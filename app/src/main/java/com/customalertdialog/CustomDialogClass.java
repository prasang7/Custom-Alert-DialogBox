package com.customalertdialog;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by prasang on 1/7/16.
 */
public class CustomDialogClass extends Dialog implements
        android.view.View.OnClickListener {

    public Activity c;
    public Dialog d;
    public Button okay;
    TextView tv_title, tv_content;
    String title, content, buttonText;

    public CustomDialogClass(Activity a, String s_title, String s_content, String s_buttonText) {
        super(a);

        this.title = s_title;
        this.content = s_content;
        this.buttonText = s_buttonText;

        this.c = a;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.custom_layout);

        okay = (Button)findViewById(R.id.bt_dialog_okay);
        tv_title = (TextView)findViewById(R.id.tv_dialog_title);
        tv_content = (TextView)findViewById(R.id.txt_dialog_content);

        tv_title.setText(title);
        tv_content.setText(content);
        okay.setText(buttonText);

        okay.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.bt_dialog_okay:
                Toast.makeText(getContext().getApplicationContext(), "Okay pressed on dialog box!", Toast.LENGTH_SHORT).show();

                break;

            default:
                break;
        }
        dismiss();
    }
}