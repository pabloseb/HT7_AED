/**
 * @author Pablo Herrera & Jorge Andrino
 * @since 28/03/2022
 * This class allows to create dictionaries, it depends on the .txt in the project
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Scanner;

public class Association {
    Association(){}

    /**
     * Class that reads the file and returns a String that contains the information in the archive
     * @return String that contains .txt information
     * @throws FileNotFoundException
     */
    public static String read_file() throws FileNotFoundException{
        File file = new File("texto.txt");
        Scanner scanner = new Scanner(file);
        String sentence_in_txt = scanner.nextLine();
        return sentence_in_txt;

    }

    /**
     * This class creates a dictionary that contains have english words as keys and the words in spanish and french as values
     * @return Map
     * @throws FileNotFoundException
     */
    public Map CreateDictEnglish() throws FileNotFoundException{
        ArrayList<String> txtwords = new ArrayList<String>();

        File myfile = new File("content.txt");
        Scanner scanner = new Scanner(myfile);
        //mientras hayan lineas en el txt, se realiza las operaciones necesarias
        while(scanner.hasNextLine()){
            txtwords.add(scanner.nextLine());
        }
        //se crea un diccionario que guarda una clave y un valor
        Map<String,ArrayList<String>> Diccionario = new HashMap<String,ArrayList<String>>();

        for(int i = 0;i<txtwords.size();i++){
            String[] elements = txtwords.get(i).split(",");
            String keyvalue = elements[0];
            Diccionario.put(keyvalue,new ArrayList<String>());
            Diccionario.get(keyvalue).add(elements[1]);
            Diccionario.get(keyvalue).add(elements[2]);
        }
        //ya se ha creado el diccionario con las claves y los valores correspondientes.
        return Diccionario;
    }

    /**
     * Creates a dictionary that has spanish words as keys and englis/french words as values
     * @return Map
     * @throws FileNotFoundException
     */
    public Map CreateDictSpanish() throws FileNotFoundException{
        ArrayList<String> txtwords = new ArrayList<String>();

        File myfile = new File("content.txt");
        Scanner scanner = new Scanner(myfile);
        //mientras hayan lineas en el txt, se realiza las operaciones necesarias
        while(scanner.hasNextLine()){
            txtwords.add(scanner.nextLine());
        }
        //se crea un diccionario que guarda una clave y un valor
        Map<String,ArrayList<String>> Diccionario = new HashMap<String,ArrayList<String>>();

        for (String txtword : txtwords) {
            String[] elements = txtword.split(",");
            String keyvalue = elements[1];
            Diccionario.put(keyvalue, new ArrayList<>());
            Diccionario.get(keyvalue).add(elements[0]);
            Diccionario.get(keyvalue).add(elements[2]);
        }
        //ya se ha creado el diccionario con las claves y los valores correspondientes.
        return Diccionario;
    }

    /**
     * Class that has french words as keys and spanish/english words as values
     * @return Map
     * @throws FileNotFoundException
     */
    public Map CreateDictFrench() throws FileNotFoundException{
        ArrayList<String> txtwords = new ArrayList<>();

        File myfile = new File("content.txt");
        Scanner scanner = new Scanner(myfile);
        //mientras hayan lineas en el txt, se realiza las operaciones necesarias
        while(scanner.hasNextLine()){
            txtwords.add(scanner.nextLine());
        }
        //se crea un diccionario que guarda una clave y un valor
        Map<String,ArrayList<String>> Diccionario = new HashMap<>();

        for (String txtword : txtwords) {
            String[] elements = txtword.split(",");
            String keyvalue = elements[2];
            Diccionario.put(keyvalue, new ArrayList<>());
            Diccionario.get(keyvalue).add(elements[0]);
            Diccionario.get(keyvalue).add(elements[1]);
        }
        //ya se ha creado el diccionario con las claves y los valores correspondientes.
        return Diccionario;
    }

    /**
     * Class that contains English words as keys and Spanish words as values, it helps to translate a sentence from English to spanish
     * @return Map
     * @throws FileNotFoundException
     */
    public Map EnglishSpanishDictionary() throws FileNotFoundException {
        ArrayList<String> txtwords = new ArrayList<>();

        File myfile = new File("content.txt");
        Scanner scanner = new Scanner(myfile);
        //mientras hayan lineas en el txt, se realiza las operaciones necesarias
        while(scanner.hasNextLine()){
            txtwords.add(scanner.nextLine());
        }
        //se crea un diccionario que guarda una clave y un valor
        Map<String,String> Diccionario = new HashMap<>();

        for (String txtword : txtwords) {
            String[] elements = txtword.split(",");
            String keyvalue = elements[0];
            Diccionario.put(keyvalue, elements[1]);
        }
        //ya se ha creado el diccionario con las claves y los valores correspondientes.
        return Diccionario;
    }

    /**
     * Class that contains English words as keys and French words as values, it helps to translate a sentence in English to french
     * @return Map
     * @throws FileNotFoundException
     */
    public Map EnglishFrenchDictionary() throws FileNotFoundException {
        ArrayList<String> txtwords = new ArrayList<>();

        File myfile = new File("content.txt");
        Scanner scanner = new Scanner(myfile);
        //mientras hayan lineas en el txt, se realiza las operaciones necesarias
        while(scanner.hasNextLine()){
            txtwords.add(scanner.nextLine());
        }
        //se crea un diccionario que guarda una clave y un valor
        Map<String,String> Diccionario = new HashMap<>();

        for (String txtword : txtwords) {
            String[] elements = txtword.split(",");
            String keyvalue = elements[0];
            Diccionario.put(keyvalue, elements[2]);
        }
        //ya se ha creado el diccionario con las claves y los valores correspondientes.
        return Diccionario;
    }

    /**
     * Class that creates a Map with spanish words as keys and english words as values, it helps to translate a sentence from spanish to english
     * @return Map
     * @throws FileNotFoundException
     */
    public Map SpanishEnglishDictionary() throws FileNotFoundException {
        ArrayList<String> txtwords = new ArrayList<>();

        File myfile = new File("content.txt");
        Scanner scanner = new Scanner(myfile);
        //mientras hayan lineas en el txt, se realiza las operaciones necesarias
        while(scanner.hasNextLine()){
            txtwords.add(scanner.nextLine());
        }
        //se crea un diccionario que guarda una clave y un valor
        Map<String,String> Diccionario = new HashMap<>();

        for (String txtword : txtwords) {
            String[] elements = txtword.split(",");
            String keyvalue = elements[1];
            Diccionario.put(keyvalue, elements[0]);
        }
        //ya se ha creado el diccionario con las claves y los valores correspondientes.
        return Diccionario;
    }
    /**
     * Class that creates a Map with spanish words as keys and french words as values, it helps to translate a sentence from spanish to french
     * @return Map
     * @throws FileNotFoundException
     */
    public Map SpanishFrenchDictionary() throws FileNotFoundException {
        ArrayList<String> txtwords = new ArrayList<>();

        File myfile = new File("content.txt");
        Scanner scanner = new Scanner(myfile);
        //mientras hayan lineas en el txt, se realiza las operaciones necesarias
        while(scanner.hasNextLine()){
            txtwords.add(scanner.nextLine());
        }
        //se crea un diccionario que guarda una clave y un valor
        Map<String,String> Diccionario = new HashMap<>();

        for (String txtword : txtwords) {
            String[] elements = txtword.split(",");
            String keyvalue = elements[1];
            Diccionario.put(keyvalue, elements[2]);
        }
        //ya se ha creado el diccionario con las claves y los valores correspondientes.
        return Diccionario;
    }
    /**
     * Class that creates a Map with french words as keys and english words as values, it helps to translate a sentence from french to english
     * @return Map
     * @throws FileNotFoundException
     */
    public Map FrenchEnglishDictionary() throws FileNotFoundException {
        ArrayList<String> txtwords = new ArrayList<>();

        File myfile = new File("content.txt");
        Scanner scanner = new Scanner(myfile);
        //mientras hayan lineas en el txt, se realiza las operaciones necesarias
        while(scanner.hasNextLine()){
            txtwords.add(scanner.nextLine());
        }
        //se crea un diccionario que guarda una clave y un valor
        Map<String,String> Diccionario = new HashMap<>();

        for (String txtword : txtwords) {
            String[] elements = txtword.split(",");
            String keyvalue = elements[2];
            Diccionario.put(keyvalue, elements[0]);
        }
        //ya se ha creado el diccionario con las claves y los valores correspondientes.
        return Diccionario;
    }
    /**
     * Class that creates a Map with french words as keys and spanish words as values, it helps to translate a sentence from french to spanish
     * @return Map
     * @throws FileNotFoundException
     */
    public Map FrenchSpanishDictionary() throws FileNotFoundException {
        ArrayList<String> txtwords = new ArrayList<>();

        File myfile = new File("content.txt");
        Scanner scanner = new Scanner(myfile);
        //mientras hayan lineas en el txt, se realiza las operaciones necesarias
        while(scanner.hasNextLine()){
            txtwords.add(scanner.nextLine());
        }
        //se crea un diccionario que guarda una clave y un valor
        Map<String,String> Diccionario = new HashMap<>();

        for (String txtword : txtwords) {
            String[] elements = txtword.split(",");
            String keyvalue = elements[2];
            Diccionario.put(keyvalue, elements[1]);
        }
        //ya se ha creado el diccionario con las claves y los valores correspondientes.
        return Diccionario;
    }
}
