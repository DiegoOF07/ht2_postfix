/**
 * @author Diego Flores
 * @creationDate 20/01/2024
 * @description Clase que se encarga de manejar el uso de la pila asi como de controlar el funcionamiento de la calculadora
 */
public class StackManager {
    Reader reader = new Reader("datos.txt");
    Stack<String> myStack = new Stack<String>();
    
    /**
     * @throws Exception
     * @description Método encargado de utilizar las lineas del archivo de texto para identificar las expresiones
     *              postfix y mostrar el resultado
     */
    public void manageOperations() throws Exception{
        for (String expresion : reader.read()) {
            char digits[] = expresion.replace(" ", "").toCharArray();
            for(int i = 0; i<digits.length; i++){
                myStack.push(String.valueOf(digits[i]));
                if(digits[i] == '+' || digits[i] == '-' || digits[i] == '*' || digits[i] == '/'){
                    myStack.pop();
                    int newValue = Calculator.calculate(digits[i], Integer.parseInt(myStack.pop()), Integer.parseInt(myStack.pop()));
                    myStack.push(Integer.toString(newValue));
                }
            }
            System.out.println("El resultado es: "+myStack.pop());
        }
    }
}
