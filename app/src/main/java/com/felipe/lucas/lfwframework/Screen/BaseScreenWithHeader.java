package com.felipe.lucas.lfwframework.Screen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.felipe.lucas.lfwframework.R;

public class BaseScreenWithHeader extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.base_screen_with_header);
    }
}
