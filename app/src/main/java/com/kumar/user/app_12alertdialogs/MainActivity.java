package com.kumar.user.app_12alertdialogs;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button showDialog;
    private AlertDialog.Builder dialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showDialog= (Button) findViewById(R.id.button);
        showDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //show our alertDialog
                dialog=new AlertDialog.Builder(MainActivity.this);
                //set Title
                dialog.setTitle(R.string.dialog_title);
                //set Message
                dialog.setMessage(R.string.dialog_message);
                //set Cancelable
                dialog.setCancelable(false);
                //set Icon
                dialog.setIcon(android.R.drawable.btn_star);
                //set Positive Button
                dialog.setPositiveButton(getString(R.string.positive_button),
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                MainActivity.this.finish();

                            }
                        });
                //set Negative Button
                dialog.setNegativeButton(R.string.negative_button,
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alertDialog=dialog.create();
                alertDialog.show();
            }
        });

    }

}
