package com.github.miao1007.animewallpaper.utils.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import com.squareup.picasso.Transformation;

public class BlurTransformation implements Transformation {

    Context context;

    final int BLUR_RADIUS = 5;

    public BlurTransformation(Context context) {
        this.context = context;
    }

    @Override
    public Bitmap transform(Bitmap bitmap) {
        Bitmap blurredBitmap = Blur.apply(context, bitmap, BLUR_RADIUS);
        bitmap.recycle();
        return blurredBitmap;
    }

    @Override
    public String key() {
        return "blur";
    }
}
