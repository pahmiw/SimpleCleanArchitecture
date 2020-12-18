package com.example.preworkshopdsc.abstraction

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import dagger.android.support.AndroidSupportInjection
import javax.inject.Inject

abstract class BaseFragment<out B : ViewDataBinding, V : ViewModel> : Fragment() {
    val binding: B
        get() = mViewDataBinding

    lateinit var vm: V

    @Inject
    lateinit var factory: ViewModelProvider.Factory

    private lateinit var mViewDataBinding: B

    override fun onAttach(context: Context) {
        AndroidSupportInjection.inject(this)
        super.onAttach(context)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mViewDataBinding =
            DataBindingUtil.inflate(inflater, getLayoutResourceId(), container, false)
        vm = ViewModelProviders.of(this, factory).get(getViewModelClass())
        mViewDataBinding.lifecycleOwner = viewLifecycleOwner
        mViewDataBinding.executePendingBindings()
        return mViewDataBinding.root
    }

    @LayoutRes
    abstract fun getLayoutResourceId(): Int
    abstract fun getViewModelClass(): Class<V>
}