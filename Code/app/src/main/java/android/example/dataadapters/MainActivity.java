package android.example.dataadapters;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String [] names = new String[10];
        names [0] = "Kanya";
        names [1] = "Peter";
        names [2] = "Nadine";
        names [3] = "Paul";
        names [4] = "Rainer";
        names [5] = "Felipe";
        names [6] = "Lourenco";
        names [7] = "Emiliano";
        names [8] = "Rodrigo";
        names [9] = "Danilo";

        ArrayAdapter<String> itemsAdapter =
                new ArrayAdapter<String>( this, android.R.layout.simple_list_item_1, names);

        ListView listView = (ListView) findViewById(R.id.studentList);
        listView.setAdapter(itemsAdapter);
    }
}
