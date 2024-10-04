package poop7;

/**
 * Clase principal que ejecuta el programa.
 * Contiene la función `main` donde se crean instancias de las clases `Empleado` y `Gerente`,
 * y se realizan operaciones sobre dichas instancias.
 * 
 * @version 1.0
 * @since 2024
 * @author Rodrigo Ceron
 */
public class POOP7 {

    /**
     * Método principal que se ejecuta al iniciar el programa.
     * 
     * @param args los argumentos de la línea de comandos (no se usan en este programa).
     */
    public static void main(String[] args) {
        
        // Creación de una instancia de Empleado
        Empleado empleado1 = new Empleado("Fernanda", 483674, 20000f);
        
        // Creación de otra instancia de Empleado
        Empleado empleado2 = new Empleado("Jorge", 46741, 30000f);
        
        // Imprimir la información del primer empleado
        System.out.println(empleado1);
        
        // Aumentar el sueldo del primer empleado en un 10%
        empleado1.aumentarSueldo(10);
        
        // Imprimir de nuevo la información del primer empleado después del aumento de sueldo
        System.out.println("");
        System.out.println(empleado1);
        System.out.println("");
        System.out.println("");
        
        // Creación de una instancia de Gerente con parámetros específicos
        Gerente gerente1 = new Gerente(1000f, "Jorge", 321, 20000f);
        System.out.println(gerente1);
        
        // Creación de una instancia de Gerente con el constructor por defecto
        Gerente gerente2 = new Gerente();
        System.out.println(gerente2);
        
        // Modificación del presupuesto del segundo gerente
        gerente2.setPresupuesto(34500f);
        System.out.println(gerente2);
        
        // Modificación del nombre del segundo gerente
        gerente2.setNombre("Adriel");
        System.out.println(gerente2);
        
        // Obtener el nombre del segundo gerente y mostrarlo
        System.out.println(gerente2.getNombre());
    }
}



    