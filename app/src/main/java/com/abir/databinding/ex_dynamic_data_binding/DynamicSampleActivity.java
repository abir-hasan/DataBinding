package com.abir.databinding.ex_dynamic_data_binding;

import android.databinding.BindingAdapter;
import android.databinding.DataBindingUtil;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.util.Log;
import android.widget.ImageView;

import com.abir.databinding.R;
import com.abir.databinding.databinding.ActivityDynamicSampleBinding;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * A class to demonstrate Dynamic Data Binding
 */
public class DynamicSampleActivity extends AppCompatActivity {

    private static final String TAG = "DynamicSampleActivity";
    ActivityDynamicSampleBinding sampleBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        sampleBinding = DataBindingUtil.setContentView(this, R.layout.activity_dynamic_sample);

        List<Movie> movieList = MovieUtil.getMovieList();
        MovieAdapter adapter = new MovieAdapter(movieList);

        sampleBinding.rvMovies.setLayoutManager(new LinearLayoutManager(this));
        sampleBinding.rvMovies.setAdapter(adapter);

    }

    @BindingAdapter({"imageUrl", "placeHolder"})
    public static void loadMovieImage(ImageView poster, String url, Drawable drawable) {
        Log.i(TAG, "loadMovieImage() " + url);
        Picasso.with(poster.getContext()).load(url).placeholder(drawable).fit().into(poster);
    }
}
