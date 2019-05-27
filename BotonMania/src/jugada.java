public class jugada extends juego {

	public static void main(String[] args) {
		int[][] tab = new int[8][8];
		niv = 5;
		tablero( tab, flag);
		juegos(tab, niv, m);
		puntuacion();
		mensaje(niv, golp);
	}
}