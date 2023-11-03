import java.util.ArrayList;
import java.util.Scanner;
public class ej1 {
    public static void main(String[] args) {
        /*
        1.	Diseñar un programa que lea y guarde marcas de Autos en un ArrayList de tipo
        String. El programa pedirá una marca de Auto en un bucle, el mismo se guardará
        en la lista y después se le preguntará al usuario si quiere guardar otro Auto o si
        quiere salir. Si decide salir, se mostrará todos los autos guardados en el ArrayList.

         */
        Scanner sc = new Scanner(System.in);
        ArrayList<String> cars = new ArrayList<>();
        String out = "1";
        while (out.equals("1")){
            System.out.print("Ingresa una marca de auto: ");
            String car = sc.nextLine();
            cars.add(car);
            System.out.print("Ingresa 0 si deseas salir o 1 para seguir ingresando marcas de autos: ");
            out = sc.nextLine();
        }
        System.out.println("Las marcas de auto ingresadas fueron");
        for (String i : cars){
            System.out.print(i + " ");
        }



    }
}
