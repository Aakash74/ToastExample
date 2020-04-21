package com.example.toastex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnToast, btnGravityToast, btnOffsetToast,btncustomTost;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnToast = findViewById(R.id.btnBasicToast);
        btnGravityToast = findViewById(R.id.btnGravityToast);
        btnOffsetToast = findViewById(R.id.btnOffsetToast);

        btnToast.setOnClickListener(this);
        btnGravityToast.setOnClickListener(this);
        btnOffsetToast.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnBasicToast:

                Toast.makeText(getApplicationContext(),  "Basic toast", Toast.LENGTH_SHORT).show();

                break;
            case R.id.btnGravityToast:
                Toast toast = Toast.makeText(getApplicationContext(), "Toast with Gravity", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL, 0, 0);
                toast.show();
                break;
            case R.id.btnOffsetToast:
                toast = Toast.makeText(getApplicationContext(), "Toast With Offset", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.TOP | Gravity.LEFT,150,150);
                toast.show();
                break;


        }

    }
}
