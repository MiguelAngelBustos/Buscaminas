import java.util.Scanner;

public class juego {
	protected static int mov = 0;
	protected static double punt = 0;
	protected static int fil;
	protected static int col;
	protected static int contjugada=0,golp=0;
	//protected static int niv;
	protected static Scanner t = new Scanner(System.in);

	

	public static void tablero(int [][] tab,int niv) {
		System.out.println("");
		System.out.println("");
		for (int i = 0; i < tab.length-1; i++) {
			for (int j = 0; j < tab[0].length-1; j++) {

				System.out.print("|" + tab[i][j] + "|");

			}
			System.out.println("");
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

	public static int juegos(int[][] tab, int niv) {		
		
		 Scanner t = new Scanner(System.in);
		do {
			contjugada++;
		 do {
		 fil=t.nextInt();
		 col=t.nextInt();
		 if(fil==0 && col==1) {
			//RECOMENZAR
 }
		 if(fil==0 && col==2) {
			 //NUEVO
			 tablero(tab,niv);
 }
		 if(fil==0 && col==3) {
			 //CALIFICACION
			 puntuacion(contjugada,golp,niv);
 }
		 if(fil==0 && col==4) {
			 //CAMBIAR NIVEL
			 niveles(niv);
 }
		 
		 }while(fil<-1 || col<-1);{	
				 
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
		
		//CASILLA LADO DERECHO
		if (tab[fil][col+1] == 0) {
			tab[fil][col+1] = 3;
			
		} else {
			if (tab[fil][col+1] == 1) {
				tab[fil][col+1] = 0;
			}
			if (tab[fil][col+1] == 2) {
				tab[fil][col+1] = 1;
			}

			if (tab[fil][col+1] == 3) {
				tab[fil][col+1] = 2;
			}
		}
		
		
		//CASILLA LADO IZQUIERDO
		if (tab[fil][col-1] == 0) {
			tab[fil][col-1] = 3;
			
		} else {
			if (tab[fil][col-1] == 1) {
				tab[fil][col-1] = 0;
			}
			if (tab[fil][col-1] == 2) {
				tab[fil][col-1] = 1;
			}

			if (tab[fil][col-1] == 3) {
				tab[fil][col-1] = 2;
			}
		}
		
		//CASILLA ARRIBA
		
		if (tab[fil-1][col] == 0) {
			tab[fil-1][col] = 3;
			
		} else {
			if (tab[fil-1][col] == 1) {
				tab[fil-1][col] = 0;
			}
			if (tab[fil-1][col] == 2) {
				tab[fil-1][col] = 1;
			}

			if (tab[fil-1][col] == 3) {
				tab[fil-1][col] = 2;
			}
		}
		
		
		//CASILLA ABAJO
		if (tab[fil+1][col] == 0) {
			tab[fil+1][col] = 3;
			
		} else {
			if (tab[fil+1][col] == 1) {
				tab[fil+1][col] = 0;
			}
			if (tab[fil+1][col] == 2) {
				tab[fil+1][col] = 1;
			}

			if (tab[fil+1][col] == 3) {
				tab[fil+1][col] = 2;
			}
		}
		
		
		
		// COMPROBAR SI GANO
		int cont=0;
		int i=0,j=0;
		for(i=0;i<6;i++) {
		
			for(j=0;j<6;j++) {
			if(tab[i][j]==0) {
				cont++;
				
			}
		}
		if(cont==36) {
			cont=0;
			golp=0;
			puntuacion(contjugada,golp,niv);			
		}	
			
		}
		 }
		}while(fil!=0 || col!=-2); {
			System.out.println("Gracias por jugar :D");
		}
		return golp;
		
	}

	public static void puntuacion(int contjugada, int contpuls,int niv) {

	}

	public static void mensaje(int niv) {
		int punt;
		int golp;
		int aux;
	}
}
