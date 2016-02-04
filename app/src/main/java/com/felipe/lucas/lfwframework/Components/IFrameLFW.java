package com.felipe.lucas.lfwframework.Components;

import android.content.Context;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lucas on 15/01/2016.
 */
public class IFrameLFW extends RelativeLayout {
    private ArrayList<View> m_OrderedObjectsList = new ArrayList<View>();
    FrameLayout.LayoutParams m_LayoutParams = new FrameLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);

    public IFrameLFW(Context context) {
        super(context);
        //setGravity(Gravity.CENTER);
        //m_LayoutParams.gravity = Gravity.CENTER_VERTICAL;
        setLayoutParams(m_LayoutParams);
    }

    public void add(View p_Component)
    {
        m_OrderedObjectsList.add(p_Component);
    }

    public void addBeforeComponent(View p_Component, View p_NextComponent)
    {
        int c_Position = m_OrderedObjectsList.indexOf(p_NextComponent);
        m_OrderedObjectsList.add(c_Position, p_Component);
    }

    public void addAfterComponent(View p_Component, View p_PreviousComponent)
    {
        int c_Position = m_OrderedObjectsList.indexOf(p_PreviousComponent);
        m_OrderedObjectsList.add(c_Position + 1, p_Component);
    }

    public void clear () {
        m_OrderedObjectsList.clear();
    }

    public void builScreen()
    {
        int c_Count = 0;
        View v_PreviousComponent = null;
        for (View v_Component : m_OrderedObjectsList)
        {
            RelativeLayout.LayoutParams v_LayoutParamElement = new RelativeLayout.LayoutParams
                    (RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams
                            .WRAP_CONTENT);

            if(v_Component instanceof ButtonLFW)
            {
                v_LayoutParamElement.setMargins(100, 50, 100, 50);
                v_LayoutParamElement.addRule(RelativeLayout.CENTER_HORIZONTAL,
                        RelativeLayout.TRUE);
            }
            if (v_Component instanceof EditText) {
                v_LayoutParamElement = new RelativeLayout.LayoutParams
                        (RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams
                                .WRAP_CONTENT);
                v_LayoutParamElement.addRule(RelativeLayout.CENTER_HORIZONTAL,
                        RelativeLayout.TRUE);
            }
//            if(v_Component instanceof SelectLFW)
//            {
//                v_LayoutParamElement = new RelativeLayout.LayoutParams(LayoutParams
// .MATCH_PARENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
//            }
            if (c_Count != 0) {
                v_LayoutParamElement.addRule(RelativeLayout.BELOW, v_PreviousComponent.getId());

            }

            if (v_Component instanceof CheckBoxLFW) {
                v_PreviousComponent = ((CheckBoxLFW) v_Component).getLayoutParams
                        (v_PreviousComponent.getId(), this);
            } else {
                v_PreviousComponent = v_Component;
                addView(v_Component, v_LayoutParamElement);
            }


            c_Count++;
        }
    }
}
