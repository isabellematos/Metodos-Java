import java.util.Scanner; 

class CalcDois{
    public static void main(String args[]){
        
        double n1 = entrada("Digite o primeiro numero");
        double n2 = entrada("Digite o segundo numero");
 
            double resultadosoma = somar(n1,n2);
            double resultadomenos = subtrair(n1,n2);
            double resultadomult = multiplicar(n1,n2);
            double resultadodiv = dividir(n1,n2);

                exibirNaTela(n1,'+', n2, resultadosoma);
                exibirNaTela(n1,'-', n2, resultadomenos);
                exibirNaTela(n1,'x', n2, resultadomult);
                exibirNaTela(n1,'/', n2, resultadodiv);
                
    }

        //metodo exibir na tela
        public static void exibirNaTela(double n1, char op, double n2, double res){
        System.out.println(n1 + " " + op + " " + n2 + "=" + res);
        }

        //metodo entrada
        public static double entrada(String frase){
        Scanner ler = new Scanner(System.in);
        System.out.println(frase);
        double numero = ler.nextDouble();
        return numero;
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