
package mainPackage;

/**
 * @author Robert Weber
 */
public class Triangle extends GeometricObject {
	
	//lengths of the three sides of a triangle
	double side1 = 1.0;
	double side2 = 1.0;
	double side3 = 1.0;

	/**
	 * No-args constructor that creates a default triangle
	 */
	public Triangle() {

	}

	/**
	 * Constructor for a triangle 
	 * @param side1
	 * @param side2
	 * @param side3
	 * @param color
	 * @param filled
	 */
	public Triangle(double side1, double side2, double side3, String color, boolean filled) {
		super(color, filled); // constructor from superclass
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	
	/**
	 * @return the side1
	 */
	public double getSide1() {
		return side1;
	}

	/**
	 * @return the side2
	 */
	public double getSide2() {
		return side2;
	}

	/**
	 * @return the side3
	 */
	public double getSide3() {
		return side3;
	}


	@Override
	public double getArea() {
		double x = .5 * (side1 + side2 + side3); //using Heron's formula
        return Math.sqrt(x*(x-side1)*(x-side2)*(x-side3));
	}

	
	@Override
	public double getPerimeter() {
		return side1+side2+side3;
	}


	@Override
	public String toString() {
		return String.format("Triangle [side1= %s, side2= %s, side3= %s,"
				+ " area= %.1f, perimeter= %.1f]", side1,
				side2, side3, this.getArea(), this.getPerimeter());
	}

}
