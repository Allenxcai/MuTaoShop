package com.allenxcai.mutaoshop.adapter;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.allenxcai.mutaoshop.R;
import com.allenxcai.mutaoshop.entity.Find_Menu;

import java.util.List;


/**
 * Project:MuTaoShop
 * Author:Allenxcai
 * Date:2018/10/2/002
 * Description:
 */
public class FindMenuAdapter extends RecyclerView.Adapter<FindMenuViewholder> {

    protected Context context;
    protected List<Find_Menu> menus;


    public FindMenuAdapter(Context context, List<Find_Menu> menus) {
        this.context = context;
        this.menus = menus;


    }

    @NonNull
    @Override
    public FindMenuViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        switch (parent.getId()) {
            case R.id.find_main_channel:
                return new FindMenuViewholder(LayoutInflater.from(context).inflate(R.layout.item_main_menu, null));

            case R.id.find_channel_second:
                return new FindMenuViewholder(LayoutInflater.from(context).inflate(R.layout.item_find_second_menu, null));
            default:
                return new FindMenuViewholder(LayoutInflater.from(context).inflate(R.layout.item_main_menu, null));
        }

        // return new MainMenuViewholder(LayoutInflater.from(context).inflate(R.layout.item_main_second_menu, null));


    }


    @Override
    public void onBindViewHolder(@NonNull FindMenuViewholder holder, int position) {
        Find_Menu menu = menus.get(position);
        holder.mImgMenuIcon.setImageResource(menu.icon);
        holder.mTxtMenuName.setText(menu.menuName);
        if(holder.mTxtMenuName2!=null)
        holder.mTxtMenuName2.setText(menu.menuName2);

    }


    @Override
    public int getItemCount() {
        return null != menus ? menus.size() : 0;
    }
}

class FindMenuViewholder extends RecyclerView.ViewHolder {

    public ImageView mImgMenuIcon;
    public TextView mTxtMenuName;
    public TextView mTxtMenuName2;

    public FindMenuViewholder(View itemView) {
        super(itemView);


        mImgMenuIcon = ((ImageView) itemView.findViewById(R.id.img_menu_icon) != null) ? (ImageView) itemView.findViewById(R.id.img_menu_icon) : (ImageView) itemView.findViewById(R.id.img_second_menu_icon);
        mTxtMenuName = ((TextView) itemView.findViewById(R.id.txt_menu_name) != null) ? (TextView) itemView.findViewById(R.id.txt_menu_name) : (TextView) itemView.findViewById(R.id.txt_second_menu_name);
        mTxtMenuName2 = (TextView) itemView.findViewById(R.id.txt_second_menu_name2);
    }
}