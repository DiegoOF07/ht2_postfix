package OurCalculator;
/**
 * @author Juan Solis
 * @creationDate 21/01/2024
 * @description Clase que contiene los test realizados con JUnit para verificar el correcto funcionamiento de las funciones
 * de la clase Stack
 */

 import org.junit.*;

 public class StackTest {
     /**
      * @description Prueba para verificar que al realizar la extracción de un elemento
      * en un pila vacía se devuelva un null
      * (Prueba hecha para no fallar)
      */
     @Test
     public void testPopWithEmptyStack() {
         Stack<String> stack = new Stack<>();
         Assert.assertNull("Debería devolverse null ya que la pila está vacía", stack.pop());
     }
 
     /**
      * @description Prueba para verificar que al realizar hace un push a una nueva pila
      * el lastNode y el firstNode tengan el mismo valor
      * (Prueba hecha para no fallar)
      */
     @Test
     public void testFirstPushAndCheckLastNodeAndFirstNode() {
         Stack<String> stack = new Stack<>();
         stack.push("4");
 
         Assert.assertEquals("Al insertar el primer valor en una pila, tanto el lastNode como el firstNode deberían tener el mismo valor",
         stack.getFirstNode().getValue(), stack.getLastNode().getValue());
     }
 
     /**
      * @description Prueba para verificar que al pushear 3 valores a una pila, el primero en salir 
      * al realizar el pop sea el último en haber sido pusheado
      * (Prueba hecha para fallar)
      * A propósito se espera el primer valor en haber ingresado a la pila
      */
     @Test
     public void testCorrectPushAndPop() {
         Stack<String> stack = new Stack<>();
         stack.push("5");
         stack.push("9");
         stack.push("8");
 
         Assert.assertEquals("El último valor en ingresar debería ser el primero en salir","5", stack.pop());
     }
 }