package com.felipe.lucas.lfwframework.Test_Screens;

import android.os.Bundle;

import com.felipe.lucas.lfwframework.Components.ItemMenuLFW;
import com.felipe.lucas.lfwframework.Screen.BaseMenuScreen;

import java.util.ArrayList;

/**
 * Created by lucas on 09/03/2016.
 */
public class MenuPrincipalScreen extends BaseMenuScreen {


    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        buildOptions();
        m_IFrame.add(m_Menu);
        m_IFrame.builScreen(this.getClass(), "Menu principal");
        addOnScreen(m_IFrame);
    }

    private void buildOptions () {
        m_ItemMenuList.add(new ItemMenuLFW("Login", LoginScreen.class));
        m_ItemMenuList.add(new ItemMenuLFW("Filtrar Ordem de produção",
                ProductionOrderFormScreen.class));
        m_ItemMenuList.add(new ItemMenuLFW("Resultados Ordem Produção",
                ProductionOrderResultsScreen.class));
        m_ItemMenuList.add(new ItemMenuLFW("Detalhes Ordem Produção",
                ProductionOrderDetailsScreen.class));
        m_Menu.setMenuItens(m_Context, m_ItemMenuList);
    }
}
