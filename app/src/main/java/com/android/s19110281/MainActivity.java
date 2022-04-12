package com.android.s19110281;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static ArrayList<String> listMessage = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showToast(View view){
        listMessage.removeIf(n -> n.equals(""));
        Toast.makeText(getApplicationContext(),"Toppings: " + String.join(" ",listMessage),
                Toast.LENGTH_SHORT).show();
    }
    public void onCheckBoxClicked(View view) {
        // Is the button now checked?
        boolean checked = ((CheckBox) view).isChecked();
        // Check which radio button was clicked.
        switch (view.getId()) {
            case R.id.chocolate:
                if (checked)
                    listMessage.add("Chocolate syrup");
                else listMessage.set(0, "");
                break;
            case R.id.sprinkle:
                if (checked)
                    listMessage.add("Sprinkles");
                else listMessage.set(1, "");
                break;
            case R.id.crush_nut:
                if (checked)
                    listMessage.add("Crushed nuts");
                else listMessage.set(2, "");
                break;
            case R.id.cherry:
                if (checked)
                    listMessage.add("Cherries");
                else listMessage.set(3, "");
                break;
            case R.id.orio:
                if (checked)
                    listMessage.add("Orio cookie crumbles");
                else listMessage.set(4, "");
                break;
            default:
                // Do nothing.
                break;
        }
    }
}