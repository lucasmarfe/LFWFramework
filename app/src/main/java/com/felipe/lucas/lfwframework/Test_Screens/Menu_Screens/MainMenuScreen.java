package com.felipe.lucas.lfwframework.Test_Screens.Menu_Screens;

import android.os.Bundle;

import com.felipe.lucas.lfwframework.Components.ItemMenuLFW;
import com.felipe.lucas.lfwframework.Screen.BaseMenuScreen;

/**
 * Created by lucas on 09/03/2016.
 */
public class MainMenuScreen extends BaseMenuScreen {


    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        buildOptions();
        m_IFrame.add(m_Menu);
        m_IFrame.builScreen(this.getClass(), "Menu principal");
        addOnScreen(m_IFrame);
    }

    private void buildOptions () {
        m_ItemMenuList.add(new ItemMenuLFW("Operação", OperationMenuScreen.class));
        m_ItemMenuList.add(new ItemMenuLFW("Qualidade",
                QualityMenuScreen.class));
        m_ItemMenuList.add(new ItemMenuLFW("Cadastro",
                CadastreMenuScreen.class));
        m_ItemMenuList.add(new ItemMenuLFW("Relatórios",
                ReportMenuScreen.class));
        m_Menu.setMenuItens(m_Context, m_ItemMenuList);
    }
}
