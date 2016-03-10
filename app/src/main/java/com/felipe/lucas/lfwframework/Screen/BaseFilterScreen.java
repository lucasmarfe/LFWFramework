package com.felipe.lucas.lfwframework.Screen;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;

import com.felipe.lucas.lfwframework.Components.ItemResultLFW;
import com.felipe.lucas.lfwframework.Components.MenuLFW;
import com.felipe.lucas.lfwframework.Components.ResultsLFW;

import java.util.ArrayList;

/**
 * Created by lucas on 08/03/2016.
 */
public class BaseFilterScreen extends BaseScreenWithHeader {

    public ResultsLFW m_FilterFrame;
    public ArrayList<ItemResultLFW> m_ResultItensList = new ArrayList<ItemResultLFW>();

    @Override
    protected void onCreate (Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        m_FilterFrame = new ResultsLFW(getApplicationContext());
    }
}
