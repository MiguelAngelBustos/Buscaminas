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

		public static void tablero(char [][] m,int niv) {
			System.out.println("");
			System.out.println("");
			for (int i = 0; i < m.length-1; i++) {
				for (int j = 0; j < m[0].length-1; j++) {

					System.out.print("|" + m[i][j] + "|");

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
				System.out.println("�Desea cambiar de nivel?");
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
						System.out.println("�Que nivel desea?");
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

		public static double puntuacion(int contpartidas, int golpes, int fil, int col, int niv) {
			int calificacion=0;
			
			//si es la primera vez que se juega 
			
			
			//calculo de la puntuaci�n de los niveles
			if(niv==0){
				 calificacion = 3/golpes;
			}else if(niv==0){
				 calificacion = 6/golpes;
			}else if(niv==1){
				 calificacion = 9/golpes;
			}else if(niv==2){
				 calificacion = 12/golpes;
			}else if(niv==4){
				 calificacion = 15/golpes;
			}else if(niv==5){
				 calificacion = 18/golpes;
			}else if(niv==6){
				 calificacion = 21/golpes;
			}else if(niv==7){
				 calificacion = 24/golpes;
			}else if(niv==8){
				 calificacion = 27/golpes;
			}else if(niv==9){
				 calificacion = 30/golpes;
			}
			
			//abandono juego 
			if(fil==0 && col==-2 & golpes==0){
				calificacion=0;
			}
			if(fil==0 && col==-2 & golpes>0){
				calificacion=1;
			}
			
			punt += calificacion;
			return punt;	
		}
		
		
		public static void mensaje(int niv) {
			int punt;
			int golp;
			int aux;
		}
	}
