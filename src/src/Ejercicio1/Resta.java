package Ejercicio1;

public class Resta extends Operacion {
	
//Constructor
public  Resta (int num1, int num2){
		this.num1 = num1;
		this.num2 = num2;
}

//Metodo derivado del abstracto
@Override
public int calcular() {
	// TODO Auto-generated method stub
	return num1-num2;
}

}