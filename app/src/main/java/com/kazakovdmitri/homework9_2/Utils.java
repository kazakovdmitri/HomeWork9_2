package com.kazakovdmitri.homework9_2;

import android.app.Activity;
import android.content.Intent;

public class Utils
{
    private static int sTheme;

    public final static int THEME_DEFAULT = 0;
    public final static int THEME_BIG = 1;
    public final static int THEME_MIDDLE = 2;
    public final static int THEME_SMALL = 3;

    /**
     * Set the theme of the Activity, and restart it by creating a new Activity of the same type.
     */
    public static void changeToMargin(Activity activity, int theme)
    {
        sTheme = theme;
        activity.finish();

        activity.startActivity(new Intent(activity, activity.getClass()));

    }

    /** Set the theme of the activity, according to the configuration. */
    public static void onActivityCreateSetTheme(Activity activity)
    {
        switch (sTheme)
        {
            default:
            case THEME_DEFAULT:
                activity.setTheme(R.style.AppTheme);
                break;
            case THEME_BIG:
                activity.setTheme(R.style.MarginBig);
                break;
            case THEME_MIDDLE:
                activity.setTheme(R.style.MarginMiddle);
                break;
            case THEME_SMALL:
                activity.setTheme(R.style.MarginSmall);
                break;
        }
    }
}