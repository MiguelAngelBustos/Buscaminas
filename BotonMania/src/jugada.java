public class jugada extends juego {

	public static void main(String[] args) {
		int[][] tab = new int[8][8];
		tablero(niv, tab, flag);
		juegos(tab, niv, m);
		puntuacion(contjugadas, fil, col);
		mensaje(niv, golp);
	}
}