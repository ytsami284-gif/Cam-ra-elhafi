package com.imad.camera;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView text = new TextView(this);
        text.setText("Camera Imad");
        text.setTextSize(24);
        text.setPadding(40, 40, 40, 40);

        setContentView(text);
    }
}
