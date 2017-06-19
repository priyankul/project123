package biztime_zonal.demolayouts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView proceed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        proceed = (TextView) findViewById(R.id.textView4);
        proceed.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if(view==proceed) {
            Intent intent = new Intent(this, OTPVerify.class);
            startActivity(intent);
        }
    }
}
