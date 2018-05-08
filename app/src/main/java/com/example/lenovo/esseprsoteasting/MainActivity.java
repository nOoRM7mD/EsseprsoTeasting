package com.example.lenovo.esseprsoteasting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView mText;
    EditText mEditText;
    Button mBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtn=(Button)findViewById(R.id.button);
        mEditText=(EditText)findViewById(R.id.edit_text);
        mText=(TextView)findViewById(R.id.text_view);
        mBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mText.setText(mEditText.getText());
            }
        });
    }
}
