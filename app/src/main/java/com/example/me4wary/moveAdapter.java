package com.example.me4wary;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Handler;

public class moveAdapter extends ArrayAdapter {
    List list = new ArrayList();
    public moveAdapter(@NonNull Context context, int resource) {
        super(context, resource);
    }
    static class DataHandler{
        ImageView poster;
        TextView title;
        TextView rating;
    }
    public void add_object(Object object){
        super.add(object);
        list.add(object);
    }
    public int getCountO(){
        return this.list.size();
    }


    public Object getItem(int position) {
        return this.list.get(position);
    }

    public View getView(int position, View convertView,  ViewGroup parent) {
        View row;
        row = convertView;
        DataHandler handler;
        if (convertView == null ){
            LayoutInflater inflater = (LayoutInflater)this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.first_shap,parent,false);
            handler=new DataHandler();
            handler.poster =(ImageView) row.findViewById(R.id.imageView);
            handler.title =(TextView) row.findViewById(R.id.textView);
            handler.rating =(TextView) row.findViewById(R.id.txt);
            row.setTag(handler);
        }else{
            handler = (DataHandler) row.getTag();

        }
        moviesDataProvider dataProvider;
        dataProvider = (moviesDataProvider)this.getItem(position);
        handler.poster.setImageResource(dataProvider.getMoviePosterRe());
        handler.title.setText(dataProvider.getMoviesTilte());
        handler.rating.setText(dataProvider.getMoviesRating());
        return row;
    }
}
