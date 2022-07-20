import java.util.Scanner; 

class Area{
    public static void main(String args[]){
         Scanner ler = new Scanner(System.in);

            System.out.println("Informe um raio para area do circulo");
            double raio = ler.nextDouble();
            System.out.println("Informe um valor para o lado do quadrado");
            double lado = ler.nextDouble();
            System.out.println("Informe um valor para a base do retangulo");
            double base = ler.nextDouble();
            System.out.println("Informe um valor para a altura do retangulo");
            double altura = ler.nextDouble();
            System.out.println("Informe um valor para a base do triangulo");
            double basetri = ler.nextDouble();
            System.out.println("Informe um valor para a altura do triangulo");
            double alturatri = ler.nextDouble();


            double resultadocirculo = circulo(raio);
            System.out.println("circulo = 3.14" + " * raio ^ 2 " + " = " + resultadocirculo);

            double resultadoquadrado = quadrado(lado);
            System.out.println("quadrado = lado * lado "  + " = " + resultadoquadrado);

            double resultadoretangulo = retangulo(base,altura);
            System.out.println("retangulo = base * altura" + " = " + resultadoretangulo);

            double resultadotriangulo = triangulo(basetri,alturatri);
            System.out.println("triangulo = base * altura / 2" + " = " + resultadotriangulo);

    }
        public static double circulo(double raio){
        return(3.14 * (raio*=raio));
    }

        public static double quadrado(double lado){
        return(lado * lado);
    }

        public static double retangulo(double base, double altura){
        return(base*altura);
    }

         public static double triangulo(double basetri, double alturatri){
        return((basetri*alturatri)/2);
    }
}





