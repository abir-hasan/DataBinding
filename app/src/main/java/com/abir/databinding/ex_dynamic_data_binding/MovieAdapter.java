package com.abir.databinding.ex_dynamic_data_binding;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.abir.databinding.R;
import com.abir.databinding.databinding.MovieItemBinding;

import java.util.List;

/**
 * Created by Abir Hasan on 02-Mar-17.
 */

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MovieViewHolder> {

    private List<Movie> movieList;

    public MovieAdapter(List<Movie> movieList) {
        this.movieList = movieList;
    }

    @Override
    public MovieViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        MovieItemBinding itemBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.movie_item, parent, false);
        return new MovieViewHolder(itemBinding.getRoot());
    }

    @Override
    public void onBindViewHolder(MovieViewHolder holder, int position) {
        MovieItemBinding itemBinding = DataBindingUtil.bind(holder.itemView);
        itemBinding.setMovieModel(movieList.get(position));
    }

    @Override
    public int getItemCount() {
        return movieList.size();
    }

    class MovieViewHolder extends RecyclerView.ViewHolder {
        MovieViewHolder(View itemView) {
            super(itemView);
        }
    }
}
