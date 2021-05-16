package za.ac.cput.adp3Assignment;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

class ListCollectionTest {

    ListCollection test1 = new ListCollection();

    ArrayList<String> listNames = new ArrayList<>();

    @Test
    void testLength(){
        listNames.add("Thibos ");
        listNames.add("Bhoza");
        assertEquals(3,listNames.size());


    }

}