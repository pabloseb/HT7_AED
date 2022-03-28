import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;

public class Controller {
    public static boolean validation(String s){
        int i;
        try{
            i = Integer.parseInt(s);
            if(i <=0 || i > 3){
                System.out.println("Escoja un valor del menu");
                return false;
            }
            else{
                return true;
            }
        }catch (Exception e){
            System.out.println("Escoja un valor del menu");
            return false;
        }
    }
    public static boolean validation_small(String s){
        int i;
        try{
            i = Integer.parseInt(s);
            if(i <=0 || i > 2){
                System.out.println("Escoja un valor del menu");
                return false;
            }
            else{
                return true;
            }
        }catch (Exception e){
            System.out.println("Escoja un valor del menu");
            return false;
        }
    }
    public static String Translate(String txtLanguage, String translateLanguage,BinarySearchTree tree,Node node) throws FileNotFoundException {
        Association as = new Association();
        String value;
        String last_translation = "";

        String sentence_inTxt = Association.read_file().toLowerCase(Locale.ROOT);
        String[] array = sentence_inTxt.split(" ");
        ArrayList<String> elements_to_compare = new ArrayList<String>(Arrays.asList(array));

        ArrayList<String> translation = new ArrayList<>();

        if (txtLanguage.equals(translateLanguage)) {
            System.out.println("No se puede traducir al mismo idioma, intente de nuevo...");
        }
        else if (txtLanguage.equals("E") && translateLanguage.equals("S")) {
            //se crea el diccionario ingles-espaniol
            HashMap dictionary = (HashMap) as.EnglishSpanishDictionary();
            for(int i =0;i<elements_to_compare.size();i++){
                if(dictionary.containsKey(elements_to_compare.get(i))){
                    value = (String)dictionary.get(elements_to_compare.get(i));
                    translation.add(value);
                }if(!dictionary.containsKey(elements_to_compare.get(i))){
                    value = "*"+(String)elements_to_compare.get(i)+"*";
                    translation.add(value);
                }
            }
            for(String s : translation){
                last_translation = last_translation+" "+s;
            }
            }
        //agregar para los otros casos
        System.out.println("Enunciado en .txt\n"+sentence_inTxt);
        return last_translation;
    }
}
