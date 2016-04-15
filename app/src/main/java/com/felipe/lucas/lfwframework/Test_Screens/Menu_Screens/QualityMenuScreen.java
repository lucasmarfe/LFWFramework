package com.felipe.lucas.lfwframework.Test_Screens.Menu_Screens;

import android.os.Bundle;

import com.felipe.lucas.lfwframework.Components.ItemMenuLFW;
import com.felipe.lucas.lfwframework.Screen.BaseMenuScreen;
import com.felipe.lucas.lfwframework.Test_Screens.QualityScreens.QualityResultsFormScreen;
import com.felipe.lucas.lfwframework.Test_Screens.QualityScreens.SampleFormScreen;

/**
 * Created by lucas on 09/03/2016.
 */
public class QualityMenuScreen extends BaseMenuScreen {


    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        buildOptions();
        m_IFrame.add(m_Menu);
        m_IFrame.builScreen(this.getClass(), "Qualidade");
        addOnScreen(m_IFrame);
    }

    private void buildOptions () {
        m_ItemMenuList.add(new ItemMenuLFW("Amostra de material", SampleFormScreen.class));
        m_ItemMenuList.add(new ItemMenuLFW("Resultados de qualidade",
                QualityResultsFormScreen.class));
        m_Menu.setMenuItens(getApplicationContext(), m_ItemMenuList);
    }
}
