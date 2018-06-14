package com.example.anvit.firstapp;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.GridLayout;
import android.widget.Toast;

import com.example.anvit.firstapp.GridMainActivity2.CCT2Activity;
import com.example.anvit.firstapp.GridMainActivity2.Civil2Activity;
import com.example.anvit.firstapp.GridMainActivity2.Cse2Activiy;
import com.example.anvit.firstapp.GridMainActivity2.Electrical2Activity;
import com.example.anvit.firstapp.GridMainActivity2.Electronics2Activity;
import com.example.anvit.firstapp.GridMainActivity2.FirstYear2Activity;
import com.example.anvit.firstapp.GridMainActivity2.GridActivity2;
import com.example.anvit.firstapp.GridMainActivity2.IS2Activity;
import com.example.anvit.firstapp.GridMainActivity2.Mech2Activity;

public class CivilActivity extends AppCompatActivity {

    GridLayout CivilSemGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_civil);
        CivilSemGrid = (GridLayout) findViewById(R.id.CivilSemGrid);

        //Set Event
        setSingleEvent(CivilSemGrid);
        //setToggleEvent(mainGrid);
    }
    private void setToggleEvent(GridLayout CivilSemGrid) {
        //Loop all child item of Main Grid
        for (int i = 0; i < CivilSemGrid.getChildCount(); i++) {
            //You can see , all child item is CardView , so we just cast object to CardView
            final CardView cardView = (CardView) CivilSemGrid.getChildAt(i);
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (cardView.getCardBackgroundColor().getDefaultColor() == -1) {
                        //Change background color
                        cardView.setCardBackgroundColor(Color.parseColor("#FF6F00"));
                        Toast.makeText(CivilActivity.this, "State : True", Toast.LENGTH_SHORT).show();

                    } else {
                        //Change background color
                        cardView.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                        Toast.makeText(CivilActivity.this, "State : False", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }

    private void setSingleEvent(GridLayout CivilSemGrid) {
        //Loop all child item of Main Grid
        for (int i = 0; i < CivilSemGrid.getChildCount(); i++) {
            //You can see , all child item is CardView , so we just cast object to CardView
            CardView cardView = (CardView) CivilSemGrid.getChildAt(i);
            final int finalI = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (finalI == 0) {
                        Intent intent = new Intent(CivilActivity.this, FirstYear2Activity.class);
                        intent.putExtra("info", "This is activity from card item index  " + finalI);
                        startActivity(intent);

                    } else if (finalI == 1) {
                        Intent intent = new Intent(CivilActivity.this, CvSemActivity.class);
                        startActivity(intent);
                    } else if (finalI == 2) {
                        Intent intent = new Intent(CivilActivity.this, Civil2Activity.class);
                        startActivity(intent);
                    } else if (finalI == 3) {
                        Intent intent = new Intent(CivilActivity.this, IS2Activity.class);
                        startActivity(intent);
                    } else if (finalI == 4) {
                        Intent intent = new Intent(CivilActivity.this, Electronics2Activity.class);
                        startActivity(intent);
                    } else if (finalI == 5) {
                        Intent intent = new Intent(CivilActivity.this, Electrical2Activity.class);
                        startActivity(intent);
                    } else if (finalI == 6) {
                        Intent intent = new Intent(CivilActivity.this, Mech2Activity.class);
                        startActivity(intent);
                    }

                }
            });
        }
    }
}
