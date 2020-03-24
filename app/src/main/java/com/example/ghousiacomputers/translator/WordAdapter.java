package com.example.ghousiacomputers.translator;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {
    private int ColorResource;

    public WordAdapter(Activity context, ArrayList<Word> numberslist, int colorResource) {
        super(context, 0, numberslist);
        this.ColorResource = colorResource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
//check if new view is required or not
        View ListItemView = convertView;
        if (ListItemView == null) {
            ListItemView = LayoutInflater.from(getContext()).inflate(R.layout.listview_item, parent, false);
        }

        Word currentWord = getItem(position);

        TextView Frenchnumbertextview = (TextView) ListItemView.findViewById(R.id.French_Textview);
        Frenchnumbertextview.setText(currentWord.getFrenchtranslation());


        TextView defaultnumbertextview = (TextView) ListItemView.findViewById(R.id.Default_Textview);
        defaultnumbertextview.setText(currentWord.getEnglishtranslation());


        ImageView relatedimage = (ImageView) ListItemView.findViewById(R.id.image_area);
        if (currentWord.hasImage()) {
            relatedimage.setImageResource(currentWord.getImageResourceId());
            relatedimage.setVisibility(View.VISIBLE);
        } else {
            relatedimage.setVisibility(View.GONE);
        }

        View textcontainer = ListItemView.findViewById(R.id.Text_Container);
        int color = ContextCompat.getColor(getContext(), ColorResource);
        textcontainer.setBackgroundColor(color);

        View playicon = ListItemView.findViewById(R.id.play_icon);
        playicon.setBackgroundColor(color);

        return ListItemView;
    }
}

