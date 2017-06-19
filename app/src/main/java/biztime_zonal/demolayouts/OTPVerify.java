package biztime_zonal.demolayouts;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by J_Jay on 13-Jun-17.
 */

public class OTPVerify extends MainActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.otpverify);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
