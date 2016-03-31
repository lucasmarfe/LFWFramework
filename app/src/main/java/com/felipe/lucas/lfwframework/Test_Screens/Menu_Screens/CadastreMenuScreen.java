package com.felipe.lucas.lfwframework.Test_Screens.Menu_Screens;

import android.os.Bundle;

import com.felipe.lucas.lfwframework.Components.ItemMenuLFW;
import com.felipe.lucas.lfwframework.Screen.BaseMenuScreen;
import com.felipe.lucas.lfwframework.Test_Screens.CadastreScreens.MaterialCadastreScreen;
import com.felipe.lucas.lfwframework.Test_Screens.CadastreScreens.MaterialPropertyCadastreScreen;
import com.felipe.lucas.lfwframework.Test_Screens.CadastreScreens.ShiftCadastreScreen;

/**
 * Created by lucas on 09/03/2016.
 */
public class CadastreMenuScreen extends BaseMenuScreen {


    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        buildOptions();
        m_IFrame.add(m_Menu);
        m_IFrame.builScreen(this.getClass(), "Cadastro");
        addOnScreen(m_IFrame);
    }

    private void buildOptions () {
        m_ItemMenuList.add(new ItemMenuLFW("Material", MaterialCadastreScreen.class));
        m_ItemMenuList.add(new ItemMenuLFW("Propriedade de material",
                MaterialPropertyCadastreScreen.class));
        m_ItemMenuList.add(new ItemMenuLFW("Turno",
                ShiftCadastreScreen.class));
        m_Menu.setMenuItens(m_Context, m_ItemMenuList);
    }
}
