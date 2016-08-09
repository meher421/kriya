package com.myapplication.ui;

import android.app.Fragment;
import android.app.FragmentManager;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v13.app.FragmentPagerAdapter;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.myapplication.R;
import com.myapplication.ui.VerticalViewPager;

import java.util.Locale;


public class HomeFragment extends Fragment {

    private RecyclerView mRecyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        getActivity().setTitle(getString(R.string.tit_home));

        View view = inflater.inflate(R.layout.fragment_home, container, false);

        mRecyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);



        return view;
    }


}
