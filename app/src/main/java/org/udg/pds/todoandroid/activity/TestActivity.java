package org.udg.pds.todoandroid.activity;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.udg.pds.todoandroid.R;

public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        EditText editText = findViewById(R.id.editText);
        ((Button) findViewById(R.id.button2)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText.getText().toString().isEmpty()) {
                    TestActivity.this.setResult(Activity.RESULT_CANCELED);
                    TestActivity.this.finish();
                } else {
                    Intent data = new Intent();
                    data.putExtra("result", editText.getText().toString());
                    TestActivity.this.setResult(Activity.RESULT_OK, data);
                    TestActivity.this.finish();
                }

            }
        });

    }
}
