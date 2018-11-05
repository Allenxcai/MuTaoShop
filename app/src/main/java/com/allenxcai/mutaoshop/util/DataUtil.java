package com.allenxcai.mutaoshop.util;

import android.content.Context;
import android.widget.ImageView;

import com.allenxcai.mutaoshop.entity.Find_List_Menu;
import com.allenxcai.mutaoshop.entity.Main_Menu;
import com.allenxcai.mutaoshop.entity.Menu;
import com.allenxcai.mutaoshop.entity.Find_Menu;

import java.util.ArrayList;
import java.util.List;

public class DataUtil {
    /**
     * @param context
     * @param icons
     * @return
     */
    public static List<ImageView> getHeaderAddInfo(Context context, int icons[]) {
        List<ImageView> datas = new ArrayList<>();
        for (int i = 0; i < icons.length; i++) {
            ImageView icon = new ImageView(context);
            icon.setImageResource(icons[i]);
            icon.setScaleType(ImageView.ScaleType.CENTER_CROP);
            datas.add(icon);
        }

        return datas;

    }

    /**
     *
     * @param icons
     * @param names
     * @return
     */
    public static List<Main_Menu> getMainMenus(int icons[], String names[]){

        List<Main_Menu> menus = new ArrayList<>();
        for (int i = 0; i <names.length ; i++) {
            Main_Menu menu = new Main_Menu(icons[i],names[i]);
            menus.add(menu);

        }
        return menus;

    }



    /**
     *
     * @param icons
     * @param names
     * @return
     */
    public static List<Find_Menu> getFindMenus(int icons[], String names[]){

        List<Find_Menu> menus = new ArrayList<>();
        for (int i = 0; i <names.length ; i++) {
            Find_Menu menu = new Find_Menu(icons[i],names[i]);
            menus.add(menu);

        }
        return menus;

    }

    /**
     *
     * @param icons
     * @param names
     * @param name2
     * @return
     */
    public static List<Find_Menu> getFindMenus(int icons[], String names[],String name2[]){

        List<Find_Menu> menus = new ArrayList<>();
        for (int i = 0; i <names.length ; i++) {
            Find_Menu menu = new Find_Menu(icons[i],names[i],name2[i]);
            menus.add(menu);

        }
        return menus;

    }


    public static List<Find_List_Menu> getFindMenus(int icons[], String names[], String name2[], String name3[], String name4[]){

        List<Find_List_Menu> menus = new ArrayList<>();
        for (int i = 0; i <names.length ; i++) {
            Find_List_Menu menu = new Find_List_Menu(icons[i],names[i],name2[i],name3[i],name4[i]);
            menus.add(menu);

        }
        return menus;

    }




}

