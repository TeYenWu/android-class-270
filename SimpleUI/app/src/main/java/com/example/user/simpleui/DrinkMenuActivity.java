package com.example.user.simpleui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class DrinkMenuActivity extends AppCompatActivity {

    TextView totalTextView;
    ListView drinkMenuListView;

    String[] names = {"冬瓜紅茶", "玫瑰鹽奶蓋紅茶", "珍珠紅茶拿鐵", "紅茶拿鐵"};
    int[] mPrices = {25, 35, 45, 35};
    int[] lPrices = {35, 45, 55, 45};
    int[] imageId = {R.drawable.drink1, R.drawable.drink2, R.drawable.drink3, R.drawable.drink4};

    List<Drink> drinks = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink_menu);
        Log.d("Debug", "DrinkMenuActivity OnCreate");
        setData();

        totalTextView = (TextView) findViewById(R.id.totalTextView);
        drinkMenuListView = (ListView) findViewById(R.id.drinkMenuListView);

        setupDrinkMenuListView();
    }

    private void setData()
    {
        for(int i = 0; i < names.length; i++)
        {
            Drink drink = new Drink();
            drink.name = names[i];
            drink.mPrice = mPrices[i];
            drink.lPrice = lPrices[i];
            drink.imageId = imageId[i];
            drinks.add(drink);
        }
    }

    private void setupDrinkMenuListView()
    {
        DrinkAdapter adapter = new DrinkAdapter(this, drinks);
        drinkMenuListView.setAdapter(adapter);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Debug", "DrinkMenuActivity OnStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Debug", "DrinkMenuActivity OnResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Debug", "DrinkMenuActivity OnPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Debug", "DrinkMenuActivity OnStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Debug", "DrinkMenuActivity OnDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Debug", "DrinkMenuActivity OnRestart");
    }
}
