package com.brandmore.minni;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class versionselect extends AppCompatActivity {
    private Button p;
    private Button d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_versionselect);

     d = (Button) findViewById(R.id.driverid);
     p = (Button) findViewById(R.id.passengerid);
     p.setOnClickListener(new View.OnClickListener(){

         @Override
         public void onClick(View v){
           /* TODO Auto-generated method stub*/

           /*
           * Intent is just like glue which helps to navigate the activity
           * to another
            */ Intent intent = new Intent(versionselect.this, RegisterActivity.class);
             startActivity(intent);
         }
     });
     d.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             /* TODO Auto-generated method stub*/

             /*
              * Intent is just like glue which helps to navigate the activity
              * to another
              */ Intent intent = new Intent(versionselect.this, driver.class);
             startActivity(intent);
         }
     });
    }
}
