package sg.edu.rp.c346.id20046797.todoitem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    ListView lvTodoItem;
    ArrayAdapter<ToDoItem> aaTodoItem;
    ArrayList<ToDoItem> alTodoItem;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvTodoItem = findViewById(R.id.lvToDoItem);

        alTodoItem = new ArrayList<ToDoItem>();
        Calendar date1 = Calendar.getInstance();
        date1.set(2021, 7, 1);

        Calendar date2 = Calendar.getInstance();
        date2.set(2021, 7, 2);

        ToDoItem item1 = new ToDoItem("Go for Movie", date1);
        ToDoItem item2 = new ToDoItem("Go for haircut", date2);

        alTodoItem.add(item1);
        alTodoItem.add(item2);

        adapter = new CustomAdapter(this, R.layout.row, alTodoItem);

//        aaTodoItem = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, alTodoItem);
        lvTodoItem.setAdapter(adapter);
    }
}