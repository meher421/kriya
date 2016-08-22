package com.myapplication.ui;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.myapplication.R;
import com.myapplication.Utils.Logger;
import com.myapplication.admin.ui.AdminActivity;
import com.myapplication.ui.adapters.HomeAdapter;


public class HomeFragment extends Fragment implements AdminActivity.OnClickAdapterItem{

    private RecyclerView mRecyclerView;
    private HomeAdapter mAdapter;
    private final String TAG = "HomeFragment-123456";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        getActivity().setTitle(getString(R.string.tit_home));

        View view = inflater.inflate(R.layout.fragment_home, container, false);

        mRecyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));


        mAdapter = new HomeAdapter(this,getActivity());


        mRecyclerView.setAdapter(mAdapter);
        mAdapter.addList();


        return view;
    }


    @Override
    public void onClickAdapterItem(View view, int position) {
        Logger.i(TAG,"onClickAdapterItem : "+position);

        DownlinkIntentService.startActionFoo(getActivity(),"","");

    }
}
