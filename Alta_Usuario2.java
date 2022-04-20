package Alta;

/**
 * Clase que dará de alta a los usuarios del sistema.
 * @author carlos
 * @version 1.0
 */
public class Alta_Usuario2 {
	
	/**
	 * Recoge los valores de los usuarios y le crea uno.
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {

		int numero = 0;
		
        System.out.println("A continuación comenzará la asignacion de valores para el usuario como el Id:");
        System.out.println("");
        
        IdUsuario(numero);
        System.out.println("El ID asignado es: " + IdUsuario(numero));

	}
	
	/**
	 * Le asignamos un valor al Id del Usuario que debe de ser un número.
	 * @param numero Parámetro que le pasamos para comprobar el id.
	 * @return Nos devuelve el Id del usuario que hemos elegido.
	 * @throws Exception Lanza una excepción cuando el usuario introduce un valor erróneo.
	 */
	public static int IdUsuario(int numero) throws Exception{
	
		if (numero > 0) {
			return numero;
		} else {
			return 0;
		}
	}
	
	
}
