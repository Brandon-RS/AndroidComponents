package dev.brandon.components;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class SpinnerActivity extends AppCompatActivity {

  private EditText etN1;
  private EditText etN2;
  private Spinner spOperations;
  private TextView txtResult;
  private final String[] operations = {"Sum", "Subtraction", "Multiplication", "Division"};

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_spinner);

    etN1 = findViewById(R.id.txtN1);
    etN2 = findViewById(R.id.txtN2);
    txtResult = findViewById(R.id.txtResult);

    spOperations = findViewById(R.id.spinner);

    ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, operations);
    this.spOperations.setAdapter(adapter);

  }

  public void calculate(View v) {

    if (etN1.getText().toString().isEmpty() && etN2.getText().toString().isEmpty()) {
      Toast.makeText(this, "Put all numbers.", Toast.LENGTH_SHORT).show();
      return;
    }

    double n1 = Integer.parseInt(etN1.getText().toString());
    double n2 = Integer.parseInt(etN2.getText().toString());

    String selected = spOperations.getSelectedItem().toString();

    if (selected.equals(operations[0])) {
      txtResult.setText(String.valueOf(n1 + n2));
    } else if (selected.equals(operations[1])) {
      txtResult.setText(String.valueOf(n1 - n2));
    } else if (selected.equals(operations[2])) {
      txtResult.setText(String.valueOf(n1 * n2));
    } else if (selected.equals(operations[3])) {
      double res = n2 != 0 ? n1 / n2 : 0;
      txtResult.setText(String.valueOf(res));
    }

  }

}