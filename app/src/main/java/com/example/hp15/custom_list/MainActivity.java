package com.example.hp15.custom_list;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends Activity {

    ListView lt;
    ArrayList<String> pnm,pr , m;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lt=(ListView)findViewById(R.id.listView1);

        pnm=new ArrayList<String>();
        pr=new ArrayList<String>();
        pnm.add("TV");
        pnm.add("AC");
        pr.add("18000");
        pr.add("89000");
        pnm.add("TV");
        pnm.add("AC");
        pr.add("18000");
        pr.add("89000");

        pnm.add("TV");
        pnm.add("AC");
        pr.add("18000");
        pr.add("89000");

        pnm.add("TV");
        pnm.add("AC");
        pr.add("18000");
        pr.add("89000");
        pnm.add("TV");
        pnm.add("AC");
        pr.add("18000");
        pr.add("89000");
        pnm.add("TV");
        pnm.add("AC");
        pr.add("18000");
        pr.add("89000");

        pnm.add("TV");
        pnm.add("AC");
        pr.add("18000");
        pr.add("89000");

        pnm.add("TV");
        pnm.add("AC");
        pr.add("18000");
        pr.add("89000");
        Custom c=new Custom(getApplicationContext(),pnm,pr);

        lt.setAdapter(c);

    }


}