package com.felipe.lucas.lfwframework.Components;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.text.InputType;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;

import com.felipe.lucas.lfwframework.R;
import com.felipe.lucas.lfwframework.Util.UtilLFW;

/**
 * Created by lucas on 07/01/2016.
 */
public class InputPasswordLFW extends EditText {
    public InputPasswordLFW (Context context) {
        super(context);
    }

    public InputPasswordLFW (Context p_Context, String p_Text, boolean p_IsActive) {
        super(p_Context);
        setId(UtilLFW.getAvailableID());
        setHint(p_Text);
        setSingleLine(true);
        setPadding(200, 0, 0, 0);
        setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
        setActivated(p_IsActive);
        setTextColor(ContextCompat.getColor(p_Context, R.color.black));
        setHintTextColor(ContextCompat.getColor(p_Context, R.color.inputGray));
    }

    public View getLayoutParams (int p_PreviousComponentId, boolean
            p_IsBaseScreenWithHeaderChild, IFrameLFW p_IFrame) {
        RelativeLayout.LayoutParams v_LayoutParamElement = new
                RelativeLayout.LayoutParams
                (RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams
                        .WRAP_CONTENT);
        if (!p_IsBaseScreenWithHeaderChild) {
            v_LayoutParamElement = new
                    RelativeLayout.LayoutParams
                    (RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams
                            .WRAP_CONTENT);
        }
        v_LayoutParamElement.addRule(RelativeLayout.BELOW, p_PreviousComponentId);
        //v_LayoutParamElement.setMargins(0, 20, 0, 20);
        this.setLayoutParams(v_LayoutParamElement);
        p_IFrame.addView(this);
        return this;
    }
}
