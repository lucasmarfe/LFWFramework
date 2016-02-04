package com.felipe.lucas.lfwframework.Screen;

import android.app.DatePickerDialog;
import android.app.DialogFragment;
import android.app.FragmentTransaction;
import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.felipe.lucas.lfwframework.Components.ButtonLFW;
import com.felipe.lucas.lfwframework.Components.CheckBoxLFW;
import com.felipe.lucas.lfwframework.Components.IFrameLFW;
import com.felipe.lucas.lfwframework.Components.InputLFW;
import com.felipe.lucas.lfwframework.Components.InputPasswordLFW;
import com.felipe.lucas.lfwframework.Components.MyEditTextDatePicker;
import com.felipe.lucas.lfwframework.Components.RadioLFW;
import com.felipe.lucas.lfwframework.Components.SelectLFW;
import com.felipe.lucas.lfwframework.R;
import com.felipe.lucas.lfwframework.Util.UtilLFW;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;

public class BaseScreen extends AppCompatActivity {
    public Context m_Context;
    public IFrameLFW m_IFrame;
    //InputLFW m_Input;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        m_Context=getApplicationContext();
        setDefaultBackgroundColor();//getResources().getColor(R.color.background));
        //setContentView(R.layout.base_screen);
        IFrameLFW v_IFrame = new IFrameLFW(m_Context);
        //RelativeLayout mRlayout = (RelativeLayout) findViewById(R.id.relativeBaseScreenId);
//        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
//        mRlayout.setLayoutParams(layoutParams);
//
//        RelativeLayout.LayoutParams params1 = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
//        RelativeLayout.LayoutParams params2 = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
/***********************************************************************************
 InputLFW m_Input = new InputLFW(m_Context,"Input", true);
        m_Input.setWidth(500);
        InputLFW m_Input2 = new InputLFW(m_Context,"Input 2", true);
        m_Input2.setWidth(500);
        ButtonLFW m_Button = new ButtonLFW(m_Context,"Botão", true);

        RadioLFW m_Radio = new RadioLFW(m_Context, "TesteRad", true, true);
        m_Radio.setItensContent(m_Context, Arrays.asList("sup1", "sup2", "sup3"));

        SelectLFW m_Select = new SelectLFW(m_Context, "Teste Select", true);
        m_Select.setItensContent(Arrays.asList("sel", "sel2", "sel3"));

        CheckBoxLFW m_CheckBox = new CheckBoxLFW(m_Context, "LabelText", "Text", true);

        EditText m_EditText = new EditText(m_Context);
        m_EditText.setId(UtilLFW.getAvailableID());
        m_EditText.setMaxWidth(400);
        m_EditText.setText(new SimpleDateFormat("dd/MM/yyyy").format(Calendar.getInstance()
                .getTime()));
        m_EditText.setFocusable(false);
        m_EditText.setClickable(true);
        MyEditTextDatePicker m_Date = new MyEditTextDatePicker(this, m_EditText);

        InputPasswordLFW m_InputPassword = new InputPasswordLFW(m_Context, "Input", true);
        v_IFrame.add(m_Input);
        v_IFrame.add(m_Input2);
        v_IFrame.add(m_Radio);
        v_IFrame.add(m_Select);
        v_IFrame.add(m_CheckBox);
        v_IFrame.add(m_EditText);
        //
        v_IFrame.add(m_Button);
        v_IFrame.add(m_InputPassword);

        v_IFrame.builScreen();
        //params2.addRule(RelativeLayout.BELOW, m_Input.getId());
        //params2.addRule(RelativeLayout.ALIGN_BOTTOM, m_Input.getId());
        //mRlayout.addView(m_Input,params1);
        //mRlayout.addView(m_Button,params2);
        addOnScreen(v_IFrame);
        //setContentView(v_IFrame);
 *//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    }

    public void addOnScreen (IFrameLFW p_IFrame) {
        RelativeLayout.LayoutParams v_LayoutParamElement = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT);
        addContentView(p_IFrame, v_LayoutParamElement);
    }

    public void setDefaultBackgroundColor () {
        getWindow().getDecorView().setBackgroundColor(ContextCompat.getColor(m_Context, R.color
                .background));
    }

    public void setBackgroundColor(int p_IdColor)
    {
        getWindow().getDecorView().setBackgroundColor(ContextCompat.getColor(m_Context, p_IdColor));
    }

}
