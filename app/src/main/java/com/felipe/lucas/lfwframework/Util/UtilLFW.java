package com.felipe.lucas.lfwframework.Util;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by lucas on 13/01/2016.
 */
public class UtilLFW {

    private static ArrayList<Integer> m_IDsList = new ArrayList<Integer>();
    public static Integer getAvailableID()
    {
        Random v_RandomGenerator = new Random();
        Integer v_PossibleID;
        do
        {
            v_PossibleID = Math.abs(v_RandomGenerator.nextInt());
        }
        while (m_IDsList.contains(v_PossibleID) || v_PossibleID == 0);
        m_IDsList.add(v_PossibleID);
        return v_PossibleID;
    }
}
