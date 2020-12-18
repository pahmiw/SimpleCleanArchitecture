package com.example.preworkshopdsc.domain.usecase

import com.example.preworkshopdsc.abstraction.UseCase
import com.example.preworkshopdsc.data.vo.Result
import com.example.preworkshopdsc.domain.entity.NowPlaying
import com.example.preworkshopdsc.domain.repository.MovieRepository
import javax.inject.Inject

class GetMovieNowPlayingUseCase @Inject constructor(private val movieRepository: MovieRepository) :
    UseCase<UseCase.None, Result<List<NowPlaying>>>() {
    override suspend fun invoke(params: None): Result<List<NowPlaying>> {
        return movieRepository.getMovieNowPlaying()
    }
}