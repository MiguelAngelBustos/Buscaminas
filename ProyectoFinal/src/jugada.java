public class jugada extends juego {

	public static void main(String[] args) {
		int[][] tab = new int[8][8];
		niv = 5;
		tablero( tab);
		juegos(tab);
		puntuacion();
		mensaje();
	}
}