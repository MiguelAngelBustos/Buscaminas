
/**
 * Esta clase define los metodos con los que se trabajan en el juego ButtonMania
 * 
 * @author Gilarte Lopez Luis Antonio
 * @author Bustos Simon Miguel Angel
 * @author Garcia Castilla Jorge 
 * @author Ramos Robles Adrian
 */

public class jorcasgar extends juego {
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