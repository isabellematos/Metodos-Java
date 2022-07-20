import java.util.Scanner; 

class Calculadora{
    public static void main(String args[]){
         Scanner ler = new Scanner(System.in);

            System.out.println("Informe um valor para ser calculado");
            double n1 = ler.nextDouble();
            System.out.println("Informe outro valor para ser calculado");
            double n2 = ler.nextDouble();

            double resultadosoma = somar(n1,n2);
            System.out.println(n1 + " + " + n2 + " = " + resultadosoma);

            double resultadomenos = subtrair(n1,n2);
            System.out.println(n1 + " - " + n2 + " = " + resultadomenos);

            double resultadomult = multiplicar(n1,n2);
            System.out.println(n1 + " * " + n2 + " = " + resultadomult);

            double resultadodiv = dividir(n1,n2);
                if (resultadodiv == -1){
                    System.out.println("Nao existe divisao por zero");
                }
                else {
                    System.out.println(n1 + " / " + n2 + " = " + resultadodiv);
                }
    }
        public static double somar(double n1, double n2){
        return(n1+n2);
    }

        public static double subtrair(double n1, double n2){
        return(n1-n2);
    }

        public static double multiplicar(double n1, double n2){
        return(n1*n2);
    }

        public static double dividir(double n1, double n2){
        if (n2 == 0){
        return -1;
        }
        return(n1/n2);
    }
}
