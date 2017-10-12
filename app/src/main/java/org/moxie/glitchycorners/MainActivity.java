package org.moxie.glitchycorners;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;

import static com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions.withCrossFade;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    Glide.with(this)
         .load(R.raw.giphy)
         .apply(RequestOptions.diskCacheStrategyOf(DiskCacheStrategy.NONE))
         .apply(RequestOptions.bitmapTransform(new RoundedCorners(getResources().getDimensionPixelSize(R.dimen.corner))))
         .transition(withCrossFade())
         .into((ImageView)findViewById(R.id.image));
  }
}
