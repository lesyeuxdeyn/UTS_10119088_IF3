package com.example.uts_10119088_if3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;


public class Adapter extends PagerAdapter {

    //10119088, IF-3, Laurentius Bryan Hermanto
    Context ctx;

    public Adapter(Context ctx) {
        this.ctx = ctx;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        LayoutInflater layoutInflater = (LayoutInflater) ctx.getSystemService(ctx.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slider_screen,container,false);

        ImageView logo =view.findViewById(R.id.logo);
        ImageView dot1 =view.findViewById(R.id.dot1);
        ImageView dot2 =view.findViewById(R.id.dot2);
        ImageView dot3 =view.findViewById(R.id.dot3);


        TextView judul =view.findViewById(R.id.judul);
        TextView desc  =view.findViewById(R.id.desc);
        switch (position)
        {
            case 0:
                logo.setImageResource(R.drawable.tulis);
                dot1.setImageResource(R.drawable.selected);
                dot2.setImageResource(R.drawable.notselected);
                dot3.setImageResource(R.drawable.notselected);

                judul.setText("Tulis");
                desc.setText("Mempermudah Kita Untuk Menulis Jadwal Harian. Swipe untuk melanjutkan deskripsi");
                break;
            case 1:
                logo.setImageResource(R.drawable.pin);
                dot1.setImageResource(R.drawable.notselected);
                dot2.setImageResource(R.drawable.selected);
                dot3.setImageResource(R.drawable.notselected);

                judul.setText("Pin");
                desc.setText("Berguna Untuk menandai event penting yang akan dilakukan. Swipe untuk melanjutkan deskripsi");
                break;
            case 2:
                logo.setImageResource(R.drawable.susun);
                dot1.setImageResource(R.drawable.notselected);
                dot2.setImageResource(R.drawable.notselected);
                dot3.setImageResource(R.drawable.selected);

                judul.setText("Rapih");
                desc.setText("Menata Setiap Catatan agar selalu rapih dan terorganisir. Swipe untuk melanjutkan deskripsi");
                break;
        }

        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View)object);
    }
}
