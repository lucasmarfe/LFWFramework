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
        InputLFW v_InCode = new InputLFW(getApplicationContext(),"Código",false,true,true);
        DateLFW v_InitialDate = new DateLFW(getApplicationContext(),"Data início", Calendar
                .getInstance(),true,this,true);
        DateLFW v_EndDate = new DateLFW(getApplicationContext(),"Data fim", Calendar
                .getInstance(),true,this,true);
        InputLFW v_InMaterial = new InputLFW(getApplicationContext(),"Material",false,true,true);
        InputLFW v_InEquipment = new InputLFW(getApplicationContext(),"Centro de trabalho",false,true,true);
        SelectLFW v_SelShift = new SelectLFW(getApplicationContext(),"Turno",true,true);
        v_SelShift.setItensContent(getApplicationContext(), Arrays.asList("Turno A1", "Turno A2",
                "Turno B1", "Turno B2"));
        SelectLFW v_SelStatus = new SelectLFW(getApplicationContext(),"Status",true,true);
        v_SelStatus.setItensContent(getApplicationContext(), Arrays.asList("Programada",
                "Iniciada", "Confirmada", "Finalizada"));
        ButtonLFW v_FilterButton = new ButtonLFW(getApplicationContext(), "Filtrar", true);
        ButtonLFW v_ImportButton= new ButtonLFW(getApplicationContext(), " Importar ", true);
        v_FilterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                Intent v_Intent = new Intent(getApplicationContext(), ProductionOrderResultsScreen.class);
                v_Intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                getApplicationContext().startActivity(v_Intent);
            }
        });
        m_IFrame.add(v_InCode);
        m_IFrame.add(v_InitialDate);
        m_IFrame.add(v_EndDate);
        m_IFrame.add(v_InMaterial);
        m_IFrame.add(v_InEquipment);
        m_IFrame.add(v_SelShift);
        m_IFrame.add(v_SelStatus);
        m_IFrame.add(v_FilterButton);
        m_IFrame.add(v_ImportButton);

        /*InputLFW v_InCode = new InputLFW(getApplicationContext(),"Código",true);

        LabelValueLFW v_LabelValue = new LabelValueLFW(getApplicationContext(), "Codigo", "valor",
                true);
        m_IFrame.add(v_LabelValue);

        LabelValueLFW v_LabelValue2 = new LabelValueLFW(getApplicationContext(), "Label2",
                "valor2", false);
        m_IFrame.add(v_LabelValue2);

        RadioLFW v_Radio = new RadioLFW(getApplicationContext(), "Teste", true, true, true);
        v_Radio.setItensContent(getApplicationContext(), Arrays.asList("PRD",
                "HOM"), UtilLFW.checkIfCallerClassIsHeaderChild(this.getClass()));
        m_IFrame.add(v_Radio);

        CheckBoxLFW v_CheckBox = new CheckBoxLFW(getApplicationContext(), "Teste", "2", true,
                true, true);
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
        m_IFrame.add(m_FilterFrame);*/
    }


}
