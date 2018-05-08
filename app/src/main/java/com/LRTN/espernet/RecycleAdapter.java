package com.LRTN.espernet;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import java.util.ArrayList;
import java.util.List;

public class RecycleAdapter extends RecyclerView.Adapter<CardViewHolder> {

    private List<Device> devices;

    public RecycleAdapter(List<Device> devices) {
        this.devices = new ArrayList<>();
        this.devices.addAll(devices);
    }

    @Override
    public CardViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.
                from(viewGroup.getContext()).
                inflate(R.layout.card_view, viewGroup, false);

        return new CardViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(CardViewHolder CardViewHolder, int i) {
        Device device = devices.get(i);
        CardViewHolder.titleText.setText(device.getName());
        if (device.getState() == "on") {
            CardViewHolder.toggleButton.setChecked(true);
        } else {
            CardViewHolder.toggleButton.setChecked(false);
        }

        //CardViewHolder.card.setCardBackgroundColor(device.getIntValue());
    }

    @Override
    public int getItemCount() {
        return devices.size();
    }
}