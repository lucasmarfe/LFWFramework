package com.felipe.lucas.lfwframework.Screen;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PixelFormat;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.view.Gravity;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.felipe.lucas.lfwframework.Components.ButtonLFW;
import com.felipe.lucas.lfwframework.Components.IFrameLFW;
import com.felipe.lucas.lfwframework.Components.InputLFW;
import com.felipe.lucas.lfwframework.Components.InputPasswordLFW;
import com.felipe.lucas.lfwframework.R;
import com.felipe.lucas.lfwframework.Util.UtilLFW;

/**
 * Created by lucas on 29/01/2016.
 */
public class BaseLoginScreen extends BaseScreen {

    public InputLFW m_inUserName;
    public InputPasswordLFW m_inPassword;
    public ButtonLFW m_btnLogin;
    public TextView m_Title;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        m_Context = getApplicationContext();

        m_IFrame = new IFrameLFW(m_Context);
        setBackgroundColor(R.color.login_background);
        //m_IFrame.setGravity(Gravity.CENTER);
        m_IFrame.clear();
        m_IFrame.setBackgroundColor(ContextCompat.getColor(m_Context, R.color.login_background));
        m_Title = new TextView(getApplicationContext());
        m_Title.setId(UtilLFW.getAvailableID());
        m_Title.setPadding(0, 200, 0, 150);
        m_Title.setTextSize(40);
        m_Title.setTypeface(Typeface.DEFAULT_BOLD);
        m_Title.setTextColor(ContextCompat.getColor(m_Context, R.color.white));
//        RelativeLayout.LayoutParams v_LayoutParamElement = new RelativeLayout.LayoutParams
//                (RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams
//                        .WRAP_CONTENT);
//        v_LayoutParamElement.addRule(RelativeLayout.CENTER_HORIZONTAL,
//                RelativeLayout.TRUE);
//        m_Title.setLayoutParams(v_LayoutParamElement);
        m_IFrame.add(m_Title);
        m_inUserName = new InputLFW(m_Context, "Nome de usuário", true, false, true);
        m_inUserName.setTextSize(20);
        m_inUserName.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.white));
        m_inUserName.setHintTextColor(ContextCompat.getColor(getApplicationContext(), R.color
                .inputGrayBright));
        m_inPassword = new InputPasswordLFW(m_Context, "Senha", true);
        m_inPassword.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.white));
        m_inPassword.setHintTextColor(ContextCompat.getColor(getApplicationContext(), R.color.inputGrayBright));
        m_inPassword.setTextSize(20);
        m_btnLogin = new ButtonLFW(m_Context, "Login", true);
        m_IFrame.add(m_inUserName);
        m_IFrame.add(m_inPassword);
        m_IFrame.add(m_btnLogin);
    }
}