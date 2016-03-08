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

public class BaseScreenWithHeader extends AppCompatActivity {
    public Context m_Context;
    public IFrameLFW m_IFrame;

    //    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
////        setContentView(R.layout.base_screen_with_header);
////        RelativeLayout v_relative = (RelativeLayout) findViewById(R.id
////                .base_screen_with_header_layout_ID);
////        m_IFrame = new IFrameLFW(getApplicationContext());
////        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
////        v_relative.removeView(toolbar);
//        //setContentView(R.layout.base_screen_with_header_2);
//        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        //getSupportActionBar().setDisplayShowHomeEnabled(true);
//        //m_IFrame = new IFrameLFW(m_Context);
//    }
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

    }

    private void setupToolbar (Toolbar toolbar) {
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Título");
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

//    @Override
//    public boolean onOptionsItemSelected (MenuItem item) {
//        Intent v_Intent = new Intent(getApplicationContext(), BaseMenuScreen.class);
//        v_Intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//        getApplicationContext().startActivity(v_Intent);
//        return true;
//    }

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
