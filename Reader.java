import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Reader {
    private File file;

    public Reader(String fileName){
        this.file = new File(fileName);
    }

    /**
    * @description Método encargado de leer un archivo de texto y retornar sus caracteres  
    * @return ArrayList<String>
    * @throws Exception
    */
    public char[] read() throws Exception{
        char expresion[];
        BufferedReader bufer = new BufferedReader(new FileReader(file));
        String line = bufer.readLine();
        expresion = line.toCharArray();
        if(line !=null){
            bufer.close();
        }
        return expresion;
    }
}
