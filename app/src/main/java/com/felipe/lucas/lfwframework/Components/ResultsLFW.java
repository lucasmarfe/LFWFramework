package com.felipe.lucas.lfwframework.Components;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.felipe.lucas.lfwframework.R;
import com.felipe.lucas.lfwframework.Screen.BaseMenuScreen;
import com.felipe.lucas.lfwframework.Screen.BaseScreenWithHeader;
import com.felipe.lucas.lfwframework.Util.UtilLFW;

import java.util.ArrayList;

/**
 * Created by lucas on 04/02/2016.
 */
public class ResultsLFW extends ListView {

    private Context m_Context;

    public ResultsLFW (Context p_Context) {
        super(p_Context);
        m_Context = p_Context;
        setId(UtilLFW.getAvailableID());
        FrameLayout.LayoutParams m_LayoutParams = new FrameLayout.LayoutParams(RelativeLayout
                .LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT);
        setBackgroundColor(ContextCompat.getColor(p_Context, R.color.background_results));
        setLayoutParams(m_LayoutParams);
        setClickable(true);
        setPadding(0, 30, 0, 10);
    }

    public void setTitle (String p_TitleText) {
        TextView v_Title = new TextView(m_Context);
        v_Title.setText(p_TitleText);
        v_Title.setPadding(0, 10, 0, 10);
        v_Title.setTextSize(16);
        v_Title.setTypeface(null, Typeface.BOLD);
        addHeaderView(v_Title);
    }

    public void setResultsItens (Context p_Context, ArrayList<ItemResultLFW> p_ResultsItemList,
                                 OnItemClickListener v_ItemClickListener) {
        ItemResultLFWAdapter v_Adapter = new ItemResultLFWAdapter(p_Context, R.layout
                .list_item_result,
                p_ResultsItemList);
        setAdapter(v_Adapter);
        if (v_ItemClickListener != null) {
            setOnItemClickListener(v_ItemClickListener);
        }

    }

}

class OnItemClickListenerResultsLFW implements AdapterView.OnItemClickListener {

    @Override
    public void onItemClick (AdapterView<?> parent, View view, int position, long id) {
        //onClickLFW(parent, view, position, id);
        Context v_Context = view.getContext();
        ItemResultLFW o = (ItemResultLFW) parent.getItemAtPosition(position);
        //String str = (String) o;//As you are using Default String Adapter
        Toast.makeText(view.getContext(), o.getItemMenuIdentify(), Toast.LENGTH_SHORT).show();
//        Intent v_Intent = new Intent(v_Context, o.m_ItemMenuClass);
//        v_Intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//        v_Context.startActivity(v_Intent);
    }

    //public abstract void onClickLFW (AdapterView<?> parent, View view, int position, long id);
}

class ItemResultLFWAdapter extends ArrayAdapter<ItemResultLFW> {
    private ArrayList<ItemResultLFW> objects;

    public ItemResultLFWAdapter (Context context, int textViewResourceId, ArrayList<ItemResultLFW>
            objects) {
        super(context, textViewResourceId, objects);
        this.objects = objects;
    }

    public View getView (int position, View p_convertView, ViewGroup parent) {
        View v_ActualView = p_convertView;
        if (v_ActualView == null) {
            LayoutInflater v_Inflater = (LayoutInflater) getContext().getSystemService(Context
                    .LAYOUT_INFLATER_SERVICE);
            v_ActualView = v_Inflater.inflate(R.layout.list_item_result, parent, false);
        }
        ItemResultLFW v_ItemResultActual = objects.get(position);

        if (v_ItemResultActual != null) {
            CheckBox v_CheckBox = (CheckBox) v_ActualView.findViewById(R.id.checkbox_result);
            TextView v_TextIdentity = (TextView) v_ActualView.findViewById(R.id
                    .identificador_result_item);
            TextView v_TextInfo1 = (TextView) v_ActualView.findViewById(R.id.info1_result_item);
            TextView v_TextInfo2 = (TextView) v_ActualView.findViewById(R.id.info2_result_item);
            ImageView v_ImageViewStatus = (ImageView) v_ActualView.findViewById(R.id
                    .image_result_item);
            if (v_CheckBox != null) {
                //v_TextIdentity.setText(i.getItemMenuName());
            }
            if (v_TextIdentity != null) {
                v_TextIdentity.setText(v_ItemResultActual.getItemMenuIdentify());
            }
            if (v_TextInfo1 != null) {
                v_TextInfo1.setText(v_ItemResultActual.getItemMenuInfo1());
            }
            if (v_TextInfo2 != null) {
                v_TextInfo2.setText(v_ItemResultActual.getItemMenuInfo2());
            }
            if (v_ImageViewStatus != null && v_ItemResultActual.getItemStatusColor() != null) {
                v_ImageViewStatus.setImageBitmap(getCircle(v_ItemResultActual.getItemStatusColor
                        ()));
            }
        }
        return v_ActualView;
    }

    public Bitmap getCircle (int p_Color) {
//        Bitmap bitmap = Bitmap.createBitmap(
//                5, // Width
//                5, // Height
//                Bitmap.Config.ARGB_8888 // Config
//        );
//        // Initialize a new Canvas instance
//        Canvas canvas = new Canvas(bitmap);
////        // Draw a solid color to the canvas background
//        canvas.drawColor(p_Color);
////        // Initialize a new Paint instance to draw the Circle
//        Paint paint = new Paint();
//        paint.setStyle(Paint.Style.FILL);
//        paint.setColor(p_Color);
//        paint.setAntiAlias(true);
//        int radius = 10;
//        int padding = 1;
//        canvas.drawCircle(
//                canvas.getWidth() / 2, // cx
//                canvas.getHeight() / 2, // cy
//                radius - padding, // Radius
//                paint // Paint
//        );
//        return bitmap;
        // Display the newly created bitmap on app interface
        //mImageView.setImageBitmap(bitmap);

        Bitmap output = Bitmap.createBitmap(20,
                20, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(output);

        final int color = 0xff424242;
        final Paint paint = new Paint();
        final Rect rect = new Rect(0, 0, 20,
                20);

        paint.setAntiAlias(true);
        canvas.drawARGB(0, 0, 0, 0);
        paint.setColor(p_Color);
        canvas.drawCircle(20 / 2,
                20 / 2, 20 / 2, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(output, rect, rect, paint);
        return output;
    }

}
