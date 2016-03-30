package com.felipe.lucas.lfwframework.Test_Screens.Menu_Screens;

import android.os.Bundle;

import com.felipe.lucas.lfwframework.Components.ItemMenuLFW;
import com.felipe.lucas.lfwframework.Screen.BaseMenuScreen;
import com.felipe.lucas.lfwframework.Test_Screens.LoginScreen.LoginScreen;
import com.felipe.lucas.lfwframework.Test_Screens.OperationScreens.ProductionOrderFormScreen;
import com.felipe.lucas.lfwframework.Test_Screens.OperationScreens.ProductionOrderResultsScreen;
import com.felipe.lucas.lfwframework.Test_Screens.ReportScreens.InventoryFormScreen;

/**
 * Created by lucas on 09/03/2016.
 */
public class ReportMenuScreen extends BaseMenuScreen {


    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        buildOptions();
        m_IFrame.add(m_Menu);
        m_IFrame.builScreen(this.getClass(), "Operação");
        addOnScreen(m_IFrame);
    }

    private void buildOptions () {
        m_ItemMenuList.add(new ItemMenuLFW("Controle de estoque",
                InventoryFormScreen.class));
        m_Menu.setMenuItens(m_Context, m_ItemMenuList);
    }
}