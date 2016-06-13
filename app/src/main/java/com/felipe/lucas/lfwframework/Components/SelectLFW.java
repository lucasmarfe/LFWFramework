package com.felipe.lucas.lfwframework.Components;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;

import com.felipe.lucas.lfwframework.R;
import com.felipe.lucas.lfwframework.Util.UtilLFW;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lucas on 24/01/2016.
 */
public class SelectLFW extends Spinner implements Components {
    TextView m_LabelTextView;

    public SelectLFW (Context p_Context) {
        super(p_Context);
    }

    public SelectLFW (Context p_Context, String p_LabelText, boolean p_ShowColon, boolean
            p_IsActive) {
        super(p_Context);
        setId(UtilLFW.getAvailableID());
        setEnabled(p_IsActive);
        setClickable(p_IsActive);
        m_LabelTextView = new TextView(p_Context);
        //setBackgroundColor(ContextCompat.getColor(p_Context, R.color.black));
        m_LabelTextView.setTextColor(ContextCompat.getColor(p_Context, R.color.black));
        m_LabelTextView.setText(p_LabelText + (p_ShowColon ? ": " : " "));
        m_LabelTextView.setId(UtilLFW.getAvailableID());
        m_LabelTextView.setTextSize(12);
        setPadding(8, 8, 8, 8);
    }

    public void setItensContent (Context p_Context, List<String> p_StringList) {
        ArrayAdapter<String> v_Adapter = new ArrayAdapter<String>(p_Context,
                R.layout.spinner_lfw_layout, p_StringList);
        v_Adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        setAdapter(v_Adapter);
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
        m_LabelTextView.setPadding(10, 8, 10, 8);
        p_IFrame.addView(m_LabelTextView);
        RelativeLayout.LayoutParams v_LayoutParamElement2 = new
                RelativeLayout.LayoutParams
                (RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams
                        .WRAP_CONTENT);
        v_LayoutParamElement2.addRule(RelativeLayout.BELOW, p_PreviousComponentId);
        v_LayoutParamElement2.addRule(RelativeLayout.RIGHT_OF, m_LabelTextView.getId());
        setPadding(10, 8, 10, 8);
        this.setLayoutParams(v_LayoutParamElement2);
        p_IFrame.addView(this);
        return m_LabelTextView;
    }
}
