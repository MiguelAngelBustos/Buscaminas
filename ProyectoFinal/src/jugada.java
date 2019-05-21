
public class jugada extends juego{

	public static void main(String[] args) {
		int[][] tab = new int[8][8];
		
		jugada uno = new jugada();
		uno.tablero(niv, tab, flag);
		
			juegos(tab, niv);
			puntuacion(contjugadas,golp,fil,col,niv, punt);
			mensaje(niv, golp);
	}
}