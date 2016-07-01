package com.customalertdialog;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button bt_showDialog1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        init();

        bt_showDialog1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CustomDialogClass cdd = new CustomDialogClass(MainActivity.this, "My Title", "my content for the dialog..........", "text to fill in button");
                cdd.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                cdd.show();
            }
        });
    }

    void init() {
        setContentView(R.layout.activity_main);
        bt_showDialog1 = (Button)findViewById(R.id.bt_showDialog_1);
    }
}
