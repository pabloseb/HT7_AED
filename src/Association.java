import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Scanner;

public class Association {
    Association(){}
    public static String read_file() throws FileNotFoundException{
        File file = new File("texto.txt");
        Scanner scanner = new Scanner(file);
        String sentence_in_txt = scanner.nextLine();
        return sentence_in_txt;

    }
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
