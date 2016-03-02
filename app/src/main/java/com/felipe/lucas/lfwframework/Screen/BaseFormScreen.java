package com.felipe.lucas.lfwframework.Screen;

import android.os.Bundle;

import com.felipe.lucas.lfwframework.Components.IFrameLFW;
import com.felipe.lucas.lfwframework.R;

/**
 * Created by lucas on 26/02/2016.
 */
public class BaseFormScreen extends BaseScreenWithHeader {

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        m_IFrame.clear();
    }
}
