package com.allenxcai.mutaoshop.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.allenxcai.mutaoshop.R;
import com.allenxcai.mutaoshop.adapter.MainHeaderAdAdapter;
import com.allenxcai.mutaoshop.adapter.MainMenuAdapter;
import com.allenxcai.mutaoshop.util.DataUtil;

/**
 * 主页
 */
public class MainFragment extends Fragment {
    protected ViewPager mVPager;
    protected int[] icons = {R.mipmap.header_pic_ad1, R.mipmap.header_pic_ad2, R.mipmap.header_pic_ad1};
    protected RecyclerView mRViewMenu;
    protected RecyclerView mRViewMenu2;
    //菜单图标
    protected  int [] menuIons={R.mipmap.menu_airport,R.mipmap.menu_car
            ,R.mipmap.menu_course,R.mipmap.menu_hatol,
            R.mipmap.menu_nearby,R.mipmap.me_menu_go,
            R.mipmap.menu_ticket,R.mipmap.menu_train};
    protected  String [] menus;

    protected  int [] menuIons2={R.mipmap.menu_second_airport,R.mipmap.menu_second_play,
            R.mipmap.menu_second_quan};
    protected  String [] menus2;

    public MainFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        menus=this.getActivity().getResources().getStringArray(R.array.main_menu);
        menus2=this.getActivity().getResources().getStringArray(R.array.main_menu2);
        mVPager = getView().findViewById(R.id.vpager_main_header_ad);
        mRViewMenu=getView().findViewById(R.id.recyclerview_main_menu);
        mRViewMenu2=getView().findViewById(R.id.recyclerview_second_menu);


        MainHeaderAdAdapter adAdapter = new MainHeaderAdAdapter(getActivity(), DataUtil.getHeaderAddInfo(getActivity(), icons));
        mVPager.setAdapter(adAdapter);

        //菜单
        //布局样式
        mRViewMenu.setLayoutManager(new GridLayoutManager(getActivity(),4));
        MainMenuAdapter mainMenuAdapter=new MainMenuAdapter(getActivity(),DataUtil.getMainMenus(menuIons,menus));
        mRViewMenu.setAdapter(mainMenuAdapter);

        mRViewMenu2.setLayoutManager(new GridLayoutManager(getActivity(),3));
        MainMenuAdapter mainMenuAdapter2=new MainMenuAdapter(getActivity(),DataUtil.getMainMenus(menuIons2,menus2));
        mRViewMenu2.setAdapter(mainMenuAdapter2);
    }
}
