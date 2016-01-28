package com.felipe.lucas.lfwframework.Components;

import android.content.Context;
import android.view.Gravity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.felipe.lucas.lfwframework.Util.UtilLFW;

/**
 * Created by lucas on 25/01/2016.
 */
public class CheckBoxLFW extends CheckBox {
    private String m_LabelText;

    TextView m_LabelTextView;

    public CheckBoxLFW (Context p_Context) {
        super(p_Context);
    }

    public CheckBoxLFW (Context p_Context, String p_LabelText, String p_Text, boolean p_Checked) {
        super(p_Context);
        setText(p_Text);
        setChecked(p_Checked);
        setId(UtilLFW.getAvailableID());
        m_LabelTextView = new TextView(p_Context);
        m_LabelTextView.setText(p_LabelText);
        m_LabelTextView.setId(UtilLFW.getAvailableID());
    }

    public View getLayoutParams (int p_PreviousComponentId, IFrameLFW p_IFrame) {
        RelativeLayout.LayoutParams v_LayoutParamElement = new
                RelativeLayout.LayoutParams
                (RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams
                        .WRAP_CONTENT);
        v_LayoutParamElement.addRule(RelativeLayout.BELOW, p_PreviousComponentId);
        //v_LayoutParamElement.addRule(RelativeLayout.CENTER_VERTICAL, p_PreviousComponentId);
        //m_LabelTextView.setGravity(Gravity.CENTER_VERTICAL);
        //v_LayoutParamElement.addRule(RelativeLayout.ALIGN_PARENT_LEFT, RelativeLayout.TRUE);
        //v_LayoutParamElement.addRule(RelativeLayout.CENTER_VERTICAL);
        m_LabelTextView.setTextSize(18);
        m_LabelTextView.setLayoutParams(v_LayoutParamElement);
        //v_LayoutParamElement.addRule(RelativeLayout.RIGHT_OF, this.getId());

        //addView(v_Component, v_LayoutParamElement);
        p_IFrame.addView(m_LabelTextView);

        RelativeLayout.LayoutParams v_LayoutParamElement2 = new
                RelativeLayout.LayoutParams
                (RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams
                        .WRAP_CONTENT);
        v_LayoutParamElement2.addRule(RelativeLayout.BELOW, p_PreviousComponentId);
        v_LayoutParamElement2.addRule(RelativeLayout.RIGHT_OF, m_LabelTextView.getId());
//        v_LayoutParamElement2.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
//        v_LayoutParamElement.addRule(RelativeLayout.ALIGN_LEFT, RelativeLayout.TRUE);
//        //v_LayoutParamElement.addRule(RelativeLayout.ALIGN_BOTTOM, RelativeLayout.TRUE);
        this.setLayoutParams(v_LayoutParamElement2);
        p_IFrame.addView(this);
        //return v_LayoutParamElement;
        return m_LabelTextView;
    }

}
