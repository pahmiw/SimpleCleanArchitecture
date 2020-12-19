package com.example.preworkshopdsc.presentation.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.preworkshopdsc.databinding.ListItemNowPlayingBinding
import com.example.preworkshopdsc.domain.entity.NowPlaying
import com.example.preworkshopdsc.domain.entity.TvOnTheAir
import com.example.preworkshopdsc.presentation.home.HomeAdapter.HomeViewHolder

class HomeAdapter(private var nowPlaying: List<TvOnTheAir>) :
    RecyclerView.Adapter<HomeViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ListItemNowPlayingBinding.inflate(layoutInflater, parent, false)
        return HomeViewHolder(binding)
    }

    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {
        holder.bind(nowPlaying[position])
    }

    class HomeViewHolder(private val binding: ListItemNowPlayingBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(nowPlaying: TvOnTheAir) {
            binding.nowplaying = nowPlaying
        }
    }

    override fun getItemCount(): Int = nowPlaying.size

    fun refreshNowPlaying(nowPlaying: List<TvOnTheAir>) {
        this.nowPlaying = nowPlaying
        notifyDataSetChanged()
    }
}