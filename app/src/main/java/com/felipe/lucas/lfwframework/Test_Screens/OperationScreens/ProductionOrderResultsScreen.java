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
        createData();
        OnItemClickListenerPOResultsLFW v_ItemClickListener = new OnItemClickListenerPOResultsLFW
                (getApplicationContext());
        m_FilterFrame.setResultsItens(getApplicationContext(), m_ResultItensList,
                v_ItemClickListener);
        ButtonLFW v_ButtonPrint = new ButtonLFW(getApplicationContext(), "Imprimir selecionadas",
                true);
        //m_FilterFrame.addFooterView(v_ButtonPrint);
        m_IFrame.add(v_ButtonPrint);
        m_IFrame.add(m_FilterFrame);




        /*LabelValueLFW v_LabelValue = new LabelValueLFW(getApplicationContext(), "Label", "valor",
                true);
        m_IFrame.add(v_LabelValue);
        LabelValueLFW v_LabelValue2 = new LabelValueLFW(getApplicationContext(), "Label2",
                "valor2", false);
        m_IFrame.add(v_LabelValue2);
        ButtonLFW v_StartOperationButton = new ButtonLFW(getApplicationContext(), "Iniciar
        Operação", true);
        ButtonLFW v_EndOperationButton = new ButtonLFW(getApplicationContext(), "Finalizar Operação", false);
        m_IFrame.add(v_StartOperationButton);
        m_IFrame.add(v_EndOperationButton);*/
    }

    private void createData () {
        ItemResultLFW v_ItemResultLFW1 = new ItemResultLFW("OP: 1072360", "Material: 7036-TAR LC " +
                "155,0cm", "Centro de trabalho: 13-LINSP02H", Color.GREEN,
                ProductionOrderResultsScreen.class);
        ItemResultLFW v_ItemResultLFW2 = new ItemResultLFW("OP: 1072363", "Material: 8035-FMR SAC" +
                " 12,00", "Centro de trabalho: 10-LINSP01H", Color.RED,
                ProductionOrderResultsScreen.class);
        ItemResultLFW v_ItemResultLFW3 = new ItemResultLFW("OP: 1072368", "Material: 8936-FORJADO" +
                " 30,0cm", "Centro de trabalho: 15-LINSP06P", Color.YELLOW,
                ProductionOrderResultsScreen.class);
        ItemResultLFW v_ItemResultLFW4 = new ItemResultLFW("OP: 1072370", "Material: 8035-FMR SAC" +
                " 12,00", "Centro de trabalho: 10-LINSP01H", Color.CYAN,
                ProductionOrderResultsScreen.class);
        ItemResultLFW v_ItemResultLFW5 = new ItemResultLFW("OP: 1072378", "Material: 8035-FMR SAC" +
                " 12,00", "Centro de trabalho: 10-LINSP01H", Color.GREEN,
                ProductionOrderResultsScreen.class);
        ItemResultLFW v_ItemResultLFW6 = new ItemResultLFW("OP: 1072380", "Material: 8936-FORJADO" +
                " 30,0cm", "Centro de trabalho: 15-LINSP06P", Color.BLUE,
                ProductionOrderResultsScreen.class);
        ItemResultLFW v_ItemResultLFW7 = new ItemResultLFW("OP: 1072380", "Material: 7036-TAR LC " +
                "155,0cm", "Centro de trabalho: 13-LINSP02H", Color.BLUE,
                ProductionOrderResultsScreen.class);
        ItemResultLFW v_ItemResultLFW8 = new ItemResultLFW("OP: 1072386", "Material: 8936-FORJADO" +
                " 30,0cm", "Centro de trabalho: 10-LINSP01H", Color.YELLOW,
                ProductionOrderResultsScreen.class);
        ItemResultLFW v_ItemResultLFW9 = new ItemResultLFW("OP: 1072387", "Material: 7036-TAR LC " +
                "155,0cm", "Centro de trabalho: 15-LINSP06P", Color.RED,
                ProductionOrderResultsScreen.class);
        ItemResultLFW v_ItemResultLFW10 = new ItemResultLFW("OP: 1072390", "Material: 7036-TAR LC" +
                " 155,0cm", "Centro de trabalho: 10-LINSP01H", Color.GREEN,
                ProductionOrderResultsScreen.class);
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

class OnItemClickListenerPOResultsLFW implements AdapterView.OnItemClickListener {

    public Context m_Context;

    public OnItemClickListenerPOResultsLFW (Context p_Context) {
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

    //public abstract void onClickLFW (AdapterView<?> parent, View view, int position, long id);
}