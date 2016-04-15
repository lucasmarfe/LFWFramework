package com.felipe.lucas.lfwframework.Screen;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.felipe.lucas.lfwframework.Components.IFrameLFW;
import com.felipe.lucas.lfwframework.R;

public class BaseScreen extends AppCompatActivity {
    public IFrameLFW m_IFrame;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        IFrameLFW v_IFrame = new IFrameLFW(getApplicationContext());
    }

    public void addOnScreen (IFrameLFW p_IFrame) {
//        RelativeLayout.LayoutParams v_LayoutParamElement = new RelativeLayout.LayoutParams
// (RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT);
        setContentView(p_IFrame);//, v_LayoutParamElement);
    }

    public void setDefaultBackgroundColor () {
        getWindow().getDecorView().setBackgroundColor(ContextCompat.getColor
                (getApplicationContext(), R.color
                .background));
    }

    public void setBackgroundColor(int p_IdColor)
    {
        getWindow().getDecorView().setBackgroundColor(ContextCompat.getColor
                (getApplicationContext(), p_IdColor));
    }

}
