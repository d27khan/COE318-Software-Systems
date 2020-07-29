package coe318.lab2;
/**
 * ComplexNumber models a complex number expressed
 * in rectangular form (real and imaginary parts).
 * It is an <em>immutable</em> object.
 *
 * @author Your Name
 */
public class ComplexNumber {
  //Instance variable declarations

  /**
   * Construct a ComplexNumber given its
   * real and imaginary parts.
   * @param re The real component
   * @param im The imaginary component
   */
    
    double Ai;
    double Ar;
    double x;
    
  public ComplexNumber(double re, double im) {
      //Initialize the instance variables
      Ar = re;
      Ai = im;
      
  }

  /**
   * Returns the real component.
   * @return the real
   */
  public double getReal() {
      return Ar;  //A stub: to be fixed
  }

  /**
   * Returns the imaginary component.
   * @return the imaginary
   */
  public double getImaginary() {
      return Ai;  //A stub: to be fixed
  }

  /**
   * Returns a new ComplexNumber number that is
   * the negative of <em>this</em>.  Note: the
   * original ComplexNumber is <b>NOT</b>
   * modified.
   * @return -this
   */
  public ComplexNumber negate(){
      
      ComplexNumber neg = new ComplexNumber(-Ar,-Ai);
      
      return neg;
      
  }
  
   /**
   * Returns a new ComplexNumber that is the
   * sum of <em>this</em>  and <em>z</em>.
   * Note: the  original ComplexNumber is
   * <b>NOT</b> modified.
   * @param z
   * @return this + z
   */
  public ComplexNumber add(ComplexNumber z) {
      
      ComplexNumber add1 = new ComplexNumber(Ar+ z.getReal(),Ai+ z.getImaginary());
      
      return add1;  //A stub: to be fixed
  }

  /**
   * Returns a new ComplexNumber that is the
   * difference of <em>this</em>  and <em>z</em>.
   * Note: the  original ComplexNumber is
   * <b>NOT</b> modified.
   * @param z
   * @return this + z
   */
  public ComplexNumber subtract(ComplexNumber z) {
      ComplexNumber sub1 = new ComplexNumber(Ar - z.getReal(), Ai - z.getImaginary());
      return sub1;  //A stub: to be fixed
  }

  /**
   * Returns a new ComplexNumber that is the
   * product of <em>this</em> and <em>z</em>.
   * Note: the original ComplexNumber is
   * <b>NOT</b> modified.
   * @param z
   * @return this * z
   */
  public ComplexNumber multiply(ComplexNumber z) {
   //ComplexNumber mult1 = new ComplexNumber((Ar*z.getReal()) - (Ai*z.getImaginary()), (Ar*z.getReal()) + (Ai*z.getImaginary()) );
      
   
   ComplexNumber mult2 = new ComplexNumber( 
   
           (Ar*z.getReal() - Ai*z.getImaginary()), Ar*z.getReal() + z.getReal()*z.getImaginary());
   
   
   return mult2;  //A stub: to be fixed
  }

  /**
   * Returns a new ComplexNumber that is
   * the reciprocal of <em>this</em>.
   * Note: the original ComplexNumber is
   * <b>NOT</b> modified.
   * @return 1.0 / this
   */
  public ComplexNumber reciprocal() {
      
      ComplexNumber reci = new ComplexNumber( Ar /(Ar*Ar + Ai*Ai), -Ai / (Ar*Ar + Ai*Ai)
      );
      
      return reci;  //A stub: to be fixed
  }

  /**
   * Returns a new ComplexNumber that is
   * <em>this</em> divided by <em>z</em>.
   * Note: the original ComplexNumber is
   * <b>NOT</b> modified.
   * @param z
   * @return this / z
   */
  public ComplexNumber divide(ComplexNumber z) {
      
      ComplexNumber div = new ComplexNumber((Ar*z.getReal() +Ai*z.getImaginary()) / 
              ((z.getReal()*z.getReal()) + (z.getImaginary()*z.getImaginary())), 
      
      ((Ai*z.getReal()) - (Ar*z.getImaginary())) / ((z.getReal()*z.getReal()) + (z.getImaginary()*z.getImaginary()))
      
      );
      
      
      
      return div;  //A stub: to be fixed
  }

  /**
   * Returns a String representation of
   * <em>this</em> in the format:
   * <pre>
   * real +-(optional) i imaginary
   * </pre>
   * If the imaginary part is zero, only the
   * real part is converted to a String.
   * A "+" or "-" is placed between the real
   * and imaginary parts depending on the
   * the sign of the imagrinary part.
   * <p>
   * Examples:
   * <pre>
   *  ..println(new ComplexNumber(0,0); -> "0.0"
   *  ..println(new ComplexNumber(1,1); -> "1.0 + i1.0"
   *  ..println(new ComplexNumber(1,-1); -> "1.0 - i1.0"
   * </pre>
   * @return the String representation.
   */
  @Override
  public String toString() {
      //DO NOT MODIFY THIS CODE!
      String str = "" + this.getReal();
      if (this.getImaginary() == 0.0) {
          return str;
      }
      if (this.getImaginary() > 0) {
          return str + " + i" + this.getImaginary();
      } else {
          return str + " - i" + -this.getImaginary();
      }
  }
}
