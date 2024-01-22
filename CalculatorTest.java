/**
 * @author Diego Flores
 * @creationDate 22/01/2024
 * @description Clase que contiene los test realizados con JUnit para verificar el correcto
 * funcionamiento de los métodos de la clase Calculator
 */

import org.junit.*;

public class CalculatorTest {
    
    /**
     * @description Prueba encargada de verificar la division entre 0
     * retornando una excepcion indicando que no se puede realizar dicha
     * operación
     * (Test hecho para no fallar)
     */
    @Test
    public void NonDivisionByZeroTest(){
        Calculator calc = new Calculator();
        Exception except = Assert.assertThrows(IllegalArgumentException.class, () -> {
            calc.calculate('/', 1, 0);;
        });
        String expectedMessage = "No se puede realizar una división entre 0";
        String actualMessage = except.getMessage();
        Assert.assertTrue(actualMessage.contains(expectedMessage));
    }

    /**
     * @description Prueba encargada de verificar que se realicen las 
     * 4 principales operaciones, si se encuentra con otra retornara una
     * excepción
     * (Test hecho para no fallar)
     */
    @Test
    public void OtherOperatorGivenTest(){
        Calculator calc = new Calculator();
        char randomOperator = '%';
        Exception except = Assert.assertThrows(IllegalArgumentException.class, () -> {
            calc.calculate(randomOperator, 1, 1);;
        });
        String expectedMessage = "El carácter "+randomOperator+" no puede ser interpretado como operador";
        String actualMessage = except.getMessage();
        Assert.assertTrue(actualMessage.contains(expectedMessage));
    }

    /**
     * @description Prueba encargada de verificar los operadores tienen
     * coherencia y cada uno realiza una operación diferente
     * (Test hecho para fallar)
     */
    @Test
    public void FailedOperationResultTest(){
        Calculator calc = new Calculator();
        Assert.assertEquals(56, calc.calculate('*', 6, 50));
    }

    
}
