package com.felipe.lucas.lfwframework.Screen;

import android.os.Bundle;

import com.felipe.lucas.lfwframework.Components.LabelValueLFW;
import com.felipe.lucas.lfwframework.Util.UtilLFW;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by lucas on 31/03/2016.
 */
public class BaseAboutScreen extends BaseScreenWithHeader {

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        buildPage();
        m_IFrame.builScreen(this.getClass(), "Sobre");
        setContentView(m_IFrame);
    }

    public void buildPage () {
        TreeMap<String, String> v_ConfigList = UtilLFW.getConfigTreeMap();
        String[] v_Lines = v_ConfigList.get("AboutLine").split(";");
        for (String v_Value : v_Lines) {
            LabelValueLFW v_ItemLabelValue = new LabelValueLFW(getApplicationContext(), v_Value,
                    null, false);
            v_ItemLabelValue.setValuePadding(10, 50, 0, 0);
            m_IFrame.add(v_ItemLabelValue);
        }
    }
}