package com.simx.barcodescanner.ui.home;

import android.content.Context;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.simx.barcodescanner.R;

public class HomeActivity extends AppCompatActivity {

  public static void start(Context context) {
      Intent starter = new Intent(context, HomeActivity.class);
      starter.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
      context.startActivity(starter);
  }

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.home_activity);
    if (savedInstanceState == null) {
      getSupportFragmentManager().beginTransaction()
          .replace(R.id.container, HomeFragment.newInstance())
          .commitNow();
    }
  }
}
