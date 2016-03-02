package com.felipe.lucas.lfwframework.Screen;

import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.felipe.lucas.lfwframework.Components.CustomToolbar;
import com.felipe.lucas.lfwframework.Components.IFrameLFW;
import com.felipe.lucas.lfwframework.Components.MenuLFW;
import com.felipe.lucas.lfwframework.Components.ToolbarLFW;
import com.felipe.lucas.lfwframework.R;

/**
 * Created by lucas on 03/02/2016.
 */
public class BaseMenuScreen extends BaseScreen {

    MenuLFW m_Menu;
    String contacts[] = {"Ajay", "Sachin", "Sumit", "Tarun", "Yogesh"};

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        m_Context = getApplicationContext();
        m_IFrame = new IFrameLFW(m_Context);
        //Toolbar mToolbar = (Toolbar) findViewById(R.layout.Toolbar);
        //getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        //getSupportActionBar().setDisplayShowHomeEnabled(true);
        // getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_HOME | ActionBar
        //        .DISPLAY_SHOW_CUSTOM);
        //getSupportActionBar().show();


//        SpannableString s = new SpannableString("My Title");
//        s.setSpan(new TypefaceSpan(this, "MyTypeface.otf"), 0, s.length(),
//                Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
//
//        // Update the action bar title with the TypefaceSpan instance
//        ActionBar actionBar = getActionBar();
//        actionBar.setTitle(s);

        ToolbarLFW myToolbar = new ToolbarLFW(getApplicationContext(), "Menu");

        //Toolbar myToolbar = (Toolbar) findViewById(R.id.my_awesome_toolbar2);
        //CustomToolbar myToolbar = new CustomToolbar(getApplicationContext());
        //myToolbar.setm
        //myToolbar.setTitle("Teste");
        setSupportActionBar(myToolbar);
        //myToolbar.setNavigationIcon(R.drawable);
        //myToolbar.inflateMenu(R.menu.menu_actionbar)
        //ActionBar ab = getSupportActionBar();
        //ab.setDisplayHomeAsUpEnabled(true);

        m_IFrame.add(myToolbar);
        //getSupportActionBar().show();
        m_Menu = new MenuLFW(m_Context);
        m_Menu.setMenuItens(m_Context, contacts);
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout
//                .simple_list_item_1, contacts);
//        m_Menu.setAdapter(adapter);
//        registerForContextMenu(m_Menu);
        m_IFrame.add(m_Menu);
        m_IFrame.builScreen();
        addOnScreen(m_IFrame);
    }

    @Override
    public boolean onCreateOptionsMenu (Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //getMenuInflater().inflate(R.menu.menu_actionbar, menu);
        menu.add(Menu.NONE, 2, 100, "History").setIcon(R.drawable.ic_first_page_white_36dp)
                .setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);
        //return(super.onCreateOptionsMenu(menu));
        return true;
    }

//    @Override
//    public boolean onPrepareOptionsMenu(Menu menu) {
//        // If the nav drawer is open, hide action items related to the content
//        // view
//        // boolean drawerOpen = mDrawerLayout.isDrawerOpen(mDrawerList);
//        // menu.findItem(R.id.action_websearch).setVisible(!drawerOpen);
//        return super.onPrepareOptionsMenu(menu);
//    }

//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
////        int id = item.getItemId();
////        if (id == R.id.action_settings) {
////            return true;
////        }
//        return super.onOptionsItemSelected(item);
//    }
//    @Override
//    public boolean onCreateOptionsMenu (Menu menu) {
//        super.onCreateOptionsMenu(menu);
//
//        menu.add(0, 1, Menu.NONE, "First");
//        menu.add(0, 2, Menu.NONE, "Second");
//        // repeat this to add additional menus
//
//        return true;
//    }
//
//    @Override
//    public void onCreateContextMenu (ContextMenu menu, View v, ContextMenu.ContextMenuInfo
//            menuInfo) {
//        super.onCreateContextMenu(menu, v, menuInfo);
//        menu.setHeaderTitle("Select The Action");
//        menu.add(0, v.getId(), 0, "Call");//groupId, itemId, order, title
//        menu.add(0, v.getId(), 0, "SMS");
//    }
//
//    @Override
//    public boolean onContextItemSelected (MenuItem item) {
//        if (item.getTitle() == "Call") {
//            Toast.makeText(getApplicationContext(), "calling code", Toast.LENGTH_LONG).show();
//        } else if (item.getTitle() == "SMS") {
//            Toast.makeText(getApplicationContext(), "sending sms code", Toast.LENGTH_LONG).show();
//        } else {
//            return false;
//        }
//        return true;
//    }

}
