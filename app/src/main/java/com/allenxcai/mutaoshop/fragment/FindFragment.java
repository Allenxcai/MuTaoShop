package com.allenxcai.mutaoshop.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.allenxcai.mutaoshop.R;
import com.allenxcai.mutaoshop.adapter.FindMenuAdapter;
import com.allenxcai.mutaoshop.adapter.Find_ListView_MenuAdapter;
import com.allenxcai.mutaoshop.util.DataUtil;

/**
 * 发现页
 */
public class FindFragment extends Fragment {


    protected RecyclerView mRViewMenu;
    protected RecyclerView mRViewMenu2;
    protected ListView lstView;
    //菜单图标
    protected  int [] menuIons={R.mipmap.find_main_travel,
            R.mipmap.find_main_square,
            R.mipmap.find_main_hotwind,R.mipmap.find_main_way};
    protected  String [] menus;

    protected  int [] menuIons2={R.mipmap.find_channel_parter,R.mipmap.find_channel_me,
            R.mipmap.find_channel_online};
    protected  String [] menus2;
    protected  String [] menus2_2;


    protected  int [] menuIons3={R.mipmap.find_hot_city,
            R.mipmap.find_hot_home,R.mipmap.find_hot_jiangnan};
    protected  String [] menus3;
    protected  String [] menus3_2;
    protected  String [] menus3_3;
    protected  String [] menus3_4;


    public FindFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_find, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        menus=this.getActivity().getResources().getStringArray(R.array.find_menu);
        menus2=this.getActivity().getResources().getStringArray(R.array.find_menu2_1);
        menus2_2=this.getActivity().getResources().getStringArray(R.array.find_menu2_2);

        menus3=this.getActivity().getResources().getStringArray(R.array.find_menu3_1);
        menus3_2=this.getActivity().getResources().getStringArray(R.array.find_menu3_2);
        menus3_3=this.getActivity().getResources().getStringArray(R.array.find_menu3_3);
        menus3_4=this.getActivity().getResources().getStringArray(R.array.find_menu3_4);

        mRViewMenu=getView().findViewById(R.id.find_main_channel);
        mRViewMenu2=getView().findViewById(R.id.find_channel_second);
        lstView=getView().findViewById(R.id.lst_hot_infos);


        //菜单
        //布局样式
        mRViewMenu.setLayoutManager(new GridLayoutManager(getActivity(),4));
        FindMenuAdapter findMenuAdapter=new FindMenuAdapter(getActivity(), DataUtil.getFindMenus(menuIons,menus));
        mRViewMenu.setAdapter(findMenuAdapter);

        mRViewMenu2.setLayoutManager(new GridLayoutManager(getActivity(),3));
        FindMenuAdapter findMenuAdapter2=new FindMenuAdapter(getActivity(),DataUtil.getFindMenus(menuIons2,menus2,menus2_2));
        mRViewMenu2.setAdapter(findMenuAdapter2);

        Find_ListView_MenuAdapter findListViewMenuAdapter = new Find_ListView_MenuAdapter(getActivity(),R.layout.item_find_hotinfo,
                DataUtil.getFindMenus(menuIons3,menus3,menus3_2,menus3_3,menus3_4));
        lstView.setAdapter(findListViewMenuAdapter);

    }
}
