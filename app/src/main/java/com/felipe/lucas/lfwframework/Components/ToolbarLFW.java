package com.felipe.lucas.lfwframework.Components;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.felipe.lucas.lfwframework.R;
import com.felipe.lucas.lfwframework.Util.UtilLFW;

/**
 * Created by lucas on 15/02/2016.
 */
public class ToolbarLFW extends android.support.v7.widget.Toolbar {
    public ToolbarLFW (Context context) {
        super(context);
    }

    public ToolbarLFW (Context p_Context, String p_Text) {
        super(p_Context);
        setId(UtilLFW.getAvailableID());

        LayoutParams v_LayoutParams = new LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);
        //v_LayoutParams.height = 2400;
        setLayoutParams(v_LayoutParams);
        setMinimumHeight(150);
        //setBackgroundColor(ContextCompat.getColor(p_Context, R.color.darkBlue_Scheme));
        setElevation((float) 4.0);
        //setPopupTheme(R.style.AppTheme_PopupOverlay);
        setTitle(p_Text);
        for (int i = 0; i < this.getChildCount(); ++i) {
            View child = this.getChildAt(i);

            // assuming that the title is the first instance of TextView
            // you can also check if the title string matches
            if (child instanceof TextView) {
                TextView toolbarTitle = (TextView) child;
                toolbarTitle.setTextSize(25);
                break;
            }
        }
    }
}
