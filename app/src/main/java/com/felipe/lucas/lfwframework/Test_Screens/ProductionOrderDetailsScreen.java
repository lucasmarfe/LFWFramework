package com.felipe.lucas.lfwframework.Test_Screens;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import com.felipe.lucas.lfwframework.Components.DateLFW;
import com.felipe.lucas.lfwframework.Components.ItemResultLFW;
import com.felipe.lucas.lfwframework.Components.LabelValueLFW;
import com.felipe.lucas.lfwframework.Screen.BaseDetailsScreen;

import java.util.Calendar;

/**
 * Created by lucas on 17/03/2016.
 */
public class ProductionOrderDetailsScreen extends BaseDetailsScreen {
    LabelValueLFW v_PONumber;
    LabelValueLFW v_POMaterial;
    LabelValueLFW v_POQuantity;
    DateLFW v_POInitialDate;
    DateLFW v_POFinalDate;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        buildPage();
        buildResultsGrid();
        m_IFrame.builScreen(this.getClass(), "PO Detalhes");
        setContentView(m_IFrame);
    }

    private void buildResultsGrid () {
        ItemResultLFW v_Operation1 = new ItemResultLFW("Operação: 0010", "Equipamento: LAM1",
                "Turno: A1",
                null, ProductionOrderFormScreen.class);
        ItemResultLFW v_Operation2 = new ItemResultLFW("Operação: 0020", "Equipamento: LAM2",
                "Turno: A1",
                null, ProductionOrderFormScreen.class);
        m_ResultItensList.add(v_Operation1);
        m_ResultItensList.add(v_Operation2);
        OnItemClickListenerPOResultsLFW v_ItemClickListener = new OnItemClickListenerPOResultsLFW
                (getApplicationContext());
        m_Table.setTitle("Operações");
        m_Table.setResultsItens(getApplicationContext(), m_ResultItensList,
                v_ItemClickListener);
        m_IFrame.add(m_Table);
    }

    private void buildPage () {
        v_PONumber = new LabelValueLFW(getApplicationContext(), "Número OP", "123456", true);
        v_POMaterial = new LabelValueLFW(getApplicationContext(), "Material OP", "1234 - Aço " +
                "Líquido", true);
        v_POQuantity = new LabelValueLFW(getApplicationContext(), "Quantidade OP", "1.000 t", true);
        v_POInitialDate = new DateLFW(getApplicationContext(), "Data início", Calendar
                .getInstance(), true, this, false);
        v_POFinalDate = new DateLFW(getApplicationContext(), "Data fim", Calendar.getInstance(),
                true, this, false);
        m_IFrame.add(v_PONumber);
        m_IFrame.add(v_POMaterial);
        m_IFrame.add(v_POQuantity);
        m_IFrame.add(v_POInitialDate);
        m_IFrame.add(v_POFinalDate);
    }

    @Override
    public boolean onOptionsItemSelected (MenuItem item) {
        return super.onOptionsItemSelected(item);
    }
}