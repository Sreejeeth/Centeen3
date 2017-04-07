package com.example.android.centeen2;

/**
 * Created by Home on 4/3/2017.
 */



/**
 * Created by Home on 4/1/2017.
 */


/**
 * Created by Home on 3/2/2017.
 */

public class Food {
    private String mName;

    // Android version number (e.g. 2.3-2.7, 3.0-3.2.6, 4.0-4.0.4)
    private int mCost;

    // Drawable resource ID




    /*
    * Create a new AndroidFlavor object.
    *
    * @param vName is the name of the Android version (e.g. Gingerbread)
    * @param vNumber is the corresponding Android version number (e.g. 2.3-2.7)
    * @param image is drawable reference ID that corresponds to the Android version
    * */
    public Food(String vName, int vNumber)
    {
        mName = vName;
       mCost = vNumber;


    }

    /**
     * Get the name of the Android version
     */
    public String getName() {
        return mName;
    }

    /**
     * Get the Android version number
     */
    public int getCost() {
       return mCost;
    }

    /**
     * Get the image resource ID
     */


}
