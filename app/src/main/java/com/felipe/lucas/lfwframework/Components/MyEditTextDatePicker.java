package com.felipe.lucas.lfwframework.Components;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.content.Context;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;

/**
 * Created by lucas on 26/01/2016.
 */
public class MyEditTextDatePicker implements View.OnClickListener, DatePickerDialog
        .OnDateSetListener {
    EditText _editText;
    private int _day;
    private int _month;
    private int _birthYear;
    private Context _context;

    public MyEditTextDatePicker (Context context, EditText editTextViewID) {
        //Activity act = (Activity) context;
        _editText = editTextViewID;
        _editText.setOnClickListener(this);
        _context = context;
    }

    @Override
    public void onDateSet (DatePicker view, int year, int monthOfYear, int dayOfMonth) {
        _birthYear = year;
        _month = monthOfYear;
        _day = dayOfMonth;
        updateDisplay();
    }

    @Override
    public void onClick (View v) {
        DatePickerDialog dialog = new DatePickerDialog(_context, this, 2013, 2, 18);
        dialog.show();

    }

    // updates the date in the birth date EditText
    private void updateDisplay () {

        _editText.setText(new StringBuilder()
                // Month is 0 based so add 1
                .append(_day).append("/").append(_month + 1).append("/").append(_birthYear)
                .append(" "));
    }
}