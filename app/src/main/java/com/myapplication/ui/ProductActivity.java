package com.myapplication.ui;

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
import com.myapplication.dto.IMarket;
import com.myapplication.dto.MarketHelper;
import com.myapplication.testdto.Product;
import com.myapplication.testdto.downlink.DownlinkImpl;
import com.myapplication.testdto.downlink.IDownLink;

import java.util.ArrayList;

/**
 * Created by meher on 23/8/16.
 */

public class ProductActivity extends AppCompatActivity {

    private ViewPager mPager;
    private MyAdapter mAdapter;
    private Context mContext;
    private ArrayList<Product> mProducts;
    private IMarket market;

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

        market = MarketHelper.getInstance();
        int productsCount = market.getProducts().size();
//        mProducts = mDownLink.getProducts().;


        mAdapter = new ProductActivity.MyAdapter(getSupportFragmentManager(),productsCount);


    }



    public class MyAdapter extends FragmentStatePagerAdapter {

        ArrayList<AdminFragment> fragments = new ArrayList<>();

        public MyAdapter(FragmentManager fragmentManager,int size) {
            super(fragmentManager);

            init(size);
        }

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
                fragments.add(ProductsFragment.init(mProducts.get(i).getId()));
            }
        }
    }
}
