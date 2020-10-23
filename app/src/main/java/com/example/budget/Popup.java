package com.example.budget;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Popup extends AppCompatActivity {
    ExampleAdapter ex;
    MainActivity main=new MainActivity();
    private FloatingActionButton floatingActionButton;
    private EditText mTextView1;
    private EditText mTextView2;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_small);
        mTextView1 = findViewById(R.id.editText_item);
        mTextView2 = findViewById(R.id.editText_rate);
        floatingActionButton=findViewById(R.id.add);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in =new Intent();
                in.putExtra("text1",
                        mTextView1.getText().toString()).putExtra("text2",mTextView2.getText().toString());
                setResult(RESULT_OK,in);
                finish();
            }
        });
    }
}

