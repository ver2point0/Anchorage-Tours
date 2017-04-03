package com.ver2point0.android.anchoragetours.Models;

import android.content.Context;

import com.ver2point0.android.anchoragetours.R;

import java.util.List;

public class Parks {

    public static void parksList(List<Location> parksList, Context context) {

        parksList.add(new Location(
                R.mipmap.ic_launcher,
                context.getString(R.string.parks_denali_name),
                context.getString(R.string.parks_denali_description),
                context.getString(R.string.parks_denali_address),
                context.getString(R.string.parks_denali_phone),
                context.getString(R.string.parks_denali_hours)
        ));

        parksList.add(new Location(
                R.mipmap.ic_launcher,
                context.getString(R.string.parks_katmai_name),
                context.getString(R.string.parks_katmai_description),
                context.getString(R.string.parks_katmai_address),
                context.getString(R.string.parks_katmai_phone),
                context.getString(R.string.parks_katmai_hours)
        ));

        parksList.add(new Location(
                R.mipmap.ic_launcher,
                context.getString(R.string.parks_kenai_name),
                context.getString(R.string.parks_kenai_description),
                context.getString(R.string.parks_kenai_address),
                context.getString(R.string.parks_kenai_phone),
                context.getString(R.string.parks_kenai_hours)
        ));

        parksList.add(new Location(
                R.mipmap.ic_launcher,
                context.getString(R.string.parks_clark_name),
                context.getString(R.string.parks_clark_description),
                context.getString(R.string.parks_clark_address),
                context.getString(R.string.parks_clark_phone),
                context.getString(R.string.parks_clark_hours)
        ));

        parksList.add(new Location(
                R.mipmap.ic_launcher,
                context.getString(R.string.parks_wrangell_name),
                context.getString(R.string.parks_wrangell_description),
                context.getString(R.string.parks_wrangell_address),
                context.getString(R.string.parks_wrangell_phone),
                context.getString(R.string.parks_wrangell_hours)
        ));
    }
}
