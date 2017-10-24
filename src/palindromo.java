import com.sun.org.apache.bcel.internal.generic.RETURN;

import java.util.Stack;

public class palindromo {


    public  void pali(){


        resultado("anitalavalatina");
        resultado("porro");
        resultado("aabaa");
        resultado("maria");
        resultado("oso");
    }


    public  static  void resultado(String Cadena){
        System.out.println(Cadena+" ¿es polindromo? "+palindromo(Cadena));
    }
    public  static  boolean palindromo(String Cadena){
        Stack<Character>pila=new Stack<Character>();
        for (int i=0; i<Cadena.length(); i++){
            pila.push(Cadena.charAt(i));
        }
        String CadenaInv="";
        while (!pila.empty()){
            CadenaInv+=pila.pop();
        }
        if(CadenaInv.equalsIgnoreCase(Cadena)){
            return  true;
        }
            return  false;




    }

}
