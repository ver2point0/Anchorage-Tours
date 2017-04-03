package com.ver2point0.android.anchoragetours.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.ver2point0.android.anchoragetours.Models.Location;
import com.ver2point0.android.anchoragetours.R;

import java.util.List;

public class LocationAdapter extends ArrayAdapter<Location> {

    public LocationAdapter(Context context, int resource, List<Location> locList) {
        super(context, 0, locList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final Location loc = getItem(position);

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.picImageView);
        if (loc.hasImage()) {
            imageView.setImageResource(loc.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }

        TextView nameLocTextView = (TextView) listItemView.findViewById(R.id.nameTextView);
        nameLocTextView.setText(loc.getName());

        TextView descripLocTextView = (TextView) listItemView.findViewById(R.id.descripTextView);
        descripLocTextView.setText(loc.getDescrip());

        TextView addressLocTextView = (TextView) listItemView.findViewById(R.id.addressTextView);
        addressLocTextView.setText(loc.getAddress());

        TextView numberLocTextView = (TextView) listItemView.findViewById(R.id.numberTextView);
        numberLocTextView.setText(loc.getNumber());

        TextView hoursLocTextView = (TextView) listItemView.findViewById(R.id.hoursTextView);
        hoursLocTextView.setText(loc.getHours());

        return listItemView;
    }
}
