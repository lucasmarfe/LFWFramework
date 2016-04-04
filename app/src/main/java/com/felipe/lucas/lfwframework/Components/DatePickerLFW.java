package com.felipe.lucas.lfwframework.Components;

import android.app.DatePickerDialog;
import android.content.Context;
import android.view.View;
import android.widget.EditText;

import java.util.Calendar;

/**
 * Created by lucas on 26/01/2016.
 */
public class DatePickerLFW implements View.OnClickListener, DatePickerDialog
        .OnDateSetListener {
    private EditText m_EditText;
    private int m_Day;
    private int m_Month;
    private int m_Year;
    private Context m_Context;

    public DatePickerLFW (Context context, EditText editTextViewID) {
        //Activity act = (Activity) context;
        m_EditText = editTextViewID;
        m_EditText.setOnClickListener(this);
        m_Context = context;
    }

    @Override
    public void onDateSet (android.widget.DatePicker view, int year, int monthOfYear, int
            dayOfMonth) {
        m_Year = year;
        m_Month = monthOfYear;
        m_Day = dayOfMonth;
        updateDisplay();
    }

    @Override
    public void onClick (View v) {
        DatePickerDialog dialog = new DatePickerDialog(m_Context, this, Calendar.getInstance().get
                (Calendar.YEAR), Calendar.getInstance().get(Calendar.MONTH), Calendar.getInstance
                ().get(Calendar.DAY_OF_MONTH));
        dialog.show();

    }

    private void updateDisplay () {

        m_EditText.setText(new StringBuilder()
                .append(m_Day).append("/").append(m_Month + 1).append("/").append(m_Year)
                .append(" "));
    }
}