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
        m_Title.setText("Login");
        CheckBoxLFW v_CheckBox2 = new CheckBoxLFW(getApplicationContext(), "Ambiente", "PRD",
                true, true);
        RadioLFW v_CheckBox = new RadioLFW(getApplicationContext(), "Ambiente", true, true, true);
        v_CheckBox.setItensContent(getApplicationContext(), Arrays.asList("PRD",
                "HOM"));
        v_CheckBox.setPadding(80, 0, 0, 0);
        v_CheckBox2.setLabelPadding(90, 0, 0, 0);
        m_IFrame.addAfterComponent(v_CheckBox, m_inPassword);
        m_IFrame.addAfterComponent(v_CheckBox2, v_CheckBox);
        m_IFrame.builScreen(this.getClass(), null);
        addOnScreen(m_IFrame);
    }
}
