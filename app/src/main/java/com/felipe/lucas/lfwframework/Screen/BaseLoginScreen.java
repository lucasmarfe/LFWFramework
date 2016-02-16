package com.felipe.lucas.lfwframework.Screen;

import android.os.Bundle;
import android.view.Gravity;

import com.felipe.lucas.lfwframework.Components.ButtonLFW;
import com.felipe.lucas.lfwframework.Components.IFrameLFW;
import com.felipe.lucas.lfwframework.Components.InputLFW;
import com.felipe.lucas.lfwframework.Components.InputPasswordLFW;
import com.felipe.lucas.lfwframework.R;

/**
 * Created by lucas on 29/01/2016.
 */
public class BaseLoginScreen extends BaseScreen {

    InputLFW m_inUserName;
    InputPasswordLFW m_inPassword;
    ButtonLFW m_btnLogin;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        m_Context = getApplicationContext();
        setContentView(R.layout.base_login_screen);
        m_IFrame = new IFrameLFW(m_Context);
        m_IFrame.setGravity(Gravity.CENTER);
        m_IFrame.setBackgroundResource(R.drawable.login_screen_drawble);
        m_IFrame.clear();
        m_inUserName = new InputLFW(m_Context, "Nome de usuário", true);
        m_inUserName.setTextSize(14);
        m_inUserName.setWidth(450);
        m_inPassword = new InputPasswordLFW(m_Context, "Senha", true);
        m_inPassword.setTextSize(14);
        m_inPassword.setWidth(450);
        m_btnLogin = new ButtonLFW(m_Context, "Login", true);
        m_IFrame.add(m_inUserName);
        m_IFrame.add(m_inPassword);
        m_IFrame.add(m_btnLogin);
        m_IFrame.builScreen();
        addOnScreen(m_IFrame);
    }
}