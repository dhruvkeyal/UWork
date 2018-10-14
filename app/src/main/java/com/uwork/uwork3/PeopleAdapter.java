package com.uwork.uwork3;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class PeopleAdapter extends ArrayAdapter<People> {


    public PeopleAdapter(@NonNull Context context, @NonNull List<People> objects) {
        super(context,0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.people_list, parent, false);
        }
        People currentInfo = getItem(position);
        ImageView gInfo = (ImageView) listItemView.findViewById(R.id.image_view);
        gInfo.setImageResource(currentInfo.getImage());

        TextView desc = (TextView) listItemView.findViewById(R.id.job_name);
        desc.setText(currentInfo.getName());

        TextView time = (TextView) listItemView.findViewById(R.id.job_description);
        time.setText(currentInfo.getJobDescription());

        return  listItemView;
    }
}
