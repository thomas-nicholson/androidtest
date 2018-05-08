package com.LRTN.espernet;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import android.widget.ToggleButton;

public class CardViewHolder extends RecyclerView.ViewHolder {

    protected TextView titleText;
    protected ToggleButton toggleButton;
    protected CardView card;

    public CardViewHolder(View itemView) {
        super(itemView);
        titleText = (TextView) itemView.findViewById(R.id.title);
        toggleButton = (ToggleButton) itemView.findViewById(R.id.toggleButton);
        card = (CardView) itemView;
    }
}