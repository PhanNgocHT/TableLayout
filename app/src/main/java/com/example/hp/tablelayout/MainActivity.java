package com.example.hp.tablelayout;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button btnColorRed, btnColorYellow, btnColorIndigo, btnClear;
    private TextView tvBackground;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        btnColorRed= (Button) findViewById(R.id.btn_color_red);
        btnColorYellow= (Button) findViewById(R.id.btn_color_yellow);
        btnColorIndigo= (Button) findViewById(R.id.btn_color_indigo);
        btnClear= (Button) findViewById(R.id.btn_clear);
        tvBackground= (TextView) findViewById(R.id.tv_background);

        btnColorRed.setOnClickListener(this);
        btnColorYellow.setOnClickListener(this);
        btnColorIndigo.setOnClickListener(this);
        btnClear.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_color_red:
                tvBackground.setBackgroundResource(R.color.colorRed);
                break;
            case R.id.btn_color_yellow:
                tvBackground.setBackgroundResource(R.color.colorYellow);
                break;
            case R.id.btn_color_indigo:
                tvBackground.setBackgroundResource(R.color.colorIndigo);
                break;
            case R.id.btn_clear:
                tvBackground.setBackgroundColor(Color.BLACK);
                break;
            default:
                break;
        }
    }
}
