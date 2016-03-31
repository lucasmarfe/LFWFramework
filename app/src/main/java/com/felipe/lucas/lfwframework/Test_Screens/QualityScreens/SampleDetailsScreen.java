package com.felipe.lucas.lfwframework.Test_Screens.QualityScreens;

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
 * Created by lucas on 30/03/2016.
 */
public class SampleDetailsScreen extends BaseDetailsScreen {
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
        m_IFrame.builScreen(this.getClass(), "Amostra: 00120");
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
//        OnItemClickListenerPOResultsLFW v_ItemClickListener = new OnItemClickListenerPOResultsLFW
//                (getApplicationContext());
        m_Table.setTitle("Operações");
        m_Table.setResultsItens(getApplicationContext(), m_ResultItensList,
                null);
        ButtonLFW v_ImportButton= new ButtonLFW(getApplicationContext(), "Excluir Operação selec
        .", true);
        m_IFrame.add(v_ImportButton);
        m_IFrame.add(m_Table);

    }*/

    private void buildPage () {
        DateLFW v_InitialDate = new DateLFW(getApplicationContext(), "Data início", Calendar
                .getInstance(), true, this, false);
        DateLFW v_EndDate = new DateLFW(getApplicationContext(), "Data fim", Calendar
                .getInstance(), true, this, false);
        LabelValueLFW v_SampleCode = new LabelValueLFW(getApplicationContext(), "Código amostra",
                "00120", true);
        LabelValueLFW v_InBatchCode = new LabelValueLFW(getApplicationContext(), "Lote", "BQ012",
                true);
        LabelValueLFW v_InReceiveLocal = new LabelValueLFW(getApplicationContext(), "Local " +
                "recebimento", "Pátio A1.12", true);
        LabelValueLFW v_InOPCode = new LabelValueLFW(getApplicationContext(), "Código OP",
                "1201459", true);
        LabelValueLFW v_InOperation = new LabelValueLFW(getApplicationContext(), "Operação",
                "0010", true);
        SelectLFW v_SelStatus = new SelectLFW(getApplicationContext(), "Status", true, false);
        v_SelStatus.setItensContent(Arrays.asList("Retirada", "Analisada",
                "Programada"));
        v_SelStatus.setSelection(1);

        ButtonLFW v_AnalysisButton = new ButtonLFW(getApplicationContext(), "Análises", true);
        ButtonLFW v_TrackButton = new ButtonLFW(getApplicationContext(), "Rastrear", true);
        //ButtonLFW v_FilterButton = new ButtonLFW(getApplicationContext(), "Finalizar Ordem",
        // true);

        /*v_FilterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                Intent v_Intent = new Intent(getApplicationContext(),
                ProductionOrderResultsScreen.class);
                v_Intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                getApplicationContext().startActivity(v_Intent);
            }
        });*/
        m_IFrame.add(v_InitialDate);
        m_IFrame.add(v_EndDate);
        m_IFrame.add(v_SampleCode);
        m_IFrame.add(v_InBatchCode);
        m_IFrame.add(v_InReceiveLocal);
        m_IFrame.add(v_InOPCode);
        m_IFrame.add(v_InOperation);
        m_IFrame.add(v_SelStatus);
        m_IFrame.add(v_AnalysisButton);
        m_IFrame.add(v_TrackButton);
    }


    @Override
    public boolean onOptionsItemSelected (MenuItem item) {
        return super.onOptionsItemSelected(item);
    }
}