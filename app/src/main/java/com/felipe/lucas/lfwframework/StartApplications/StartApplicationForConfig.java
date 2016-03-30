package com.felipe.lucas.lfwframework.StartApplications;

import android.app.Application;
import android.util.Log;

import com.felipe.lucas.lfwframework.Util.UtilLFW;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.TreeMap;

/**
 * Created by lucas on 23/03/2016.
 */
public class StartApplicationForConfig extends Application {
    public boolean hasRefreshed;

    @Override
    public void onCreate () {
        super.onCreate();
        try {
            InputStream v_inputStream = getBaseContext().getAssets().open("Config.properties");
            BufferedReader bfr = new BufferedReader(new InputStreamReader(v_inputStream, "UTF-8"));
            final int lhs = 0;
            final int rhs = 1;
            TreeMap<String, String> map = new TreeMap<String, String>();
            String line;
            while ((line = bfr.readLine()) != null) {
                if (!line.startsWith("#") && !line.isEmpty()) {
                    String[] pair = line.trim().split("=");
                    //Log.i("Teste","Par: " + pair[lhs].trim() + pair[rhs].trim());
                    map.put(pair[lhs].trim(), pair[rhs].trim());
                }
            }
            UtilLFW.buildConfigTreeMap(map);
            bfr.close();
            //Log.i("Teste", "OK");
        } catch (Exception e) {
            e.printStackTrace();
        }

        /*final int lhs = 0;
        final int rhs = 1;
        String p_PathStringFileConfigApp = "C:\\Users\\lucas\\AndroidStudioProjects\\LFWFramework" +
                "\\app\\src\\main\\java\\com\\felipe\\lucas\\lfwframework\\Configuration
                \\ConfigApp";
        com//felipe//lucas//lfwframework//Configuration//ConfigApp
        TreeMap<String, String> map = new TreeMap<String, String>();
        try
        {
            BufferedReader bfr = new BufferedReader(new FileReader(new File
            (p_PathStringFileConfigApp)));

            String line;
            while ((line = bfr.readLine()) != null) {
                if (!line.startsWith("#") && !line.isEmpty()) {
                    String[] pair = line.trim().split("=");
                    map.put(pair[lhs].trim(), pair[rhs].trim());
                }
            }
            bfr.close();
        } catch (Exception v_Exception)
        {
            Log.i(this.getClass().getSimpleName(), "Error on handling with ConfigApp File: "+
            v_Exception.getMessage());
        }

        UtilLFW.buildConfigTreeMap(map);*/
    }
}
