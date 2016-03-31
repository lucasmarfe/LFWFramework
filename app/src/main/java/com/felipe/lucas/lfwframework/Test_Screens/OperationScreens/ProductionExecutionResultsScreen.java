package com.felipe.lucas.lfwframework.Test_Screens.OperationScreens;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import com.felipe.lucas.lfwframework.Components.ButtonLFW;
import com.felipe.lucas.lfwframework.Components.ItemResultLFW;
import com.felipe.lucas.lfwframework.Screen.BaseFilterScreen;

/**
 * Created by lucas on 25/03/2016.
 */
public class ProductionExecutionResultsScreen extends BaseFilterScreen {
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        buildPage();
        m_IFrame.builScreen(this.getClass(), "Execução de Produção");
        addOnScreen(m_IFrame);
    }

    private void buildPage () {
        createData();
        OnItemClickListenerPOExecutionResultsLFW v_ItemClickListener = new
                OnItemClickListenerPOExecutionResultsLFW
                (getApplicationContext());
        m_FilterFrame.setResultsItens(getApplicationContext(), m_ResultItensList,
                v_ItemClickListener);
        ButtonLFW v_ButtonPrint = new ButtonLFW(getApplicationContext(), "Retirar amostra", true);
        m_IFrame.add(v_ButtonPrint);
        m_IFrame.add(m_FilterFrame);
    }

    private void createData () {
        ItemResultLFW v_ItemResultLFW1 = new ItemResultLFW("OP: 1072360", "Operação: 0010",
                "Equipamento: LAM1", Color.GREEN, ProductionExecutionResultsScreen.class);
        ItemResultLFW v_ItemResultLFW2 = new ItemResultLFW("OP: 1072360", "Operação: 0020",
                "Equipamento: Lingot. conv", Color.RED, ProductionExecutionResultsScreen.class);
        ItemResultLFW v_ItemResultLFW3 = new ItemResultLFW("OP: 1072360", "Operação: 0030",
                "Equipamento: LAM2", Color.YELLOW, ProductionExecutionResultsScreen.class);
        ItemResultLFW v_ItemResultLFW4 = new ItemResultLFW("OP: 1072378", "Operação: 0010",
                "Equipamento: LAM1", Color.CYAN, ProductionExecutionResultsScreen.class);
        ItemResultLFW v_ItemResultLFW5 = new ItemResultLFW("OP: 1072378", "Operação: 0020",
                "Equipamento: Inspeção Forj", Color.GREEN, ProductionExecutionResultsScreen.class);
        ItemResultLFW v_ItemResultLFW6 = new ItemResultLFW("OP: 1072380", "Operação: 0410",
                "Equipamento: LAM1", Color.BLUE, ProductionExecutionResultsScreen.class);
        ItemResultLFW v_ItemResultLFW7 = new ItemResultLFW("OP: 1072380", "Operação: 0510",
                "Equipamento: LAM2", Color.BLUE, ProductionExecutionResultsScreen.class);
        ItemResultLFW v_ItemResultLFW8 = new ItemResultLFW("OP: 1072386", "Operação: 0010",
                "Equipamento: LAM1", Color.YELLOW, ProductionExecutionResultsScreen.class);
        ItemResultLFW v_ItemResultLFW9 = new ItemResultLFW("OP: 1072386", "Operação: 0020",
                "Equipamento: LAM2", Color.RED, ProductionExecutionResultsScreen.class);
        ItemResultLFW v_ItemResultLFW10 = new ItemResultLFW("OP: 1072386", "Operação: 0030",
                "Equipamento: LAM3", Color.GREEN, ProductionExecutionResultsScreen.class);
        m_ResultItensList.add(v_ItemResultLFW1);
        m_ResultItensList.add(v_ItemResultLFW2);
        m_ResultItensList.add(v_ItemResultLFW3);
        m_ResultItensList.add(v_ItemResultLFW4);
        m_ResultItensList.add(v_ItemResultLFW5);
        m_ResultItensList.add(v_ItemResultLFW6);
        m_ResultItensList.add(v_ItemResultLFW7);
        m_ResultItensList.add(v_ItemResultLFW8);
        m_ResultItensList.add(v_ItemResultLFW9);
        m_ResultItensList.add(v_ItemResultLFW10);
    }
}

class OnItemClickListenerPOExecutionResultsLFW implements AdapterView.OnItemClickListener {

    public Context m_Context;

    public OnItemClickListenerPOExecutionResultsLFW (Context p_Context) {
        m_Context = p_Context;
    }

    @Override
    public void onItemClick (AdapterView<?> parent, View view, int position, long id) {
        //onClickLFW(parent, view, position, id);
//        Context v_Context = view.getContext();
//        ItemResultLFW o = (ItemResultLFW) parent.getItemAtPosition(position);
//        //String str = (String) o;//As you are using Default String Adapter
//        Toast.makeText(m_Context, o.getItemMenuIdentify() != null ? o.getItemMenuIdentify() :
//                "Header", Toast.LENGTH_SHORT).show();
        Intent v_Intent = new Intent(view.getContext(), ProductionOrderDetailsScreen.class);
        v_Intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        view.getContext().startActivity(v_Intent);
    }
}
