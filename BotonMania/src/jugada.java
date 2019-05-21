public class jugada extends juego{

	public static void main(String[] args) {
		int[][] tab = new int[8][8];
		
			juegos(tab, niv,m);
			puntuacion(contjugadas,golp,fil,col,niv, punt);
			mensaje(niv, golp);
	}
}