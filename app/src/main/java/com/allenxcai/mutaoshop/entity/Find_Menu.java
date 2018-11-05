package com.allenxcai.mutaoshop.entity;

public class Find_Menu extends Menu{

    public String menuName2;

    public Find_Menu(int icon, String menuName) {
        this.icon = icon;
        this.menuName = menuName;

    }

    public Find_Menu(int icon, String menuName, String menuName2) {
        this.icon = icon;
        this.menuName = menuName;
        this.menuName2 = menuName2;
    }
}
