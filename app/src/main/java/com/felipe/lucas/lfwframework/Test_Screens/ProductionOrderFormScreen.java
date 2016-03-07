package com.felipe.lucas.lfwframework.Test_Screens;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;
import android.support.v7.widget.Toolbar;
import android.widget.Toast;

import com.felipe.lucas.lfwframework.Components.IFrameLFW;
import com.felipe.lucas.lfwframework.Components.InputLFW;
import com.felipe.lucas.lfwframework.R;
import com.felipe.lucas.lfwframework.Screen.BaseFormScreen;

/**
 * Created by lucas on 02/03/2016.
 */
public class ProductionOrderFormScreen extends BaseFormScreen {
    IFrameLFW m_IFrame;
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.base_screen_with_header);
        //setupToolbar(toolbar);
//        m_IFrame = new IFrameLFW(getApplicationContext());
//        InputLFW m_InputTest = new InputLFW(getApplicationContext(),"Input teste",true);
//        RelativeLayout.LayoutParams v_LayoutParamElement = new RelativeLayout.LayoutParams
//                (RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams
//                        .MATCH_PARENT);
//        //v_LayoutParamElement.addRule(RelativeLayout.BELOW, R.id.toolbar);
//        m_IFrame.addView(m_InputTest, v_LayoutParamElement);
//        //m_IFrame.builScreen();
//
//       FrameLayout.LayoutParams m_LayoutParams = new FrameLayout.LayoutParams(RelativeLayout
//                .LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT);
//        addContentView(m_IFrame, m_LayoutParams);
        //setContentView(R.layout.base_screen_with_header);

        /*******OK
         RelativeLayout v_relative = (RelativeLayout) findViewById(R.id
         .base_screen_with_header_layout_ID);
         InputLFW m_InputTest = new InputLFW(getApplicationContext(),"Input teste",true);
         RelativeLayout.LayoutParams v_LayoutParamElement = new RelativeLayout.LayoutParams
         (RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams
         .WRAP_CONTENT);
         v_LayoutParamElement.addRule(RelativeLayout.BELOW, R.id.toolbar);
         v_relative.addView(m_InputTest, v_LayoutParamElement);
         setupToolbar();
         setContentView(v_relative);
         *////////

        RelativeLayout v_relative = (RelativeLayout) findViewById(R.id
                .base_screen_with_header_layout_ID);
        m_IFrame = new IFrameLFW(getApplicationContext());
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        v_relative.removeView(toolbar);
        setupToolbar(toolbar);
        m_IFrame.add(toolbar);
        InputLFW m_InputTest = new InputLFW(getApplicationContext(), "Input teste", true);
        RelativeLayout.LayoutParams v_LayoutParamElement = new RelativeLayout.LayoutParams
                (RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams
                        .WRAP_CONTENT);
        m_IFrame.add(m_InputTest);
        setupToolbar(toolbar);
        //m_IFrame.add(m_InputTest);
        m_IFrame.builScreen();

        setContentView(m_IFrame);


//        RelativeLayout v_relative = new RelativeLayout(getApplicationContext());
//        RelativeLayout.LayoutParams v_LayoutParamElement = new RelativeLayout.LayoutParams
//                (RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams
//                        .MATCH_PARENT);
//        v_relative.setLayoutParams(v_LayoutParamElement);
//
//        Toolbar v_toolbar = new Toolbar(getApplicationContext());
//        v_toolbar.setId(UtilLFW.getAvailableID());
//        RelativeLayout.LayoutParams v_LayoutParamElement2 = new RelativeLayout.LayoutParams
//                (RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams
//                        .MATCH_PARENT);
//        v_toolbar.setLayoutParams(v_LayoutParamElement2);
//        v_toolbar.setBackgroundColor(getResources().getColor(R.color.black));
//        setSupportActionBar(v_toolbar);
//        assert getSupportActionBar() != null;
//        final ActionBar ab = getSupportActionBar();
//        ab.setHomeAsUpIndicator(R.drawable.ic_first_page_white_36dp);
//        ab.setDisplayHomeAsUpEnabled(true);
//        v_relative.addView(v_toolbar);
//        setContentView(v_relative);
//        //m_IFrame.clear();
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

    @Override
    public boolean onOptionsItemSelected (MenuItem item) {

        if (item.getItemId() == R.id.config_item) {
            Toast toast = Toast.makeText(getApplicationContext(), "Teste item selecionado", Toast
                    .LENGTH_SHORT);
            toast.show();
        } else if (item.getItemId() == android.R.id.home) {
            Toast toast = Toast.makeText(getApplicationContext(), "Teste home", Toast.LENGTH_SHORT);
            toast.show();
        }
        return (super.onOptionsItemSelected(item));
    }
}
