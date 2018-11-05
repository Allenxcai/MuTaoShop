package com.allenxcai.mutaoshop.fragment;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.allenxcai.mutaoshop.LoginActivity;
import com.allenxcai.mutaoshop.R;

/**
 * 我的页
 */
public class MeFragment extends Fragment {
    protected Button mBtnLogin;

    public MeFragment() {
        // Required empty public constructor
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_me, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mBtnLogin = getView().findViewById(R.id.login_btn);
        mBtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //登录
                Intent login= new Intent(getActivity(), LoginActivity.class);
                startActivity(login);

            }
        });
    }
}
