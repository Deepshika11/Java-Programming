class QDemo {
    void Process (double a,double b, double c)
    {
        double d = b*b-4.0*a*c;
        if(d>0.0)
        {
            double r1 = (-b+Math.pow(d,0.5))/(2.0*a);
            double r2 = (-b-Math.pow(d,0.5))/(2.0*a); 
            System.out.println("The roots are: "+r1+" and "+r2);
        }



    }

}

class Quadratic {
    public static void main(String[] args) {
        QDemo obj = new QDemo();
        double a = 0, b = 0, c = 0;
        if (args.length>2)
        {
            try {
                a=Double.parseDouble(args[0]);
                b=Double.parseDouble(args[1]);
                c=Double.parseDouble(args[2]);
            }
                
            
            catch(NumberFormatException e) {
                System.out.println("Argument "+args[0]+" must be an integer.");
                System.exit(1);
            }
        }
        obj.Process(a, b, c);

    }
    
}
