import com.yourcompany.todo.Todo;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class tests {


    @Test
    public void test_Get_Description(){

        String title = "title";
        String description = "Desc";
        LocalDate dueDate = LocalDate.of(2024, 4, 4); // Year, Month, Day

        Todo todo = new Todo(title, description, dueDate);

        assertEquals(description, todo.getDescription());

    }


    @Test
    public void test_Todo_Constructor(){

        String title = "title1";
        String description = "Desc1";
        LocalDate dueDate = LocalDate.of(2024, 5, 4); // Year, Month, Day

        Todo todo = new Todo(title, description, dueDate);


        assertEquals(title, todo.getTitle());
        assertEquals(description, todo.getDescription());
        assertEquals(dueDate, todo.getDue_date());

    }
}





