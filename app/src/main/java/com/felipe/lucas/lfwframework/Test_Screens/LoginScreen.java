package com.felipe.lucas.lfwframework.Test_Screens;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.felipe.lucas.lfwframework.Components.CheckBoxLFW;
import com.felipe.lucas.lfwframework.Components.RadioLFW;
import com.felipe.lucas.lfwframework.Screen.BaseLoginScreen;
import com.felipe.lucas.lfwframework.Util.UtilLFW;

import java.util.Arrays;

/**
 * Created by lucas on 02/03/2016.
 */
public class LoginScreen extends BaseLoginScreen {
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        m_Title.setText("Login");
        RadioLFW v_CheckBox = new RadioLFW(getApplicationContext(), "Ambiente", true, true, true);
        v_CheckBox.setItensContent(getApplicationContext(), Arrays.asList("PRD",
                "HOM"), UtilLFW.checkIfCallerClassIsHeaderChild(this.getClass()));
        v_CheckBox.setPadding(80, 20, 0, 20);
        m_IFrame.addAfterComponent(v_CheckBox, m_inPassword);
        m_btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                Intent v_Intent = new Intent(getApplicationContext(), MenuPrincipalScreen.class);
                v_Intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                getApplicationContext().startActivity(v_Intent);
            }
        });
        m_IFrame.builScreen(this.getClass(), null);
        addOnScreen(m_IFrame);
    }
}
