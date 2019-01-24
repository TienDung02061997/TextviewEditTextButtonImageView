package com.example.nguyentiendung.textviewedittextbuttonimageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class giaodien extends AppCompatActivity implements View.OnClickListener {

    Button hienthi;
    EditText edhienthi;
    String a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giaodien);
        hienthi=(Button)findViewById(R.id.hienthi);
        hienthi.setOnClickListener(this);
        edhienthi=(EditText)findViewById(R.id.edhienthi);
    }

    @Override
    public void onClick(View v) {
        a=edhienthi.getText().toString();
        Toast.makeText(giaodien.this,a,Toast.LENGTH_LONG).show();
    }
}
