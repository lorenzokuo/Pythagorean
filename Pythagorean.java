import java.lang.Math;
public class Pythagorean {
	public double calculateHypotenuse(int legA, int legB) {
		// int squareA = Math.pow(legA);
		// int squareB = Math.pow(legB);
		// double squareSum = squareA + squareB;
		double squareSum = (legA)*(legA) + (legB)*(legB);
		double legC = Math.sqrt(squareSum);
		return legC;
	}
}