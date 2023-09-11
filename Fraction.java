public class Fraction implements INumber<Fraction>
{
    protected double numerator, denominator;
    public Fraction(final double numerator, final double denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
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
}
