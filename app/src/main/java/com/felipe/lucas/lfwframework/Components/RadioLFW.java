package com.felipe.lucas.lfwframework.Components;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.InputType;
import android.util.Log;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.felipe.lucas.lfwframework.Util.UtilLFW;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lucas on 20/01/2016.
 */
public class RadioLFW extends RadioGroup {
    private RadioButton[] m_RadioButtonList;

    private String m_Label;

    private Context m_LocalContext;

    //private List<RadioButton> m_RadioButtonList = new ArrayList<RadioButton>();

    public RadioLFW (Context context) {
        super(context);
    }

    public RadioLFW (Context p_Context, String p_LabelText, boolean p_IsHorizontal, boolean
            p_IsActive) {
        super(p_Context);
        m_LocalContext = p_Context;
        setId(UtilLFW.getAvailableID());
        m_Label = p_LabelText;
        setOrientation(p_IsHorizontal ? RadioGroup.HORIZONTAL : RadioGroup.VERTICAL);
        setActivated(p_IsActive);

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

    public void setItensContent (Context p_Context, Enum<?> p_Enum) {
        int c_Count = 0;
        int v_RadioId = UtilLFW.getAvailableID();
        m_RadioButtonList = new RadioButton[p_Enum.getDeclaringClass().getEnumConstants().length];
        //p_Enum.getClass().getEnumConstants();
        for (Object p_Value : p_Enum.getDeclaringClass().getEnumConstants()) {
            m_RadioButtonList[c_Count] = new RadioButton(p_Context);
            m_RadioButtonList[c_Count].setText((String) p_Value);
            m_RadioButtonList[c_Count].setId(v_RadioId + c_Count);
            //m_RadioButtonList.add(m_RadioButton);
            addView(m_RadioButtonList[c_Count]);
        }
    }

    public void setItensContent (Context p_Context, List<String> p_StringList) {
        int c_Count = 0;
        int v_RadioId = UtilLFW.getAvailableID();
        m_RadioButtonList = new RadioButton[p_StringList.size()];
        for (String p_Value : p_StringList) {
            m_RadioButtonList[c_Count] = new RadioButton(p_Context);
            m_RadioButtonList[c_Count].setText(p_Value);
            m_RadioButtonList[c_Count].setId(v_RadioId + c_Count);
            //m_RadioButtonList.add(m_RadioButtonList[c_Count]);
            addView(m_RadioButtonList[c_Count]);
            c_Count++;
        }
    }

    //TODO Lucas
    public void writeOnScreen () {

    }

}
