import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

/**
 * @author Diego Flores
 * @creationDate 20/01/2024
 * @description Clase que se encarga de leer los datos contenidos en un archivo de texto linea por linea
 */

public class Reader {
    private File file;

    public Reader(String fileName){
        this.file = new File(fileName);
    }

    /**
    * @description Método encargado de leer un archivo de texto y retornar sus caracteres
    * @modification Ahora puede leer multiples lineas y retornar una lista de ellas  
    * @return ArrayList<String>
    * @throws Exception
    */
    public ArrayList<String> read() throws Exception{
        ArrayList<String> expresions = new ArrayList<String>();
        BufferedReader bufer = new BufferedReader(new FileReader(file));
        String line = bufer.readLine();
        while(line != null){
            expresions.add(line);
            line = bufer.readLine();
        }
        if(line !=null){
            bufer.close();
        }
        return expresions;
    }
}
