package net.htlgkr.Memory;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    List<ImageView> imageViewList = new ArrayList<>();
    List<Card> cardList = new ArrayList<>();
    public void loadImageViews()
    {
        imageViewList.add(findViewById(R.id.imageView2));
        imageViewList.add(findViewById(R.id.imageView3));
        imageViewList.add(findViewById(R.id.imageView4));
        imageViewList.add(findViewById(R.id.imageView5));
        imageViewList.add(findViewById(R.id.imageView5));
        imageViewList.add(findViewById(R.id.imageView6));
        imageViewList.add(findViewById(R.id.imageView7));
        imageViewList.add(findViewById(R.id.imageView8));
        imageViewList.add(findViewById(R.id.imageView9));
        imageViewList.add(findViewById(R.id.imageView10));
        imageViewList.add(findViewById(R.id.imageView11));
        imageViewList.add(findViewById(R.id.imageView12));
        imageViewList.add(findViewById(R.id.imageView13));
        imageViewList.add(findViewById(R.id.imageView14));
        imageViewList.add(findViewById(R.id.imageView15));
        imageViewList.add(findViewById(R.id.imageView16));
        imageViewList.add(findViewById(R.id.imageView17));
        imageViewList.add(findViewById(R.id.imageView18));

        for (ImageView temp:imageViewList)
        {
            temp.setOnClickListener(this);
        }
        Random r = new Random();
        List<Integer> imageNumberList = new ArrayList<>();
        for (int i = 0; i < 8; i++)
        {
            int random = r.nextInt(9);
            if(!imageNumberList.contains(random))
            {
                cardList.add(new Card(random, imageViewList.get(i)));
                imageNumberList.add(random);
            }
        }
        imageNumberList.clear();
        for (int i = 9; i < 17; i++)
        {
            int random = r.nextInt(9);
            if(!imageNumberList.contains(random))
            {
                cardList.add(new Card(random, imageViewList.get(i)));
                imageNumberList.add(random);
            }
        }
    }

    @Override
    public void onClick(View v)
    {

    }
}