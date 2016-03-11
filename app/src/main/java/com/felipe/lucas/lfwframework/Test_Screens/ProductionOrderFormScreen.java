package com.felipe.lucas.lfwframework.Test_Screens;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;
import android.support.v7.widget.Toolbar;
import android.widget.Toast;

import com.felipe.lucas.lfwframework.Components.ButtonLFW;
import com.felipe.lucas.lfwframework.Components.IFrameLFW;
import com.felipe.lucas.lfwframework.Components.InputLFW;
import com.felipe.lucas.lfwframework.Components.ItemResultLFW;
import com.felipe.lucas.lfwframework.Components.LabelValueLFW;
import com.felipe.lucas.lfwframework.Components.ResultsLFW;
import com.felipe.lucas.lfwframework.R;
import com.felipe.lucas.lfwframework.Screen.BaseFormScreen;

import java.util.ArrayList;

/**
 * Created by lucas on 02/03/2016.
 */
public class ProductionOrderFormScreen extends BaseFormScreen {

    public ResultsLFW m_FilterFrame;
    public ArrayList<ItemResultLFW> m_ResultItensList = new ArrayList<ItemResultLFW>();

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        InputLFW m_InputTest = new InputLFW(getApplicationContext(), "Input teste", true);
        m_IFrame.add(m_InputTest);
        LabelValueLFW v_LabelValue = new LabelValueLFW(getApplicationContext(), "Label", "valor",
                true);
        m_IFrame.add(v_LabelValue);
        LabelValueLFW v_LabelValue2 = new LabelValueLFW(getApplicationContext(), "Label2",
                "valor2", false);
        m_IFrame.add(v_LabelValue2);
        ButtonLFW v_butt = new ButtonLFW(getApplicationContext(), "Teste", true);
        m_IFrame.add(v_butt);
        ItemResultLFW v_ItemResultLFW = new ItemResultLFW("OP Ident1", "Data1", "Material1",
                Color.GREEN, ProductionOrderFormScreen.class);
        ItemResultLFW v_ItemResultLFW2 = new ItemResultLFW("OP Ident2", "Data2", "Material2",
                Color.RED, ProductionOrderFormScreen.class);
        m_ResultItensList.add(v_ItemResultLFW);
        m_ResultItensList.add(v_ItemResultLFW2);
        OnItemClickListenerPOResultsLFW v_ItemClickListener = new OnItemClickListenerPOResultsLFW
                (getApplicationContext());
        m_FilterFrame = new ResultsLFW(getApplicationContext());
        m_FilterFrame.setResultsItens(getApplicationContext(), m_ResultItensList,
                v_ItemClickListener);
        m_IFrame.add(m_FilterFrame);
        //setupToolbar(toolbar);
        //m_IFrame.add(m_InputTest);
        m_IFrame.builScreen(ProductionOrderFormScreen.class, "Filtrar OP");

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
