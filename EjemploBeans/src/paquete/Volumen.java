package paquete;

import java.util.ArrayList;

public class Volumen{
	private double radio;
	private double volumen;
	private double area;
	private double longitud;
	private double pi=Math.PI;
	
	public void setRadio(double radio2) {
		radio=radio2;
	}
	
	public double getRadio() {
		return radio;
	}
	
	public double getVolumen() {
		double radio3=radio*radio*radio;
		volumen=4/3*pi*radio3;
		return volumen;
	}
	
	public double getArea() {
		double radio2=radio*radio;
		area=pi*radio2;
		return area;
	}
	
	public double getLongitud() {
		longitud=2*pi*radio;
		return longitud;
	}
}
