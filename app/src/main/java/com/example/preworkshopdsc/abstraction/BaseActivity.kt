package com.example.preworkshopdsc.abstraction

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import dagger.android.AndroidInjection
import javax.inject.Inject

abstract class BaseActivity<B : ViewDataBinding, V : ViewModel> : AppCompatActivity() {
    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory
    private lateinit var mViewDataBinding: B
    private lateinit var mViewModel: V

    val binding: B
        get() = mViewDataBinding
    val vm: V
        get() = mViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AndroidInjection.inject(this)
        mViewDataBinding = DataBindingUtil.setContentView(this, getLayoutResourceId())
        mViewDataBinding.lifecycleOwner = this
        mViewModel = ViewModelProviders.of(this, viewModelFactory).get(getViewModelClass())
    }

    @LayoutRes
    abstract fun getLayoutResourceId(): Int
    abstract fun getViewModelClass(): Class<V>
}