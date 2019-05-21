import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class juego {
	protected static int mov = 0;
	protected static double punt = 0;
	protected static int fil;
	protected static int col;
	protected static int contjugadas;
	protected static int golp;
	protected static int m[][] = new int[8][8];
	protected static boolean flag = false;
	protected static int niv = 5;
	protected static Scanner t = new Scanner(System.in);

	public static int[][] tablero(int niv, int tab[][], boolean flag) {
		int aux = 0, i = 0, j = 0;
		aux = niv * 3;
		// System.out.println(aux);
		int fil = 0;
		int col = 0;

	
		if (flag == false) {

			System.out.println("Recomenzar(0 1) - Nuevo(0 2) - Calificación(0 3) -  Cambiar Nivel(0 4) - Salir(0 -2)");
			System.out.println("");
			for (i = 1; i < tab.length - 1; i++) { // FILA
				for (j = 1; j < tab[0].length - 1; j++) {
					// COLUMNA
					tab[i][j] = 0;
				}
			}

			for (int z = 0; z < aux; z++) {

				do {
					fil = (int) (Math.random() * 7);
					col = (int) (Math.random() * 7);
					// System.out.println(fil);
					// System.out.println(col);
				} while (col == 0 || fil == 0);

				tab[fil][col] = tab[fil][col] + 1;
				tab[fil + 1][col] = tab[fil + 1][col] + 1;
				tab[fil][col + 1] = tab[fil][col + 1] + 1;
				tab[fil][col - 1] = tab[fil][col - 1] + 1;
				tab[fil - 1][col] = tab[fil - 1][col] + 1;

				for (i = 1; i < tab.length - 1; i++) {
					for (j = 1; j < tab[0].length - 1; j++) {
						if (tab[i][j] == 4) {
							tab[i][j] = 0;
						}
					}
				}
			}
			System.out.println();

			for (i = 1; i < tab.length - 1; i++) { // FILA
				System.out.print(" ");
				for (j = 1; j < tab[0].length - 1; j++) {
					// COLUMNA
					System.out.print("|" + tab[i][j] + "|");
				}
				System.out.println();
			}
			m = tab;
		} else {
			tab = m;
		}
		return m;
	}
	

	public static int niveles(int tab[][], int niv) {
		int opc = 5;
		int aux = 2;
		String nlvl;
		/*
		 * do { try { System.out.println("¿Desea cambiar de nivel?");
		 * System.out.println("1.-SI"); System.out.println("2.-NO"); aux = t.nextInt();
		 * } catch (Exception e) { System.out.println("ERROR AL ELEGIR EL NIVEL"); } }
		 * while (aux < 1 || aux > 2);
		 */

		if (aux == 2) {
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
			} while (opc < 1 || opc > 9);
			switch (opc) {
			case 1:
				nlvl = "Novato";
				System.out.println("Has elegido el nivel " + nlvl);
				break;
			case 2:
				nlvl = "Semi-Novato";
				System.out.println("Has elegido el nivel " + nlvl);
				break;
			case 3:
				nlvl = "Intermedio";
				System.out.println("Has elegido el nivel " + nlvl);
				break;
			case 4:
				nlvl = "Intermedio-alto";
				System.out.println("Has elegido el nivel " + nlvl);
				break;
			case 5:
				nlvl = "Alto";
				System.out.println("Has elegido el nivel " + nlvl);
				break;
			case 6:
				nlvl = "Muy Alto";
				System.out.println("Has elegido el nivel " + nlvl);
				break;
			case 7:
				nlvl = "Experto";
				System.out.println("Has elegido el nivel " + nlvl);
				break;
			case 8:
				nlvl = "Semi-Dios";
				System.out.println("Has elegido el nivel " + nlvl);
				break;
			case 9:
				nlvl = "Dios";
				System.out.println("Has elegido el nivel " + nlvl);
				break;
			}

		}

		niv = opc;
		tablero(niv, tab, flag);
		return niv;

	}

	public static int juegos(int[][] tab, int niv,int[][] m) {
		Scanner t = new Scanner(System.in);
		do {
			contjugadas++;		
			do {
				tablero(niv, tab, flag);
				flag = false;
				fil = t.nextInt();
				col = t.nextInt();
				if (fil == 0 && col == 1) {
					// RECOMENZAR
					flag = true;
					tablero(niv, tab, flag);
				}
				if (fil == 0 && col == 2) {
					// NUEVO
					tablero(niv, tab, flag);
				}
				if (fil == 0 && col == 3) {
					// CALIFICACION
					puntuacion(contjugadas, golp, niv, fil, col, punt);
				}
				if (fil == 0 && col == 4) {
					// CAMBIAR NIVEL
					niveles(tab, niv);
				}

			} while ((fil > -1 && fil < 1) || (col > 0 && col < 5));

			// CASILLA EN LA QUE GOLPEA
			
			if (tab[fil][col] == 0) {
				tab[fil][col] = 3;
				golp++;
			} else {
				if (tab[fil][col] == 1) {
					tab[fil][col] = 0;
				}
				if (tab[fil][col] == 2) {
					tab[fil][col] = 1;
				}

				if (tab[fil][col] == 3) {
					tab[fil][col] = 2;
				}
			}

			// CASILLA LADO DERECHO
			if (tab[fil][col + 1] == 0) {
				tab[fil][col + 1] = 3;
				

			} else {
				if (tab[fil][col + 1] == 1) {
					tab[fil][col + 1] = 0;
				}
				if (tab[fil][col + 1] == 2) {
					tab[fil][col + 1] = 1;
				}

				if (tab[fil][col + 1] == 3) {
					tab[fil][col + 1] = 2;
				}
			}

			// CASILLA LADO IZQUIERDO
			if (tab[fil][col - 1] == 0) {
				tab[fil][col - 1] = 3;

			} else {
				if (tab[fil][col - 1] == 1) {
					tab[fil][col - 1] = 0;
				}
				if (tab[fil][col - 1] == 2) {
					tab[fil][col - 1] = 1;
				}

				if (tab[fil][col - 1] == 3) {
					tab[fil][col - 1] = 2;
				}
			}

			// CASILLA ARRIBA

			if (tab[fil - 1][col] == 0) {
				tab[fil - 1][col] = 3;

			} else {
				if (tab[fil - 1][col] == 1) {
					tab[fil - 1][col] = 0;
				}
				if (tab[fil - 1][col] == 2) {
					tab[fil - 1][col] = 1;
				}

				if (tab[fil - 1][col] == 3) {
					tab[fil - 1][col] = 2;
				}
			}

			// CASILLA ABAJO
			if (tab[fil + 1][col] == 0) {
				tab[fil + 1][col] = 3;

			} else {
				if (tab[fil + 1][col] == 1) {
					tab[fil + 1][col] = 0;
				}
				if (tab[fil + 1][col] == 2) {
					tab[fil + 1][col] = 1;
				}

				if (tab[fil + 1][col] == 3) {
					tab[fil + 1][col] = 2;
				}
			}

			// COMPROBAR SI GANO
			int cont = 0;
			int i = 0, j = 0;
			for (i = 0; i < 6; i++) {

				for (j = 0; j < 6; j++) {
					if (tab[i][j] == 0) {
						cont++;

					}
				}
				if (cont == 36) {
					cont = 0;
					golp = 0;
					puntuacion(contjugadas, golp, niv, fil, col, punt);
				}

			}

		} while (fil != 0 || col != -2);
		System.out.println("Gracias por jugar :D");
		if (golp == 0) {
			punt = 0.5;
		}
		return golp;

	}

	public static double puntuacion(int contpartidas, int golpes, int fil, int col, int niv, double punt) {
		int calificacion = 0;
		double aux = punt;

		// si es la primera vez que se juega

		if (contpartidas == 1) {
			calificacion = 1;
		}

		// calculo de la puntuación de los niveles
		if (niv == 1) {
			calificacion = 3 / golpes;
		} else if (niv == 2) {
			calificacion = 6 / golpes;
		} else if (niv == 3) {
			calificacion = 9 / golpes;
		} else if (niv == 4) {
			calificacion = 12 / golpes;
		} else if (niv == 5) {
			calificacion = 15 / golpes;
		} else if (niv == 6) {
			calificacion = 18 / golpes;
		} else if (niv == 7) {
			calificacion = 21 / golpes;
		} else if (niv == 8) {
			calificacion = 24 / golpes;
		} else if (niv == 9) {
			calificacion = 27 / golpes;
		}

		// abandono juego
		if (fil == 0 && col == -2 & golpes == 0) {
			calificacion = 0;
		}
		if (fil == 0 && col == -2 & golpes > 0) {
			calificacion = 1;
		}

		punt += calificacion;

		if (punt > aux) {
			File archivo = new File("archivo.txt");
			BufferedWriter bw = null;

			System.out.println(aux);
			try {
				if (archivo.exists()) {
					// El fichero existe
					bw = new BufferedWriter(new FileWriter("archivo.txt"));
					bw.write("El fichero de texto ya esta creado");
					bw.write((int) aux);
				} else {
					// El fichero no existe y hay que crearlo
					bw = new BufferedWriter(new FileWriter("archivo.txt"));
					bw.write("Acabo de crear el fichero de texto");
					bw.write("El fichero de texto ya esta creado");
					bw.write((int) aux);
				}
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					bw.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		}
		return punt;
	}

	public static void mensaje(int niv, int golp) {
		int aux;

		aux = niv * 3;

		if (golp == aux) {
			System.out.println("Perfecto. Hecho en " + golp + " golpes");
		} else {
			if (golp < aux) {
				System.out.println("Extraordinariamente bien. Hecho en " + golp + " golpes");
			} else {
				System.out.println("Hecho en " + golp + " golpes");
			}
		}
	}
}
