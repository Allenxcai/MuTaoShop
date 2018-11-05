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
import com.allenxcai.mutaoshop.entity.Main_Menu;
import com.allenxcai.mutaoshop.entity.Menu;

import java.util.List;


/**
 * Project:MuTaoShop
 * Author:Allenxcai
 * Date:2018/10/2/002
 * Description:
 */
public class MainMenuAdapter extends RecyclerView.Adapter<MainMenuViewholder> {

    protected Context context;
    protected List<Main_Menu> menus;


    public MainMenuAdapter(Context context, List<Main_Menu> menus) {
        this.context = context;
        this.menus = menus;


    }

    @NonNull
    @Override
    public MainMenuViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        switch (parent.getId()) {
            case R.id.recyclerview_main_menu:
                return new MainMenuViewholder(LayoutInflater.from(context).inflate(R.layout.item_main_menu, null));
            case R.id.recyclerview_second_menu:
                return new MainMenuViewholder(LayoutInflater.from(context).inflate(R.layout.item_main_second_menu, null));
            default:
                return new MainMenuViewholder(LayoutInflater.from(context).inflate(R.layout.item_main_menu, null));
        }

        // return new MainMenuViewholder(LayoutInflater.from(context).inflate(R.layout.item_main_second_menu, null));


    }


    @Override
    public void onBindViewHolder(@NonNull MainMenuViewholder holder, int position) {
        Menu menu = menus.get(position);
        holder.mImgMenuIcon.setImageResource(menu.icon);
        holder.mTxtMenuName.setText(menu.menuName);

    }


    @Override
    public int getItemCount() {
        return null != menus ? menus.size() : 0;
    }
}

class MainMenuViewholder extends RecyclerView.ViewHolder {

    public ImageView mImgMenuIcon;
    public TextView mTxtMenuName;


    public MainMenuViewholder(View itemView) {
        super(itemView);


        mImgMenuIcon = ((ImageView) itemView.findViewById(R.id.img_menu_icon) != null) ? (ImageView) itemView.findViewById(R.id.img_menu_icon) : (ImageView) itemView.findViewById(R.id.img_second_menu_icon);
        mTxtMenuName = ((TextView) itemView.findViewById(R.id.txt_menu_name) != null) ? (TextView) itemView.findViewById(R.id.txt_menu_name) : (TextView) itemView.findViewById(R.id.txt_second_menu_name);


    }
}