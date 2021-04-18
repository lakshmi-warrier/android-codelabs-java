package com.example.shoppinglist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    public static final String EXTRA_ITEMS = "com.example.shoppinglist.extra.Items";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void selectItem(View view) {
        Intent return_items_intent = new Intent();

        switch (view.getId()) {
            case R.id.tomato:
                return_items_intent.putExtra(EXTRA_ITEMS, "Tomato");
                setResult(RESULT_OK, return_items_intent);
                finish();
                break;
            case R.id.apples:
                return_items_intent.putExtra(EXTRA_ITEMS, "Apples");
                setResult(RESULT_OK, return_items_intent);
                finish();
                break;
            case R.id.mayo:
                return_items_intent.putExtra(EXTRA_ITEMS, "Mayonnaise");
                setResult(RESULT_OK, return_items_intent);
                finish();
                break;
            case R.id.milk:
                return_items_intent.putExtra(EXTRA_ITEMS, "Milk");
                setResult(RESULT_OK, return_items_intent);
                finish();
                break;
            case R.id.bread:
                return_items_intent.putExtra(EXTRA_ITEMS, "Bread");
                setResult(RESULT_OK, return_items_intent);
                finish();
                break;
            case R.id.chocolate:
                return_items_intent.putExtra(EXTRA_ITEMS, "Chocolate");
                setResult(RESULT_OK, return_items_intent);
                finish();
                break;
            case R.id.flour:
                return_items_intent.putExtra(EXTRA_ITEMS, "Flour");
                setResult(RESULT_OK, return_items_intent);
                finish();
                break;
            case R.id.olive:
                return_items_intent.putExtra(EXTRA_ITEMS, "Olive");
                setResult(RESULT_OK, return_items_intent);
                finish();
                break;
            case R.id.rice:
                return_items_intent.putExtra(EXTRA_ITEMS, "Rice");
                setResult(RESULT_OK, return_items_intent);

                finish();
                break;
            case R.id.cheese:
                return_items_intent.putExtra(EXTRA_ITEMS, "Cheese");
                setResult(RESULT_OK, return_items_intent);

                finish();
                break;
            default:
                Toast.makeText(SecondActivity.this, "There was an error", Toast.LENGTH_LONG).show();
                break;
        }

    }
}