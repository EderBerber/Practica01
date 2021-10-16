/**
 * Interfaz Servicio, que tiene un solo método cobrar.
 * @author Berber Gutiérrez Eder Samuel  317075292
 * @author Martínez Pardo Esaú  317055681
 * @version 1.0 Octubre 2021
 * @since practica 01, Modelado y programación, 2022-1
 */
public interface Servicio{
	/**
	* Método en donde una plataforma cobra a sus clientes por el servicio que están requiriendo.
	* @return true si se cobró, false si no se pudo realizar el cobro.
	*/
	public boolean cobrar();
}