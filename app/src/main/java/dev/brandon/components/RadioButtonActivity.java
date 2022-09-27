package dev.brandon.components;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class RadioButtonActivity extends AppCompatActivity {
  private EditText etN1;
  private EditText etN2;

  private RadioButton rbSum, rbSubt, rbMulti, rbDiv;

  private TextView txtResult;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_radio_button);

    etN1 = findViewById(R.id.txtN1);
    etN2 = findViewById(R.id.txtN2);

    rbSum = findViewById(R.id.rbSum);
    rbSubt = findViewById(R.id.rbSubt);
    rbMulti = findViewById(R.id.rbMulti);
    rbDiv = findViewById(R.id.rbDiv);

    txtResult = findViewById(R.id.txtResult);

  }

  public void calculate(View v) {

    if (etN1.getText().toString().isEmpty() && etN1.getText().toString().isEmpty()) {
      Toast.makeText(this, "Put all numbers.", Toast.LENGTH_SHORT).show();
      return;
    }

    int n1 = Integer.parseInt(etN1.getText().toString());
    int n2 = Integer.parseInt(etN2.getText().toString());

    if (rbSum.isChecked()) {
      txtResult.setText(String.valueOf(n1 + n2));
    } else if (rbSubt.isChecked()) {
      txtResult.setText(String.valueOf(n1 - n2));
    } else if (rbMulti.isChecked()) {
      txtResult.setText(String.valueOf(n1 * n2));
    } else if (rbDiv.isChecked() && n1 != 0) {
      txtResult.setText(String.valueOf(n1 / n2));
    } else {
      Toast.makeText(this, "Can't divide to 0", Toast.LENGTH_SHORT).show();
    }

  }

}
