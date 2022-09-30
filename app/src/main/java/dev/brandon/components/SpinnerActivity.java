package dev.brandon.components;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class SpinnerActivity extends AppCompatActivity {

  private Spinner spOperations;
  private TextView txtResult;
//  private final String[] operations = {"Sum", "Subtraction", "Multiplication", "Division"};

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_spinner);

    txtResult = findViewById(R.id.txtResult);

    spOperations = findViewById(R.id.spinner);
    String[] operations = getResources().getStringArray(R.array.operations);

//    ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.custom_spinner, operations);
    ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, operations);
//    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
    adapter.setDropDownViewResource(R.layout.custom_spinner);
    this.spOperations.setAdapter(adapter);

    SpinnerListener listener = new SpinnerListener();
    Spinner spinner2 = findViewById(R.id.spinner2);
    spinner2.setOnItemSelectedListener(listener);

  }

  public void calculate(View v) {

    String selected = spOperations.getSelectedItem().toString();
    String[] operations = getResources().getStringArray(R.array.operations);

    if (selected.equals(operations[0])) {
      Toast.makeText(this, selected, Toast.LENGTH_SHORT).show();
    } else if (selected.equals(operations[1])) {
      Toast.makeText(this, selected, Toast.LENGTH_SHORT).show();
    } else if (selected.equals(operations[2])) {
      Toast.makeText(this, selected, Toast.LENGTH_SHORT).show();
    } else if (selected.equals(operations[3])) {
      Toast.makeText(this, selected, Toast.LENGTH_SHORT).show();
    }

  }

}
