package com.example.preworkshopdsc.presentation.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.preworkshopdsc.abstraction.UseCase
import com.example.preworkshopdsc.data.vo.Result
import com.example.preworkshopdsc.domain.entity.NowPlaying
import com.example.preworkshopdsc.domain.usecase.GetMovieNowPlayingUseCase
import kotlinx.coroutines.launch
import javax.inject.Inject

class HomeViewModel @Inject constructor(private val getMovieNowPlayingUseCase: GetMovieNowPlayingUseCase) :
    ViewModel() {

    private val _nowPlaying = MutableLiveData<Result<List<NowPlaying>>>()
    val nowPlaying: LiveData<Result<List<NowPlaying>>>
        get() = _nowPlaying

    fun getNowPlaying() {
        _nowPlaying.value = Result.Loading
        viewModelScope.launch {
            _nowPlaying.value = getMovieNowPlayingUseCase(UseCase.None)
        }
    }
}