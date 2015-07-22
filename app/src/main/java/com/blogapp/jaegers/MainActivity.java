package com.blogapp.jaegers;

import android.app.Activity;
/*import android.content.Intent;
import android.support.v7.app.ActionBarActivity;*/
import android.os.Bundle;
/*import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;*/
import android.view.View;
import android.widget.Button;



public class MainActivity extends Activity implements View.OnClickListener  {

    Button fb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fb = (Button)findViewById(R.id.facebook);

        }

    @Override
    public void onClick(View view) {

    }
}





