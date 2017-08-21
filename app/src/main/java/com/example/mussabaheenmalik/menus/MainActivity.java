package com.example.mussabaheenmalik.menus;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

/**
 * This app displays a scrollable TextView (a magazine article).
 * All changes were made to the layout. No code changes.
 * The code below is part of the Empty Activity template.
 */
public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MyActivity";
    TextView txt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt1 = (TextView) findViewById(R.id.article);
        registerForContextMenu(txt1);

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        switch (v.getId()) {
            case R.id.article:
                getMenuInflater().inflate(R.menu.more_options, menu);
                break;
        }
    }
    @Override
    public boolean onContextItemSelected(MenuItem item)
    {
        switch (item.getItemId())
        {
            case  R.id.e1 :
                Log.v(TAG,"EDIT");
                break;
            case  R.id.E2 :
                Log.v(TAG,"SHARE");
                break;
            case  R.id.e3 :
                Log.v(TAG,"DELETE ");
                break;

        }
        return true;

    }
}
