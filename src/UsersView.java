/**
 * @author Pablo Herrera & Jorge Andrino
 * @since 28/03/2022
 * Hoja de Trabajo No.7 Algoritmos y Estructuras de Datos
 */

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class UsersView {
    public static void main(String[] args) {
        Association filedictionary = new Association();
        try{
            //se crean los diccionarios con diferentes claves y valores.
            HashMap<String,ArrayList<String>> EnglishDictionary = (HashMap<String, ArrayList<String>>) filedictionary.CreateDictEnglish();
            HashMap<String,ArrayList<String>> SpanishDictionary = (HashMap<String, ArrayList<String>>) filedictionary.CreateDictSpanish();
            HashMap<String,ArrayList<String>> FrenchDictionary = (HashMap<String, ArrayList<String>>) filedictionary.CreateDictFrench();
            //----------------------------------------------------------------------------------------------------------

            BinarySearchTree bst_english = new BinarySearchTree();
            ArrayList<String> keys = new ArrayList<>(EnglishDictionary.keySet());
            Node root = null;

            //se llena el arbol con los valores de las llaves en el hashmap
            for(int i = 0;i<keys.size();i++){
                root = bst_english.insert(root,keys.get(i));
            }
            //-------------------------------------------------------------------------
            BinarySearchTree bst_spanish = new BinarySearchTree();
            ArrayList<String> keys_spanish = new ArrayList<>(SpanishDictionary.keySet());
            Node nodo = null;
            for(int i = 0;i<keys.size();i++){
                nodo = bst_spanish.insert(nodo,keys.get(i));
            }
            //---------------------------------------------------------------------------
            BinarySearchTree bst_french = new BinarySearchTree();
            ArrayList<String> keys_french = new ArrayList<>(FrenchDictionary.keySet());
            Node noeud  = null;
            for(int i = 0;i<keys.size();i++){
                noeud = bst_french.insert(nodo,keys.get(i));
            }
            //------------------------------------------------------------------------------

            //se imprimen los valores del arbol en Inorder
            System.out.println("Bienvenido al Diccionario Inglés-Español-Frances");
            System.out.println("A Continacion se presentan todas las palabras (en idioma ingles) que actualmente se tienen en el diccionario");
            bst_english.Inorder(root);
            //------------------------------------------------------------------------------------
            //Se inicializa el traductor por archivo
            System.out.println("Por favor, indique alguna de las opciones del menu");
            System.out.println("1.Traducir un documento");
            System.out.println("2.Finalizar traductor");
            Scanner scanner = new Scanner(System.in);

            String option_keyboard;
            int option_casted;

            do{
                option_keyboard = scanner.nextLine();
            }while(Controller.validation_small(option_keyboard)==false);
            //-----------------------------------------------------------------------------------------------
            String translation="";
            option_casted = Integer.parseInt(option_keyboard);
            if(option_casted == 1){
                System.out.println("Escoja el lenguaje en el que esta escrito el archivo, \nEnglish/Spanish/French");
                System.out.println("E/S/F");
                String txtLanguage = scanner.nextLine();
                System.out.println("Escoja el lenguaje al que desea traducir");
                System.out.println("E/S/F");
                String translateLanguaje = scanner.nextLine();
                if(txtLanguage.equals("E")){
                    translation = Controller.Translate(txtLanguage,translateLanguaje,bst_english,root);
                }else if(txtLanguage.equals("S")){
                    translation = Controller.Translate(txtLanguage,translateLanguaje,bst_spanish,root);
                }else if(txtLanguage.equals("F")){
                    translation = Controller.Translate(txtLanguage,translateLanguaje,bst_french,root);
                }
                System.out.println("Traduccion:\n"+translation);
                System.exit(0);
            }else{
                System.out.println("Que tenga una buen dia");
            }
            //--------------------------------------------------------------------------------------------
        }catch (FileNotFoundException e){
            System.out.println("No se ha encontrado el archivo, intente de nuevo");
        }//catch block
    }//main block
}//class block
