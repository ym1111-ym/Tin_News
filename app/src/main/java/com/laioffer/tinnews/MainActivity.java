package com.laioffer.tinnews;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;
import android.util.Log;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.laioffer.tinnews.model.NewsResponse;
import com.laioffer.tinnews.network.NewsApi;
import com.laioffer.tinnews.network.RetrofitClient;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private NavController navController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navView = findViewById(R.id.nav_view);//name given in activity_main.xml
        NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager()
                           .findFragmentById(R.id.nav_host_fragment);////name given in activity_main.xml
        navController = navHostFragment.getNavController();
        NavigationUI.setupWithNavController(navView, navController);//把bottom view和navigation component连起来
        NavigationUI.setupActionBarWithNavController(this, navController);//上面的部分是action bar
    }
    @Override
    public boolean onSupportNavigateUp() {
        return navController.navigateUp();
    }//支持回退

}