package com.felipe.lucas.lfwframework.Screen;

import android.os.Bundle;

import com.felipe.lucas.lfwframework.Components.ItemResultLFW;
import com.felipe.lucas.lfwframework.Components.ResultsLFW;

import java.util.ArrayList;

/**
 * Created by lucas on 26/02/2016.
 */
public class BaseDetailsScreen extends BaseScreenWithHeader {
    public ResultsLFW m_Table;
    public ArrayList<ItemResultLFW> m_ResultItensList = new ArrayList<ItemResultLFW>();

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        m_Table = new ResultsLFW(getApplicationContext());
    }
}
