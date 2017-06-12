package ua.avk.menu;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.MenuItem;
import ua.avk.R;
import ua.avk.activity.AboutAppActivity;

/**
 * @author Alexander Kononenko
 * @version 1.0.0
 * @date 17.05.2017.
 */
public class MenuMain {
    protected final String TAG = this.getClass().getSimpleName();
    private Context context;

    public MenuMain(Context context){
        this.context = context;
    }

    public Boolean createMenu(MenuItem item){

        // получим идентификатор выбранного пункта меню
        int id = item.getItemId();
        Intent intent = null;
        // Операции для выбранного пункта меню
        switch (id) {
            case R.id.menu_show_credit_stat:
                Log.i(TAG, "menu_show_credit_stat");
                intent = new Intent(context, AboutAppActivity.class);
                context.startActivity(intent);
                return true;

            case R.id.menu_show_credit_edit:
                Log.i(TAG, "menu_show_credit_edit");
                intent = new Intent(context, AboutAppActivity.class);
                context.startActivity(intent);
                return true;

            case R.id.menu_show_employee_all:
                Log.i(TAG, "R.id.menu_show_employee_all");
                intent = new Intent(context, AboutAppActivity.class);
                context.startActivity(intent);
                return true;

            case R.id.menu_show_dialog_employee_add:
                intent = new Intent(context, AboutAppActivity.class);
                context.startActivity(intent);
                return true;

            default:
                //return super.onOptionsItemSelected(item);
                //return false;
            break;
        }

        return false;
    }


}
