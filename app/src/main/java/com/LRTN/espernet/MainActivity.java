package com.LRTN.espernet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ToggleButton;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    ToggleButton toggleButton;

    public void clickFunction(View view) {
        toggleButton = (ToggleButton) view;
        Log.i("toggle button is...", Boolean.toString(toggleButton.isChecked()));

        if (toggleButton.isChecked()) {
            VirtualDevice.on();
        }

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerList);
        LinearLayoutManager linearLM = new LinearLayoutManager(this);
        linearLM.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLM);

        recyclerView.setAdapter(new RecycleAdapter(generateBooks()));
    }

    private List<Device> generateBooks() {
        List<Device> devices = new ArrayList<>();
        devices.add(new VirtualDevice());
        devices.add(new VirtualDevice());
        devices.add(new VirtualDevice());
        devices.add(new VirtualDevice());
        devices.add(new VirtualDevice());
        devices.add(new VirtualDevice());
        devices.add(new VirtualDevice());

        return devices;
    }

}
