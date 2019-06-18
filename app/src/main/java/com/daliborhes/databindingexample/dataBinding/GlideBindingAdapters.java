package com.daliborhes.databindingexample.dataBinding;

import android.content.Context;
import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.daliborhes.databindingexample.R;

/**
 * Created by Dalibor J. Stanković on 18.06.2019.
 */

public class GlideBindingAdapters {

    // getting the image from drawable folder
    @BindingAdapter("imageDrawable")
    public static void setImageResource(ImageView view, int imageUrl) {

        Context context = view.getContext();
        RequestOptions options = new RequestOptions().placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background);

        Glide.with(context).setDefaultRequestOptions(options)
                .load(imageUrl).into(view);
    }


    // getting the image URL from internet
    @BindingAdapter("imageUrl")
    public static void setImageResource(ImageView view, String imageUrl) {

        Context context = view.getContext();
        RequestOptions options = new RequestOptions().placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background);

        Glide.with(context).setDefaultRequestOptions(options)
                .load(imageUrl).into(view);
    }
}
