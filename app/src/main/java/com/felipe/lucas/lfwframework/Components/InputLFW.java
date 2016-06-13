package com.felipe.lucas.lfwframework.Components;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.text.InputType;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.felipe.lucas.lfwframework.R;
import com.felipe.lucas.lfwframework.Util.UtilLFW;

/**
 * Created by lucas on 07/01/2016.
 */
public class InputLFW extends EditText implements Components {

    private TextView m_LabelTextView;

    private Context m_Context;

    public InputLFW(Context context)
    {
        super(context);
    }

    public InputLFW (Context p_Context, String p_Text, boolean p_ShowHint, boolean p_ShowColon,
                     boolean p_IsActive) {
        super(p_Context);
        m_Context = p_Context;
        setId(UtilLFW.getAvailableID());
        setPadding(0, 0, 0, 0);
        if (p_ShowHint) {
            setHint(p_Text);
        }
        setInputType(InputType.TYPE_CLASS_TEXT);
        setActivated(p_IsActive);
        setTextColor(ContextCompat.getColor(p_Context, R.color.black));
        setHintTextColor(ContextCompat.getColor(p_Context, R.color.inputGray));
        m_LabelTextView = new TextView(p_Context);
        m_LabelTextView.setTextColor(ContextCompat.getColor(p_Context, R.color.black));
        m_LabelTextView.setText(p_Text + (p_ShowColon ? ": " : " "));
        m_LabelTextView.setTextSize(18);
        m_LabelTextView.setId(UtilLFW.getAvailableID());

    }

    public View getLayoutParamsWhitoutHeader (int p_PreviousComponentId, boolean
            p_IsBaseScreenWithHeaderChild, IFrameLFW p_IFrame) {
        setTextColor(ContextCompat.getColor(m_Context, R.color.white));
        setHintTextColor(ContextCompat.getColor(m_Context, R.color.white));
        RelativeLayout.LayoutParams v_LayoutParamElement = new
                RelativeLayout.LayoutParams
                (RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams
                        .WRAP_CONTENT);
            v_LayoutParamElement = new
                    RelativeLayout.LayoutParams
                    (RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams
                            .WRAP_CONTENT);
        //setTranslationX(10);
        setPadding(18, 8, 18, 20);
        v_LayoutParamElement.addRule(RelativeLayout.BELOW, p_PreviousComponentId);
        //v_LayoutParamElement.setMargins(0, 20, 0, 20);
        this.setLayoutParams(v_LayoutParamElement);
        p_IFrame.addView(this);
        return this;
    }

    public View getLayoutParams (int p_PreviousComponentId, boolean
            p_IsBaseScreenWithHeaderChild, IFrameLFW p_IFrame) {
        if (!p_IsBaseScreenWithHeaderChild) {
            return getLayoutParamsWhitoutHeader(p_PreviousComponentId,
                    p_IsBaseScreenWithHeaderChild, p_IFrame);
        }
        RelativeLayout.LayoutParams v_LayoutParamElement = new
                RelativeLayout.LayoutParams
                (RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams
                        .WRAP_CONTENT);
        v_LayoutParamElement.addRule(RelativeLayout.BELOW, p_PreviousComponentId);
        m_LabelTextView.setLayoutParams(v_LayoutParamElement);
        m_LabelTextView.setPadding(10, 8, 0, 8);
        p_IFrame.addView(m_LabelTextView);
        RelativeLayout.LayoutParams v_LayoutParamElement2 = new
                RelativeLayout.LayoutParams
                (RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams
                        .WRAP_CONTENT);
        v_LayoutParamElement2.addRule(RelativeLayout.BELOW, p_PreviousComponentId);
        v_LayoutParamElement2.addRule(RelativeLayout.RIGHT_OF, m_LabelTextView.getId());
        setPadding(10, 8, 10, 8);
        this.setLayoutParams(v_LayoutParamElement2);
        p_IFrame.addView(this);
        return m_LabelTextView;
    }
}
