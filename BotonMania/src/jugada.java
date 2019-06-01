
/**
 * Esta clase define los metodos con los que se trabajan en el juego ButtonMania
 * 
 * @author Luis Antonio Gilarte Lopez
 * @author Miguel Angel Bustos Simon
 * @author Jorge Garcia Castilla
 * @author Adrian Ramos Robles
 */

public class jugada extends juego {
	/*
	 * 
	 */
	public static void main(String[] args) {
		int[][] tab = new int[8][8];
		niv = 5;

		
		
		for (int x = 0; x > vb.length; x++) {
			vb[x] = false;
		}

		tablero(tab);
		juegos(tab);
		puntuacion();
		mensaje();
	}
}