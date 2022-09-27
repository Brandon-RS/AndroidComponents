package dev.brandon.components;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

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

}
