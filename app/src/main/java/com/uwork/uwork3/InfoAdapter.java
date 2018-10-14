package com.uwork.uwork3;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class InfoAdapter extends ArrayAdapter<Info> {
    public InfoAdapter(@NonNull Context context, @NonNull ArrayList<Info> announce) {
        super(context, 0, announce);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.info_item, parent, false);
        }
        Info currentInfo = getItem(position);
        TextView gInfo = (TextView) listItemView.findViewById(R.id.header);
        gInfo.setText(currentInfo.getInfo());

        TextView desc = (TextView) listItemView.findViewById(R.id.desc);
        desc.setText(currentInfo.getDescription());

        TextView time = (TextView) listItemView.findViewById(R.id.times);
        time.setText(currentInfo.getTime());

        return  listItemView;
    }
}
