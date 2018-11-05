package com.allenxcai.mutaoshop.entity;

/**
 * Project:MuTaoShop
 * Author:Allenxcai
 * Date:2018/10/7/007
 * Description:
 */
public class Find_List_Menu {
    public int find_hotinfo_IV;
    public String find_hotinfo_txt_yes;
    public String find_hotinfo_txt_eye;
    public String find_hotinfo_from;
    public String find_hotinfo_desc;

    public Find_List_Menu(int find_hotinfo_IV, String find_hotinfo_desc, String find_hotinfo_from, String find_hotinfo_txt_yes, String find_hotinfo_txt_eye) {
        this.find_hotinfo_IV = find_hotinfo_IV;
        this.find_hotinfo_txt_yes = find_hotinfo_txt_yes;
        this.find_hotinfo_txt_eye = find_hotinfo_txt_eye;
        this.find_hotinfo_from = find_hotinfo_from;
        this.find_hotinfo_desc = find_hotinfo_desc;
    }

    public int getFind_hotinfo_IV() {
        return find_hotinfo_IV;
    }

    public void setFind_hotinfo_IV(int find_hotinfo_IV) {
        this.find_hotinfo_IV = find_hotinfo_IV;
    }

    public String getFind_hotinfo_txt_yes() {
        return find_hotinfo_txt_yes;
    }

    public void setFind_hotinfo_txt_yes(String find_hotinfo_txt_yes) {
        this.find_hotinfo_txt_yes = find_hotinfo_txt_yes;
    }

    public String getFind_hotinfo_txt_eye() {
        return find_hotinfo_txt_eye;
    }

    public void setFind_hotinfo_txt_eye(String find_hotinfo_txt_eye) {
        this.find_hotinfo_txt_eye = find_hotinfo_txt_eye;
    }

    public String getFind_hotinfo_from() {
        return find_hotinfo_from;
    }

    public void setFind_hotinfo_from(String find_hotinfo_from) {
        this.find_hotinfo_from = find_hotinfo_from;
    }

    public String getFind_hotinfo_desc() {
        return find_hotinfo_desc;
    }

    public void setFind_hotinfo_desc(String find_hotinfo_desc) {
        this.find_hotinfo_desc = find_hotinfo_desc;
    }
}
