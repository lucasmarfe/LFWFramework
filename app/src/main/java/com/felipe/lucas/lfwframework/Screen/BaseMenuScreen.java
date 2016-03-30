package com.felipe.lucas.lfwframework.Screen;

import android.os.Bundle;

import com.felipe.lucas.lfwframework.Components.ItemMenuLFW;
import com.felipe.lucas.lfwframework.Components.MenuLFW;

import java.util.ArrayList;

/**
 * Created by lucas on 03/02/2016.
 */
public class BaseMenuScreen extends BaseScreenWithHeader {

    public MenuLFW m_Menu;
    public ArrayList<ItemMenuLFW> m_ItemMenuList = new ArrayList<ItemMenuLFW>();

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        m_Context = getApplicationContext();
        m_Menu = new MenuLFW(m_Context);
    }

//    @Override
//    public boolean onCreateOptionsMenu (Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        //getMenuInflater().inflate(R.menu.menu_actionbar, menu);
//        menu.add(Menu.NONE, 2, 100, "History").setIcon(R.drawable.ic_first_page_white_36dp)
//                .setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);
//        //return(super.onCreateOptionsMenu(menu));
//        return true;
//    }

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
