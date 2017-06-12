package ua.avk.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import ua.avk.R;
import ua.avk.menu.MenuMain;


public class MainActivity extends Activity {
    protected final String TAG = this.getClass().getSimpleName();
    protected final Context context = this;

    /**
     * Called when the activity is first created.
     *
     * @param savedInstanceState If the activity is being re-initialized after
     *                           previously being shut down then this Bundle contains the data it most
     *                           recently supplied in onSaveInstanceState(Bundle). <b>Note: Otherwise it is null.</b>
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        final Button debitBtn = (Button) findViewById(R.id.debit_btn);
        debitBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(context, AboutAppActivity.class);
                startActivity(intent);
            }
        });

        final Button creditBtn = (Button) findViewById(R.id.credit_btn);
        creditBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(context, AboutAppActivity.class);
                startActivity(intent);
            }
        });

        final Button totalBtn = (Button) findViewById(R.id.total_btn);
        totalBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(context, AboutAppActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //super.onCreateOptionsMenu(menu);
    	// Inflate the menu; this adds items to the action bar if it is present.
	    getMenuInflater().inflate(ua.avk.R.menu.main, menu);
        Log.i(TAG, "MENU-1: onCreateOptionsMenu(Menu menu)");
	    return  true;
        //return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Log.i(TAG, "MENU-2: onOptionsItemSelected(MenuItem item)");
        super.onOptionsItemSelected(item);
        MenuMain m = new MenuMain(context);
        Log.i(TAG, "MENU-3: onOptionsItemSelected(MenuItem item)");
        //m.createMenu(item);
        return m.createMenu(item);
        //return super.onOptionsItemSelected(item);
        //return true;

    }

}

