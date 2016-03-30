package com.felipe.lucas.lfwframework.Components;

import android.app.TimePickerDialog;
import android.content.Context;
import android.view.View;
import android.widget.EditText;

import java.util.Calendar;

/**
 * Created by lucas on 26/01/2016.
 */
public class TimePickerLFW implements View.OnClickListener, TimePickerDialog.OnTimeSetListener {

    EditText m_EditText;
    private int m_Hour;
    private int m_Minute;
    private Context _context;

    public TimePickerLFW (Context context, EditText editTextViewID) {
        //Activity act = (Activity) context;
        m_EditText = editTextViewID;
        m_EditText.setOnClickListener(this);
        _context = context;
    }

    @Override
    public void onTimeSet (android.widget.TimePicker view, int hourOfDay, int minute) {
        // Do something with the time chosen by the user
        m_Hour = hourOfDay;
        m_Minute = minute;
        updateDisplay();
    }


    @Override
    public void onClick (View v) {
        TimePickerDialog dialog = new TimePickerDialog(_context, this, Calendar.getInstance().get
                (Calendar.HOUR_OF_DAY), Calendar.getInstance().get(Calendar.MINUTE), true);
        dialog.show();

    }

    private void updateDisplay () {

        m_EditText.setText(new StringBuilder()
                .append(m_Hour).append(":").append(m_Minute < 10 ? ("0" + m_Minute) : m_Minute)
                .append(" "));
    }
}