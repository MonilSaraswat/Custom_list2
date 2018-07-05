package com.example.hp15.custom_list;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Custom extends BaseAdapter {

    Context cnt;
    ArrayList<String> pnm=new ArrayList<String>();
    ArrayList<String> pr=new ArrayList<String>();
    LayoutInflater lyt;
    public Custom(Context applicationContext, ArrayList<String> pnm,
                  ArrayList<String> pr) {
        // TODO Auto-generated constructor stub

        this.pnm=pnm;
        this.pr=pr;
        cnt=applicationContext;
        lyt= LayoutInflater.from(cnt);
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return pnm.size() ;
    }

    @Override
    public Object getItem(int arg0) {
        // TODO Auto-generated method stub
        return pnm.get(arg0);
    }

    @Override
    public long getItemId(int arg0) {
        // TODO Auto-generated method stub
        return arg0;
    }

    @Override
    public View getView(int arg0, View arg1, ViewGroup arg2) {
        // TODO Auto-generated method stub




        arg1= lyt.inflate(R.layout.activity_custom,null);
        TextView t1=(TextView)arg1.findViewById(R.id.textView1);
        TextView t2=(TextView)arg1.findViewById(R.id.textView2);
        t1.setText(pnm.get(arg0));
        t2.setText(pr.get(arg0));
        t1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub

                Toast.makeText(cnt,"Event on list", Toast.LENGTH_SHORT).show();
            }
        });
        return arg1;
    }



}