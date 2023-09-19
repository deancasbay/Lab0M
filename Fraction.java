import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;


public class Fraction implements INumber<Fraction>

{
	static Fraction[] fractionArray = new Fraction[100];
    protected double numerator, denominator;
    public Fraction(final double numerator, final double denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }
    public static void main(String[] args) {
    	
    	Fraction[] fractionArray = new Fraction[100];
    	for(int i=0; i<fractionArray.length; i++) {
    	fractionArray[i] = new Fraction(i, i+1);
    	}
    	Fraction X = new Fraction(5, 10);
    	X.compare(fractionArray[5]);

    	   for (Fraction fraction : fractionArray) {
               fraction.print();
           }
    }
    
 
	@Override
    public Fraction plus(final Fraction input) {
        return new Fraction(numerator + input.numerator, denominator + input.denominator);
    }

    @Override
    public Fraction minus(final Fraction input) {
        return new Fraction(numerator - input.numerator, denominator - input.denominator);
    }

    @Override
    public Fraction divide(final Fraction input) {
        return new Fraction(numerator / input.numerator, denominator / input.denominator);
    }

    @Override
    public Fraction multiply(final Fraction input) {
        return new Fraction(numerator * input.numerator, denominator * input.denominator);
    }

    @Override
    public void print() {
        System.out.printf("%f/%f\n", numerator, denominator);
    }
	
	
	public int compare(Fraction F) {
		// Compare fractions based on their values
		double Fraction1 = F.numerator / F.denominator;
		double Fraction2 = numerator / denominator;

		if (Fraction1 < Fraction2) {
			System.out.println(1);
			return 1;
		} else if (Fraction1 > Fraction2) {
			System.out.println(-1);
			return -1;
		} else {
			System.out.println(0);
			return 0;
		}
	}
	}

