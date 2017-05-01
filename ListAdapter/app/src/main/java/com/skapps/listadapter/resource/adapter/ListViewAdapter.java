package com.skapps.listadapter.resource.adapter;


import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import com.skapps.listadapter.R;

import java.util.ArrayList;
import java.util.HashMap;

import static com.skapps.listadapter.resource.AppConstant.CDESC;
import static com.skapps.listadapter.resource.AppConstant.CNAME;
import static com.skapps.listadapter.resource.AppConstant.CNO;


public class ListViewAdapter extends BaseAdapter
{
    public ArrayList<HashMap<String,String>> list;
    Activity activity;


    public ListViewAdapter(Activity activity, ArrayList<HashMap<String,String>> list) {
        super();
        this.activity = activity;

        this.list = list;
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return 0;
    }

    private class ViewHolder {

        TextView NameTxt;
        TextView DescTxt;
        TextView ContactTxt;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub

        // TODO Auto-generated method stub
        ViewHolder holder;
        LayoutInflater inflater =  activity.getLayoutInflater();

        if (convertView == null)
        {
            convertView =  inflater.inflate(R.layout.table_list, null);
            holder = new ViewHolder();


            holder.NameTxt = (TextView) convertView.findViewById(R.id.NameTxt);
            holder.DescTxt = (TextView) convertView.findViewById(R.id.DescTxt);
            holder.ContactTxt = (TextView) convertView.findViewById(R.id.ContactTxt);


            convertView.setTag(holder);
        }
        else
        {
            holder = (ViewHolder) convertView.getTag();
        }

        HashMap map = list.get(position);




            try {


                holder.NameTxt.setText(map.get(CNAME).toString());
                holder.ContactTxt.setText(map.get(CNO).toString());
                holder.DescTxt.setText(map.get(CDESC).toString());

            }
            catch(Exception e){
                System.out.println("Error Contact list: "+e.toString());
            }





        return convertView;
    }

}