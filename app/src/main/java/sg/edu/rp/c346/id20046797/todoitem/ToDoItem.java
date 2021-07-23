package sg.edu.rp.c346.id20046797.todoitem;

import java.io.Serializable;
import java.time.Month;
import java.util.Calendar;

public class ToDoItem implements Serializable {
    public String item;
    public Calendar date;

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Calendar getDate() {
        return date;
    }

    public String getDateString() {
        String finalString = "";

        finalString += date.get(Calendar.YEAR);
        finalString += "/" + date.get(Calendar.MONTH);
        finalString += "/" + date.get(Calendar.DAY_OF_WEEK);

        return finalString;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public ToDoItem(String item, Calendar date) {
        this.item = item;
        this.date = date;
    }

    @Override
    public String toString() {
        return item + "\n" + getDateString();
    }
}
