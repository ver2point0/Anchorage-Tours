package com.ver2point0.android.anchoragetours.Models;

import android.content.Context;

import com.ver2point0.android.anchoragetours.R;

import java.util.List;

public class Museums {

    public static void museumsList(List<Location> museumsList, Context context) {

        museumsList.add(new Location(
                R.mipmap.ic_launcher,
                context.getString(R.string.museums_anchmuseum_name),
                context.getString(R.string.museums_anchmuseum_description),
                context.getString(R.string.museums_anchmuseum_address),
                context.getString(R.string.museums_anchmuseum_phone),
                context.getString(R.string.museums_anchmuseum_hours)
        ));

        museumsList.add(new Location(
                R.mipmap.ic_launcher,
                context.getString(R.string.museums_akavi_name),
                context.getString(R.string.museums_akavi_description),
                context.getString(R.string.museums_akavi_address),
                context.getString(R.string.museums_akavi_phone),
                context.getString(R.string.museums_akavi_hours)
        ));

        museumsList.add(new Location(
                R.mipmap.ic_launcher,
                context.getString(R.string.museums_wellshistory_name),
                context.getString(R.string.museums_wellshistory_description),
                context.getString(R.string.museums_wellshistory_address),
                context.getString(R.string.museums_wellshistory_phone),
                context.getString(R.string.museums_wellshistory_hours)
        ));

        museumsList.add(new Location(
                R.mipmap.ic_launcher,
                context.getString(R.string.museums_akscinat_name),
                context.getString(R.string.museums_akscinat_description),
                context.getString(R.string.museums_akscinat_address),
                context.getString(R.string.museums_akscinat_phone),
                context.getString(R.string.museums_akscinat_hours)
        ));

        museumsList.add(new Location(
                R.mipmap.ic_launcher,
                context.getString(R.string.museums_akvets_name),
                context.getString(R.string.museums_akvets_description),
                context.getString(R.string.museums_akvets_address),
                context.getString(R.string.museums_akvets_phone),
                context.getString(R.string.museums_akvets_hours)
        ));
    }
}
