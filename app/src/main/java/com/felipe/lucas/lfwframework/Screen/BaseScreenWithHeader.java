package com.felipe.lucas.lfwframework.Screen;

import android.content.Context;
import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.RelativeLayout;

import com.felipe.lucas.lfwframework.Components.IFrameLFW;
import com.felipe.lucas.lfwframework.R;

public class BaseScreenWithHeader extends AppCompatActivity {
    public Context m_Context;
    public IFrameLFW m_IFrame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.base_screen_with_header);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        m_IFrame = new IFrameLFW(m_Context);
    }

    @Override
    public boolean onOptionsItemSelected (MenuItem item) {
        Intent v_Intent = new Intent(getApplicationContext(), BaseMenuScreen.class);
        v_Intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        getApplicationContext().startActivity(v_Intent);
        return true;
    }

    public void addOnScreen (IFrameLFW p_IFrame) {
        RelativeLayout.LayoutParams v_LayoutParamElement = new RelativeLayout.LayoutParams
                (RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams
                        .MATCH_PARENT);
        setContentView(p_IFrame, v_LayoutParamElement);
    }

    public void setDefaultBackgroundColor () {
        getWindow().getDecorView().setBackgroundColor(ContextCompat.getColor(m_Context, R.color
                .background));
    }

    public void setBackgroundColor (int p_IdColor) {
        getWindow().getDecorView().setBackgroundColor(ContextCompat.getColor(m_Context, p_IdColor));
    }
}
