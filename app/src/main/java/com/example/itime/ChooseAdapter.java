package com.example.itime;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class ChooseAdapter extends ArrayAdapter<ChooseItem>{
    private int resourceId;
    public ChooseAdapter(@NonNull Context context, int resource, @NonNull ArrayList<ChooseItem> objects) {
        super(context, resource, objects);
        resourceId = resource;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ChooseItem chooseItem = getItem(position);//获取当前项的实例
        View view = LayoutInflater.from(getContext()).inflate(resourceId, parent, false);
        ((ImageView) view.findViewById(R.id.image2)).setImageResource(chooseItem.getImageId());
        ((TextView) view.findViewById(R.id.title2)).setText(chooseItem.getTitle());
        ((TextView) view.findViewById(R.id.description2)).setText(chooseItem.getDescription());

        return view;
    }
}

