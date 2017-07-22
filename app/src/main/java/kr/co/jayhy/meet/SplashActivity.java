package kr.co.jayhy.meet;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import kr.co.jayhy.meet.databinding.ActivitySplashBinding;

/**
 * Created by jhkim on 2017-07-05.
 */

public class SplashActivity extends AppCompatActivity {

    private ActivitySplashBinding binding = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_splash);


    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        if(binding != null) binding = null;
    }
}
