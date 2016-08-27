package com.myapplication.ui.adapters;

import android.content.Context;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.myapplication.R;
import com.myapplication.admin.ui.AdminFragment;
import com.myapplication.dto.Product;
import com.myapplication.dto.downlink.DownlinkImpl;
import com.myapplication.dto.downlink.IDownLink;

import java.util.ArrayList;

/**
 * Created by meher on 23/8/16.
 */

public class ProductActivity extends AppCompatActivity {

    private ViewPager mPager;
    private IDownLink mDownLink;
    private MyAdapter mAdapter;
    private Context mContext;
    private ArrayList<Product> mProducts;

    private String TAG = "ProductActivity-123456";

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.product_parent_layout);
        mPager = (ViewPager) findViewById(R.id.pager);

        mDownLink =  DownlinkImpl.getInstance();
//        mProducts = mDownLink.getProducts().;


        mAdapter = new ProductActivity.MyAdapter(getSupportFragmentManager(),3);


    }



    public class MyAdapter extends FragmentStatePagerAdapter {

        ArrayList<AdminFragment> fragments = new ArrayList<>();

        public MyAdapter(FragmentManager fragmentManager,int size) {
            super(fragmentManager);

            init(size);
        }

        /*public void addFragment() {
            Logger.i(TAG, " products size ;  " + mProducts.size());
            int id = -1;

            id = mProducts.get(fragments.size()).getId();
            fragments.add(AdminFragment.init(id));

        }*/

        @Override
        public int getCount() {
            int size = mProducts.size();
            return size > 0 ? size : 1;
        }


        @Override
        public AdminFragment getItem(int position) {
            return fragments.get(position);
        }


        public void init(int size) {
            for (int i = 0; i < size; i++) {
                fragments.add(AdminFragment.init(mProducts.get(i).getId()));
            }
        }
    }
}
