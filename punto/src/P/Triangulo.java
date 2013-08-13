package P;

import java.util.Scanner;

		public class Triangulo {
			
			private Scanner reader;			
			private int vertice1, vertice2, vertice3;
			
				public void definir_lados() {					
						reader=new Scanner(System.in);
						System.out.print("Introduzca longitud lado 1 (m): ");
						vertice1=reader.nextInt();
							System.out.print("Introduzca longitud lado 2 (m): ");
							vertice2=reader.nextInt();
								System.out.print("Introduzca longitud lado 3 (m): ");
								vertice3=reader.nextInt();
				}
				public String toString(){
					
					return super.toString()+" y es un Triangulo";
				}
						void tipo_triangulo() {
							if (vertice1==vertice2 && vertice1==vertice3){
							System.out.println("Es un Triángulo Equilátero.");
							} 
							else
								if(vertice1==vertice2 || vertice1==vertice3 || vertice2==vertice3){
									System.out.println("Es un Triángulo Isósceles.");
								}
									else 
										System.out.println("Es un Triángulo Escaleno.");
						}
							void perimetro() {
							System.out.println("El perímetro del Triángulo es: "+(vertice1+vertice2+vertice3)+" mts.");
							}
		}