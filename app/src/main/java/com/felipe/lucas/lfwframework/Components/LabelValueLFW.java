package com.felipe.lucas.lfwframework.Components;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.felipe.lucas.lfwframework.Util.UtilLFW;

/**
 * Created by lucas on 10/03/2016.
 */
public class LabelValueLFW extends TextView {
    TextView m_Value;
    Boolean m_ShowColon;

    public LabelValueLFW (Context context) {
        super(context);
    }

    public LabelValueLFW (Context p_Context, String p_Label, String p_Value, Boolean p_ShowColon) {
        super(p_Context);
        String v_Colon = p_ShowColon ? " : " : " ";
        setText(p_Label + v_Colon);
        setId(UtilLFW.getAvailableID());
        setTextSize(15);
        setPadding(10, 0, 0, 0);
        m_Value = new TextView(p_Context);
        m_Value.setTextSize(15);
        m_Value.setText(p_Value);
        m_Value.setId(UtilLFW.getAvailableID());
        m_ShowColon = p_ShowColon;

    }

    public View getLayoutParams (int p_PreviousComponentId, IFrameLFW p_IFrame) {
        RelativeLayout.LayoutParams v_LayoutParamElement = new
                RelativeLayout.LayoutParams
                (RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams
                        .WRAP_CONTENT);
        v_LayoutParamElement.addRule(RelativeLayout.BELOW, p_PreviousComponentId);
        setLayoutParams(v_LayoutParamElement);
        p_IFrame.addView(this);
        RelativeLayout.LayoutParams v_LayoutParamElement2 = new
                RelativeLayout.LayoutParams
                (RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams
                        .WRAP_CONTENT);
        //v_LayoutParamElement2.addRule(RelativeLayout.BELOW, this.getId());
        v_LayoutParamElement2.addRule(RelativeLayout.BELOW, p_PreviousComponentId);
        v_LayoutParamElement2.addRule(RelativeLayout.RIGHT_OF, getId());
        m_Value.setLayoutParams(v_LayoutParamElement2);
        p_IFrame.addView(m_Value);
        return this;
    }
}