import java.util.Scanner;

public class juego {
	protected static int mov = 0;
	protected static double punt = 0;
	protected static int fil;
	protected static int col;
	protected static int[][] tab = new int[7][7];
	//protected static int niv;
	protected static Scanner t = new Scanner(System.in);

	juego() {

	}

	public static void tablero(int niv, char m[][]) {
		int aux = 0, i = 0, j = 0;
		aux = niv * 3;
		int fil = 0;
		int col = 0;
		for (i = 1; i < m.length - 1; i++) { // FILA
			System.out.print(" ");
			for (j = 1; j < m[0].length - 1; j++) {
				// COLUMNA
				m[i][j] = '0';
				System.out.print("|" + m[i][j] + "|");
			}
			System.out.println();
		}
		for (i = 0; i < aux; i++) {

			fil = (int) (Math.random() * 7);
			col = (int) (Math.random() * 7);

			m[fil][col] = +1;
			m[fil + 1][col] = +1;
			m[fil][col + 1] = +1;
			m[fil][col - 1] = +1;
			m[fil - 1][col] = +1;

			for (i = 1; i < m.length - 1; i++) { // FILA

				for (j = 1; j < m[0].length - 1; j++) {
					if (m[i][j] == 3) {
						m[i][j] = 0;
					}

				}

			}
		}
	}

	public static int niveles(int niv) {
		int opc = 5;
		int aux = 2;
		String nlvl;
		do {
		try {
			System.out.println("¿Desea cambiar de nivel?");
			System.out.println("1.-SI");
			System.out.println("2.-NO");
			aux = t.nextInt();
		} catch (Exception e) {
			System.out.println("ERROR AL ELEGIR EL NIVEL");
		}
		}while(aux!=1 || aux!=2);
		
		if (aux == 1) {
			do {
				try {
					System.out.println("¿Que nivel desea?");
					System.out.println("1.-NOVATO");
					System.out.println("2.-SEMI-NOVATO");
					System.out.println("3.-INTERMEDIO");
					System.out.println("4.-INTERMEDIO-ALTO");
					System.out.println("5.-ALTO");
					System.out.println("6.-MUY ALTO");
					System.out.println("7.-EXPERTO");
					System.out.println("8.-SEMI-DIOS");
					System.out.println("9.-DIOS");
					opc = t.nextInt();
				} catch (Exception e) {
					System.out.println("ERROR AL ELEGIR EL NIVEL");
				}
				}while(opc<1 || opc>9);
			switch(opc) {
			case 1:
				nlvl = "Novato";
				break;
			case 2:
				nlvl = "Semi-Novato";
				break;
			case 3:
				nlvl = "Intermedio";
				break;
			case 4:
				nlvl = "Intermedio-alto";
				break;
			case 5:
				nlvl = "Alto";
				break;
			case 6:
				nlvl = "Muy Alto";
				break;
			case 7:
				nlvl = "Experto";
				break;
			case 8:
				nlvl = "Semi-Dios";
				break;
			case 9:
				nlvl = "Dios";
				break;
			}
		}

		niv = opc;
		return niv;
	}

	public static void juegos() {

	}

	public static void puntuacion() {

	}

	public static void mensaje(int niv) {
		int punt;
		int golp;
		int aux;
	}
}
