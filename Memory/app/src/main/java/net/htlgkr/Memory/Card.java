package net.htlgkr.Memory;

import android.widget.ImageView;

public class Card
{
    int id;
    ImageView v;
    ImageView partner;

    public Card(int id, ImageView v) {
        this.id = id;
        this.v = v;
    }
}
