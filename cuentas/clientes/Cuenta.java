package cuentas.clientes;

	/**
	 * Clase que representa una cuenta bancaria simple(esto es el commit).
	 * Permite realizar operaciones como ingreso, retiro y consultar saldo.
	 * Contiene información básica del titular, número de cuenta, saldo y tipo de interés.
	 * (commit)
	 * 
	 * @author Sergio
	 * @version 1.2
	 * @since 2025-05
	 */
	public class Cuenta {

	    private String nombre;
	    private String cuenta;
	    private double saldo;
	    private double tipoInteres;

	    /**
	     * Constructor por defecto. Inicializa los campos a valores por defecto.
	     */
	    public Cuenta() {
	        nombre = "";
	        cuenta = "";
	        saldo = 0;
	        tipoInteres = 0;
	    }

	    /**
	     * Constructor con parámetros para inicializar una cuenta con valores específicos.
	     * 
	     * @param nom Nombre del titular de la cuenta.
	     * @param cue Número de cuenta.
	     * @param sal Saldo inicial.
	     * @param tipo Tipo de interés aplicado a la cuenta.
	     */
	    public Cuenta(String nom, String cue, double sal, double tipo) {
	        nombre = nom;
	        cuenta = cue;
	        saldo = sal;
	        tipoInteres = tipo;
	    }

	    /**
	     * Devuelve el saldo actual de la cuenta.
	     * 
	     * @return Saldo actual.
	     */
	    public double estado() {
	        return saldo;
	    }

	    /**
	     * Ingresa dinero en la cuenta.
	     * 
	     * @param cantidad Cantidad a ingresar.
	     * @throws Exception si la cantidad es negativa.
	     */
	    public void ingresar(double cantidad) throws Exception {
	        if (cantidad < 0)
	            throw new Exception("No se puede ingresar una cantidad negativa");
	        saldo = saldo + cantidad;
	    }

	    /**
	     * Retira una cantidad de la cuenta.
	     * 
	     * @param cantidad Cantidad a retirar.
	     * @throws Exception si la cantidad es negativa o no hay saldo suficiente.
	     */
	    public void retirar(double cantidad) throws Exception {
	        if (cantidad <= 0)
	            throw new Exception("No se puede retirar una cantidad negativa");
	        if (estado() < cantidad)
	            throw new Exception("No hay suficiente saldo");
	        saldo = saldo - cantidad;
	    }

	    /**
	     * Obtiene el nombre del titular.
	     * 
	     * @return Nombre del titular.
	     */
	    public String getNombre() {
	        return nombre;
	    }

	    /**
	     * Establece el nombre del titular.
	     * 
	     * @param nombre Nombre del titular.
	     */
	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    /**
	     * Obtiene el número de cuenta.
	     * 
	     * @return Número de cuenta.
	     */
	    public String getCuenta() {
	        return cuenta;
	    }

	    /**
	     * Establece el número de cuenta.
	     * 
	     * @param cuenta Número de cuenta.
	     */
	    public void setCuenta(String cuenta) {
	        this.cuenta = cuenta;
	    }

	    /**
	     * Obtiene el saldo actual.
	     * 
	     * @return Saldo actual.
	     */
	    public double getSaldo() {
	        return saldo;
	    }

	    /**
	     * Establece el saldo de la cuenta.
	     * 
	     * @param saldo Nuevo saldo.
	     */
	    public void setSaldo(double saldo) {
	        this.saldo = saldo;
	    }

	    /**
	     * Obtiene el tipo de interés.
	     * 
	     * @return Tipo de interés.
	     */
	    public double getTipoInteres() {
	        return tipoInteres;
	    }

	    /**
	     * Establece el tipo de interés.
	     * 
	     * @param tipoInteres Tipo de interés.
	     */
	    public void setTipoInteres(double tipoInteres) {
	        this.tipoInteres = tipoInteres;
	    }
	}
