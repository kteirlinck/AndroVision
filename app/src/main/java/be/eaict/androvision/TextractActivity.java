package be.eaict.androvision;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TextractActivity extends AppCompatActivity {

    private static final String LOG_TAG = TextractActivity.class.getSimpleName();

    private EditText mEditText;
    private Button btnSave, btnReturn;
    public static final int TEXT_REQUEST = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_textract);

        btnSave = (Button)findViewById(R.id.btnSave);
        btnReturn = (Button)findViewById(R.id.btnReturn);

        Intent intent = getIntent();
        String message = intent.getStringExtra(CameraActivity.EXTRA_MESSAGE);
        EditText editText = (EditText) findViewById(R.id.EditTextResult);
        editText.setText(message);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Save();
            }
        });

        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TextractActivity.this, CameraActivity.class);
                startActivityForResult(intent, TEXT_REQUEST);
            }
        });

    }

    public void Save(){

    }


}


