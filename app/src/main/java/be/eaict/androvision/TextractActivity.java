package be.eaict.androvision;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class TextractActivity extends AppCompatActivity {

    private static final String LOG_TAG = TextractActivity.class.getSimpleName();

    private EditText mEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_textract);

        Intent intent = getIntent();
        String message = intent.getStringExtra(CameraActivity.EXTRA_MESSAGE);
        EditText editText = (EditText) findViewById(R.id.EditTextResult);
        editText.setText(message);
    }
}


