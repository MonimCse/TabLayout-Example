package com.example.csemo.tablayoutexample.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.csemo.tablayoutexample.R;


public class OfficeFragment extends Fragment {


    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle)
    {
        View view = inflater.inflate(R.layout.fragment_office,viewGroup,false);
        init(view);
        return view;
    }

    private void init(View view)
    {

    }
}