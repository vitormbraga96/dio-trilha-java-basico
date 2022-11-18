public class Operadores {
    public static void main(String[] args) throws Exception {
        
        boolean variavel = false;
         
        variavel = !variavel;   // O SINAL DE "!" INVERTE OS VALORES DO TIPO BOOLEAN

        //System.out.println(variavel);

       // ************************************** OPERADORES TERNÁRIOS ********************************************

        int a, b; 
        a = 5;
        b = 6;

        String resultado = a==b ?"VERDADEIRO" : "FALSO";  // O SINAL "?" REPRESENTA IF E O SINAL ":" REPRESENTA O ELSE 
 
        System.out.println(resultado);




        // ************************************** OPERADORES RELACIONAIS ********************************************
            int numeroUm = 2;
            int numeroDois = 4;

            boolean simNao = numeroUm != numeroDois;

            System.out.println("O número Um é diferente do número Dois? " + simNao);








    }
}
