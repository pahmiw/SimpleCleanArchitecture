package com.example.preworkshopdsc.domain.usecase

import com.example.preworkshopdsc.abstraction.UseCase
import com.example.preworkshopdsc.data.vo.Result
import com.example.preworkshopdsc.domain.entity.TvOnTheAir
import com.example.preworkshopdsc.domain.repository.MovieRepository
import javax.inject.Inject

class GetTvOnTheAirUseCase @Inject constructor(private val movieRepository: MovieRepository) :
    UseCase<UseCase.None, Result<List<TvOnTheAir>>>() {
    override suspend fun invoke(params: None): Result<List<TvOnTheAir>> {
        return movieRepository.getTvOnTheAir()
    }
}