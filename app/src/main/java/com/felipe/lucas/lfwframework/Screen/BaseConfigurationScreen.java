package com.felipe.lucas.lfwframework.Screen;

import android.os.Bundle;

import com.felipe.lucas.lfwframework.Components.LabelValueLFW;
import com.felipe.lucas.lfwframework.Util.UtilLFW;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by lucas on 25/03/2016.
 */
public class BaseConfigurationScreen extends BaseScreenWithHeader {

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        buildPage();
        m_IFrame.builScreen(this.getClass(), "PO Detalhes");
        setContentView(m_IFrame);
    }

    public void buildPage () {
        TreeMap<String, String> v_ConfigList = UtilLFW.getConfigTreeMap();
        for (Map.Entry<String, String> v_Item : v_ConfigList.entrySet()) {
            LabelValueLFW v_ItemLabelValue = new LabelValueLFW(getApplicationContext(), v_Item
                    .getKey(), v_Item.getValue(), true);
            v_ItemLabelValue.setValuePadding(10, 50, 0, 0);
            m_IFrame.add(v_ItemLabelValue);
        }

    }
}
