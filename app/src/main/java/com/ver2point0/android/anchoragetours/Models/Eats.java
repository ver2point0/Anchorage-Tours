package com.ver2point0.android.anchoragetours.Models;

import android.content.Context;

import com.ver2point0.android.anchoragetours.R;

import java.util.List;

public class Eats {

    public static void eatsList(List<Location> eatsList, Context context) {
        
        eatsList.add(new Location(
                R.mipmap.ic_launcher,
                context.getString(R.string.eats_og_name),
                context.getString(R.string.eats_og_description),
                context.getString(R.string.eats_og_address),
                context.getString(R.string.eats_og_phone),
                context.getString(R.string.eats_og_hours)
        ));

        eatsList.add(new Location(
                R.mipmap.ic_launcher,
                context.getString(R.string.eats_rockwood_name),
                context.getString(R.string.eats_rockwood_description),
                context.getString(R.string.eats_rockwood_address),
                context.getString(R.string.eats_rockwood_phone),
                context.getString(R.string.eats_rockwood_hours)
        ));

        eatsList.add(new Location(
                R.mipmap.ic_launcher,
                context.getString(R.string.eats_firetap_name),
                context.getString(R.string.eats_firetap_description),
                context.getString(R.string.eats_firetap_address),
                context.getString(R.string.eats_firetap_phone),
                context.getString(R.string.eats_firetap_hours)
        ));

        eatsList.add(new Location(
                R.mipmap.ic_launcher,
                context.getString(R.string.eats_moosetooth_name),
                context.getString(R.string.eats_moosetooth_description),
                context.getString(R.string.eats_moosetooth_address),
                context.getString(R.string.eats_moosetooth_phone),
                context.getString(R.string.eats_moosetooth_hours)
        ));

        eatsList.add(new Location(
                R.mipmap.ic_launcher,
                context.getString(R.string.eats_akdinner_name),
                context.getString(R.string.eats_akdinner_description),
                context.getString(R.string.eats_akdinner_address),
                context.getString(R.string.eats_akdinner_phone),
                context.getString(R.string.eats_akdinner_hours)
        ));
    }
}
