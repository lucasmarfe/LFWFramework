package com.felipe.lucas.lfwframework.Util;

import android.content.Context;

import com.felipe.lucas.lfwframework.Screen.BaseScreenWithHeader;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Random;
import java.util.TreeMap;

/**
 * Created by lucas on 13/01/2016.
 */
public class UtilLFW {

    private static ArrayList<Integer> m_IDsList = new ArrayList<Integer>();

    private static TreeMap<String, String> m_ConfigurationsList;

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

    public static boolean checkIfCallerClassIsHeaderChild (Class<?> p_CallerClass) {
        return BaseScreenWithHeader.class.isAssignableFrom(p_CallerClass);
    }

    public static void buildConfigTreeMap (TreeMap<String, String> p_TreeMap) {
        m_ConfigurationsList = p_TreeMap;
    }

    public static TreeMap<String, String> getConfigTreeMap () {
        return m_ConfigurationsList;
    }

    public static String getConfigValueFromConfigAttribute (String p_KeyString) {
        if (m_ConfigurationsList.containsKey(p_KeyString)) {
            return m_ConfigurationsList.get(p_KeyString);
        }
        return null;
    }
}
