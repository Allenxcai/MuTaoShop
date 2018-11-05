package com.allenxcai.mutaoshop.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.allenxcai.mutaoshop.R;
import com.allenxcai.mutaoshop.entity.Find_List_Menu;

import java.util.List;

/**
 * Project:MuTaoShop
 * Author:Allenxcai
 * Date:2018/10/7/007
 * Description:
 */
public class Find_ListView_MenuAdapter extends ArrayAdapter<Find_List_Menu> {
    /**
     * Constructor
     *
     * @param context  The current context.
     * @param resource The resource ID for a layout file containing a TextView to use when
     *                 instantiating views.
     * @param objects  The objects to represent in the ListView.
     */
    protected int resid;
    public Find_ListView_MenuAdapter( @NonNull Context context, int resource,  @NonNull List<Find_List_Menu> objects) {
        super(context, resource, objects);
        resid=resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {


        Find_List_Menu findListMenu = getItem(position);

        View view = LayoutInflater.from(getContext()).inflate(resid,parent,false);
        ImageView listImage = view.findViewById(R.id.find_hotinfo_IV);
        TextView tV_desc =view.findViewById(R.id.find_hotinfo_desc);
        TextView tV_from =view.findViewById(R.id.find_hotinfo_from);
        TextView tV_yes =view.findViewById(R.id.find_hotinfo_txt_yes);
        TextView tV_eye =view.findViewById(R.id.find_hotinfo_txt_eye);

        listImage.setImageResource(findListMenu.getFind_hotinfo_IV());
        tV_desc.setText(findListMenu.getFind_hotinfo_desc());
        tV_from.setText(findListMenu.getFind_hotinfo_from());
        tV_yes.setText(findListMenu.getFind_hotinfo_txt_yes());
        tV_eye.setText(findListMenu.getFind_hotinfo_txt_eye());

        return view;

    }
}
