package com.kazakovdmitri.homework9_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Utils.onActivityCreateSetTheme(this);
        setContentView(R.layout.activity_main);
        InitViews();
    }

    private void InitViews() {
        Button btnSetMargin = findViewById(R.id.buttonMargin);
        final RadioGroup radioGroupMargin = findViewById(R.id.radioGroupMargin);
        btnSetMargin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId = radioGroupMargin.getCheckedRadioButtonId();

                switch (selectedId) {
                    case R.id.radioButtonBig: {
                        Utils.changeToMargin(MainActivity.this, Utils.THEME_BIG);
                        break;
                    }
                    case R.id.radioButtonMiddle: {
                        Utils.changeToMargin(MainActivity.this, Utils.THEME_MIDDLE);
                        break;
                    }
                    case R.id.radioButtonSmall: {
                        Utils.changeToMargin(MainActivity.this, Utils.THEME_SMALL);
                        break;
                    }
                }
            }
        });

    }
}