/**
 * @author Pablo Herrera & Jorge Andrino
 * @since 28/03/2022
 */
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;

/**
 * This class controls certain activities for the program to works fine
 */
public class Controller {
    /**
     * Checks if the user is entering a valid data
     * @param s
     * @return boolean
     */
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

    /**
     * Class that translates a sentence in a txt to a desire language
     * @param txtLanguage
     * @param translateLanguage
     * @param tree
     * @param node
     * @return String
     * @throws FileNotFoundException
     */
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

        else if (txtLanguage.equals("E") && translateLanguage.equals("F")) {
            //se crea el diccionario ingles-espaniol
            HashMap dictionary = (HashMap) as.EnglishFrenchDictionary();
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
        else if (txtLanguage.equals("S") && translateLanguage.equals("E")) {
            //se crea el diccionario ingles-espaniol
            HashMap dictionary = (HashMap) as.SpanishEnglishDictionary();
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
        else if (txtLanguage.equals("S") && translateLanguage.equals("F")) {
            //se crea el diccionario ingles-espaniol
            HashMap dictionary = (HashMap) as.SpanishFrenchDictionary();
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
        else if (txtLanguage.equals("F") && translateLanguage.equals("E")) {
            //se crea el diccionario ingles-espaniol
            HashMap dictionary = (HashMap) as.FrenchEnglishDictionary();
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
        else if (txtLanguage.equals("F") && translateLanguage.equals("S")) {
            //se crea el diccionario ingles-espaniol
            HashMap dictionary = (HashMap) as.FrenchSpanishDictionary();
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
        System.out.println("Enunciado en .txt\n "+sentence_inTxt);
        return last_translation;
    }
}
