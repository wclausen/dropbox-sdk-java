package com.dropbox.core;

/*>>> import checkers.nullness.quals.Nullable; */

public class DbxSdkVersion
{
    public static final String Version;
    static {
        Version = loadVersion();
    }


    private static String loadVersion()
    {
        return "4.0.1-SNAPSHOT";
    }
}
