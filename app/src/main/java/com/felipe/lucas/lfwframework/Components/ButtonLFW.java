package com.felipe.lucas.lfwframework.Components;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.felipe.lucas.lfwframework.R;
import com.felipe.lucas.lfwframework.Util.UtilLFW;

/**
 * Created by lucas on 13/01/2016.
 */
public class ButtonLFW extends Button implements Components {

    ButtonLFW (Context context)
    {
        super(context);
    }

    public ButtonLFW(Context p_Context, String p_Text, boolean p_IsActive) {
        super(p_Context);
        setId(UtilLFW.getAvailableID());
        setText(p_Text);
        setTextSize(18);
        //setPadding(100, 20, 20, 100);
        setTextColor(ContextCompat.getColor(p_Context, R.color.textButtonPressed));
        setActivated(p_IsActive);
        setBackgroundResource(R.drawable.buttons_properties);
        setCompoundDrawablePadding(20);
    }

    public View getLayoutParams (int p_PreviousComponentId, boolean
            p_IsBaseScreenWithHeaderChild, IFrameLFW p_IFrame) {
        RelativeLayout.LayoutParams v_LayoutParamElement = new
                RelativeLayout.LayoutParams
                (RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams
                        .WRAP_CONTENT);
        v_LayoutParamElement.addRule(RelativeLayout.CENTER_HORIZONTAL,
                RelativeLayout.TRUE);
        v_LayoutParamElement.addRule(RelativeLayout.BELOW, p_PreviousComponentId);
        v_LayoutParamElement.setMargins(10, 20, 10, 20);
        this.setLayoutParams(v_LayoutParamElement);
        p_IFrame.addView(this);
        return this;
    }
}
