package com.example.preworkshopdsc.presentation.home

import android.os.Bundle
import androidx.lifecycle.Observer
import com.example.preworkshopdsc.R
import com.example.preworkshopdsc.abstraction.BaseActivity
import com.example.preworkshopdsc.data.vo.Result
import com.example.preworkshopdsc.databinding.ActivityHomeBinding
import timber.log.Timber

class HomeActivity : BaseActivity<ActivityHomeBinding, HomeViewModel>() {
    override fun getLayoutResourceId(): Int = R.layout.activity_home
    override fun getViewModelClass(): Class<HomeViewModel> = HomeViewModel::class.java

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        observeMovieNowPlayingResult()
        vm.getNowPlaying()
    }

    private fun observeMovieNowPlayingResult() {
        vm.nowPlaying.observe(this, Observer {
            when (it) {
                is Result.Loading -> {

                }
                is Result.Success -> {
                    Timber.tag("ISINYA").d("${it.data}")
                }
                is Result.Empty -> {

                }
                is Result.Error -> {

                }
            }
        })
    }
}