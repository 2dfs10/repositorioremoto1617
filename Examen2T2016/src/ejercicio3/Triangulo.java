package ejercicio3;

import java.io.Serializable;

public class Triangulo implements Serializable
{
	private double base;
	private double altura;
	private double area;
	
	public Triangulo()
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
		return (base * altura) / 2;
	}

	public void setArea(double area)
	{
		this.area = area;
	}
}
