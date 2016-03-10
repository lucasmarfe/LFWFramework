package com.felipe.lucas.lfwframework.Components;

import android.content.Context;
import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.felipe.lucas.lfwframework.R;
import com.felipe.lucas.lfwframework.Screen.BaseMenuScreen;
import com.felipe.lucas.lfwframework.Screen.BaseScreenWithHeader;

import java.util.ArrayList;

/**
 * Created by lucas on 04/02/2016.
 */
public class MenuLFW extends ListView {

    public MenuLFW (Context p_Context) {
        super(p_Context);
        FrameLayout.LayoutParams m_LayoutParams = new FrameLayout.LayoutParams(RelativeLayout
                .LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT);
        setBackgroundColor(ContextCompat.getColor(p_Context, R.color.menu_background));
        setDividerHeight(10);
        setLayoutParams(m_LayoutParams);
        setClickable(true);
    }

    public void setMenuItens (Context p_Context, ArrayList<ItemMenuLFW> p_MenuItemList) {
        ItemMenuLFWAdapter v_Adapter = new ItemMenuLFWAdapter(p_Context, R.layout.list_item_menu,
                p_MenuItemList);
        setAdapter(v_Adapter);
        setOnItemClickListener(new OnItemClickListenerMenuLFW());
    }
}

class OnItemClickListenerMenuLFW implements AdapterView.OnItemClickListener {

    @Override
    public void onItemClick (AdapterView<?> parent, View view, int position, long id) {
        //onClickLFW(parent, view, position, id);
        Context v_Context = view.getContext();
        ItemMenuLFW o = (ItemMenuLFW) parent.getItemAtPosition(position);
        //String str = (String) o;//As you are using Default String Adapter
        Toast.makeText(view.getContext(), o.getItemMenuName(), Toast.LENGTH_SHORT).show();
        Intent v_Intent = new Intent(v_Context, o.m_ItemMenuClass);
        v_Intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        v_Context.startActivity(v_Intent);
    }

    //public abstract void onClickLFW (AdapterView<?> parent, View view, int position, long id);
}

class ItemMenuLFWAdapter extends ArrayAdapter<ItemMenuLFW> {
    private ArrayList<ItemMenuLFW> objects;

    public ItemMenuLFWAdapter (Context context, int textViewResourceId, ArrayList<ItemMenuLFW>
            objects) {
        super(context, textViewResourceId, objects);
        this.objects = objects;
    }

    public View getView (int position, View convertView, ViewGroup parent) {
        View v = convertView;
        if (v == null) {
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context
                    .LAYOUT_INFLATER_SERVICE);
            v = inflater.inflate(R.layout.list_item_menu, null);
        }
        ItemMenuLFW i = objects.get(position);

        if (i != null) {
            TextView tt = (TextView) v.findViewById(R.id.toptext);
            if (tt != null) {
                tt.setText(i.getItemMenuName());
            }

        }
        return v;
    }


}
