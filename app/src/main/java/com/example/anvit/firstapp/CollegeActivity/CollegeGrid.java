package com.example.anvit.firstapp.CollegeActivity;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.GridLayout;
import android.widget.Toast;

import com.example.anvit.firstapp.CseActivity;
import com.example.anvit.firstapp.FirstYearActivity;
import com.example.anvit.firstapp.GridMainActivity.GridActivity;
import com.example.anvit.firstapp.GridMainActivity2.FirstYear2Activity;
import com.example.anvit.firstapp.GridMainActivity2.GridActivity2;
import com.example.anvit.firstapp.R;

public class CollegeGrid extends AppCompatActivity {
    GridLayout SecondGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_college_grid);

        SecondGrid = (GridLayout) findViewById(R.id.SecondGrid);

        //Set Event
        setSingleEvent(SecondGrid);
        //setToggleEvent(mainGrid);
    }

    private void setToggleEvent(GridLayout SecondGrid) {
        //Loop all child item of Main Grid
        for (int i = 0; i < SecondGrid.getChildCount(); i++) {
            //You can see , all child item is CardView , so we just cast object to CardView
            final CardView cardView = (CardView) SecondGrid.getChildAt(i);
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (cardView.getCardBackgroundColor().getDefaultColor() == -1) {
                        //Change background color
                        cardView.setCardBackgroundColor(Color.parseColor("#FF6F00"));
                        Toast.makeText(CollegeGrid.this, "State : True", Toast.LENGTH_SHORT).show();

                    } else {
                        //Change background color
                        cardView.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                        Toast.makeText(CollegeGrid.this, "State : False", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }

    private void setSingleEvent(GridLayout SecondGrid) {
        //Loop all child item of Main Grid
        for (int i = 0; i < SecondGrid.getChildCount(); i++) {
            //You can see , all child item is CardView , so we just cast object to CardView
            CardView cardView = (CardView) SecondGrid.getChildAt(i);
            final int finalI = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    if (finalI == 0) {
                        Intent intent = new Intent(CollegeGrid.this, GridActivity.class);
                        intent.putExtra("info", "This is activity from card item index  " + finalI);
                        startActivity(intent);

                    } else if (finalI == 1) {
                        Intent intent = new Intent(CollegeGrid.this, GridActivity2.class);
                        startActivity(intent);

                }
                }
            });
        }
    }
}

