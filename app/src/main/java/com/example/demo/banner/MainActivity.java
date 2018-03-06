package com.example.demo.banner;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;
import com.youth.banner.Banner;
import com.youth.banner.loader.ImageLoader;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Banner mBanner = findViewById(R.id.mBanner);
        final ArrayList<Integer> imageViews = new ArrayList<>();
        imageViews.add(R.mipmap.ic_launcher);
        imageViews.add(R.mipmap.ic_launcher_round);
        imageViews.add(R.mipmap.ic_launcher);
        mBanner.setImages(imageViews).setImageLoader(new ImageLoader() {
            @Override
            public void displayImage(Context context, Object path, ImageView imageView) {
                Picasso.with(MainActivity.this).load((Integer) path).into(imageView);
            }
        }).start();

    }
}
