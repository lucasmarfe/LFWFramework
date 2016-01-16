package com.felipe.lucas.lfwframework.Screen;

import android.content.Context;
import android.graphics.Color;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

import com.felipe.lucas.lfwframework.Components.ButtonLFW;
import com.felipe.lucas.lfwframework.Components.InputLFW;
import com.felipe.lucas.lfwframework.R;

public class BaseScreen extends AppCompatActivity {
    private Context m_Context;
    InputLFW m_Input;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        m_Context=getApplicationContext();
        setBackgroundColor();//getResources().getColor(R.color.background));
        setContentView(R.layout.base_screen);
        RelativeLayout mRlayout = (RelativeLayout) findViewById(R.id.relativeBaseScreenId);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        mRlayout.setLayoutParams(layoutParams);

        RelativeLayout.LayoutParams params1 = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        RelativeLayout.LayoutParams params2 = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);

        m_Input = new InputLFW(m_Context,"Input", true);
        m_Input.setWidth(250);
        ButtonLFW m_Button = new ButtonLFW(m_Context,"Botão", true);
        params2.addRule(RelativeLayout.BELOW, m_Input.getId());
        //params2.addRule(RelativeLayout.ALIGN_BOTTOM, m_Input.getId());
        mRlayout.addView(m_Input,params1);
        mRlayout.addView(m_Button,params2);
    }

    public void setBackgroundColor()
    {
        getWindow().getDecorView().setBackgroundColor(ContextCompat.getColor(m_Context, R.color.background));
    }

    public void setBackgroundColor(int p_IdColor)
    {
        getWindow().getDecorView().setBackgroundColor(ContextCompat.getColor(m_Context, p_IdColor));
    }
}
