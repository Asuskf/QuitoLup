package com.example.root.appbar;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

/**
 * Created by root on 6/02/17.
 */

public class foto_bar_murcielago_adapter extends PagerAdapter {

    private int[] images_murcielago = {R.drawable.murcielago,R.drawable.murcielago1,R.drawable.murcielago2,R.drawable.murcielago3};
    private Context ctx;
    private LayoutInflater layoutInflater;



    public foto_bar_murcielago_adapter(Context ctx)
    {
        this.ctx = ctx;
    }
    @Override
    public int getCount() {
        return images_murcielago.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view ==(LinearLayout)object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        layoutInflater = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View item_view = layoutInflater.inflate(R.layout.swipe,container,false);
        ImageView imageView = (ImageView) item_view.findViewById(R.id.image_view);
        imageView.setImageResource(images_murcielago[position]);
        container.addView(item_view);


        return item_view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout)object);

    }
}
