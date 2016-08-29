package com.myapplication.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;

import com.myapplication.admin.ui.AdminFragment;

/**
 * Created by meher on 21/8/16.
 */

public class ProductsFragment extends Fragment implements View.OnClickListener {


    public static AdminFragment init(int val) {
        AdminFragment fragment = new AdminFragment();

        Bundle args = new Bundle();
        args.putInt("val", val);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onClick(View v) {

    }
}
