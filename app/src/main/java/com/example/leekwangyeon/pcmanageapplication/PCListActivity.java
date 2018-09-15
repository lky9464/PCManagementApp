package com.example.leekwangyeon.pcmanageapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class PCListActivity extends AppCompatActivity {



    TextView title;
    RelativeLayout pLayout;
    ListView PClist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pclist);

        pLayout = findViewById(R.id.activity_pclist);
        pLayout.setBackgroundColor(Color.rgb(200,100,222));

//        title = findViewById(R.id.PLTitle);

        String strArray [] = {"123", "321", "456"};
        PClist = findViewById(R.id.PCList);

        PClist.setAdapter(new ArrayAdapter<>(PCListActivity.this, android.R.layout.simple_list_item_1,strArray));

    }
}
