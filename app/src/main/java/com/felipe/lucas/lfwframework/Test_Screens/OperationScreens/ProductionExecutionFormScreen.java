package com.felipe.lucas.lfwframework.Test_Screens.OperationScreens;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.felipe.lucas.lfwframework.Components.ButtonLFW;
import com.felipe.lucas.lfwframework.Components.DateLFW;
import com.felipe.lucas.lfwframework.Components.InputLFW;
import com.felipe.lucas.lfwframework.Components.SelectLFW;
import com.felipe.lucas.lfwframework.Screen.BaseFormScreen;

import java.util.Arrays;
import java.util.Calendar;

/**
 * Created by lucas on 25/03/2016.
 */
public class ProductionExecutionFormScreen extends BaseFormScreen {



    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        buildPage();
        m_IFrame.builScreen(ProductionOrderFormScreen.class, "Execução de Produção");
        setContentView(m_IFrame);
    }

    private void buildPage () {

        DateLFW v_InitialDate = new DateLFW(getApplicationContext(), "Data início", Calendar
                .getInstance(), true, this, true);
        DateLFW v_EndDate = new DateLFW(getApplicationContext(), "Data fim", Calendar
                .getInstance(), true, this, true);
        InputLFW v_InCodeOP = new InputLFW(getApplicationContext(), "Código OP", false, true, true);
        InputLFW v_InCodeOperation = new InputLFW(getApplicationContext(), "Operação", false, true, true);
        InputLFW v_InMaterial = new InputLFW(getApplicationContext(), "Material", false, true, true);
        InputLFW v_InEquipment = new InputLFW(getApplicationContext(), "Equipamento", false, true, true);
        SelectLFW v_SelStatus = new SelectLFW(getApplicationContext(), "Status", true, true);
        v_SelStatus.setItensContent(getApplicationContext(), Arrays.asList("Programada", "Iniciada",
                "Confirmada", "Finalizada"));
        ButtonLFW v_FilterButton = new ButtonLFW(getApplicationContext(), "Filtrar", true);
        v_FilterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                Intent v_Intent = new Intent(getApplicationContext(),
                        ProductionExecutionResultsScreen.class);
                v_Intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                getApplicationContext().startActivity(v_Intent);
            }
        });
        m_IFrame.add(v_InitialDate);
        m_IFrame.add(v_EndDate);
        m_IFrame.add(v_InCodeOP);
        m_IFrame.add(v_InCodeOperation);
        m_IFrame.add(v_InMaterial);
        m_IFrame.add(v_InEquipment);
        m_IFrame.add(v_SelStatus);
        m_IFrame.add(v_FilterButton);
    }
}
