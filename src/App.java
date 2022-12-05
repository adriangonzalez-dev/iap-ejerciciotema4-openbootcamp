public class App {
    public static void main(String[] args) throws Exception {
        /* Ejercicio if */
        int numeroIf = 5;
        if(numeroIf > 0){
            System.out.println(numeroIf + " es positivo");
        } else if(numeroIf < 0){
            System.out.println(numeroIf + " es negativo");
        } else {
            System.out.println(numeroIf + " es cero");
        }

        /* Ejercicio while */
        int numeroWhile = 1;
        while(numeroWhile < 3){
            System.out.println(numeroWhile + " con while");
            numeroWhile++;
        }

        /* Ejercicio do while */
        do {
            System.out.println(numeroWhile + " con do while");
            numeroWhile++;
        } while (numeroWhile < 3);

        /* Ejercicio for */
        for(int numeroFor=0;numeroFor<=3;numeroFor++){
            System.out.println(numeroFor + " con for");
        }

        /* Ejercicio switch */
        String estacion = "Verano";
        switch (estacion) {
            case "Invierno":
                System.out.println("La estacion es " + estacion);
                break;
            case "Otoño":
                System.out.println("La estacion es " + estacion);
                break;
            case "Primavera":
                System.out.println("La estacion es " + estacion);
                break;
            case "Verano":
                System.out.println("La estacion es " + estacion);
                break;
        
            default:
                System.out.println("La estacion no existe");
                break;
        }
    }
}
