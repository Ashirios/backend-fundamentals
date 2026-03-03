package library;

import com.example.interfaces.Product;
import com.example.library.Book;
import org.junit.jupiter.api.Test;


public class BookTest {

    Product book = new Book();
    @Test
    public void testBookName(){
        book.setName("1984");
        assert(book.getName().equals("1984"));
    }


    

}
