package OurCalculator;
public class Main {
    public static void main(String[] args) {
        StackManager stackManager = new StackManager();
        System.out.println(" \nPROGRAMA PARA EXPRESIONES POSTFIX: ");
        System.out.println("Tomar en cuenta que no se trabaja con números décimales,\npor lo que se redondearán los resultados de las divisiones.");
        try {
            System.out.println("(Puede ingresar varias expresiones postfix en el archivo dando saltos de línea)");
            stackManager.manageOperations();
        } catch (Exception e) {
            System.out.println("Ocurrió un error al realizar la operación");
        }
    }
}