
/**
 * Esta clase define los metodos con los que se trabajan en el juego ButtonMania
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
		
		for(int z = 0; z<v.length;z++) {
			v[z]=1;
		}
		
		tablero( tab);
		juegos(tab);
		puntuacion();
		mensaje();
	}
}