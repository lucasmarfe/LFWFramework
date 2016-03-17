package com.felipe.lucas.lfwframework.Test_Screens;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import com.felipe.lucas.lfwframework.Components.ButtonLFW;
import com.felipe.lucas.lfwframework.Components.ItemMenuLFW;
import com.felipe.lucas.lfwframework.Components.ItemResultLFW;
import com.felipe.lucas.lfwframework.Components.LabelValueLFW;
import com.felipe.lucas.lfwframework.Screen.BaseFilterScreen;

/**
 * Created by lucas on 08/03/2016.
 */
public class ProductionOrderResultsScreen extends BaseFilterScreen {
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        buildPage();
        m_IFrame.builScreen(this.getClass(), "Ordem de Produção");
        addOnScreen(m_IFrame);
        //m_FilterFrame.setOnItemClickListener(new OnItemClickListenerPOResultsLFW());
    }

    private void buildPage () {
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
        ButtonLFW v_ButtonPrint = new ButtonLFW(getApplicationContext(), "Imprimir", true);
        m_IFrame.add(v_ButtonPrint);
        LabelValueLFW v_LabelValue = new LabelValueLFW(getApplicationContext(), "Label", "valor",
                true);
        m_IFrame.add(v_LabelValue);
        LabelValueLFW v_LabelValue2 = new LabelValueLFW(getApplicationContext(), "Label2",
                "valor2", false);
        m_IFrame.add(v_LabelValue2);
        ButtonLFW v_StartOperationButton = new ButtonLFW(getApplicationContext(), "Iniciar " +
                "Operação", true);
        ButtonLFW v_EndOperationButton = new ButtonLFW(getApplicationContext(), "Finalizar " +
                "Operação", false);
        m_IFrame.add(v_StartOperationButton);
        m_IFrame.add(v_EndOperationButton);
    }
}

class OnItemClickListenerPOResultsLFW implements AdapterView.OnItemClickListener {

    public Context m_Context;

    public OnItemClickListenerPOResultsLFW (Context p_Context) {
        m_Context = p_Context;
    }

    @Override
    public void onItemClick (AdapterView<?> parent, View view, int position, long id) {
        //onClickLFW(parent, view, position, id);
        Context v_Context = view.getContext();
        ItemResultLFW o = (ItemResultLFW) parent.getItemAtPosition(position);
        //String str = (String) o;//As you are using Default String Adapter
        Toast.makeText(m_Context, o.getItemMenuIdentify() != null ? o.getItemMenuIdentify() :
                "Header", Toast.LENGTH_SHORT).show();
    }

    //public abstract void onClickLFW (AdapterView<?> parent, View view, int position, long id);
}