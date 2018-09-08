package com.example.dushyant.basic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edt;
    Button btn1,btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt=findViewById(R.id.editText);

        btn1=findViewById(R.id.short_button);

        btn2=findViewById(R.id.long_button);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(( edt.getText().toString())))
                {
                    edt.setError("Khali mat chhodo yrr..");
                    return;
                }
                String str= edt.getText().toString();
                Toast.makeText(MainActivity.this, ""+str, Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void LongToast (View v)
    {
        if(TextUtils.isEmpty(( edt.getText().toString())))
        {
            edt.setError("Khali mat chhodo yrr..");
            return;
        }
        String str =edt.getText().toString();
        Toast.makeText(MainActivity.this,""+str,Toast.LENGTH_LONG).show();
    }
}
