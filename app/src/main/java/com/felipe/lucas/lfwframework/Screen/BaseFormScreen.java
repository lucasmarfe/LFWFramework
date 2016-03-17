package com.felipe.lucas.lfwframework.Screen;

import android.content.Context;
import android.os.Bundle;

import com.felipe.lucas.lfwframework.Components.IFrameLFW;
import com.felipe.lucas.lfwframework.Components.ItemResultLFW;
import com.felipe.lucas.lfwframework.Components.ResultsLFW;
import com.felipe.lucas.lfwframework.R;

import java.util.ArrayList;

/**
 * Created by lucas on 26/02/2016.
 */
public class BaseFormScreen extends BaseScreenWithHeader {
    public ResultsLFW m_FilterFrame;
    public ArrayList<ItemResultLFW> m_ResultItensList = new ArrayList<ItemResultLFW>();
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        m_FilterFrame = new ResultsLFW(getApplicationContext());
    }
}
