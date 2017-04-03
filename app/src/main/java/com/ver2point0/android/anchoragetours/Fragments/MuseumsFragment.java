package com.ver2point0.android.anchoragetours.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.ver2point0.android.anchoragetours.Adapters.LocationAdapter;
import com.ver2point0.android.anchoragetours.Models.Location;
import com.ver2point0.android.anchoragetours.Models.Museums;
import com.ver2point0.android.anchoragetours.R;

import java.util.ArrayList;
import java.util.List;

public class MuseumsFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        List<Location> museumsListFragment = new ArrayList<>();
        Museums.museumsList(museumsListFragment, getContext());

        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), -1, museumsListFragment);
        View view = inflater.inflate(R.layout.loc_list, container, false);
        ListView listView = (ListView) view.findViewById(R.id.locListView);

        listView.setAdapter(locationAdapter);

        return view;
    }
}
