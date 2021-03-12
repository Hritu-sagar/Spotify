package com.example.spotifyclone;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class BottonNavigationViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_botton_navigation_view);
        BottomNavigationView bottomNavigationView =findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(navigationItemSelectedListener);
        getSupportFragmentManager().beginTransaction().replace(R.id.flContainer,new HomeFragment()).commit();

    }
    private BottomNavigationView.OnNavigationItemSelectedListener navigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener(){

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment selectedfragment =null;
            switch (item.getItemId()){
                case R.id.nav_home:
                    selectedfragment=new HomeFragment();
                    break;

            case R.id.navigation_dashboard:
            selectedfragment=new SearchFragment();
            break;

        case R.id.nev_notification:
        selectedfragment=new LiabraryFragment();
                    break;

    case R.id.new_liabrary:
    selectedfragment=new PremiumFragment();
                    break;
}
getSupportFragmentManager().beginTransaction().replace(R.id.flContainer,selectedfragment).commit();
            return true;
        }
    };
}