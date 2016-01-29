package com.felipe.lucas.lfwframework.Screen;

import android.os.Bundle;

import com.felipe.lucas.lfwframework.Components.InputLFW;
import com.felipe.lucas.lfwframework.Components.InputPasswordLFW;
import com.felipe.lucas.lfwframework.R;

/**
 * Created by lucas on 29/01/2016.
 */
public class BaseLoginScreen extends BaseScreen {

    InputLFW m_inUserName;
    InputPasswordLFW m_inPassword;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.base_login_screen);
    }
}
