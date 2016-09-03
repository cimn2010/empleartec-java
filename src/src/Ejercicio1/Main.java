package Ejercicio1;
//aqui se crean las instancias de objetos
public class Main {

	public static void main(String[] args) {
		Operacion suma1 = new Suma(1,1);
		Suma suma2 = new Suma(9,8); //alternativa, 	OJO CON LAS MAYUSCULAS
		
		System.out.println("la suma en total da " + suma1.calcular());
		System.out.println(suma2.calcular());//OJO CON EL PARENTESIS
	}

}
