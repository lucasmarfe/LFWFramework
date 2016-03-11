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
        setBackgroundColor(R.color.toolbar_background);
        //m_IFrame.setGravity(Gravity.CENTER);
        m_IFrame.clear();
        m_IFrame.setBackgroundColor(ContextCompat.getColor(m_Context, R.color.toolbar_background));
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
        m_inUserName = new InputLFW(m_Context, "Nome de usuário", true);
        m_inUserName.setTextSize(20);
        m_inUserName.setWidth(900);
        m_inPassword = new InputPasswordLFW(m_Context, "Senha", true);
        m_inPassword.setTextSize(20);
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