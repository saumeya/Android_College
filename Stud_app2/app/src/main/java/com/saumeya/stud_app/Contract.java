package com.saumeya.stud_app;

import android.provider.BaseColumns;

/**
 * Created by Hemani19 on 28-09-2017.
 */

public class Contract {
    public static class FeedEntry implements BaseColumns {
        public static final String TABLE_NAME = "entry";
        public static final String COLUMN_NAME = "Name";
        public static final String COLUMN_ROLL = "Roll";
        public static final String COLUMN_MARKS = "Marks";
    }
}
