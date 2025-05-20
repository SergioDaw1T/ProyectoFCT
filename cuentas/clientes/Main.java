package cuentas.clientes;

	/**
	 * Clase principal de ejecución del programa.(main)
	 * Contiene el método main y la lógica para operar con una cuenta bancaria.
	 * Muestra el uso básico de ingreso, retiro y consulta de saldo.
	 * (Otro commit)
	 * @author 
	 * @version 1.2
	 * @since 2025-05-19
	 */
	public class Main {

	    /**
	     * Método principal que inicia la ejecución del programa.
	     * 
	     * @param args Argumentos de línea de comandos (no utilizados).
	     */
	    public static void main(String[] args) {
	        operativa_cuenta(10);
	    }

	    /**
	     * Realiza operaciones de retirada e ingreso sobre una cuenta bancaria.
	     * Crea una cuenta, realiza una retirada y un ingreso, y muestra el saldo resultante.
	     * 
	     * @param cantidad Cantidad que se desea ingresar.
	     */
	    private static void operativa_cuenta(float cantidad) {
	        Cuenta cuenta1;
	        double saldoActual;

	        cuenta1 = new Cuenta("Rafael Nadal Parera", "1000-2365-85-1230456789", 2500, 0);

	        System.out.println("El saldo actual es: " + cuenta1.estado());

	        try {
	            cuenta1.retirar(2300);
	            System.out.println("El saldo actual es: " + cuenta1.estado());
	        } catch (Exception e) {
	            System.out.print("Fallo al retirar");
	        }

	        try {
	            System.out.println("Ingreso en cuenta");
	            cuenta1.ingresar(695);
	            System.out.println("El saldo actual es: " + cuenta1.estado());
	        } catch (Exception e) {
	            System.out.print("Fallo al ingresar");
	        }
	    }
}
