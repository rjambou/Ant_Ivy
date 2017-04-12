
package example;

import org.apache.commons.lang.WordUtils;

public class Hello {
    public static void main(String[] args) {
        String  message = "hello ivy !";
        System.out.println("standard message : " + message);
        System.out.println("capitalized by " + WordUtils.class.getName() 
                                + " : " + WordUtils.capitalizeFully(message));
        package example;

        import java.io.*;
        import org.apache.commons.lang.WordUtils;
        import java.util.*;
        import com.opencsv.*;

        public class Hello {
            public static void main(String[] args) {
            	int monmax=0;
                String  message = "hello ivy !";
                System.out.println("standard message : " + message);
                System.out.println("capitalized by " + WordUtils.class.getName() + " : " + WordUtils.capitalizeFully(message));
                try {
                    CSVReader reader = new CSVReader(new FileReader("data.csv"),',');
                    try{
                        List<String[]> myEntries=reader.readAll();
                        for (String[] strings : myEntries){
                            System.out.println(Arrays.toString(strings));
                            for(String nombre : strings){
                                monmax = max(monmax, Integer.parseInt(nombre));
                                }                        
                            }
                    }catch (IOException i){System.out.println("Erreur");}
                }catch (FileNotFoundException f){System.out.println("Erreur");}
                System.out.println("mon max: " + monmax);
            }
            public static int max(int a, int b)
            {
                return a > b ? a : b;
            }
        }
}
        