package com.felipe.lucas.lfwframework.Components;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.widget.Button;

import com.felipe.lucas.lfwframework.R;
import com.felipe.lucas.lfwframework.Util.UtilLFW;

/**
 * Created by lucas on 13/01/2016.
 */
public class ButtonLFW extends Button {

    public ButtonLFW(Context context)
    {
        super(context);
    }

    public ButtonLFW(Context p_Context, String p_Text, boolean p_IsActive) {
        super(p_Context);
        setId(UtilLFW.getAvailableID());
        setText(p_Text);
        setTextSize(18);
        setPadding(0, 50, 0, 50);
        setTextColor(ContextCompat.getColor(p_Context, R.color.textButtonPressed));
        setActivated(p_IsActive);
        setBackgroundResource(R.drawable.buttons_properties);
    }
}
