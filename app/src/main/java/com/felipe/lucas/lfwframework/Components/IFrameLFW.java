package com.felipe.lucas.lfwframework.Components;

import android.content.Context;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.felipe.lucas.lfwframework.Screen.BaseScreenWithHeader;
import com.felipe.lucas.lfwframework.Util.UtilLFW;

import java.util.ArrayList;

/**
 * Created by lucas on 15/01/2016.
 */
public class IFrameLFW extends RelativeLayout {
    private ArrayList<View> m_OrderedObjectsList = new ArrayList<View>();
    FrameLayout.LayoutParams m_LayoutParams = new FrameLayout.LayoutParams(RelativeLayout
            .LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);

    public IFrameLFW (Context context) {
        super(context);
        //setGravity(Gravity.CENTER);
        //m_LayoutParams.gravity = Gravity.CENTER_VERTICAL;
        setLayoutParams(m_LayoutParams);
    }

    public void add (View p_Component) {
        m_OrderedObjectsList.add(p_Component);
    }

    public void addBeforeComponent (View p_Component, View p_NextComponent) {
        int c_Position = m_OrderedObjectsList.indexOf(p_NextComponent);
        m_OrderedObjectsList.add(c_Position, p_Component);
    }

    public void addAfterComponent (View p_Component, View p_PreviousComponent) {
        int c_Position = m_OrderedObjectsList.indexOf(p_PreviousComponent);
        m_OrderedObjectsList.add(c_Position + 1, p_Component);
    }

    public void clear () {
        if(! m_OrderedObjectsList.isEmpty() && m_OrderedObjectsList.get(0) instanceof Toolbar)
        {
            Toolbar v_Toolbar = (Toolbar) m_OrderedObjectsList.get(0);
            m_OrderedObjectsList.clear();
            m_OrderedObjectsList.add(v_Toolbar);

        }
        else {
            m_OrderedObjectsList.clear();
        }
    }

    public void builScreen (Class<?> p_CallerClass, String p_Title) {
        boolean v_IsBaseScreenWithHeaderChild = UtilLFW.checkIfCallerClassIsHeaderChild
                (p_CallerClass);
        int c_Count = 0;
        View v_PreviousComponent = null;
        for (View v_Component : m_OrderedObjectsList) {
            RelativeLayout.LayoutParams v_LayoutParamElement = new RelativeLayout.LayoutParams
                    (RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams
                            .WRAP_CONTENT);

            if (v_Component instanceof EditText || v_Component instanceof TextView) {
                v_LayoutParamElement = new RelativeLayout.LayoutParams
                        (RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams
                                .WRAP_CONTENT);
            }
            if (c_Count != 0) {
                v_LayoutParamElement.addRule(RelativeLayout.BELOW, v_PreviousComponent.getId());
                v_Component.setPadding(0, 0, 0, 20);

            }
            if(! v_IsBaseScreenWithHeaderChild)
            {
                v_LayoutParamElement.addRule(RelativeLayout.CENTER_HORIZONTAL,
                        RelativeLayout.TRUE);
            } else if (p_Title != null && v_Component instanceof Toolbar)
            {
                ((Toolbar)v_Component).setTitle(p_Title);
            }
            if (v_Component instanceof CheckBoxLFW) {
                v_PreviousComponent = ((CheckBoxLFW) v_Component).getLayoutParams
                        (v_PreviousComponent.getId(), v_IsBaseScreenWithHeaderChild, this);
            } else if (v_Component instanceof LabelValueLFW) {
                v_PreviousComponent = ((LabelValueLFW) v_Component).getLayoutParams
                        (v_PreviousComponent.getId(), this);
            } else if (v_Component instanceof DateLFW) {
                v_PreviousComponent = ((DateLFW) v_Component).getLayoutParams
                        (v_PreviousComponent.getId(), v_IsBaseScreenWithHeaderChild, this);
            } else if (v_Component instanceof RadioLFW) {
                v_PreviousComponent = ((RadioLFW) v_Component).getLayoutParams
                        (v_PreviousComponent.getId(), v_IsBaseScreenWithHeaderChild, this);
            } else if (v_Component instanceof ButtonLFW) {
                v_PreviousComponent = ((ButtonLFW) v_Component).getLayoutParams
                        (v_PreviousComponent.getId(), v_IsBaseScreenWithHeaderChild, this);
            } else if (v_Component instanceof InputLFW) {
                v_PreviousComponent = ((InputLFW) v_Component).getLayoutParams
                        (v_PreviousComponent.getId(), v_IsBaseScreenWithHeaderChild, this);
            } else if (v_Component instanceof InputPasswordLFW) {
                v_PreviousComponent = ((InputPasswordLFW) v_Component).getLayoutParams
                        (v_PreviousComponent.getId(), v_IsBaseScreenWithHeaderChild, this);
            } else if (v_Component instanceof SelectLFW) {
                v_PreviousComponent = ((SelectLFW) v_Component).getLayoutParams
                        (v_PreviousComponent.getId(), v_IsBaseScreenWithHeaderChild, this);
            } else {
                v_PreviousComponent = v_Component;
                addView(v_Component, v_LayoutParamElement);
            }
            c_Count++;
        }


    }
}
