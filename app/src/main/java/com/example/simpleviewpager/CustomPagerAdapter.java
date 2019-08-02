package com.example.simpleviewpager;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import java.util.List;

public class CustomPagerAdapter extends PagerAdapter {
    private Context context;
    private List<DataModel> itemList;
    private LayoutInflater inflater;

    public CustomPagerAdapter(Context context, List<DataModel> itemList) {
        this.context = context;
        this.itemList = itemList;
        this.inflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return this.itemList.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
       View itemView= inflater.inflate(R.layout.viewpager_item,container,false);
        ImageView imageView=itemView.findViewById(R.id.imageItem);
        TextView textView=itemView.findViewById(R.id.textViewItem);
        DataModel dataModel=this.itemList.get(position);
        imageView.setImageResource(dataModel.getImageId());
        textView.setText(dataModel.getTitle());
        container.addView(itemView);
        return itemView;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
//        super.destroyItem(container, position, object);
        container.removeView((FrameLayout)object);
    }
}
