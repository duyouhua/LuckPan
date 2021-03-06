package io.github.bakumon.luckpan.utils;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;

/**
 * dp转px等
 * Created by bakumon on 16-11-12.
 */
public class DisplayUtils {

    private static DisplayMetrics getMetrics(Context context) {
        DisplayMetrics metrics = new DisplayMetrics();

        WindowManager wm = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        wm.getDefaultDisplay().getMetrics(metrics);
        return metrics;
    }

    /**
     * dp转pixel
     */
    public static int dp2px(float dp, Context context) {
        DisplayMetrics metrics = getMetrics(context);
        return (int) (dp * (metrics.densityDpi / 160f));
    }

}
