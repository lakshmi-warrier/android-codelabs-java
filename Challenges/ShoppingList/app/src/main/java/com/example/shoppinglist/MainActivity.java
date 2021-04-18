package com.example.shoppinglist;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private final TextView[] item = new TextView[10];
    private final String[] item_list = new String[10];
    public static final int ITEM_REQUEST = 1;


    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        item[0] = findViewById(R.id.item1);
        item[1] = findViewById(R.id.item2);
        item[2] = findViewById(R.id.item3);
        item[3] = findViewById(R.id.item4);
        item[4] = findViewById(R.id.item5);
        item[5] = findViewById(R.id.item6);
        item[6] = findViewById(R.id.item7);
        item[7] = findViewById(R.id.item8);
        item[8] = findViewById(R.id.item9);
        item[9] = findViewById(R.id.item10);
        if (savedInstanceState != null) {

            for (int i = 0; i < item_list.length; i++) {
                if (count == 10) {
                    Toast.makeText(MainActivity.this, "Cannot add more items to the list", Toast.LENGTH_LONG).show();
                    break;
                }
                item[i].setVisibility(View.VISIBLE);
                item[i].setText(item_list[i]);
            }
        }
    }

    public void addItem(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivityForResult(intent, ITEM_REQUEST);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == ITEM_REQUEST) {
            if (resultCode == RESULT_OK) {
                String itemString = data.getStringExtra(SecondActivity.EXTRA_ITEMS);
                if (count < 10)
                    item_list[count++] = itemString;
                for (int i = 0; i < item_list.length; i++) {
                    if (count == 10) {
                        Toast.makeText(MainActivity.this, "Cannot add more items to the list", Toast.LENGTH_LONG).show();
                        break;
                    }
                    item[i].setVisibility(View.VISIBLE);
                    item[i].setText(item_list[i]);
                }
            }
        }
    }

}
