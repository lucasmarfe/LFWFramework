package com.felipe.lucas.lfwframework.Components;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lucas on 15/01/2016.
 */
public class IFrameLFW extends RelativeLayout {
    private List<View> m_OrdeneredObjectsList = new ArrayList<View>();

    public IFrameLFW(Context context) {
        super(context);
    }

    public void add(View p_Component)
    {
        m_OrdeneredObjectsList.add(p_Component);
    }

    public void addBeforeComponent(View p_Component, View p_NextComponent)
    {
        int c_Position = m_OrdeneredObjectsList.indexOf(p_NextComponent);
        m_OrdeneredObjectsList.add(c_Position, p_Component);
    }

    public void addAfterComponent(View p_Component, View p_PreviousComponent)
    {
        int c_Position = m_OrdeneredObjectsList.indexOf(p_PreviousComponent);
        m_OrdeneredObjectsList.add(c_Position+1, p_Component);
    }


//    RelativeLayout mRlayout = (RelativeLayout) findViewById(R.id.relativeBaseScreenId);
//    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
//    mRlayout.setLayoutParams(layoutParams);
//
//    RelativeLayout.LayoutParams params1 = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
//    RelativeLayout.LayoutParams params2 = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
//
//    m_Input = new InputLFW(m_Context,"Input", true);
//    m_Input.setWidth(250);
//    ButtonLFW m_Button = new ButtonLFW(m_Context,"Botão", true);
//    params2.addRule(RelativeLayout.BELOW, m_Input.getId());
//    //params2.addRule(RelativeLayout.ALIGN_BOTTOM, m_Input.getId());
//    mRlayout.addView(m_Input,params1);
//    mRlayout.addView(m_Button,params2);

    public void builScreen()
    {
        int c_Count = 0;
        View v_PreviousComponent = null;
        for(View v_Component : m_OrdeneredObjectsList)
        {
            if(c_Count ==0)
            {
                RelativeLayout.LayoutParams v_LayoutParamFirstElement = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
                addView(v_Component,v_LayoutParamFirstElement);
            }
            else
            {
                RelativeLayout.LayoutParams v_LayoutParamElement = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
                v_LayoutParamElement.addRule(RelativeLayout.BELOW, v_PreviousComponent.getId());
                addView(v_Component, v_LayoutParamElement);
            }
            v_PreviousComponent = v_Component;
            c_Count++;
        }
    }
}
