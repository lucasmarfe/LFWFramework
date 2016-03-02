package com.felipe.lucas.lfwframework.Test_Screens;

import android.os.Bundle;

import com.felipe.lucas.lfwframework.Components.CheckBoxLFW;
import com.felipe.lucas.lfwframework.Components.RadioLFW;
import com.felipe.lucas.lfwframework.Screen.BaseLoginScreen;

import java.util.Arrays;

/**
 * Created by lucas on 02/03/2016.
 */
public class LoginScreen extends BaseLoginScreen {
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        RadioLFW v_CheckBox = new RadioLFW(getApplicationContext(), "Ambiente", true, true);
        v_CheckBox.setItensContent(getApplicationContext(), Arrays.asList("PRD",
                "HOM"));
        m_IFrame.addAfterComponent(v_CheckBox, m_inPassword);
        m_IFrame.builScreen();
        addOnScreen(m_IFrame);
    }
}
