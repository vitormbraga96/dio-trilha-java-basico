public class Operadores {
    public static void main(String[] args) throws Exception {
        
        boolean variavel = false;
         
        variavel = !variavel;   // O SINAL DE "!" INVERTE OS VALORES DO TIPO BOOLEAN

        //System.out.println(variavel);

        // EXEMPLO DE TERNÁRIO 

        int a, b; 
        a = 5;
        b = 6;

        // O SINAL "?" REPRESENTA IF E O SINAL ":" REPRESENTA O ELSE 
        String resultado = a==b ?"VERDADEIRO" : "FALSO";
 
        System.out.println(resultado);

    }
}
