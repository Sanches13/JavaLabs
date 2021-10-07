public class Complex{
    double re, im;

    public Complex(){
    }

    public Complex(double re, double im){
        this.re = re;
        this.im = im;
    }

    public double getModule(){
        return Math.sqrt(Math.pow(re, 2) + Math.pow(im, 2));
    }

    public double getArgument(){
        if(re == 0 && im == 0)
            return 0;

        if(re == 0){
            if(im > 0)
                return Math.PI/2;
            else
                return -Math.PI/2;
        }

        if(re >= 0){
            if(im >= 0)
                return Math.atan( Math.abs(im) / Math.abs(re) );

            else
                return -Math.atan( Math.abs(im) / Math.abs(re) );
        }

        else{
            if(im >= 0)
                return Math.PI - Math.atan( Math.abs(im) / Math.abs(re) );

            else{
                return -Math.PI + Math.atan( Math.abs(im) / Math.abs(re) );
            }
        }
    }

    public static Complex sumOfNumbers(Complex first, Complex second){
        return new Complex(first.re + second.re, first.im + second.im);
    }

    public static Complex subOfNumbers(Complex first, Complex second){
        return new Complex(first.re - second.re, first.im - second.im );
    }
}
