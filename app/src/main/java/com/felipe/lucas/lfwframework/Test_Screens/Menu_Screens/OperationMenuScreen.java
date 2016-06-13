package com.felipe.lucas.lfwframework.Test_Screens.Menu_Screens;

import android.os.Bundle;

import com.felipe.lucas.lfwframework.Components.ItemMenuLFW;
import com.felipe.lucas.lfwframework.Screen.BaseMenuScreen;
import com.felipe.lucas.lfwframework.Test_Screens.OperationScreens.ProductionExecutionFormScreen;
import com.felipe.lucas.lfwframework.Test_Screens.OperationScreens.ProductionOrderFormScreen;

/**
 * Created by lucas on 09/03/2016.
 */
public class OperationMenuScreen extends BaseMenuScreen {


    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        buildOptions();
        m_IFrame.add(m_Menu);
        m_IFrame.builScreen(this.getClass(), "Menu Produção");
        addOnScreen(m_IFrame);
    }

    private void buildOptions () {
        m_ItemMenuList.add(new ItemMenuLFW("Ordem de produção", ProductionOrderFormScreen.class));
        m_ItemMenuList.add(new ItemMenuLFW("Execução de produção",
                ProductionExecutionFormScreen.class));
        m_Menu.setMenuItens(getApplicationContext(), m_ItemMenuList);
    }
}
