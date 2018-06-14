package com.example.anvit.firstapp;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.GridLayout;
import android.widget.Toast;

import com.example.anvit.firstapp.CseSem.Csesem11;
import com.example.anvit.firstapp.CseSem.Csesem12;
import com.example.anvit.firstapp.CseSem.Csesem13;
import com.example.anvit.firstapp.CseSem.Csesem14;
import com.example.anvit.firstapp.CseSem.Csesem15;
import com.example.anvit.firstapp.GridMainActivity.GridActivity;
import com.github.barteksc.pdfviewer.PDFView;

public class CseActivity extends AppCompatActivity {

    GridLayout cse1grid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse);
        cse1grid = (GridLayout) findViewById(R.id.cse1grid);

        //Set Event
        setSingleEvent(cse1grid);
        //setToggleEvent(mainGrid);
    }

    private void setToggleEvent(GridLayout cse1grid) {
        //Loop all child item of Main Grid
        for (int i = 0; i < cse1grid.getChildCount(); i++) {
            //You can see , all child item is CardView , so we just cast object to CardView
            final CardView cardView = (CardView) cse1grid.getChildAt(i);
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (cardView.getCardBackgroundColor().getDefaultColor() == -1) {
                        //Change background color
                        cardView.setCardBackgroundColor(Color.parseColor("#FF6F00"));
                        Toast.makeText(CseActivity.this, "State : True", Toast.LENGTH_SHORT).show();

                    } else {
                        //Change background color
                        cardView.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                        Toast.makeText(CseActivity.this, "State : False", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }
    private void setSingleEvent(GridLayout cse1grid) {
        //Loop all child item of Main Grid
        for (int i = 0; i < cse1grid.getChildCount(); i++) {
            //You can see , all child item is CardView , so we just cast object to CardView
            CardView cardView = (CardView) cse1grid.getChildAt(i);
            final int finalI = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (finalI == 0) {
                        Intent intent = new Intent(CseActivity.this, Csesem11.class);
                        intent.putExtra("info", "This is activity from card item index  " + finalI);
                        startActivity(intent);

                    } else if (finalI == 1) {
                        Intent intent = new Intent(CseActivity.this, Csesem12.class);
                        startActivity(intent);
                    } else if (finalI == 2) {
                        Intent intent = new Intent(CseActivity.this, Csesem13.class);
                        startActivity(intent);
                    } else if (finalI == 3) {
                        Intent intent = new Intent(CseActivity.this, Csesem14.class);
                        startActivity(intent);
                    } else if (finalI == 4) {
                        Intent intent = new Intent(CseActivity.this, Csesem15.class);
                        startActivity(intent);
                    } else if (finalI == 5) {
                        Intent intent = new Intent(CseActivity.this, Csesem15.class);
                        startActivity(intent);
                    }

                }
            });
        }
    }
}
