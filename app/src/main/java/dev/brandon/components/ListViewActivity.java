package dev.brandon.components;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListViewActivity extends AppCompatActivity {

  private EditText et;
  private ArrayList<String> list;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_list_view);

    ListView lv = findViewById(R.id.idListView);
    Button btnAdd = findViewById(R.id.button);
    et = findViewById(R.id.idEdtItemName);
    list = new ArrayList<>();

    list.add("C++");
    list.add("Python");

    ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, list);
    lv.setAdapter(adapter);

    btnAdd.setOnClickListener(v -> {
      String item = et.getText().toString();
      if (!item.isEmpty()) {
        list.add(item);
        adapter.notifyDataSetChanged();
        et.setText("");
      } else {
        Toast.makeText(ListViewActivity.this, "Write something!", Toast.LENGTH_SHORT).show();
      }
    });

  }
}
