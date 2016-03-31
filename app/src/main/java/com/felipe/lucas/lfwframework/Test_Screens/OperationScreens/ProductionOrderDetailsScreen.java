package com.felipe.lucas.lfwframework.Test_Screens.OperationScreens;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.felipe.lucas.lfwframework.Components.ButtonLFW;
import com.felipe.lucas.lfwframework.Components.DateLFW;
import com.felipe.lucas.lfwframework.Components.InputLFW;
import com.felipe.lucas.lfwframework.Components.ItemResultLFW;
import com.felipe.lucas.lfwframework.Components.LabelValueLFW;
import com.felipe.lucas.lfwframework.Components.SelectLFW;
import com.felipe.lucas.lfwframework.Screen.BaseDetailsScreen;

import java.util.Arrays;
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
    SelectLFW v_SelectTurno;

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
        ItemResultLFW v_Operation3 = new ItemResultLFW("Operação: 0030", "Equipamento: LAM3",
                "Turno: A1",
                null, ProductionOrderFormScreen.class);
        m_ResultItensList.add(v_Operation1);
        m_ResultItensList.add(v_Operation2);
        m_ResultItensList.add(v_Operation3);
        OnItemClickListenerPOResultsLFW v_ItemClickListener = new OnItemClickListenerPOResultsLFW
                (getApplicationContext());
        m_Table.setTitle("Operações");
        m_Table.setResultsItens(getApplicationContext(), m_ResultItensList,
                v_ItemClickListener);
        ButtonLFW v_ImportButton= new ButtonLFW(getApplicationContext(), "Excluir Operação selec.", true);
        m_IFrame.add(v_ImportButton);
        m_IFrame.add(m_Table);

    }

    private void buildPage () {
        LabelValueLFW v_InCode = new LabelValueLFW(getApplicationContext(),"Código","1072360",true);
        DateLFW v_InitialDate = new DateLFW(getApplicationContext(),"Data início planejada", Calendar
                .getInstance(),true,this,false);
        DateLFW v_EndDate = new DateLFW(getApplicationContext(),"Data fim planejada", Calendar
                .getInstance(),true,this,false);
        LabelValueLFW v_InMaterial = new LabelValueLFW(getApplicationContext(),"Material","7036-TAR LC 155,0cm",true);
        LabelValueLFW v_InEquipment = new LabelValueLFW(getApplicationContext(),"Centro de trabalho","2901 - Forno Forjaria",true);
        SelectLFW v_SelShift = new SelectLFW(getApplicationContext(),"Turno",true,false);
        v_SelShift.setItensContent(Arrays.asList("Turno A1", "Turno A2", "Turno B1", "Turno B2"));
        v_SelShift.setSelection(1);
        SelectLFW v_SelStatus = new SelectLFW(getApplicationContext(),"Status",true,false);
        v_SelStatus.setItensContent(Arrays.asList("Programada", "Iniciada", "Confirmada", "Finalizada"));
        v_SelShift.setSelection(3);

        ButtonLFW v_FilterButton = new ButtonLFW(getApplicationContext(), "Inicar Ordem", true);
        //ButtonLFW v_FilterButton = new ButtonLFW(getApplicationContext(), "Finalizar Ordem", true);

        /*v_FilterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                Intent v_Intent = new Intent(getApplicationContext(), ProductionOrderResultsScreen.class);
                v_Intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                getApplicationContext().startActivity(v_Intent);
            }
        });*/
        m_IFrame.add(v_InCode);
        m_IFrame.add(v_InitialDate);
        m_IFrame.add(v_EndDate);
        m_IFrame.add(v_InMaterial);
        m_IFrame.add(v_InEquipment);
        m_IFrame.add(v_SelShift);
        m_IFrame.add(v_SelStatus);
        m_IFrame.add(v_FilterButton);


        /*v_PONumber = new LabelValueLFW(getApplicationContext(), "Número OP", "123456", true);
        v_POMaterial = new LabelValueLFW(getApplicationContext(), "Material OP", "1234 - Aço " +
                "Líquido", true);
        v_POQuantity = new LabelValueLFW(getApplicationContext(), "Quantidade OP", "1.000 t", true);
        v_POInitialDate = new DateLFW(getApplicationContext(), "Data início", Calendar
                .getInstance(), true, this, false);
        v_POFinalDate = new DateLFW(getApplicationContext(), "Data fim", Calendar.getInstance(),
                true, this, false);
        v_SelectTurno = new SelectLFW(getApplicationContext(), "Turno", true, true);
        v_SelectTurno.setItensContent(Arrays.asList("Buenos Aires", "Córdoba", "La Plata"));
        m_IFrame.add(v_PONumber);
        m_IFrame.add(v_POMaterial);
        m_IFrame.add(v_POQuantity);
        m_IFrame.add(v_POInitialDate);
        m_IFrame.add(v_POFinalDate);
        m_IFrame.add(v_SelectTurno);*/
    }


    @Override
    public boolean onOptionsItemSelected (MenuItem item) {
        return super.onOptionsItemSelected(item);
    }
}