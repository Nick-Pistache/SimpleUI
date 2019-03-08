package com.example.simpleui;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    Button   mButton;
    EditText mEdit;
    EditText mEdit2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEdit   = findViewById(R.id.editText);
        mEdit2   = findViewById(R.id.editText2);

        final Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        // Code here executes on main thread after user presses button
                        Context context = getApplicationContext();
                        CharSequence text = "Congratulation " + mEdit.getText().toString() +" " + mEdit2.getText().toString();

                        int duration = Toast.LENGTH_SHORT;
                        Toast toast = Toast.makeText(context, text, duration);

                        toast.setGravity(Gravity.BOTTOM|Gravity.CENTER_HORIZONTAL, 0, 100);
                        toast.show();

                    }
        });
    }
}

