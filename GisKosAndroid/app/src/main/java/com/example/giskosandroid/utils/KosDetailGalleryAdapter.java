package com.example.giskosandroid.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.example.giskosandroid.R;
import com.example.giskosandroid.data.models.KosGallery;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

public class KosDetailGalleryAdapter extends PagerAdapter {
    private final Context context;
    private final List<KosGallery> images;
    private static final String TAG = "KOSDETAIL";

    public KosDetailGalleryAdapter(Context context, List<KosGallery> images) {
        this.context = context;
        this.images = images;
    }

    @Override
    public int getCount() {
        return images.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    private Bitmap getImageBitmap(String url) {
        Bitmap bitmap = null;
        try {
            URL imageURL = new URL(url);
            URLConnection connection = imageURL.openConnection();
            InputStream inputStream;
            BufferedInputStream bufferedInputStream;

            connection.connect();
            inputStream = connection.getInputStream();
            bufferedInputStream = new BufferedInputStream(inputStream);
            bitmap = BitmapFactory.decodeStream(bufferedInputStream);
            bufferedInputStream.close();
            inputStream.close();
        } catch (IOException e) {
            Log.e(TAG, "Error getting bitmap", e);
        }
        return bitmap;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        ImageView imageView = new ImageView(context);
        Bitmap bitmap = getImageBitmap(images.get(position).getFilename());

        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        if (bitmap == null) {
            imageView.setImageResource(R.drawable.ic_no_image);
        } else {
            imageView.setImageBitmap(bitmap);
        }

        container.addView(imageView, position);

        return imageView;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        super.destroyItem(container, position, object);
        container.removeView((ImageView) object);
    }
}
