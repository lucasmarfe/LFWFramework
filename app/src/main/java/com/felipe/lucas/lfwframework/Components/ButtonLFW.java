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
        //Set Id
        setId(UtilLFW.getAvailableID());
        //Set Text of button
        setText(p_Text);
        setTextColor(ContextCompat.getColor(p_Context, R.color.darkBlue_Scheme));
        //Set if button is activated
        setActivated(p_IsActive);

        //Corder radius
        //GradientDrawable v_GradientDrawable = new GradientDrawable();
        setBackgroundResource(R.drawable.buttons_properties);
        //setBackground(v_GradientDrawable);
        //setBackgroundColor(ContextCompat.getColor(p_Context, R.color.button));
        //setHighlightColor(ContextCompat.getColor(p_Context, R.color.darkBlue_Scheme));

//        setHintTextColor();
//        setLinkTextColor();
    }
}
