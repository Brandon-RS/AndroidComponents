package dev.brandon.components;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
  }

  public void goToRadioButton(View v) {
    Intent i = new Intent(this, RadioButtonActivity.class);
    startActivity(i);
  }

  public void goToSpinner(View v) {
    Intent i = new Intent(this, SpinnerActivity.class);
    startActivity(i);
  }

  public void goToCheck(View v) {
    Intent i = new Intent(this, CheckBoxActivity.class);
    startActivity(i);
  }

  public void goToListView(View v) {
    Intent i = new Intent(this, ListViewActivity.class);
    startActivity(i);
  }

}
