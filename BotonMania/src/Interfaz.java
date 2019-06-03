import java.awt.event.*;
import java.util.Scanner;

import javax.swing.*;


public class Interfaz {
	protected static Scanner t = new Scanner(System.in);
protected static boolean flagtab = false;
protected static boolean flag = false;
protected static double punt = 1;
protected static int m[][] = new int[8][8];
protected static int[][] tab = new int[8][8];
protected static int niv=5;
protected static String nlvl = "Normal";
protected static double golp=0;
protected static int fil;
protected static int col;
public static JButton[] botones = new JButton[36];
public static JLabel golpes = new JLabel();
public static JLabel nivel = new JLabel();
public static JLabel puntuacion = new JLabel();
protected static double v[] = new double[9];
protected static boolean vb[] = new boolean[9];

	public static void main (String [] args) {
		
		tablero(tab);
		JuegaTablero(tab);
		// CREAMOS EL PANEL 
		JPanel panel = new JPanel ();
		panel.setLayout(null);
					
		
		
		
		
		
		nivel.setText("Nivel de juego: "+nlvl);
		nivel.setBounds(150, 360, 200, 50);
		puntuacion.setText("Puntuación en nivel: "+punt);
		puntuacion.setBounds(500, 360, 200, 50);
		golpes.setText("Golpes realizados: "+ (int)golp);		
		golpes.setBounds(150, 400, 200, 50);
		
		
		
		//CREAMOS EL TABLERO
		
		JButton recomenzar = new JButton("Recomenzar");
		recomenzar.setBounds(100, 10, 120, 40);
		JButton nuevo = new JButton("Nuevo");
		nuevo.setBounds(230, 10, 120, 40);
		JButton calificacion = new JButton("Calificación");
		calificacion.setBounds(360, 10, 120, 40);
		JButton cambiarn = new JButton("Cambiar Nivel");
		cambiarn.setBounds(490, 10, 120, 40);
		JButton salir = new JButton("Salir");
		salir.setBounds(620, 10, 120, 40);

		//fila 1
		String t11 = Integer.toString(tab[1][1]);
		botones[0] = new JButton();
		botones[0].setText(t11);
		botones[0].setBounds(250, 60, 50, 50);

		
		
String t12 = Integer.toString(tab[1][2]);
		botones[1] = new JButton();
		botones[1].setText(t12);
		botones[1].setBounds(300, 60, 50, 50);
		
		
String t13 = Integer.toString(tab[1][3]);
		botones[2] = new JButton();
		botones[2].setText(t13);
		botones[2].setBounds(350, 60, 50, 50);		
		
String t14 = Integer.toString(tab[1][4]);
		botones[3] = new JButton();
		botones[3].setText(t14);
		botones[3].setBounds(400, 60, 50, 50);	

String t15 = Integer.toString(tab[1][5]);
		botones[4] = new JButton();
		botones[4].setText(t15);
		botones[4].setBounds(450, 60, 50, 50);		
		
String t16 = Integer.toString(tab[1][6]);
		botones[5] = new JButton();
		botones[5].setText(t16);
		botones[5].setBounds(500, 60, 50, 50);				
	
String t21 = Integer.toString(tab[2][1]);
		botones[6] = new JButton();
		botones[6].setText(t21);
		botones[6].setBounds(250,110, 50, 50);		

String t22 = Integer.toString(tab[2][2]);
		botones[7] = new JButton();
		botones[7].setText(t22);
		botones[7].setBounds(300,110, 50, 50);		

String t23 = Integer.toString(tab[2][3]);
		botones[8] = new JButton();
		botones[8].setText(t23);
		botones[8].setBounds(350,110, 50, 50);		
		
String t24 = Integer.toString(tab[2][4]);
		botones[9] = new JButton();
		botones[9].setText(t24);
		botones[9].setBounds(400,110, 50, 50);	
		
String t25 = Integer.toString(tab[2][5]);
		botones[10] = new JButton();
		botones[10].setText(t25);
		botones[10].setBounds(450,110, 50, 50);	

String t26 = Integer.toString(tab[2][6]);
		botones[11] = new JButton();
		botones[11].setText(t26);
		botones[11].setBounds(500,110, 50, 50);	

String t31 = Integer.toString(tab[3][1]);
		botones[12] = new JButton();
		botones[12].setText(t31);
		botones[12].setBounds(250,160, 50, 50);	
		
String t32 = Integer.toString(tab[3][2]);
		botones[13] = new JButton();
		botones[13].setText(t32);
		botones[13].setBounds(300,160, 50, 50);

String t33 = Integer.toString(tab[3][3]);
		botones[14] = new JButton();
		botones[14].setText(t33);
		botones[14].setBounds(350,160, 50, 50);		

String t34 = Integer.toString(tab[3][4]);
		botones[15] = new JButton();
		botones[15].setText(t34);
		botones[15].setBounds(400,160, 50, 50);			

String t35 = Integer.toString(tab[3][5]);
		botones[16] = new JButton();
		botones[16].setText(t35);
		botones[16].setBounds(450,160, 50, 50);
		
String t36 = Integer.toString(tab[3][6]);
		botones[17] = new JButton();
		botones[17].setText(t36);
		botones[17].setBounds(500,160, 50, 50);		

String t41 = Integer.toString(tab[4][1]);
		botones[18] = new JButton();
		botones[18].setText(t41);
		botones[18].setBounds(250,210, 50, 50);		

String t42 = Integer.toString(tab[4][2]);
		botones[19] = new JButton();
		botones[19].setText(t42);
		botones[19].setBounds(300,210, 50, 50);

String t43 = Integer.toString(tab[4][3]);
		botones[20] = new JButton();
		botones[20].setText(t43);
		botones[20].setBounds(350,210, 50, 50);
		
String t44 = Integer.toString(tab[4][4]);
		botones[21] = new JButton();
		botones[21].setText(t44);
		botones[21].setBounds(400,210, 50, 50);	

String t45 = Integer.toString(tab[4][5]);
		botones[22] = new JButton();
		botones[22].setText(t45);
		botones[22].setBounds(450,210, 50, 50);	

String t46 = Integer.toString(tab[4][6]);
		botones[23] = new JButton();
		botones[23].setText(t46);
		botones[23].setBounds(500,210, 50, 50);	

String t51 = Integer.toString(tab[5][1]);
		botones[24] = new JButton();
		botones[24].setText(t51);
		botones[24].setBounds(250,260, 50, 50);	

String t52 = Integer.toString(tab[5][2]);
		botones[25] = new JButton();
		botones[25].setText(t52);
		botones[25].setBounds(300,260, 50, 50);

String t53 = Integer.toString(tab[5][3]);
		botones[26] = new JButton();
		botones[26].setText(t53);
		botones[26].setBounds(350,260, 50, 50);		
		
String t54 = Integer.toString(tab[5][4]);
		botones[27] = new JButton();
		botones[27].setText(t54);
		botones[27].setBounds(400,260, 50, 50);
		
String t55 = Integer.toString(tab[5][5]);
		botones[28] = new JButton();
		botones[28].setText(t55);
		botones[28].setBounds(450,260, 50, 50);	

String t56 = Integer.toString(tab[5][6]);
		botones[29] = new JButton();
		botones[29].setText(t56);
		botones[29].setBounds(500,260, 50, 50);	

String t61 = Integer.toString(tab[6][1]);
		botones[30] = new JButton();
		botones[30].setText(t61);
		botones[30].setBounds(250,310, 50, 50);	

String t62 = Integer.toString(tab[6][2]);
		botones[31] = new JButton();
		botones[31].setText(t62);
		botones[31].setBounds(300,310, 50, 50);
		
String t63 = Integer.toString(tab[6][3]);
		botones[32] = new JButton();
		botones[32].setText(t63);
		botones[32].setBounds(350,310, 50, 50);		

String t64 = Integer.toString(tab[6][4]);
		botones[33] = new JButton();
		botones[33].setText(t64);
		botones[33].setBounds(400,310, 50, 50);			

String t65 = Integer.toString(tab[6][5]);
		botones[34] = new JButton();
		botones[34].setText(t65);
		botones[34].setBounds(450,310, 50, 50);	
		
String t66 = Integer.toString(tab[6][6]);
		botones[35] = new JButton();
		botones[35].setText(t66);
		botones[35].setBounds(500,310, 50, 50);	
		
	
		
		//CREAMOS LA VENTANA
		JFrame ventana = new JFrame();
		ventana.setTitle ("juego");
		ventana.setLocation(200,200);
		ventana.setSize(800,500);
		
		//AÑADIMOS A LA VENTANA
		panel.add(recomenzar);
		panel.add(nuevo);
		panel.add(calificacion);
		panel.add(cambiarn);
		panel.add(salir);
		panel.add(botones[0]);
		panel.add(botones[1]);
		panel.add(botones[2]);
		panel.add(botones[3]);
		panel.add(botones[4]);
		panel.add(botones[5]);
		panel.add(botones[6]);
		panel.add(botones[7]);
		panel.add(botones[8]);
		panel.add(botones[9]);
		panel.add(botones[10]);
		panel.add(botones[10]);
		panel.add(botones[11]);
		panel.add(botones[12]);
		panel.add(botones[13]);
		panel.add(botones[14]);
		panel.add(botones[15]);
		panel.add(botones[16]);
		panel.add(botones[17]);
		panel.add(botones[18]);
		panel.add(botones[19]);
		panel.add(botones[20]);
		panel.add(botones[21]);
		panel.add(botones[22]);
		panel.add(botones[23]);
		panel.add(botones[24]);
		panel.add(botones[25]);
		panel.add(botones[26]);
		panel.add(botones[27]);
		panel.add(botones[28]);
		panel.add(botones[29]);
		panel.add(botones[30]);
		panel.add(botones[31]);
		panel.add(botones[32]);
		panel.add(botones[33]);
		panel.add(botones[34]);
		panel.add(botones[35]);
		panel.add(nivel);
		panel.add(puntuacion);
		panel.add(golpes);
		
		
		//HACEMOS QUE CONTENGA PANEL Y LA HACEMOS VISIBLE
		ventana.setContentPane(panel);
		ventana.setVisible(true);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	
		
		
		
		//LAS ACCIONES DE LOS BOTONES
		
		//JUEGO
	//tab11
		botones[0].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				this.tab11();
				
			}
			
			public void tab11() {
				int aux=1,aux2=1;
				golp++;
				jugar(tab,aux,aux2);
				mostrartab();
				comprobar();
				
											
			}
		
			
			
		});
		
		
		
		//tab12
				botones[1].addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						this.tab12();
						
					}
					
					public void tab12() {
						int aux=1,aux2=2;
						golp++;
						jugar(tab,aux,aux2);
						mostrartab();
						comprobar();							
					}
					
			
			
		});
		
		//tab13
			botones[2].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				this.tab13();
				
			}
			
			public void tab13() {
				int aux=1,aux2=3;
				golp++;
				jugar(tab,aux,aux2);
				mostrartab();
				comprobar();
			
			}
			
			
		});
		
		//tab14
			botones[3].addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						this.tab14();
					
					}
					
					public void tab14() {
						int aux=1,aux2=4;
						golp++;
						jugar(tab,aux,aux2);
						mostrartab();
						comprobar();
					}
					
					
				});
				//tab15
			botones[4].addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						this.tab15();
					
					}
					
					public void tab15() {
						int aux=1,aux2=5;
						golp++;
						jugar(tab,aux,aux2);
						mostrartab();
						comprobar();
					}
					
					
				});
				//tab16
			botones[5].addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						this.tab16();
					
					}
					
					public void tab16() {
						int aux=1,aux2=6;
						golp++;
						jugar(tab,aux,aux2);
						mostrartab();
						comprobar();
					}
					
					
				});
				//tab21
			botones[6].addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						this.tab21();
					
					}
					
					public void tab21() {
						int aux=2,aux2=1;
						golp++;
						jugar(tab,aux,aux2);
						mostrartab();
						comprobar();
					}
					
					
				});
				//tab22
			botones[7].addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						this.tab22();
					
					}
					
					public void tab22() {
						int aux=2,aux2=2;
						golp++;
						jugar(tab,aux,aux2);
						mostrartab();
						comprobar();
					}
					
					
				});
				//tab23
			botones[8].addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						this.tab23();
					
					}
					
					public void tab23() {
						int aux=2,aux2=3;
						golp++;
						jugar(tab,aux,aux2);
						mostrartab();
						comprobar();
					}
					
					
				});
				//tab24
			botones[9].addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						this.tab24();
					
					}
					
					public void tab24() {
						int aux=2,aux2=4;
						golp++;
						jugar(tab,aux,aux2);
						mostrartab();
						comprobar();
					}
					
					
				});
				//tab25
			botones[10].addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						this.tab25();
					
					}
					
					public void tab25() {
						int aux=2,aux2=5;
						golp++;
						jugar(tab,aux,aux2);
						mostrartab();
						comprobar();
					}
					
					
				});
				//tab26
			botones[11].addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						this.tab26();
					
					}
					
					public void tab26() {
						int aux=2,aux2=6;
						golp++;
						jugar(tab,aux,aux2);
						mostrartab();
						comprobar();
					}
					
					
				});
				
				//tab31
			botones[12].addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						this.tab31();
					
					}
					
					public void tab31() {
						int aux=3,aux2=1;
						golp++;
						jugar(tab,aux,aux2);
						mostrartab();
						comprobar();
					}
					
					
				});
				//tab32
				botones[13].addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						this.tab32();
					
					}
					
					public void tab32() {
						int aux=3,aux2=2;
						golp++;
						jugar(tab,aux,aux2);
						mostrartab();
						comprobar();
					}
					
					
				});
				//tab33
				botones[14].addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						this.tab33();
					
					}
					
					public void tab33() {
						int aux=3,aux2=3;
						golp++;
						jugar(tab,aux,aux2);
						mostrartab();
						comprobar();
					}
					
					
				});
				//tab34
				botones[15].addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						this.tab34();
					
					}
					
					public void tab34() {
						int aux=3,aux2=4;
						golp++;
						jugar(tab,aux,aux2);
						mostrartab();
						comprobar();
					}
					
					
				});
				//tab35
				botones[16].addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						this.tab35();
					
					}
					
					public void tab35() {
						int aux=3,aux2=5;
						golp++;
						jugar(tab,aux,aux2);
						mostrartab();
						comprobar();
					}
					
					
				});
				//tab36
				botones[17].addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						this.tab36();
					
					}
					
					public void tab36() {
						int aux=3,aux2=6;
						golp++;
						jugar(tab,aux,aux2);
						mostrartab();
						comprobar();
					}
					
					
				});
				
				
				
				//tab41
				botones[18].addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						this.tab41();
					
					}
					
					public void tab41() {
						int aux=4,aux2=1;
						golp++;
						jugar(tab,aux,aux2);
						mostrartab();
						comprobar();
					}
					
					
				});
				//tab42
				botones[19].addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						this.tab42();
					
					}
					
					public void tab42() {
						int aux=4,aux2=2;
						golp++;
						jugar(tab,aux,aux2);
						mostrartab();
						comprobar();
					}
					
					
				});
				
				//tab43
				botones[20].addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						this.tab43();
					
					}
					
					public void tab43() {
						int aux=4,aux2=3;
						golp++;
						jugar(tab,aux,aux2);
						mostrartab();
						comprobar();
					}
					
					
				});
				//tab44
				botones[21].addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						this.tab44();
					
					}
					
					public void tab44() {
						int aux=4,aux2=4;
						golp++;
						jugar(tab,aux,aux2);
						mostrartab();
						comprobar();
					}
					
					
				});
				//tab45
				botones[22].addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						this.tab45();
					
					}
					
					public void tab45() {
						int aux=4,aux2=5;
						golp++;
						jugar(tab,aux,aux2);
						mostrartab();
						comprobar();
					}
					
					
				});
				//tab46
				botones[23].addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						this.tab46();
					
					}
					
					public void tab46() {
						int aux=4,aux2=6;
						golp++;
						jugar(tab,aux,aux2);
						mostrartab();
						comprobar();
					}
					
					
				});
				
				
				//tab51
				botones[24].addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						this.tab51();
					
					}
					
					public void tab51() {
						int aux=5,aux2=1;
						golp++;
						jugar(tab,aux,aux2);
						mostrartab();
						comprobar();
					}
					
					
				});
				//tab52
				botones[25].addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						this.tab52();
					
					}
					
					public void tab52() {
						int aux=5,aux2=2;
						golp++;
						jugar(tab,aux,aux2);
						mostrartab();
						comprobar();
					}
					
					
				});
				
				//tab53
				botones[26].addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						this.tab53();
					
					}
					
					public void tab53() {
						int aux=5,aux2=3;
						golp++;
						jugar(tab,aux,aux2);
						mostrartab();
						comprobar();
					}
					
					
				});
				//tab54
				botones[27].addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						this.tab54();
					
					}
					
					public void tab54() {
						int aux=5,aux2=4;
						golp++;
						jugar(tab,aux,aux2);
						mostrartab();
						comprobar();
					}
					
					
				});
				//tab55
				botones[28].addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						this.tab55();
					
					}
					
					public void tab55() {
						int aux=5,aux2=5;
						golp++;
						jugar(tab,aux,aux2);
						mostrartab();
						comprobar();
					}
					
					
				});
				//tab56
				botones[29].addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						this.tab56();
					
					}
					
					public void tab56() {
						int aux=5,aux2=6;
						golp++;
						jugar(tab,aux,aux2);
						mostrartab();
						comprobar();
					}
					
					
				});
				
				//tab61
				botones[30].addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						this.tab61();
						
					}
					
					public void tab61() {
						int aux=6,aux2=1;
						golp++;
						jugar(tab,aux,aux2);
						mostrartab();
						comprobar();
						
													
					}
				
					
					
				});
				//tab62
				botones[31].addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								this.tab62();
								
							}
							
							public void tab62() {
								int aux=6,aux2=2;
								golp++;
								jugar(tab,aux,aux2);
								mostrartab();
								comprobar();						
							}
							
					
					
				});
				
				//tab63
				botones[32].addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						this.tab63();
						
					}
					
					public void tab63() {
						int aux=6,aux2=3;
						golp++;
						jugar(tab,aux,aux2);
						mostrartab();
						comprobar();
					
					}
					
					
				});
				
				//tab64
				botones[33].addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								this.tab64();
							
							}
							
							public void tab64() {
								int aux=6,aux2=4;
								golp++;
								jugar(tab,aux,aux2);
								mostrartab();
								comprobar();
							}
							
							
						});
						//tab65
				botones[34].addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								this.tab65();
							
							}
							
							public void tab65() {
								int aux=6,aux2=5;
								golp++;
								jugar(tab,aux,aux2);
								mostrartab();
								comprobar();
							}
							
							
						});
						//tab66
				botones[35].addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								this.tab66();
							
							}
							
							public void tab66() {
								int aux=6,aux2=6;
								golp++;
								jugar(tab,aux,aux2);
								mostrartab();
								comprobar();
							}
							
							
						});
				
				//CLASIFICACION
				calificacion.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						this.clasi();
					
					}
					
					public void clasi() {
			/*			for (int z = 0; z > vb.length; z++) {
							if (v[z] != 0) {
								vb[z] = true;
							}
						}*/
						JPanel clasi = new JPanel ();
						clasi.setLayout(null);
						JFrame ventana5 = new JFrame();
						ventana5.setTitle ("NIVELES");
						ventana5.setLocation(300,200);
						ventana5.setSize(500,500);
						
						JLabel nivel1 = new JLabel("Huh, What: "+ v[0]);
						nivel1.setBounds(225, 60, 100, 30);
						JLabel nivel2 = new JLabel("Dumb: " + v[1]);
						nivel2.setBounds(225, 80, 100, 30);
						JLabel nivel3 = new JLabel("Real Easy: " + v[2]);
						nivel3.setBounds(225, 100, 100, 30);
						JLabel nivel4 = new JLabel("Easy: " + v[3]);
						nivel4.setBounds(225, 120, 100, 30);
						JLabel nivel5 = new JLabel("Normal: " + v[4]);
						nivel5.setBounds(225, 140, 100, 30);
						JLabel nivel6 = new JLabel("Hard: " + v[5]);
						nivel6.setBounds(225, 160, 100, 30);
						JLabel nivel7 = new JLabel("Real Hard: " + v[6]);
						nivel7.setBounds(225, 180, 100, 30);
						JLabel nivel8 = new JLabel("Master: " + v[7]);
						nivel8.setBounds(225, 200, 100, 30);
						JLabel nivel9 = new JLabel("Impossible: " + v[8]);
						nivel9.setBounds(225, 220, 100, 30);
						
						clasi.add(nivel1);
						clasi.add(nivel2);
						clasi.add(nivel3);
						clasi.add(nivel4);
						clasi.add(nivel5);
						clasi.add(nivel6);
						clasi.add(nivel7);
						clasi.add(nivel8);
						clasi.add(nivel9);
						ventana5.setContentPane(clasi);
						ventana5.setVisible(true);
						
						
						
						
						
					}
					
					
				});
				
				
				//Cambiar nivel
				
						cambiarn.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								this.cambiar();
							
							}
							
							public void cambiar() {
								JPanel nive = new JPanel ();
								nive.setLayout(null);
								JFrame ventana4 = new JFrame();
								ventana4.setTitle ("NIVELES");
								ventana4.setLocation(300,200);
								ventana4.setSize(500,500);
						
							
								
								JButton niv1 = new JButton("Huh, what?");
								niv1.setBounds(225, 60, 100, 30);
								JButton niv2 = new JButton("Dumb");
								niv2.setBounds(225, 100, 100, 30);
								JButton niv3 = new JButton("Real Easy");
								niv3.setBounds(225, 140, 100, 30);
								JButton niv4 = new JButton("Easy");
								niv4.setBounds(225, 180, 100, 30);
								JButton niv5 = new JButton("Normal");
								niv5.setBounds(225, 220, 100, 30);
								JButton niv6 = new JButton("Hard");
								niv6.setBounds(225, 260, 100, 30);
								JButton niv7 = new JButton("Real Hard");
								niv7.setBounds(225, 300, 100, 30);
								JButton niv8 = new JButton("Master");
								niv8.setBounds(225, 340, 100, 30);
								JButton niv9 = new JButton("Impossible");
								niv9.setBounds(225, 380, 100, 30);
								nive.add(niv1);
								nive.add(niv2);
								nive.add(niv3);
								nive.add(niv4);
								nive.add(niv5);
								nive.add(niv6);
								nive.add(niv7);
								nive.add(niv8);
								nive.add(niv9);
								ventana4.setContentPane(nive);
								ventana4.setVisible(true);
								niv1.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {
										this.nivel1();
									
									}
									
									public void nivel1() {
								    nlvl="Huh, what?";
									niv=1;
								    golp=0;
								    tablero(tab);
								    mostrartab();
								    ventana4.dispose();
								 
								    
									}
									
									
								});
								niv2.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {
										this.nivel2();
									
									}
									
									public void nivel2() {
									nlvl="Dumb";
									niv=2;
								    golp=0;
								    tablero(tab);
								    mostrartab();
								    ventana4.dispose();
								  
								    
									}
									
									
								});
								niv3.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {
										this.nivel3();
									
									}
									
									public void nivel3() {
									nlvl="Real Easy";
									niv=3;
								    golp=0;
								    tablero(tab);
								    mostrartab();
								    ventana4.dispose();
								  
								    
									}
									
									
								});
								niv4.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {
										this.nivel4();
									
									}
									
									public void nivel4() {
									nlvl="Easy";
									niv=4;
								    golp=0;
								    tablero(tab);
								    mostrartab();
								    ventana4.dispose();
								  
								    
									}
									
									
								});
								niv5.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {
										this.nivel5();
									
									}
									
									public void nivel5() {
									nlvl="Normal";
									niv=5;
								    golp=0;
								    tablero(tab);
								    mostrartab();
								    ventana4.dispose();
								  
								    
									}
									
									
								});
								niv6.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {
										this.nivel6();
									
									}
									
									public void nivel6() {
									nlvl="Hard";
									niv=6;
								    golp=0;
								    tablero(tab);
								    mostrartab();
								    ventana4.dispose();
								  
								    
									}
									
									
								});
								niv7.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {
										this.nivel7();
									
									}
									
									public void nivel7() {
									nlvl="Real Hard";
									niv=7;
								    golp=0;
								    tablero(tab);
								    mostrartab();
								    ventana4.dispose();
								  
								    
									}
									
									
								});
								niv8.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {
										this.nivel8();
									
									}
									
									public void nivel8() {
									nlvl="Master";
									niv=8;
								    golp=0;
								    tablero(tab);
								    mostrartab();
								    ventana4.dispose();
								  
								    
									}
									
									
								});
								niv9.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {
										this.nivel9();
									
									}
									
									public void nivel9() {
									nlvl="Impossible";
									niv=9;
								    golp=0;
								    tablero(tab);
								    mostrartab();
								    ventana4.dispose();
								  
								    
									}
									
									
								});
								
								
							}
							
							
						});		
				
				
				//Salir
				salir.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						this.salir();
					
					}
					
					public void salir() {
					ventana.dispose();
					JPanel adios = new JPanel ();
					adios.setLayout(null);
					JFrame ventana2 = new JFrame();
					ventana2.setTitle ("ADIOS");
					ventana2.setLocation(200,200);
					ventana2.setSize(300,300);
					JLabel despedida = new JLabel ("Gracias por jugar :D");
					despedida.setBounds(100, 100, 150, 50);
					adios.add(despedida);
					ventana2.setContentPane(adios);
					ventana2.setVisible(true);
					ventana2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					}
					
					
				});
		//recomenzar
		recomenzar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				this.recomenzartab();
			}
			
			public void recomenzartab() {
				flag = true;
				tablero(tab);
				mostrartab();
			
				
				flag = false;
				
					
			}
			
			
		});
		//Nuevo
		nuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				this.nuevotab();
			}
			
			public void nuevotab() {
				
				tablero(tab);
				mostrartab();
				
				flag = false;
				
					
			}
			
			
		});
	

	
		
	

	}
	
	//METODO TABLERO
	
			public static int[][] tablero (int tab[][]) {
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
			
			
			public static void mostrartab() {
				puntuacion();
				 String t11 = Integer.toString(tab[1][1]);
					botones[0].setText(t11);
					String t12 = Integer.toString(tab[1][2]);
					botones[1].setText(t12);
					String t13 = Integer.toString(tab[1][3]);
					botones[2].setText(t13);
					String t14 = Integer.toString(tab[1][4]);
					botones[3].setText(t14);
					String t15 = Integer.toString(tab[1][5]);
					botones[4].setText(t15);
					String t16 = Integer.toString(tab[1][6]);
					botones[5].setText(t16);
					//fila 2
					String t21 = Integer.toString(tab[2][1]);
					botones[6].setText(t21);
					String t22 = Integer.toString(tab[2][2]);
					botones[7].setText(t22);
					String t23 = Integer.toString(tab[2][3]);
					botones[8].setText(t23);
					String t24 = Integer.toString(tab[2][4]);
					botones[9].setText(t24);
					String t25 = Integer.toString(tab[2][5]);
					botones[10].setText(t25);
					String t26 = Integer.toString(tab[2][6]);
					botones[11].setText(t26);
					//fila 3
					String t31 = Integer.toString(tab[3][1]);
					botones[12].setText(t31);
					String t32 = Integer.toString(tab[3][2]);
					botones[13].setText(t32);
					String t33 = Integer.toString(tab[3][3]);
					botones[14].setText(t33);
					String t34 = Integer.toString(tab[3][4]);
					botones[15].setText(t34);
					String t35 = Integer.toString(tab[3][5]);
					botones[16].setText(t35);
					String t36 = Integer.toString(tab[3][6]);
					botones[17].setText(t36);
					//fila 4
					String t41 = Integer.toString(tab[4][1]);
					botones[18].setText(t41);
					String  t42 = Integer.toString(tab[4][2]);
					botones[19].setText(t42);
					String t43 = Integer.toString(tab[4][3]);
					botones[20].setText(t43);
					String t44 = Integer.toString(tab[4][4]);
					botones[21].setText(t44);
					String t45 = Integer.toString(tab[4][5]);
					botones[22].setText(t45);
					String t46 = Integer.toString(tab[4][6]);
					botones[23].setText(t46);
					//fila 5
					String t51 = Integer.toString(tab[5][1]);
					botones[24].setText(t51);
					String  t52 = Integer.toString(tab[5][2]);
					botones[25].setText(t52);
					String t53 = Integer.toString(tab[5][3]);
					botones[26].setText(t53);
					String t54 = Integer.toString(tab[5][4]);
					botones[27].setText(t54);
					String t55 = Integer.toString(tab[5][5]);
					botones[28].setText(t55);
					String t56 = Integer.toString(tab[5][6]);
					botones[29].setText(t56);
					//fila 6
					String t61 = Integer.toString(tab[6][1]);
					botones[30].setText(t61);
					String t62 = Integer.toString(tab[6][2]);
					botones[31].setText(t62);
					String t63 = Integer.toString(tab[6][3]);
					botones[32].setText(t63);
					String t64 = Integer.toString(tab[6][4]);
					botones[33].setText(t64);
					String t65 = Integer.toString(tab[6][5]);
					botones[34].setText(t65);
					String t66 = Integer.toString(tab[6][6]);
					botones[35].setText(t66);
					puntuacion.setText("Puntuación en nivel: "+punt);
					nivel.setText("Nivel de juego: "+nlvl);
					golpes.setText("Golpes realizados: "+ (int)golp);
			}
			public static void JuegaTablero(int tab[][]) {

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
				
				}
				flagtab = false;
			}
			
			public static double puntuacion() {
			
  if(golp>0) {
				v[(niv - 1)] = (3 * niv) / golp;

				punt = v[niv - 1];
  }else {


		punt = 1;
	  
  }
				return punt;

		}
			public static void comprobar() {
				int cont = 0;
				int i = 1, j = 1;
				for (i = 1; i < 7; i++) {
					for (j = 1; j < 7; j++) {
						if (tab[i][j] == 0) {
							cont++;

						}
					}
					if (cont == 36) {
						
						int aux;
						aux = niv * 3;
						JPanel ganar = new JPanel ();
						ganar.setLayout(null);
						JFrame ventana3 = new JFrame();
						ventana3.setTitle ("WINNER");
						ventana3.setLocation(200,200);
						ventana3.setSize(300,300);
						if (golp > 2) {
							if (golp == aux) {
								JLabel label1 = new JLabel ("Perfecto. Hecho en " + (int) golp + " golpes");
								label1.setBounds(100, 130, 250, 50);
								ganar.add(label1);
							} else {
								if (golp < aux) {
									JLabel label2 = new JLabel ("Extraordinariamente bien. Hecho en " + (int) golp + " golpes");
									label2.setBounds(100, 130, 250, 50);
									ganar.add(label2);
								} else {
									JLabel label3 = new JLabel ("Hecho en " + (int) golp +  "golpes");
									label3.setBounds(100, 130, 250, 50);
									ganar.add(label3);
								}
							}
				}
						golp =  0;	
						cont = 0;
						JLabel ganaste = new JLabel ("GANADOOOR!!!");
						ganaste.setBounds(100, 100, 150, 50);
					
						ganar.add(ganaste);
						ventana3.setContentPane(ganar);
						ventana3.setVisible(true);
						
					

					}

				}
				
				
			}
			public static void jugar(int tab[][],int fil,int col) {


				
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
			
			}
	
	
}
