package com.myapplication.ui.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.myapplication.R;
import com.myapplication.admin.ui.AdminActivity;
import com.myapplication.dto.Product;
import com.myapplication.dto.downlink.DownlinkImpl;
import com.myapplication.dto.downlink.IDownLink;

import java.util.ArrayList;

/**
 * Created by meher on 9/8/16.
 */

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.ViewHolder> {

    private static final String TAG = "HomeAdapter-123456";
    private ArrayList<Product> mList = new ArrayList<>();
    private AdminActivity.OnClickAdapterItem onClickAdapterItem;
    private IDownLink mDownLink;
    private Context mContext;

    public HomeAdapter(AdminActivity.OnClickAdapterItem listener, Context context) {
        onClickAdapterItem = listener;
        mContext = context;
        mDownLink = DownlinkImpl.getInstance();
//        mList = mDownLink.getProducts();

    }

//    public void addList() {
//        mList.add("Turmaric");
//        mList.add("cashew");
//        mList.add("badam");
//        mList.add("mirchi");
//
//        notifyDataSetChanged();
//    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


        LayoutInflater inflater = LayoutInflater.from(mContext);
        View v1 = inflater.inflate(R.layout.home_list_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(v1);

        return viewHolder;


    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        configureViewHolder(holder, position);
    }


    private void configureViewHolder(ViewHolder holder, int position) {
        String title = mList.get(position).getName();

        holder.mTitle.setText("" + title);


    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        private TextView mTitle;

        public ViewHolder(View itemView) {
            super(itemView);

            mTitle = (TextView) itemView.findViewById(R.id.tv_title);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onClickAdapterItem.onClickAdapterItem(v, getAdapterPosition());
                }
            });
        }
    }
}
