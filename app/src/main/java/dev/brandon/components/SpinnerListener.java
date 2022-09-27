package dev.brandon.components;

import android.view.View;
import android.widget.AdapterView;

public class SpinnerListener implements AdapterView.OnItemSelectedListener {
  @Override
  public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
    System.out.println(position);
  }

  @Override
  public void onNothingSelected(AdapterView<?> parent) {
    System.out.println("Nothing");
  }
}
