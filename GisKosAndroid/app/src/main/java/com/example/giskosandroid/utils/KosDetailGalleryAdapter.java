package com.example.giskosandroid.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.example.giskosandroid.R;
import com.example.giskosandroid.data.models.KosGallery;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Target;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

public class KosDetailGalleryAdapter extends PagerAdapter {
    private final Context context;
    private final List<KosGallery> images;
    private static final String TAG = "KOSDETAIL";
    private final Target mTarget;
    private ImageView imageView;

    public KosDetailGalleryAdapter(Context context, List<KosGallery> images) {
        this.context = context;
        this.images = images;
        this.mTarget = new Target() {
            @Override
            public void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom from) {
                imageView.setImageBitmap(bitmap);
            }

            @Override
            public void onBitmapFailed(Exception e, Drawable errorDrawable) {
                imageView.setImageDrawable(errorDrawable);
            }

            @Override
            public void onPrepareLoad(Drawable placeHolderDrawable) {
                imageView.setImageDrawable(placeHolderDrawable);
            }
        };
    }

    @Override
    public int getCount() {
        return images.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        imageView = new ImageView(context);
        if (position < images.size()) {
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);

            try {
                Picasso.get()
                        .load(String.valueOf(new URL("https://raw.githubusercontent.com/zulfauzi92/Web-GIS/main/kos%20image/kos1/kos1-001.jpg")))
                        .resize(300, 300)
                        //                    .load(String.valueOf(new URL(images.get(position).getFilename())))
                        .into(mTarget);
            } catch (IOException e) {
                Log.e(TAG, "Error getting bitmap", e);
            }

            container.addView(imageView, position);
        }

        return imageView;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
//        super.destroyItem(container, position, object);
        container.removeView((ImageView) object);
    }
}
