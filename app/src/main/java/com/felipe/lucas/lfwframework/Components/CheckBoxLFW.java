package com.felipe.lucas.lfwframework.Components;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.Gravity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.felipe.lucas.lfwframework.R;
import com.felipe.lucas.lfwframework.Util.UtilLFW;

/**
 * Created by lucas on 25/01/2016.
 */
public class CheckBoxLFW extends CheckBox {
    private int m_PaddingLeft = 0;
    private int m_PaddingTopp = 0;
    private int m_PaddingRigth = 0;
    private int m_PaddingBottom = 0;

    private TextView m_LabelTextView;

    CheckBoxLFW (Context p_Context) {
        super(p_Context);
    }

    public CheckBoxLFW (Context p_Context, String p_LabelText, String p_Text, boolean p_Checked,
                        boolean p_ShowColon, boolean p_IsActive) {
        super(p_Context);
        setText(p_Text);
        setChecked(p_Checked);
        setId(UtilLFW.getAvailableID());
        setLabelPadding(0, 8, 0, 8);
        setActivated(p_IsActive);
        m_LabelTextView = new TextView(p_Context);
        setTextColor(ContextCompat.getColor(p_Context, R.color.black));
        m_LabelTextView.setTextColor(ContextCompat.getColor(p_Context, R.color.black));
        m_LabelTextView.setText(p_LabelText + (p_ShowColon ? ": " : " "));
        m_LabelTextView.setId(UtilLFW.getAvailableID());
    }

    public View getLayoutParams (int p_PreviousComponentId, boolean
            p_IsBaseScreenWithHeaderChild, IFrameLFW p_IFrame) {
        RelativeLayout.LayoutParams v_LayoutParamElement = new
                RelativeLayout.LayoutParams
                (RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams
                        .WRAP_CONTENT);
        v_LayoutParamElement.addRule(RelativeLayout.BELOW, p_PreviousComponentId);
        m_LabelTextView.setTextSize(18);
        m_LabelTextView.setLayoutParams(v_LayoutParamElement);
        m_LabelTextView.setPadding(m_PaddingLeft, m_PaddingTopp, m_PaddingRigth, m_PaddingBottom);
        p_IFrame.addView(m_LabelTextView);
        RelativeLayout.LayoutParams v_LayoutParamElement2 = new
                RelativeLayout.LayoutParams
                (RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams
                        .WRAP_CONTENT);
        v_LayoutParamElement2.addRule(RelativeLayout.BELOW, p_PreviousComponentId);
        v_LayoutParamElement2.addRule(RelativeLayout.RIGHT_OF, m_LabelTextView.getId());
        this.setLayoutParams(v_LayoutParamElement2);
        p_IFrame.addView(this);
        return m_LabelTextView;
    }

    public void setLabelPadding (int p_PaddingLeft, int p_PaddingTop, int p_PaddingRigth, int
            p_PaddingBottom) {
        m_PaddingLeft = p_PaddingLeft;
        m_PaddingTopp = p_PaddingTop;
        m_PaddingRigth = p_PaddingRigth;
        m_PaddingBottom = p_PaddingBottom;
    }
}
