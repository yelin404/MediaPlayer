package com.example.wether.CityManager;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.wether.R;

import java.util.List;

public class DeleteCityAdapter extends BaseAdapter {
    Context context;
    List<String>mDatas;
    List<String>deleteCitys;  //表示存储了删除的城市信息



    public DeleteCityAdapter(Context context, List<String> mDatas,List<String>deleteCitys) {
        this.context = context;
        this.mDatas = mDatas;
        this.deleteCitys = deleteCitys;
    }

    @Override
    public int getCount() {
        return mDatas.size();
    }

    @Override
    public Object getItem(int position) {
        return mDatas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item_deletecity,null);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        String city = mDatas.get(position);
        holder.itemDeleteTv.setText(city);
        holder.itemDeleteIv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDatas.remove(city);
                deleteCitys.add(city);
                notifyDataSetChanged();
            }
        });


        return convertView;
    }

    class ViewHolder {
        TextView itemDeleteTv;
        ImageView itemDeleteIv;

        public ViewHolder(View itemView) {
            itemDeleteTv = itemView.findViewById(R.id.item_delete_tv);
            itemDeleteIv = itemView.findViewById(R.id.item_delete_iv);
        }
    }
}
