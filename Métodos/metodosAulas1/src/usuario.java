public class usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("A TV está ligada? " + smartTv.ligada);
        System.out.println("Canal atual? " + smartTv.canal);
        System.out.println("Volume atual? " + smartTv.volume);
    
        smartTv.ligar();
        System.out.println("Novo Status -> A TV está ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status 2  -> A TV está ligada? " + smartTv.ligada);
    
    }
        
      
    }

 