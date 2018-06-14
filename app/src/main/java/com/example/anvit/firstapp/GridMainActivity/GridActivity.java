package com.example.anvit.firstapp.GridMainActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.GridLayout;
import android.widget.Toast;

import com.example.anvit.firstapp.CCTActivity;
import com.example.anvit.firstapp.CivilActivity;
import com.example.anvit.firstapp.CseActivity;
import com.example.anvit.firstapp.ElectricalActivity;
import com.example.anvit.firstapp.ElectronicsActivity;
import com.example.anvit.firstapp.FirstYearActivity;
import com.example.anvit.firstapp.ISActivity;
import com.example.anvit.firstapp.MechActivity;
import com.example.anvit.firstapp.R;

public class GridActivity extends AppCompatActivity {


    GridLayout mainGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);
        mainGrid = (GridLayout) findViewById(R.id.mainGrid);

        //Set Event
        setSingleEvent(mainGrid);
        //setToggleEvent(mainGrid);
    }


    private void setToggleEvent(GridLayout mainGrid) {
        //Loop all child item of Main Grid
        for (int i = 0; i < mainGrid.getChildCount(); i++) {
            //You can see , all child item is CardView , so we just cast object to CardView
            final CardView cardView = (CardView) mainGrid.getChildAt(i);
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (cardView.getCardBackgroundColor().getDefaultColor() == -1) {
                        //Change background color
                        cardView.setCardBackgroundColor(Color.parseColor("#FF6F00"));
                        Toast.makeText(GridActivity.this, "State : True", Toast.LENGTH_SHORT).show();

                    } else {
                        //Change background color
                        cardView.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                        Toast.makeText(GridActivity.this, "State : False", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }

    private void setSingleEvent(GridLayout mainGrid) {
        //Loop all child item of Main Grid
        for (int i = 0; i < mainGrid.getChildCount(); i++) {
            //You can see , all child item is CardView , so we just cast object to CardView
            CardView cardView = (CardView) mainGrid.getChildAt(i);
            final int finalI = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (finalI == 0) {
                        Intent intent = new Intent(GridActivity.this, FirstYearActivity.class);
                        intent.putExtra("info", "This is activity from card item index  " + finalI);
                        startActivity(intent);

                    } else if (finalI == 1) {
                        Intent intent = new Intent(GridActivity.this, CseActivity.class);
                        startActivity(intent);
                    } else if (finalI == 2) {
                        Intent intent = new Intent(GridActivity.this, CivilActivity.class);
                        startActivity(intent);
                    } else if (finalI == 3) {
                        Intent intent = new Intent(GridActivity.this, ISActivity.class);
                        startActivity(intent);
                    } else if (finalI == 4) {
                        Intent intent = new Intent(GridActivity.this, ElectronicsActivity.class);
                        startActivity(intent);
                    } else if (finalI == 5) {
                        Intent intent = new Intent(GridActivity.this, ElectricalActivity.class);
                        startActivity(intent);
                    } else if (finalI == 6) {
                        Intent intent = new Intent(GridActivity.this, MechActivity.class);
                        startActivity(intent);
                    } else if (finalI == 7) {
                        Intent intent = new Intent(GridActivity.this, CCTActivity.class);
                        startActivity(intent);
                    }

                }
            });
        }
    }
}




