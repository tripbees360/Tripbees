package bibin.tripbees;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Welcomescreen extends AppCompatActivity {


    public  Button but1;
    public  void init() {
        but1 = (Button) findViewById( R.id.but1 );
        but1.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Welcomescreen.this,secondactivity.class );
                startActivity(toy);
            }
        } );
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcomescreen);
        init();





    }
}