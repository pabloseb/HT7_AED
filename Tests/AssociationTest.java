import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class AssociationTest {

    @Test
    void read_file() throws FileNotFoundException {
        File file = new File("texto.txt");
        Scanner scanner = new Scanner(file);
        String sentence_in_txt = scanner.nextLine();
        assertEquals("The woman asked me to do my homework about my town",sentence_in_txt);
    }
}