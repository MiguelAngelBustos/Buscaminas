import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class juego {
	protected static int mov = 0;
	protected static double punt = 0;
	protected static int fil;
	protected static int col;
	protected static int contjugadas;
	protected static double golp;
	protected static int m[][] = new int[8][8];
	protected static boolean flag = false;
	protected static int niv;
	protected static String nlvl = "Alto";
	protected static Scanner t = new Scanner(System.in);
	protected static boolean flagtab = false;
	protected static double v[] = new double [9];
	
	/*
	 * 
	 */
	public static int[][] tablero(int tab[][], boolean flag) {
		int aux = 0, i = 0, j = 0;
		aux = niv * 3;
		// System.out.println(aux);
		int fil = 0;
		int col = 0;

		if (flag == false) {

			for (i = 1; i < tab.length - 1; i++) { // FILA
				for (j = 1; j < tab[0].length - 1; j++) {
					// COLUMNA
					tab[i][j] = 0;
				}
			}

			// GENERA LAS POSICIONES RANDOM
			for (int z = 0; z < aux; z++) {

				do {
					fil = (int) (Math.random() * 7);
					col = (int) (Math.random() * 7);
					// System.out.println(fil);
					// System.out.println(col);
				} while (col == 0 || fil == 0);

				// POSICIONES DE ARRIBA ABAJO IZQUIERDA Y DERECHA
				tab[fil][col] = tab[fil][col] + 1;
				tab[fil + 1][col] = tab[fil + 1][col] + 1;
				tab[fil][col + 1] = tab[fil][col + 1] + 1;
				tab[fil][col - 1] = tab[fil][col - 1] + 1;
				tab[fil - 1][col] = tab[fil - 1][col] + 1;

				// CAMBIAR LOS NUMEROS QUE SEAN IGUAL A CUATRO EN CEROS
				for (i = 1; i < tab.length - 1; i++) {
					for (j = 1; j < tab[0].length - 1; j++) {
						if (tab[i][j] == 4) {
							tab[i][j] = 0;

						}

						// GUARDA TAB EN UNA MATRIZ M
						m[i][j] = tab[i][j];
					}
				}
			}
			System.out.println();

		} else {

			// SOBREESCRIBIR LA MATRIZ TAB PARA RECOMENZAR
			for (i = 1; i < tab.length - 1; i++) {
				for (j = 1; j < tab[0].length - 1; j++) {
					tab[i][j] = m[i][j];
				}
			}
		}
		return tab;
	}

	
	/*
	 * 
	 */
	public static void JuegaTablero(int tab[][], double punt) {

		// PINTA LA MATRIZ TAB (EN LA QUE SE JUEGA)
		System.out.println("");
		System.out.println("Recomenzar(0 1) - Nuevo(0 2) - Calificación(0 3) -  Cambiar Nivel(0 4) - Salir(0 -2)");
		System.out.println("");
		if (flagtab == false) {

			System.out.println("┌───┬───┬───┬───┬───┬───┐");
			System.out.println("│ " + tab[1][1] + " │ " + tab[1][2] + " │ " + tab[1][3] + " │ " + tab[1][4] + " │ "
					+ tab[1][5] + " │ " + tab[1][6] + " │");
			System.out.println("├───┼───┼───┼───┼───┼───┤");
			System.out.println("│ " + tab[2][1] + " │ " + tab[2][2] + " │ " + tab[2][3] + " │ " + tab[2][4] + " │ "
					+ tab[2][5] + " │ " + tab[2][6] + " │");
			System.out.println("├───┼───┼───┼───┼───┼───┤");
			System.out.println("│ " + tab[3][1] + " │ " + tab[3][2] + " │ " + tab[3][3] + " │ " + tab[3][4] + " │ "
					+ tab[3][5] + " │ " + tab[3][6] + " │");
			System.out.println("├───┼───┼───┼───┼───┼───┤");
			System.out.println("│ " + tab[4][1] + " │ " + tab[4][2] + " │ " + tab[4][3] + " │ " + tab[4][4] + " │ "
					+ tab[4][5] + " │ " + tab[4][6] + " │");
			System.out.println("├───┼───┼───┼───┼───┼───┤");
			System.out.println("│ " + tab[5][1] + " │ " + tab[5][2] + " │ " + tab[5][3] + " │ " + tab[5][4] + " │ "
					+ tab[5][5] + " │ " + tab[5][6] + " │");
			System.out.println("├───┼───┼───┼───┼───┼───┤");
			System.out.println("│ " + tab[6][1] + " │ " + tab[6][2] + " │ " + tab[6][3] + " │ " + tab[6][4] + " │ "
					+ tab[6][5] + " │ " + tab[6][6] + " │");
			System.out.println("└───┴───┴───┴───┴───┴───┘");

			/*
			 * for (int i = 1; i < tab.length - 1; i++) { // FILA System.out.print(" "); for
			 * (int j = 1; j < tab[0].length - 1; j++) { // COLUMNA System.out.print("|" +
			 * tab[i][j] + "|"); } System.out.println(); }
			 */
			System.out.println();
			System.out.println(
					"Nivel de juego: " + nlvl + " (" + niv * 3 + " golpes)" + " \t \t Puntuacion en nivel: " + punt);
			System.out.print("Golpes realizados: " + (int) golp + "\t \t \t \t Golpe (fila columna): ");
		}
		flagtab = false;
	}

	
	/*
	 * 
	 */
	public static int niveles(int tab[][]) {

		int opc = 5;
		do {
			try {
				// TE DEJA ELEGIR EL NIVEL
				System.out.println(" ");
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

		niv = opc;
		tablero( tab, flag);
		return niv;

	}

	/*
	 * 
	 */
	public static int juegos(int[][] tab, int niv, int[][] m) {
		Scanner t = new Scanner(System.in);
		String aux;
		StringTokenizer str;
		// SALIR AL PONER EL 0 -2
		do {
			contjugadas++;
			flag = false;
			do {
				try {

					JuegaTablero(tab, punt);
					aux = t.nextLine();
					str = new StringTokenizer(aux);

					fil = Integer.parseInt(str.nextToken());
					col = Integer.parseInt(str.nextToken());
					golp++;
				} catch (Exception e) {
					System.out.println("Error.");
					System.out.println("Introduce un numero valido");
					System.out.println();
				}

				if((fil < -1 || fil>6) || (col < 2 || col>6) && col !=-2) {
					System.out.println("Error");
					System.out.println("El número de filas y columnas tiene que ser entre 1 y 6");
					golp--;
					
					
				}
			} while ((fil < -1 || fil > 6) || (col < -2 || col > 6) || col == -1);
			if (fil == 0 && col == 1) {
				// RECOMENZAR
				flag = true;
				golp = 0;
				punt = 0;
				tablero(tab, flag);
			}
			if (fil == 0 && col == 2) {
				// NUEVO
				golp = 0;
				punt = 0;
				tablero(tab, flag);
			}
			if (fil == 0 && col == 3) {
				// CALIFICACION
				golp--;
				calificacion(contjugadas, fil, col);
			}
			if (fil == 0 && col == 4) {
				// CAMBIAR NIVEL
				golp = 0;
				punt = 0;
				niveles(tab);
			}

			if (fil != 0) {

				// CASILLA EN LA QUE GOLPEA

				if (tab[fil][col] == 0) {
					tab[fil][col] = 3;
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
				puntuacion(niv, fil, col);
			}

			// COMPROBAR SI GANO
			int cont = 0;
			int i = 1, j = 1;
			for (i = 1; i < 7; i++) {
				for (j = 1; j < 7; j++) {
					if (tab[i][j] == 0) {
						cont++;

					}
				}
				if (cont == 36) {
					mensaje(niv, golp);
					cont = 0;
					golp = 0;

				}

			}

		} while (fil != 0 || col != -2);
		System.out.println("Gracias por jugar :D");
		if (golp == 0) {
			punt = 0.5;
		}
		return (int) golp;

	}


	/*
	 * 
	 */
	public static double puntuacion(int contpartidas, int fil, int col) {

		int contadorjug = 0;
		
		while (golp > 0 && contadorjug == 0) {
			// calculo de la puntuación de los niveles
			// los golpes recomendados son el numero del nivel por 3
			if (niv == 1) {
				v[0] = 3 / golp;
			} else if (niv == 2) {
				v[1] = 6 / golp;
			} else if (niv == 3) {
				v[2] = 9 / golp;
			} else if (niv == 4) {
				v[3] = 12 / golp;
			} else if (niv == 5) {
				v[4] = 15 / golp;
			} else if (niv == 6) {
				v[5] = 18 / golp;
			} else if (niv == 7) {
				v[6] = 21 / golp;
			} else if (niv == 8) {
				v[7] = 24 / golp;
			} else if (niv == 9) {
				v[8] = 27 / golp;
			}
			contadorjug++;
			
			punt = v[niv]; 
			
		}
		return punt;

	}
	
	
	public static double calificacion(int contpartidas, int fil, int col) {
		double calificacion = 0;
		double aux = punt;

		// si es la primera vez que se juega
		if (contpartidas == 1) {
			calificacion = 1;
		}

		// abandono juego
		if (fil == 0 && col == -2 && golp == 0) {
			calificacion = 0.5;
		}
		if (fil == 0 && col == -2 && golp > 0) {
			calificacion = 1;
		}
		System.out.println("----------------");
		System.out.println("Calificaciones: ");
		System.out.println("----------------");
		
		System.out.println("Novato: " +v[0]);
		System.out.println("Semi-Novato: "+v[1]);
		System.out.println("Intermedio: "+v[2]);
		System.out.println("Intermedio-Alto: " +v[3]);
		System.out.println("Alto: " +v[4]);
		System.out.println("Muy Alto: "+v[5]);
		System.out.println("Experto: "+v[6]);
		System.out.println("Semi-Dios: "+v[7]);
		System.out.println("Dios: "+v[8]);
		

		if (punt > aux) {
			File archivo = new File("archivo.txt");
			BufferedWriter bw = null;

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

	
	/*
	 * 
	 */
	public static void mensaje(int niv, double golp) {
		int aux;

		aux = niv * 3;

		if (golp == aux) {
			System.out.println(" ");
			System.out.println("Perfecto. Hecho en " + (int) golp + " golpes");
		} else {
			if (golp < aux) {
				System.out.println(" ");
				System.out.println("Extraordinariamente bien. Hecho en " + (int) golp + " golpes");
			} else {
				System.out.println(" ");
				System.out.println("Hecho en " + (int) golp + " golpes");
			}
		}
		int contpartidas = 0;
		contpartidas++;
		flagtab = true;
		puntuacion(contpartidas, aux, (int) golp);

	}
}