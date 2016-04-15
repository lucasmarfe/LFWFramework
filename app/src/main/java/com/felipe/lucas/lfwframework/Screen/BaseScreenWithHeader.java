package com.felipe.lucas.lfwframework.Screen;

import android.content.Context;
import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;

import com.felipe.lucas.lfwframework.Components.IFrameLFW;
import com.felipe.lucas.lfwframework.R;
import com.felipe.lucas.lfwframework.Util.UtilLFW;

public class BaseScreenWithHeader extends AppCompatActivity {
    public IFrameLFW m_IFrame;
    public String m_Title = "";

    @Override
    protected void onCreate (Bundle savedInstanceState) {//, Context p_Context) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.base_screen_with_header);
        RelativeLayout v_relative = (RelativeLayout) findViewById(R.id
                .base_screen_with_header_layout_ID);
        m_IFrame = new IFrameLFW(getApplicationContext());
        m_IFrame.clear();
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        v_relative.removeView(toolbar);
        setupToolbar(toolbar);
        m_IFrame.add(toolbar);
        setDefaultBackgroundColor();
    }

    private void setupToolbar (Toolbar toolbar) {
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(m_Title != null ? m_Title : "");
        setSupportActionBar(toolbar);
        // Show menu icon
        final ActionBar ab = getSupportActionBar();
        //ab.setHomeButtonEnabled(true);
        ab.setHomeAsUpIndicator(R.drawable.ic_home_black_24dp);
        ab.setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu (Menu menu) {
        getMenuInflater().inflate(R.menu.base_screen_with_header, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected (MenuItem item) {
        try {
            if (item.getItemId() == android.R.id.home) {
                //Toast.makeText(getApplicationContext(), UtilLFW
                // .getConfigValueFromConfigAttribute("HomeScreen"),Toast.LENGTH_LONG);

                Intent v_Intent = null;
                v_Intent = new Intent(getApplicationContext(), Class.forName(UtilLFW
                        .getConfigValueFromConfigAttribute("HomeScreen").toString()));
                v_Intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                getApplicationContext().startActivity(v_Intent);
            } else if (item.getItemId() == R.id.config_item) {
                Intent v_Intent = new Intent(getApplicationContext(), Class.forName(UtilLFW
                        .getConfigValueFromConfigAttribute("ConfigScreen").toString()));
                v_Intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                getApplicationContext().startActivity(v_Intent);
            } else if (item.getItemId() == R.id.about_item) {
                Intent v_Intent = new Intent(getApplicationContext(), Class.forName(UtilLFW
                        .getConfigValueFromConfigAttribute("AboutScreen").toString()));
                v_Intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                getApplicationContext().startActivity(v_Intent);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return true;
    }


    public void addOnScreen (IFrameLFW p_IFrame) {
        RelativeLayout.LayoutParams v_LayoutParamElement = new RelativeLayout.LayoutParams
                (RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams
                        .MATCH_PARENT);
        setContentView(p_IFrame, v_LayoutParamElement);
    }

    public void setDefaultBackgroundColor () {
        getWindow().getDecorView().setBackgroundColor(ContextCompat.getColor
                (getApplicationContext(), R.color
                .background));
    }

    public void setBackgroundColor (int p_IdColor) {
        getWindow().getDecorView().setBackgroundColor(ContextCompat.getColor
                (getApplicationContext(), p_IdColor));
    }
}
