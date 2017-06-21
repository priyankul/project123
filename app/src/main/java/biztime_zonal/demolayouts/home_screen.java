package biztime_zonal.demolayouts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

public class home_screen extends AppCompatActivity {

    private FirebaseAuth mAuth;

    /*private TextView mStartTextView;
    private EditText mPhoneNumberField;

    private EditText mVerificationField;
    private TextView mVerifyTextView;
    private TextView mResendTextView;*/
    private Button signOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        mAuth = FirebaseAuth.getInstance();

        signOut = (Button)findViewById(R.id.sign_out_button);
        signOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                signOut();

                Intent intent = new Intent(home_screen.this, MainActivity.class);
                startActivity(intent);
                //enableViews(mStartTextView, mPhoneNumberField);
                //disableViews(mVerifyTextView, mResendTextView, mVerificationField);
            }
        });
    }

    private void signOut(){
        mAuth.signOut();
    }

    /*private void enableViews(View... views) {
        for (View v : views) {
            v.setEnabled(true);
        }
    }

    private void disableViews(View... views) {
        for (View v : views) {
            v.setEnabled(false);
        }
    }*/
}
