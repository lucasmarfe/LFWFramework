package com.felipe.lucas.lfwframework.Test_Screens.QualityScreens;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import com.felipe.lucas.lfwframework.Components.ButtonLFW;
import com.felipe.lucas.lfwframework.Components.ItemResultLFW;
import com.felipe.lucas.lfwframework.Screen.BaseFilterScreen;
import com.felipe.lucas.lfwframework.Test_Screens.OperationScreens.ProductionExecutionResultsScreen;
import com.felipe.lucas.lfwframework.Test_Screens.OperationScreens.ProductionOrderDetailsScreen;

/**
 * Created by lucas on 30/03/2016.
 */
public class SampleResultsScreen extends BaseFilterScreen {
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        buildPage();
        m_IFrame.builScreen(this.getClass(), "Amostra de material");
        addOnScreen(m_IFrame);
    }

    private void buildPage () {
        createData();
        OnItemClickListenerSampleResultsLFW v_ItemClickListener = new
                OnItemClickListenerSampleResultsLFW
                (getApplicationContext());
        m_FilterFrame.setResultsItens(getApplicationContext(), m_ResultItensList,
                v_ItemClickListener);
        //ButtonLFW v_ButtonPrint = new ButtonLFW(getApplicationContext(), "Retirar amostra", true);
        //m_IFrame.add(v_ButtonPrint);
        m_IFrame.add(m_FilterFrame);
    }

    private void createData () {
        ItemResultLFW v_ItemResultLFW1 = new ItemResultLFW("Código: 00120", "OP/peração: " +
                "1201459/0010", "Material: BAR 120,00cm", Color.GREEN, SampleDetailsScreen.class);
        ItemResultLFW v_ItemResultLFW2 = new ItemResultLFW("Código: 00121", "OP/peração: " +
                "1201459/0020", "Material: BAR 120,00cm", Color.GREEN, SampleDetailsScreen.class);
        ItemResultLFW v_ItemResultLFW3 = new ItemResultLFW("Código: 00122", "OP/peração: " +
                "1201459/0030", "Material: BAR 120,00cm", Color.GREEN, SampleDetailsScreen.class);
        ItemResultLFW v_ItemResultLFW4 = new ItemResultLFW("Código: 00123", "OP/peração: " +
                "1201560/0010", "Material: TAR 55,00cm", Color.GREEN, SampleDetailsScreen.class);
        ItemResultLFW v_ItemResultLFW5 = new ItemResultLFW("Código: 00124", "OP/peração: " +
                "1201560/0020", "Material: TAR 55,00cm", Color.GREEN, SampleDetailsScreen.class);
        ItemResultLFW v_ItemResultLFW6 = new ItemResultLFW("Código: 00125", "OP/peração: " +
                "1201575/0010", "Material: BAR LIS 120,00cm", Color.GREEN, SampleDetailsScreen
                .class);
        ItemResultLFW v_ItemResultLFW7 = new ItemResultLFW("Código: 00126", "OP/peração: " +
                "1201575/0020", "Material: BAR LIS 120,00cm", Color.GREEN, SampleDetailsScreen
                .class);
        ItemResultLFW v_ItemResultLFW8 = new ItemResultLFW("Código: 00127", "OP/peração: " +
                "1201575/0030", "Material: BAR LIS 120,00cm", Color.GREEN, SampleDetailsScreen
                .class);
        ItemResultLFW v_ItemResultLFW9 = new ItemResultLFW("Código: 00128", "OP/peração: " +
                "1201576/0010", "Material: BAR 120,00cm", Color.GREEN, SampleDetailsScreen.class);
        ItemResultLFW v_ItemResultLFW10 = new ItemResultLFW("Código: 00129", "OP/peração: " +
                "1201576/0020", "Material: BAR 120,00cm", Color.GREEN, SampleDetailsScreen.class);
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

class OnItemClickListenerSampleResultsLFW implements AdapterView.OnItemClickListener {

    public Context m_Context;

    public OnItemClickListenerSampleResultsLFW (Context p_Context) {
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
        Intent v_Intent = new Intent(view.getContext(), SampleDetailsScreen.class);
        v_Intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        view.getContext().startActivity(v_Intent);
    }
}
