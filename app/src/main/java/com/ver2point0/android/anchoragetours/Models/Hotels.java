package com.ver2point0.android.anchoragetours.Models;

import android.content.Context;

import com.ver2point0.android.anchoragetours.R;

import java.util.List;

public class Hotels {

    public static void hotelsList(List<Location> hotelsList, Context context) {

        hotelsList.add(new Location(
                R.mipmap.ic_launcher,
                context.getString(R.string.hotels_embassy_name),
                context.getString(R.string.hotels_embassy_description),
                context.getString(R.string.hotels_embassy_address),
                context.getString(R.string.hotels_embassy_phone),
                context.getString(R.string.hotels_embassy_hours)
        ));

        hotelsList.add(new Location(
                R.mipmap.ic_launcher,
                context.getString(R.string.hotels_lakefront_name),
                context.getString(R.string.hotels_lakefront_description),
                context.getString(R.string.hotels_lakefront_address),
                context.getString(R.string.hotels_lakefront_phone),
                context.getString(R.string.hotels_lakefront_hours)
        ));

        hotelsList.add(new Location(
                R.mipmap.ic_launcher,
                context.getString(R.string.hotels_capcook_name),
                context.getString(R.string.hotels_capcook_description),
                context.getString(R.string.hotels_capcook_address),
                context.getString(R.string.hotels_capcook_phone),
                context.getString(R.string.hotels_capcook_hours)
        ));

        hotelsList.add(new Location(
                R.mipmap.ic_launcher,
                context.getString(R.string.hotels_springhill_name),
                context.getString(R.string.hotels_springhill_description),
                context.getString(R.string.hotels_springhill_address),
                context.getString(R.string.hotels_springhill_phone),
                context.getString(R.string.hotels_springhill_hours)
        ));

        hotelsList.add(new Location(
                R.mipmap.ic_launcher,
                context.getString(R.string.hotels_histanc_name),
                context.getString(R.string.hotels_histanc_description),
                context.getString(R.string.hotels_histanc_address),
                context.getString(R.string.hotels_histanc_phone),
                context.getString(R.string.hotels_histanc_hours)
        ));
    }
}
