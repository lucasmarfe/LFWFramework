package com.felipe.lucas.lfwframework.Components;

import android.content.Context;
import android.content.res.ColorStateList;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.felipe.lucas.lfwframework.R;
import com.felipe.lucas.lfwframework.Util.UtilLFW;

/**
 * Created by lucas on 10/03/2016.
 */
public class LabelValueLFW extends TextView implements Components {
    TextView m_Value;

    public LabelValueLFW (Context context) {
        super(context);
    }

    public LabelValueLFW (Context p_Context, String p_Label, String p_Value, Boolean p_ShowColon) {
        super(p_Context);
        String v_Colon = p_ShowColon ? " : " : " ";
        setText(p_Label + v_Colon);
        setId(UtilLFW.getAvailableID());
        setTextSize(17);
        setTextColor(ColorStateList.valueOf(ContextCompat.getColor(p_Context, R.color.black)));
        m_Value = new TextView(p_Context);
        m_Value.setTextColor(ColorStateList.valueOf(ContextCompat.getColor(p_Context, R.color
                .black)));
        m_Value.setTextSize(17);
        m_Value.setText(p_Value);
        m_Value.setId(UtilLFW.getAvailableID());
    }

    public View getLayoutParams (int p_PreviousComponentId, boolean
            v_IsBaseScreenWithHeaderChild, IFrameLFW p_IFrame) {
        RelativeLayout.LayoutParams v_LayoutParamElement = new
                RelativeLayout.LayoutParams
                (RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams
                        .WRAP_CONTENT);
        v_LayoutParamElement.addRule(RelativeLayout.BELOW, p_PreviousComponentId);
        setPadding(10, 8, 10, 8);
        setLayoutParams(v_LayoutParamElement);
        p_IFrame.addView(this);
        RelativeLayout.LayoutParams v_LayoutParamElement2 = new
                RelativeLayout.LayoutParams
                (RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams
                        .WRAP_CONTENT);
        //v_LayoutParamElement2.addRule(RelativeLayout.BELOW, this.getId());
        v_LayoutParamElement2.addRule(RelativeLayout.BELOW, p_PreviousComponentId);
        v_LayoutParamElement2.addRule(RelativeLayout.RIGHT_OF, getId());
        m_Value.setPadding(10, 8, 10, 8);
        m_Value.setLayoutParams(v_LayoutParamElement2);
        p_IFrame.addView(m_Value);
        return this;
    }
}
