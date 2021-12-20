package com.example.android1homework3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class GameActivity extends AppCompatActivity {
    ImageView imImage;
    Button btn1, btn2, btn3;
    Button btnOne, btnTwo, btnThree;
    boolean isBloom, isFlora, isStella;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        initialization();
        listeners();
    }


    private void initialization() {
        imImage = findViewById(R.id.im_image);
        btnOne = findViewById(R.id.btn_one);
        btnTwo = findViewById(R.id.btn_two);
        btnThree = findViewById(R.id.btn_three);
        btn1 = findViewById(R.id.btn_1);
        btn2 = findViewById(R.id.btn_2);
        btn3 = findViewById(R.id.btn_3);
    }

    public void changeImage(View view) {
        switch (view.getId()) {
            case R.id.btn_1:
                imImage.setImageResource(R.drawable.bloom);
                isBloom = true;
                isFlora = false;
                isStella = false;
                break;
            case R.id.btn_2:
                imImage.setImageResource(R.drawable.flora);
                isFlora = true;
                isBloom = false;
                isStella = false;
                break;
            case R.id.btn_3:
                imImage.setImageResource(R.drawable.stella);
                isStella = true;
                isBloom = false;
                isFlora = false;
                break;


        }
    }

    private void listeners() {
        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isBloom) {
                    Toast.makeText(GameActivity.this, "Правильно", Toast.LENGTH_LONG).show();
                } else
                    Toast.makeText(GameActivity.this, "Не правильно", Toast.LENGTH_LONG).show();
            }
        });
        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isFlora) {
                    Toast.makeText(GameActivity.this,"Правильно", Toast.LENGTH_LONG).show();
                } else
                    Toast.makeText(GameActivity.this,"Не правильно", Toast.LENGTH_LONG).show();
            }
        });
        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ( isStella){
                    Toast.makeText(GameActivity.this,"Правильно",Toast.LENGTH_LONG).show();
                }else
                    Toast.makeText(GameActivity.this,"Не правильно",Toast.LENGTH_LONG).show();
            }
        });
    }

}