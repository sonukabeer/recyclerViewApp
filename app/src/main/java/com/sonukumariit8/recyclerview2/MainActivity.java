package com.sonukumariit8.recyclerview2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Contact o1=new Contact(1,"8564081306","Kabeer");
    Contact o2=new Contact(1,"8564081306","Kabeer");
    Contact o3=new Contact(1,"8564081306","Kabeer");
    Contact o4=new Contact(1,"8564081306","Kabeer");
    Contact o5=new Contact(1,"8564081306","Kabeer");
    Contact o6=new Contact(1,"8564081306","Kabeer");
    Contact o7=new Contact(1,"8564081306","Kabeer");
    Contact o8=new Contact(1,"8564081306","Kabeer");
    Contact o9=new Contact(1,"8564081306","Kabeer");
    Contact o10=new Contact(1,"8564081306","Kabeer");
    Contact o11=new Contact(1,"8564081306","Kabeer");
    Contact o12=new Contact(1,"8564081306","Kabeer");
    Contact o13=new Contact(1,"8564081306","Kabeer");
    Contact [] contacts={o1,o2,o3,o4,o5,o6,o7,o8,o9,o10,o11,o12,o13};
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerView2);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        CustomAdapter ad=new CustomAdapter(contacts);
        recyclerView.setAdapter(ad);
        recyclerView.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));
    }
}