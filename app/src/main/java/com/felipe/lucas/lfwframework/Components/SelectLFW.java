package com.felipe.lucas.lfwframework.Components;

import android.content.Context;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

import com.felipe.lucas.lfwframework.R;
import com.felipe.lucas.lfwframework.Util.UtilLFW;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lucas on 24/01/2016.
 */
public class SelectLFW extends Spinner {

    private String m_Label;

    private Context m_LocalContext;

    private List<RadioButton> m_RadioButtonList = new ArrayList<RadioButton>();

    public SelectLFW (Context p_Context) {
        super(p_Context);
    }

    public SelectLFW (Context p_Context, String p_LabelText, boolean p_IsActive) {
        super(p_Context);
        m_LocalContext = p_Context;
        setId(UtilLFW.getAvailableID());
        m_Label = p_LabelText;
        setActivated(p_IsActive);
    }

    public void setItensContent (List<String> p_StringList) {
        ArrayAdapter<String> v_Adapter = new ArrayAdapter<String>(m_LocalContext,
                android.R.layout.simple_spinner_item, p_StringList);
        v_Adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        setAdapter(v_Adapter);
    }
}
