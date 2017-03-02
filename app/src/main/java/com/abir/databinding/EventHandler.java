package com.abir.databinding;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;

import com.abir.databinding.ex_dynamic_data_binding.DynamicSampleActivity;

/**
 * Created by Abir Hasan on 15-Jan-17.
 */

public class EventHandler {

    private Context context;

    public EventHandler(Context context) {
        this.context = context;
    }

    public void onHandleClick(View view) {
        view.getContext().startActivity(new Intent(view.getContext(), ObservableTestActivity.class));
        Toast.makeText(view.getContext(), "Opening Dummy", Toast.LENGTH_SHORT).show();
    }

    public void onHandleClick(String name) {
        context.startActivity(new Intent(context, DynamicSampleActivity.class));
        Toast.makeText(context, name, Toast.LENGTH_SHORT).show();
    }
}
