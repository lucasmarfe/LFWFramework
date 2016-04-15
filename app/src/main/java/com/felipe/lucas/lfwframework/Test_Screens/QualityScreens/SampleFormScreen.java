package com.felipe.lucas.lfwframework.Test_Screens.QualityScreens;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.felipe.lucas.lfwframework.Components.ButtonLFW;
import com.felipe.lucas.lfwframework.Components.DateLFW;
import com.felipe.lucas.lfwframework.Components.InputLFW;
import com.felipe.lucas.lfwframework.Components.SelectLFW;
import com.felipe.lucas.lfwframework.Screen.BaseFormScreen;
import com.felipe.lucas.lfwframework.Test_Screens.OperationScreens.ProductionOrderFormScreen;

import java.util.Arrays;
import java.util.Calendar;

/**
 * Created by lucas on 28/03/2016.
 */
public class SampleFormScreen extends BaseFormScreen {


    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        buildPage();
        m_IFrame.builScreen(ProductionOrderFormScreen.class, "Amostra de material");
        setContentView(m_IFrame);
    }

    private void buildPage () {

        DateLFW v_InitialDate = new DateLFW(getApplicationContext(), "Data início", Calendar
                .getInstance(), true, this, true);
        DateLFW v_EndDate = new DateLFW(getApplicationContext(), "Data fim", Calendar
                .getInstance(), true, this, true);
        InputLFW v_SampleCode = new InputLFW(getApplicationContext(), "Código amostra", false,
                true, true);
        InputLFW v_InBatchCode = new InputLFW(getApplicationContext(), "Lote", false, true, true);
        InputLFW v_InReceiveLocal = new InputLFW(getApplicationContext(), "Local recebimento",
                false, true, true);
        InputLFW v_InOPCode = new InputLFW(getApplicationContext(), "Código OP", false, true, true);
        InputLFW v_InOperation = new InputLFW(getApplicationContext(), "Operação", false, true,
                true);
        SelectLFW v_SelStatus = new SelectLFW(getApplicationContext(), "Status", true, true);
        v_SelStatus.setItensContent(getApplicationContext(), Arrays.asList("Retirada", "Analisada",
                "Programada"));
        ButtonLFW v_FilterButton = new ButtonLFW(getApplicationContext(), "Filtrar", true);
        v_FilterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                Intent v_Intent = new Intent(getApplicationContext(),
                        SampleResultsScreen.class);
                v_Intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                getApplicationContext().startActivity(v_Intent);
            }
        });
        m_IFrame.add(v_InitialDate);
        m_IFrame.add(v_EndDate);
        m_IFrame.add(v_SampleCode);
        m_IFrame.add(v_InBatchCode);
        m_IFrame.add(v_InReceiveLocal);
        m_IFrame.add(v_InOPCode);
        m_IFrame.add(v_InOperation);
        m_IFrame.add(v_SelStatus);
        m_IFrame.add(v_FilterButton);
    }
}
