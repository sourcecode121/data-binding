package com.example.databinding;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

/**
 * Created by Anand on 21/10/2016.
 */

public class Handlers {

    private Context context;

    public static Handlers getInstance() {
        return new Handlers();
    }

    public void setContext(Context context) {
        this.context = context;
    }

    // Method reference event handler
    public void onClickMessage1(View view) {
        Toast.makeText(context, "Message 1", Toast.LENGTH_SHORT).show();
    }
}
