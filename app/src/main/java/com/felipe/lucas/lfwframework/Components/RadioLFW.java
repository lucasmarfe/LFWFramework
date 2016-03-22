package com.felipe.lucas.lfwframework.Components;

import android.content.Context;
import android.content.res.ColorStateList;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.felipe.lucas.lfwframework.R;
import com.felipe.lucas.lfwframework.Util.UtilLFW;

import java.util.List;

/**
 * Created by lucas on 20/01/2016.
 */
public class RadioLFW extends RadioGroup {
    private int m_PaddingLeft;
    private int m_PaddingTopp;
    private int m_PaddingRigth;
    private int m_PaddingBottom;

    private RadioButton[] m_RadioButtonList;

    private TextView m_LabelTextView;

    private Context m_LocalContext;

    //private List<RadioButton> m_RadioButtonList = new ArrayList<RadioButton>();

    public RadioLFW (Context context) {
        super(context);
    }

    public RadioLFW (Context p_Context, String p_LabelText, boolean p_IsHorizontal, boolean
            p_IsActive, boolean p_ShowColon) {
        super(p_Context);
        m_LocalContext = p_Context;
        setId(UtilLFW.getAvailableID());
        setOrientation(p_IsHorizontal ? RadioGroup.HORIZONTAL : RadioGroup.VERTICAL);
        setActivated(p_IsActive);
        m_LabelTextView = new TextView(p_Context);
        m_LabelTextView.setTextColor(ContextCompat.getColor(p_Context, R.color.black));
        m_LabelTextView.setText(p_LabelText + (p_ShowColon ? ": " : " "));
        m_LabelTextView.setId(UtilLFW.getAvailableID());
        setLabelPadding(0, 20, 0, 20);
        //setBackgroundColor();

//        setOnCheckedChangeListener(new OnCheckedChangeListener() {
//            int v_Checked = -1;
//            @Override
//            public void onCheckedChanged(RadioGroup group, int checkedId) {
//                if(checkedId!=-1)
//                {
//                    v_Checked = checkedId;
//                    clearCheck();
//                }
//
//                RadioButton v_RadioChecked = (RadioButton) findViewById(v_Checked);
//                if(v_RadioChecked!=null)v_RadioChecked.setChecked(true);
//            }
//
//        });
        //);
    }

    public void setItensContent (Context p_Context, Enum<?> p_Enum, boolean
            p_IsFromBaseScreenWithHeader) {
        int c_Count = 0;
        int v_RadioId = UtilLFW.getAvailableID();
        m_RadioButtonList = new RadioButton[p_Enum.getDeclaringClass().getEnumConstants().length];
        //p_Enum.getClass().getEnumConstants();
        for (Object p_Value : p_Enum.getDeclaringClass().getEnumConstants()) {
            m_RadioButtonList[c_Count] = new RadioButton(p_Context);
            m_RadioButtonList[c_Count].setText((String) p_Value);
            m_RadioButtonList[c_Count].setId(v_RadioId + c_Count);
            m_RadioButtonList[c_Count].setTextColor(p_IsFromBaseScreenWithHeader ? ContextCompat
                    .getColor(m_LocalContext, R.color.black) : ContextCompat.getColor
                    (m_LocalContext, R.color.white));
            m_RadioButtonList[c_Count].setButtonTintList(p_IsFromBaseScreenWithHeader ?
                    ColorStateList.valueOf(ContextCompat
                            .getColor(m_LocalContext, R.color.black)) : ColorStateList.valueOf
                    (ContextCompat
                            .getColor(m_LocalContext, R.color.white)));
            //m_RadioButtonList.add(m_RadioButton);
            addView(m_RadioButtonList[c_Count]);
        }
    }

    public void setItensContent (Context p_Context, List<String> p_StringList, boolean p_IsFromBaseScreenWithHeader) {
        int c_Count = 0;
        int v_RadioId = UtilLFW.getAvailableID();
        m_RadioButtonList = new RadioButton[p_StringList.size()];
        for (String p_Value : p_StringList) {
            m_RadioButtonList[c_Count] = new RadioButton(p_Context);
            m_RadioButtonList[c_Count].setText(p_Value);
            m_RadioButtonList[c_Count].setId(v_RadioId + c_Count);
            m_RadioButtonList[c_Count].setTextColor(p_IsFromBaseScreenWithHeader ? ContextCompat
                    .getColor(m_LocalContext, R.color.black) : ContextCompat.getColor
                    (m_LocalContext, R.color.white));
            m_RadioButtonList[c_Count].setButtonTintList(p_IsFromBaseScreenWithHeader ?
                    ColorStateList.valueOf(ContextCompat
                    .getColor(m_LocalContext, R.color.black)) : ColorStateList.valueOf(ContextCompat
                    .getColor(m_LocalContext, R.color.white)));
            //m_RadioButtonList.add(m_RadioButtonList[c_Count]);
            addView(m_RadioButtonList[c_Count]);
            c_Count++;
        }
    }

    public View getLayoutParams (int p_PreviousComponentId, boolean
            p_IsBaseScreenWithHeaderChild, IFrameLFW p_IFrame) {
        RelativeLayout.LayoutParams v_LayoutParamElement = new
                RelativeLayout.LayoutParams
                (RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams
                        .WRAP_CONTENT);

        if (!p_IsBaseScreenWithHeaderChild) {
            m_LabelTextView.setTextColor(ContextCompat.getColor(m_LocalContext, R.color.white));
        }
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
