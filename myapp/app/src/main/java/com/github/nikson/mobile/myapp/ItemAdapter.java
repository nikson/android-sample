package com.github.nikson.mobile.myapp;

import android.content.Context;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.github.nikson.mobile.myapp.model.Friend;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Nikson
 */
public class ItemAdapter extends
        RecyclerView.Adapter<ItemAdapter.ViewHolder> {

    private List<Friend> listData;

    public ItemAdapter(List<Friend> data) {
        listData = data;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context ctx = parent.getContext();
        LayoutInflater inflator = LayoutInflater.from(ctx);

        View listItemView = inflator.inflate(R.layout.listview_item, parent, false);

        ViewHolder holder = new ViewHolder(listItemView);

        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        Friend frnd = listData.get(position);

        TextView textView = holder.nameTextView;
        textView.setText(frnd.getName());

        Button button = holder.viewBtn;

        if (frnd.isActive()) {
            button.setEnabled(true);
        } else {
            button.setText("Inactive");
            button.setEnabled(false);
        }
    }

    @Override
    public int getItemCount() {
        return (listData != null ? listData.size() : 0);
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        @Bind(R.id.name)
        public TextView nameTextView;

        @Bind(R.id.viewBtn)
        public Button viewBtn;

        public ViewHolder(View itemView) {

            super(itemView);

            ButterKnife.bind(this, itemView);
        }

        @OnClick(R.id.viewBtn)
        public void viewBtnOnClick(View v) {
            Snackbar.make(v, "Detail view not implemented yet", Snackbar.LENGTH_SHORT)
                    .show();
        }
    }
}
