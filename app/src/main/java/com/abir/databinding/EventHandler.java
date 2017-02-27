package com.abir.databinding;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;

/**
 * Created by Abir Hasan on 15-Jan-17.
 */

public class EventHandler {

    private Context context;

    public EventHandler(Context context) {
        this.context = context;
    }

    public void onHandleClick(View view) {
        view.getContext().startActivity(new Intent(view.getContext(), DummyActivity.class));
        Toast.makeText(view.getContext(), "Opening Dummy", Toast.LENGTH_SHORT).show();
    }

    public void onHandleClick(String name) {
        Toast.makeText(context, name, Toast.LENGTH_SHORT).show();
    }
}
