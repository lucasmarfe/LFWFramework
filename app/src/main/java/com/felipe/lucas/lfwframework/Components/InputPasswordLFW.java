package com.felipe.lucas.lfwframework.Components;

import android.content.Context;
import android.text.InputType;
import android.widget.EditText;

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
        setInputType(InputType.TYPE_CLASS_TEXT |
                InputType.TYPE_TEXT_VARIATION_PASSWORD);
        setActivated(p_IsActive);
    }
}
