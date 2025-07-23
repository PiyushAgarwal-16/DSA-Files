// Print the sum, difference, and product of two complex numbers by creating a class named 'Complex' 
// with separate methods for each operation. The real and imaginary parts are entered by the user.
public class Question1{
    public static void main(String args[]){
        Complex c1 = new Complex(2,3);
        Complex c2 = new Complex(4,3);
        Complex c3 = Complex.add(c1,c2);
        Complex c4 = Complex.subtract(c1, c2);
        Complex.eat();
        Complex c5 = Complex.product(c1,c2);
        c3.printComplex();
        c4.printComplex();
        c5.printComplex();

    }
}


class Complex{
    int real;
    int imag;
    Complex(int real, int imaginary){
        this.real = real;
        this.imag = imaginary;
    }

    public static Complex add(Complex a, Complex b){
        return new Complex((a.real + b.real), (b.imag + a.imag));
    }
    public static Complex subtract(Complex a, Complex b){
        return new Complex((a.real - b.real), (a.imag - b.imag));
    }
    public static Complex product(Complex a, Complex b){
        return new Complex(((a.real * b.real) - (a.imag * b.imag)), ((a.real * b.imag) + (a.imag * b.real)));
    }
    static void eat(){
        System.out.println("Function working.");
    }

    public void  printComplex(){
        if(real == 0 && imag != 0){
            System.out.println(imag + "i");
        }
        else if(imag == 0 && real != 0){
            System.out.println(real);
        }
        else{
            System.out.println(real + " + " + imag + "i");
        }
    }
}


//Had to take help from GeeksforGeeks
// Done solution from Apna College Solution Sheet