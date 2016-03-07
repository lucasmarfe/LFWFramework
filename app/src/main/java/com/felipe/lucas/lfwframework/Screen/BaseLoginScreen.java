package com.felipe.lucas.lfwframework.Screen;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PixelFormat;
import android.graphics.drawable.Drawable;
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

    public InputLFW m_inUserName;
    public InputPasswordLFW m_inPassword;
    public ButtonLFW m_btnLogin;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        m_Context = getApplicationContext();
        setContentView(R.layout.base_login_screen);
        m_IFrame = new IFrameLFW(m_Context);
        m_IFrame.setGravity(Gravity.CENTER);
        m_IFrame.setBackgroundResource(R.drawable.login_screen_drawble);
        //TextDrawable v_TextDrawable = new TextDrawable("Login");
        //v_TextDrawable.setLevel(4000);
        //m_IFrame.setBackground(v_TextDrawable);
        m_IFrame.clear();
        m_inUserName = new InputLFW(m_Context, "Nome de usuário", true);
        m_inUserName.setTextSize(18);
        m_inUserName.setWidth(900);
        m_inPassword = new InputPasswordLFW(m_Context, "Senha", true);
        m_inPassword.setTextSize(18);
        m_inPassword.setWidth(900);
        m_btnLogin = new ButtonLFW(m_Context, "Login", true);
        m_IFrame.add(m_inUserName);
        m_IFrame.add(m_inPassword);
        m_IFrame.add(m_btnLogin);

    }


    class TextDrawable extends Drawable {

        private final String text;
        private final Paint paint;

        public TextDrawable (String text) {

            this.text = text;

            this.paint = new Paint();
            paint.setColor(Color.BLACK);
            paint.setTextSize(35f);
            paint.setAntiAlias(true);
            paint.setFakeBoldText(true);
            paint.setShadowLayer(6f, 0, 0, Color.BLACK);
            paint.setStyle(Paint.Style.FILL);
            paint.setTextAlign(Paint.Align.CENTER);
        }

        @Override
        public void draw (Canvas canvas) {
            canvas.drawText(text, 0, 0, paint);
        }

        @Override
        public void setAlpha (int alpha) {
            paint.setAlpha(alpha);
        }

        @Override
        public void setColorFilter (ColorFilter cf) {
            paint.setColorFilter(cf);
        }

        @Override
        public int getOpacity () {
            return PixelFormat.TRANSLUCENT;
        }
    }
}