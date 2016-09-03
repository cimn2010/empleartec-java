package Ejercicio1;

public abstract class Operacion {

//Declaracion de variables
protected int num1, num2;

//Metodo abstracto, tiene que haber al menos uno en una clase abstracta. Metodo comun en los hijos, pero que se hace distinto. 
public abstract int calcular();

//Setters & Getters, no se pueden crear cosntructores en clases abstractas
public int getNum1() {
	return num1;
}

public void setNum1(int num1) {
	this.num1 = num1;
}

public int getNum2() {
	return num2;
}

public void setNum2(int num2) {
	this.num2 = num2;
}

}