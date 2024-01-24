package OtherCalculator;
import java.io.File;
/**
 * @author Diego Flores
 * @creationDate 20/01/2024
 * @description Clase que se encarga de manejar el uso de la pila asi como de controlar el funcionamiento de la calculadora
 */
public class StackManager {
    Calculator calculator = new Calculator();
    Reader reader = new Reader("./OtherCalculator/datos.txt");
    Stack<String> myStack = new Stack<String>();
    
    /**
     * @throws Exception
     * @description Método encargado de utilizar las lineas del archivo de texto para identificar las expresiones
     *              postfix y mostrar el resultado
     */
    public void manageOperations() throws Exception{

        File fileReader = new File("./OtherCalculator/datos.txt");
        if(fileReader.exists()){
            for (String expresion : reader.read()) {
                char digits[] = expresion.replace(" ", "").toCharArray();
                boolean expresionValida = true;

                System.out.print("\nExpresión: " + expresion);

                if (digits.length < 3) {
                    System.out.println("\nResultado: La expresión es muy corta como para mostrar un resultado");
                    continue;
                }

                for(int i = 0; i<digits.length; i++){
                    myStack.push(String.valueOf(digits[i]));
                    if(digits[i] == '+' || digits[i] == '-' || digits[i] == '*' || digits[i] == '/'){
                        try {
                            myStack.pop();
                            int newValue = calculator.calculate(digits[i], Integer.parseInt(myStack.pop()), Integer.parseInt(myStack.pop()));
                            myStack.push(Integer.toString(newValue));
                        } catch (Exception e) {
                            expresionValida = false;
                        }
                    }
                }

                if (expresionValida) {
                    if (myStack.getFirstNode() != null && myStack.getFirstNode().getNext() == null) {
                        System.out.println("\nResultado: " + Integer.parseInt(myStack.pop()));
                    } else {
                        System.out.println("\nResultado: La expresión postfix no es válida");
                    }
                } else {
                    System.out.println("\nResultado: La expresión postfix no es válida");
                }
            }
        } else {
            System.out.println("\nNo sé encontró el archivo datos.txt, agreguelo a la carpeta de OtherCalculator");
        } 
    }
}
