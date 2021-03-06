package com.example.vardansharma.zimply.utils;

import android.content.ContentUris;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.util.DisplayMetrics;

import static java.lang.Long.parseLong;

/**
 * Created by vardansharma on 15/11/16.
 */

public class Utils {
    private final static Uri ART_CONTENT_URI = Uri.parse("content://media/external/audio/albumart");

    private Utils() {
    }

    public static Uri getImageUriFromId(@NonNull String id) {
        Preconditions.checkNotNull(id, "album id is null");
        return ContentUris.withAppendedId(ART_CONTENT_URI, parseLong(id));
    }

    public static float dpToPixel(float dp, Context context) {
        Resources resources = context.getResources();
        DisplayMetrics metrics = resources.getDisplayMetrics();
        float px = dp * ((float) metrics.densityDpi / DisplayMetrics.DENSITY_DEFAULT);
        return px;
    }

}
