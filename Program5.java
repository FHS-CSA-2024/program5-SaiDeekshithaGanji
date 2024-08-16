
//Your code here
public class program5{
    public static void main(String[] args){
        
        int rM = 286;
        int kM = 412;
        int pM = 361;
        int bM = 161;
        int rG = 9;
        int kG = 40;
        int pG = 18;
        int bG = 11;
        double rA;
        double kA;
        double pA;
        double bA;


        // now do the calculations
        rA = (double) rM/rG;
        kA = (double) kM/kG;
        pA = (double) pM/pG;
        bA = (double) bM/bG;
        
        //mutiply rA with a 10.0
        //then cast it to a int
        //then cast it to  a double
        //then divide the rA by 10.0
        
        
        rA =  Math.round(rA * 10.0) / 10.0;
        kA =  Math.round(kA * 10.0) / 10.0;
        pA =  Math.round(pA * 10.0) / 10.0;
        bA =  Math.round(bA * 10.0) / 10.0;
        
        //print
        System.out.println("Mushroom Cup Prix Racer Average Miles/Per Gallon:");
        System.out.println("\nRoyale averaged " + rA + " m/g");
        System.out.println("\nKoopa King averaged " + kA + " m/g");
        System.out.println("\nPipe Frame averaged " + pA + " m/g");
        System.out.println("\nBadwagon averaged " + bA + " m/g");
    }
}

//Paste console output below:
/*
 * 
Mushroom Cup Prix Racer Average Miles/Per Gallon:

Royale averaged 31.8 m/g

Koopa King averaged 10.3 m/g

Pipe Frame averaged 20.1 m/g

Badwagon averaged 14.6 m/g


*/
