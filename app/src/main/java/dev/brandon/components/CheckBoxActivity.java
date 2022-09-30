package dev.brandon.components;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class CheckBoxActivity extends AppCompatActivity {

  private CheckBox ch1, ch2, ch3;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_check_box);

    ch1 = findViewById(R.id.checkBox);
    ch2 = findViewById(R.id.checkBox2);
    ch3 = findViewById(R.id.checkBox3);

  }

  public void calculate(View v) {

    if (ch1.isChecked()) {
      Toast.makeText(this, "First Checked", Toast.LENGTH_SHORT).show();
    } else if (ch2.isChecked()) {
      Toast.makeText(this, "Second Checked", Toast.LENGTH_SHORT).show();
    } else if (ch3.isChecked()) {
      Toast.makeText(this, "Third Checked", Toast.LENGTH_SHORT).show();
    }

  }

}
