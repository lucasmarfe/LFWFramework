package com.felipe.lucas.lfwframework.Test_Screens.OperationScreens;

import android.os.Bundle;
import android.view.MenuItem;

import com.felipe.lucas.lfwframework.Components.ButtonLFW;
import com.felipe.lucas.lfwframework.Components.DateLFW;
import com.felipe.lucas.lfwframework.Components.LabelValueLFW;
import com.felipe.lucas.lfwframework.Components.SelectLFW;
import com.felipe.lucas.lfwframework.Screen.BaseDetailsScreen;

import java.util.Arrays;
import java.util.Calendar;

/**
 * Created by lucas on 25/03/2016.
 */
public class ProductionExecutionDetailsScreen extends BaseDetailsScreen {
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
        //buildResultsGrid();
        m_IFrame.builScreen(this.getClass(), "OP: 1072360-0010");
        setContentView(m_IFrame);
    }

    /*private void buildResultsGrid () {
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

    }*/

    private void buildPage () {
        LabelValueLFW v_InCode = new LabelValueLFW(getApplicationContext(),"Ordem de Produção","1072360",true);
        LabelValueLFW v_InCodeOperation = new LabelValueLFW(getApplicationContext(),"Operação","0010",true);
        SelectLFW v_SelStatus = new SelectLFW(getApplicationContext(),"Status",true,false);
        v_SelStatus.setItensContent(Arrays.asList("Programada", "Iniciada", "Confirmada", "Finalizada"));
        v_SelStatus.setSelection(3);
        DateLFW v_InitialDate = new DateLFW(getApplicationContext(),"Data início planejada", Calendar
                .getInstance(),true,this,false);
        DateLFW v_EndDate = new DateLFW(getApplicationContext(),"Data fim planejada", Calendar
                .getInstance(),true,this,false);
        LabelValueLFW v_InMaterial = new LabelValueLFW(getApplicationContext(),"Material","7036-TAR LC 155,0cm",true);
        LabelValueLFW v_InEquipment = new LabelValueLFW(getApplicationContext(),"Equipamento","2901 - Forno Forjaria",true);
        LabelValueLFW v_InWorkCenter = new LabelValueLFW(getApplicationContext(),"Centro de Trabalho","9991 - LINGLC01",true);
        LabelValueLFW v_InCliente = new LabelValueLFW(getApplicationContext(),"Cliente","ALSTOM LTDA",true);

        ButtonLFW v_StartOperation = new ButtonLFW(getApplicationContext(), "Inicar Operação", true);
        ButtonLFW v_ConfirmButton = new ButtonLFW(getApplicationContext(), "Confirmar Produção", true);
        /*v_FilterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                Intent v_Intent = new Intent(getApplicationContext(), ProductionOrderResultsScreen.class);
                v_Intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                getApplicationContext().startActivity(v_Intent);
            }
        });*/
        m_IFrame.add(v_InCode);
        m_IFrame.add(v_InCodeOperation);
        m_IFrame.add(v_SelStatus);
        m_IFrame.add(v_InitialDate);
        m_IFrame.add(v_EndDate);
        m_IFrame.add(v_InMaterial);
        m_IFrame.add(v_InEquipment);
        m_IFrame.add(v_InWorkCenter);
        m_IFrame.add(v_InCliente);
        m_IFrame.add(v_StartOperation);
        m_IFrame.add(v_ConfirmButton);
    }


    @Override
    public boolean onOptionsItemSelected (MenuItem item) {
        return super.onOptionsItemSelected(item);
    }
}