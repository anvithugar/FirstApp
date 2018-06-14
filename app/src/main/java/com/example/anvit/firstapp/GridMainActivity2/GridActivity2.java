package com.example.anvit.firstapp.GridMainActivity2;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
import com.example.anvit.firstapp.GridMainActivity.GridActivity;
import com.example.anvit.firstapp.ISActivity;
import com.example.anvit.firstapp.MechActivity;
import com.example.anvit.firstapp.R;

public class GridActivity2 extends AppCompatActivity {

    GridLayout mainGrid2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid2);
        mainGrid2 = (GridLayout) findViewById(R.id.mainGrid2);

        //Set Event
        setSingleEvent(mainGrid2);
        //setToggleEvent(mainGrid);
    }


    private void setToggleEvent(GridLayout mainGrid2) {
        //Loop all child item of Main Grid
        for (int i = 0; i < mainGrid2.getChildCount(); i++) {
            //You can see , all child item is CardView , so we just cast object to CardView
            final CardView cardView = (CardView) mainGrid2.getChildAt(i);
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (cardView.getCardBackgroundColor().getDefaultColor() == -1) {
                        //Change background color
                        cardView.setCardBackgroundColor(Color.parseColor("#FF6F00"));
                        Toast.makeText(GridActivity2.this, "State : True", Toast.LENGTH_SHORT).show();

                    } else {
                        //Change background color
                        cardView.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                        Toast.makeText(GridActivity2.this, "State : False", Toast.LENGTH_SHORT).show();
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
                        Intent intent = new Intent(GridActivity2.this, FirstYear2Activity.class);
                        intent.putExtra("info", "This is activity from card item index  " + finalI);
                        startActivity(intent);

                    } else if (finalI == 1) {
                        Intent intent = new Intent(GridActivity2.this, Cse2Activiy.class);
                        startActivity(intent);
                    } else if (finalI == 2) {
                        Intent intent = new Intent(GridActivity2.this, Civil2Activity.class);
                        startActivity(intent);
                    } else if (finalI == 3) {
                        Intent intent = new Intent(GridActivity2.this, IS2Activity.class);
                        startActivity(intent);
                    } else if (finalI == 4) {
                        Intent intent = new Intent(GridActivity2.this, Electronics2Activity.class);
                        startActivity(intent);
                    } else if (finalI == 5) {
                        Intent intent = new Intent(GridActivity2.this, Electrical2Activity.class);
                        startActivity(intent);
                    } else if (finalI == 6) {
                        Intent intent = new Intent(GridActivity2.this, Mech2Activity.class);
                        startActivity(intent);
                    } else if (finalI == 7) {
                        Intent intent = new Intent(GridActivity2.this, CCT2Activity.class);
                        startActivity(intent);
                    }

                }
            });
        }
    }
}
