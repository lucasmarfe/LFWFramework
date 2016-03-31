package com.felipe.lucas.lfwframework.Test_Screens.LoginScreen;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.felipe.lucas.lfwframework.Components.CheckBoxLFW;
import com.felipe.lucas.lfwframework.Components.HourLFW;
import com.felipe.lucas.lfwframework.Components.RadioLFW;
import com.felipe.lucas.lfwframework.Screen.BaseLoginScreen;
import com.felipe.lucas.lfwframework.Test_Screens.MenuPrincipalScreen;
import com.felipe.lucas.lfwframework.Test_Screens.Menu_Screens.MainMenuScreen;
import com.felipe.lucas.lfwframework.Util.UtilLFW;

import java.util.Arrays;
import java.util.Calendar;

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
        m_IFrame.addAfterComponent(v_CheckBox, m_inPassword);
//        HourLFW v_HourTest = new HourLFW(getApplicationContext(),"Hora início", Calendar
//         .getInstance(),true,this,true);
//        m_IFrame.addAfterComponent(v_HourTest , v_CheckBox);
        m_btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                Intent v_Intent = new Intent(getApplicationContext(), MainMenuScreen.class);
                v_Intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                getApplicationContext().startActivity(v_Intent);
            }
        });
        m_IFrame.builScreen(this.getClass(), null);
        addOnScreen(m_IFrame);
    }
}
