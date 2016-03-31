package com.felipe.lucas.lfwframework.Components;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.felipe.lucas.lfwframework.R;
import com.felipe.lucas.lfwframework.Util.UtilLFW;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by lucas on 17/03/2016.
 */
public class DateLFW extends EditText {

    private int m_PaddingLeft = 0;

    private int m_PaddingTopp = 0;

    private int m_PaddingRigth = 0;

    private int m_PaddingBottom = 0;

    private String m_LabelText;

    TextView m_LabelTextView;

    public DateLFW (Context context) {
        super(context);
    }

    public DateLFW (Context p_Context, String p_LabelText, Calendar p_Date, Boolean p_ShowColon,
                    AppCompatActivity p_Activity, boolean p_IsActive) {
        super(p_Context);
        m_LabelText = p_LabelText;
        setId(UtilLFW.getAvailableID());
        setMaxWidth(400);
        setText(new SimpleDateFormat("dd/MM/yyyy").format(p_Date.getTime()));
        setTextSize(18);
        setFocusable(false);
        setClickable(true);
        setActivated(p_IsActive);
        if (p_IsActive) {
            DatePickerLFW m_Date = new DatePickerLFW(p_Activity, this);
        }
        m_LabelTextView = new TextView(p_Context);
        setTextColor(ContextCompat.getColor(p_Context, R.color.black));
        m_LabelTextView.setTextColor(ContextCompat.getColor(p_Context, R.color.black));
        m_LabelTextView.setText(p_LabelText + (p_ShowColon ? ": " : " "));
        m_LabelTextView.setTextSize(18);
        m_LabelTextView.setId(UtilLFW.getAvailableID());
        setLabelPadding(0, 8, 0, 8);
    }


    public View getLayoutParams (int p_PreviousComponentId, boolean
            p_IsBaseScreenWithHeaderChild, IFrameLFW p_IFrame) {
        RelativeLayout.LayoutParams v_LayoutParamElement = new
                RelativeLayout.LayoutParams
                (RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams
                        .WRAP_CONTENT);
        v_LayoutParamElement.addRule(RelativeLayout.BELOW, p_PreviousComponentId);
        m_LabelTextView.setLayoutParams(v_LayoutParamElement);
        m_LabelTextView.setPadding(m_PaddingLeft, m_PaddingTopp, m_PaddingRigth, m_PaddingBottom);
        p_IFrame.addView(m_LabelTextView);
        RelativeLayout.LayoutParams v_LayoutParamElement2 = new
                RelativeLayout.LayoutParams
                (RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams
                        .WRAP_CONTENT);
        v_LayoutParamElement2.addRule(RelativeLayout.BELOW, p_PreviousComponentId);
        v_LayoutParamElement2.addRule(RelativeLayout.RIGHT_OF, m_LabelTextView.getId());
        setPadding(m_PaddingLeft, m_PaddingTopp, m_PaddingRigth, m_PaddingBottom);
        this.setLayoutParams(v_LayoutParamElement2);
        p_IFrame.addView(this);
        return m_LabelTextView;
    }

    public void setLabelPadding (int p_PaddingLeft, int p_PaddingTop, int p_PaddingRigth, int
            p_PaddingBottom) {
        m_PaddingLeft = p_PaddingLeft;
        m_PaddingTopp = p_PaddingTop;
        m_PaddingRigth = p_PaddingRigth;
        m_PaddingBottom = p_PaddingBottom;
    }
}
