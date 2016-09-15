package ejercicio3;

import java.io.Serializable;

public class Rectangulo implements Serializable
{
	private double base;
	private double altura;
	private double area;
	
	public Rectangulo()
	{
	}
	
	public double getBase()
	{
		return base;
	}

	public void setBase(double base)
	{
		this.base = base;
	}

	public double getAltura()
	{
		return altura;
	}

	public void setAltura(double altura)
	{
		this.altura = altura;
	}

	public double getArea()
	{
		return (base * altura);
	}

	public void setArea(double area)
	{
		this.area = area;
	}
}
