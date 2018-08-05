package com.simx.barcodescanner.ui.splash;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.PersistableBundle;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProviders;
import com.simx.barcodescanner.R;
import com.simx.barcodescanner.databinding.SplashActivityBinding;
import com.simx.barcodescanner.ui.home.HomeActivity;

public class SplashActivity extends AppCompatActivity {


  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    SplashViewModel splashViewModel = ViewModelProviders.of(this).get(SplashViewModel.class);
    SplashActivityBinding splashActivityBinding = DataBindingUtil
        .setContentView(this, R.layout.splash_activity);
    splashActivityBinding.setSvm(splashViewModel);
    new Handler().postDelayed(() -> gotoHome(), 2000);
  }

  private void gotoHome() {
    //HomeActivity.start(this);
  }
}
