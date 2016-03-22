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
import com.felipe.lucas.lfwframework.Components.CheckBoxLFW;
import com.felipe.lucas.lfwframework.Components.IFrameLFW;
import com.felipe.lucas.lfwframework.Components.InputLFW;
import com.felipe.lucas.lfwframework.Components.ItemResultLFW;
import com.felipe.lucas.lfwframework.Components.LabelValueLFW;
import com.felipe.lucas.lfwframework.Components.RadioLFW;
import com.felipe.lucas.lfwframework.Components.ResultsLFW;
import com.felipe.lucas.lfwframework.R;
import com.felipe.lucas.lfwframework.Screen.BaseFormScreen;
import com.felipe.lucas.lfwframework.Util.UtilLFW;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by lucas on 02/03/2016.
 */
public class ProductionOrderFormScreen extends BaseFormScreen {



    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        buildPage();
        m_IFrame.builScreen(ProductionOrderFormScreen.class, "Filtrar OP");
        setContentView(m_IFrame);
    }

    private void buildPage () {
        LabelValueLFW v_LabelValue = new LabelValueLFW(getApplicationContext(), "Label", "valor",
                true);
        m_IFrame.add(v_LabelValue);

        LabelValueLFW v_LabelValue2 = new LabelValueLFW(getApplicationContext(), "Label2",
                "valor2", false);
        m_IFrame.add(v_LabelValue2);

        RadioLFW v_Radio = new RadioLFW(getApplicationContext(), "Teste", true, true, true);
        v_Radio.setItensContent(getApplicationContext(), Arrays.asList("PRD",
                "HOM"), UtilLFW.checkIfCallerClassIsHeaderChild(this.getClass()));
        m_IFrame.add(v_Radio);

        CheckBoxLFW v_CheckBox = new CheckBoxLFW(getApplicationContext(), "Teste", "2", true, true);
        m_IFrame.add(v_CheckBox);

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

        m_FilterFrame.setResultsItens(getApplicationContext(), m_ResultItensList,
                v_ItemClickListener);
        m_IFrame.add(m_FilterFrame);
    }


}
