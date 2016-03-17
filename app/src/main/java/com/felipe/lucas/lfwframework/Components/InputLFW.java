package com.felipe.lucas.lfwframework.Components;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.text.InputType;
import android.view.ViewGroup;
import android.widget.EditText;

import com.felipe.lucas.lfwframework.R;
import com.felipe.lucas.lfwframework.Util.UtilLFW;

/**
 * Created by lucas on 07/01/2016.
 */
public class InputLFW extends EditText {
    public InputLFW(Context context)
    {
        super(context);
    }

    public InputLFW(Context p_Context, String p_Text, boolean p_IsActive) {
        super(p_Context);
        setId(UtilLFW.getAvailableID());
        setHint(p_Text);
        setInputType(InputType.TYPE_CLASS_TEXT);
        setActivated(p_IsActive);
        setTextColor(ContextCompat.getColor(p_Context, R.color.black));
        setHintTextColor(ContextCompat.getColor(p_Context, R.color.inputGray));
    }
}
