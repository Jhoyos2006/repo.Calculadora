package main.java.com.eam.app;

public class Calculadora {
	public static double sumar(double a, double b) {
		return a + b;
	}
	
	public static int resta(int a, int b) {
        return a - b;
    }
	
	public static int multiplicacion(int a, int b) {
        return a * b;
    }
	
	public static double dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return (double) a / b;
    }
}
