package com.felipe.lucas.lfwframework.Test_Screens.QualityScreens;

import android.os.Bundle;

import com.felipe.lucas.lfwframework.Components.ButtonLFW;
import com.felipe.lucas.lfwframework.Components.DateLFW;
import com.felipe.lucas.lfwframework.Components.InputLFW;
import com.felipe.lucas.lfwframework.Components.LabelValueLFW;
import com.felipe.lucas.lfwframework.Components.SelectLFW;
import com.felipe.lucas.lfwframework.Screen.BaseDetailsScreen;

import java.util.Calendar;

/**
 * Created by lucas on 31/03/2016.
 */
public class QualityResultsDetailsScreen extends BaseDetailsScreen {
    LabelValueLFW v_PONumber;
    LabelValueLFW v_POMaterial;
    LabelValueLFW v_POQuantity;
    DateLFW v_POInitialDate;
    DateLFW v_POFinalDate;
    SelectLFW v_SelectTurno;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        buildPage();
        m_IFrame.builScreen(this.getClass(), "Amostra: 00120");
        setContentView(m_IFrame);
    }

    private void buildPage () {
        LabelValueLFW v_SampleCode = new LabelValueLFW(getApplicationContext(), "Código amostra",
                "00120", true);
        DateLFW v_InitialDate = new DateLFW(getApplicationContext(), "Data amostra", Calendar
                .getInstance(), true, this, false);
        LabelValueLFW v_AnalysisCode = new LabelValueLFW(getApplicationContext(), "Código ensaio",
                "QUI - Enxofre", true);
        LabelValueLFW v_AnalysisType = new LabelValueLFW(getApplicationContext(), "Tipo de ensaio",
                "Químico", true);
        LabelValueLFW v_AnalysisDescription = new LabelValueLFW(getApplicationContext(),
                "Descrição ensaio",
                "Ensaio Químico - Composição enxofre", true);
        LabelValueLFW v_UM = new LabelValueLFW(getApplicationContext(), "Unidade de medida", "%",
                true);
        LabelValueLFW v_TheoreticalValue = new LabelValueLFW(getApplicationContext(), "Valor " +
                "teórico", "10",
                true);
        LabelValueLFW v_MinValue = new LabelValueLFW(getApplicationContext(), "Valor mínimo",
                "8", true);
        LabelValueLFW v_MaxValue = new LabelValueLFW(getApplicationContext(), "Valor máximo",
                "8", true);
        LabelValueLFW v_RealValue = new LabelValueLFW(getApplicationContext(), "Valor real",
                "8", true);
        InputLFW v_InAdjustedValue = new InputLFW(getApplicationContext(), "Valor ajustado",
                false, true, true);

        ButtonLFW v_Save = new ButtonLFW(getApplicationContext(), "Salvar alterações", true);

        m_IFrame.add(v_SampleCode);
        m_IFrame.add(v_InitialDate);
        m_IFrame.add(v_AnalysisCode);
        m_IFrame.add(v_AnalysisType);
        m_IFrame.add(v_AnalysisDescription);
        m_IFrame.add(v_UM);
        m_IFrame.add(v_TheoreticalValue);
        m_IFrame.add(v_MinValue);
        m_IFrame.add(v_MaxValue);
        m_IFrame.add(v_RealValue);
        m_IFrame.add(v_InAdjustedValue);
        m_IFrame.add(v_Save);
    }
}