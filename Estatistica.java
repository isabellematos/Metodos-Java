import java.util.Scanner;

class Estatistica{
    public static void main(String args[]){
        Scanner ler = new Scanner(System.in);
		double decimais[] = new double[3];
		
		for (int i=0 ; i<decimais.length ; i++ ){
		System.out.print((i+1) + "ª nota: ");
		notas[i] = ler.nextDouble();
	}

    
     public static double maior(double n1, double n2){
        return(n1+n2);
    }

    public static double menor(double n1, double n2){
    return(n1-n2);
    }