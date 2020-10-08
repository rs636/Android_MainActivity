package com.example.loginexample1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    FragmentManager fm;
    FragmentTransaction tran;
    private DrawerLayout drawerLayout;
    private View drawerView;
    private Button btn2;
    private Frag2 frag2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn2=findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //getFragmentManager().beginTransaction().replace(R.id.main_frame, new frag1()).commit();
            }
        });

        drawerLayout=(DrawerLayout)findViewById(R.id.drawer_layout);
        drawerView=(View)findViewById(R.id.drawer);
        Button btn_open = (Button)findViewById(R.id.btn_menu);
        btn_open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(drawerView);
            }
        });
        Button btn_close = (Button)findViewById(R.id.btn_close);
        btn_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.closeDrawers();
            }
        });
        drawerLayout.setDrawerListener(listener);
        drawerView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                return true;
            }
        });

    }
  //  public void clickHandler(View view)
  //  {
      //  transaction = fragmentManager.beginTransaction();

      //  switch(view.getId())
       // {
         //   case R.id.btn2:
         //       transaction.replace(R.id.main_frame, fragment_2).commitAllowingStateLoss();
          //      break;
      //  }
  //  }
    DrawerLayout.DrawerListener listener= new DrawerLayout.DrawerListener() {
        @Override
        public void onDrawerSlide(@NonNull View drawerView, float slideOffset) { //슬라이드 했을때

        }

        @Override
        public void onDrawerOpened(@NonNull View drawerView) {  //오픈이 완료 됐을때

        }

        @Override
        public void onDrawerClosed(@NonNull View drawerView) {

        }

        @Override
        public void onDrawerStateChanged(int newState) { //어떤 상태가 체인지가 됐을때때

        }
    };
}