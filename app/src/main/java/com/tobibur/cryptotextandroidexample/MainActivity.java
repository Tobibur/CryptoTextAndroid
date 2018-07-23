package com.tobibur.cryptotextandroidexample;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.tobibur.cryptotextandroid.CryptoText;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private TextView mTextView;
    CryptoText cryptoText = new CryptoText();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = findViewById(R.id.textView);
        Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                String code = encryptText("abc");
                String plainText = decryptCode(code);

                mTextView.setText("Plain Text: "+ plainText+"\n\nCipher Text: "+code);
            }
        });

    }


    private String encryptText(String text) {
        String code = cryptoText.encryptInput(text);

        Log.d(TAG, "onCreate: "+code);

        return code;

    }

    private String decryptCode(String code) {
        String decode = cryptoText.decryptOutput(code);

        Log.d(TAG, "onCreate: "+decode);

        return decode;
    }

}
