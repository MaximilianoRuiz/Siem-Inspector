package com.example.maxi.siem_inspector.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.maxi.siem_inspector.R;

public class LateralMenuFragment extends Fragment {

    public LateralMenuFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_lateral_menu, container, false);
    }

}
