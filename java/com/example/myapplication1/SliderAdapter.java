package com.example.myapplication1;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.smarteist.autoimageslider.SliderViewAdapter;

public class SliderAdapter extends SliderViewAdapter<SliderAdapter.Holder> {
    int[] images;
    public SliderAdapter(int[] images)
    {
        this.images=images;
    }

    @Override
    public Holder onCreateViewHolder(ViewGroup parent) {
        View view= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.slider_item,parent,false);
        return new Holder(view);
    }


    @Override
    public void onBindViewHolder(Holder viewHolder, int position) {

    viewHolder.ig.setImageResource(images[position]);
    }



    @Override
    public int getCount() {
        return images.length;
    }
    public class Holder extends SliderViewAdapter.ViewHolder{
        ImageView ig;

        public Holder(View itemView)
        {
            super(itemView);
            ig=itemView.findViewById(R.id.imageView);
        }
    }
}

