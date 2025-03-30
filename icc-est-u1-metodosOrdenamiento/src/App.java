import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);
        //int [] arreglo = new int[1000];
        /*for(int i=0; i<arreglo.length; i++){
            arreglo[i] = (int)(Math.random()*1000)+1;
        }*/
        int [] arreglo  = { 12, -7, 25, 0, -15, 33, 19, -22, 5, 48, -3, 27, -30, 14, 7, -1, 41, 20, -11, 8 };
        int [] arregloBase = { 12, -7, 25, 0, -15, 33, 19, -22, 5, 48, -3, 27, -30, 14, 7, -1, 41, 20, -11, 8 };
        String cond = "";
        boolean continuar = true;
        //Instanciar MetodoBurbuja
        MetodoBurbuja metodoBurbujaClase = new MetodoBurbuja();
        //Instanciar MetodoSelección
        MetodoSeleccion mS = new MetodoSeleccion();
        //Instanciar MetodoInserción
        MetodoInserción mI = new MetodoInserción();
        //Instanciar MetodoBurbujaMejorado
        MeetodoBurbujaMejorado mB = new MeetodoBurbujaMejorado();
        

        while(continuar){
            metodoBurbujaClase.imprimirArreglo(arreglo);
            System.out.println("Seleccione el método de ordenamiento: ");
            System.out.println("1: Burbuja");
            System.out.println("2: Selección");
            System.out.println("3: Inserción");
            System.out.println("4: Burbuja Mejorado");
            System.out.println("5: Salir");
            System.out.println("-".repeat(120));
            //int metodo = lector.nextInt();
            int metodo = getPositve(lector,"\tIngresa la opción");
            if(metodo==5){
                continuar = false;
                break; 
            }
            cond = getValidString(lector, new String[] {"ascendente","descendente"}, "Ascendente o Descendente: ");

            System.out.println("¿Desea ver los pasos? (true/false)");
            boolean conPasos = lector.nextBoolean();
            

            int [] respConts = {};
            switch (metodo) {
                case 1:
                    if(cond.equalsIgnoreCase("ascendente")){
                        if(conPasos){
                            respConts = metodoBurbujaClase.ordenar(arreglo, true, true);
                            metodoBurbujaClase.imprimirArreglo(arreglo);
                        }else{
                            respConts = metodoBurbujaClase.ordenar(arreglo, true, false);
                            metodoBurbujaClase.imprimirArreglo(arreglo);
                        }
                        System.out.println("Comparaciones -> "+respConts[0]+" | Cambios -> "+respConts[1]);
                    }else if(cond.equalsIgnoreCase("descendente")){
                        if(conPasos){
                            respConts = metodoBurbujaClase.ordenar(arreglo, false, true);
                            metodoBurbujaClase.imprimirArreglo(arreglo);
                        }else{
                            respConts = metodoBurbujaClase.ordenar(arreglo, false, false);
                            metodoBurbujaClase.imprimirArreglo(arreglo);
                        }
                        System.out.println("Comparaciones -> "+respConts[0]+" | Cambios -> "+respConts[1]);
                    }else{
                        System.out.println("No existe ese orden");
                    }
                break;
                case 2:
                    if(cond.equalsIgnoreCase("ascendente")){
                        if(conPasos){
                            respConts = mS.ordenar(arreglo,true,true);
                            metodoBurbujaClase.imprimirArreglo(arreglo);
                        }else{
                            respConts = mS.ordenar(arreglo,true,false);
                            metodoBurbujaClase.imprimirArreglo(arreglo);
                        }
                        System.out.println("Comparaciones -> "+respConts[0]+" | Cambios -> "+respConts[1]);
                    }else if(cond.equalsIgnoreCase("descendente")){
                        if(conPasos){
                            respConts = mS.ordenar(arreglo,false,true);
                            metodoBurbujaClase.imprimirArreglo(arreglo);
                        }else{
                            respConts = mS.ordenar(arreglo,false,false);
                            metodoBurbujaClase.imprimirArreglo(arreglo);
                        }
                        System.out.println("Comparaciones -> "+respConts[0]+" | Cambios -> "+respConts[1]);
                    }else{
                        System.out.println("No existe ese orden");
                    }
                break;
                case 3:
                    if(cond.equalsIgnoreCase("ascendente")){
                        if(conPasos){
                            respConts = mI.ordenar(arreglo,true,true);
                            metodoBurbujaClase.imprimirArreglo(arreglo);
                        }else{
                            respConts = mI.ordenar(arreglo,true,false);
                            metodoBurbujaClase.imprimirArreglo(arreglo);
                        }
                        System.out.println("Comparaciones -> "+respConts[0]+" | Cambios -> "+respConts[1]);
                    }else if(cond.equalsIgnoreCase("descendente")){
                        if(conPasos){
                            respConts = mI.ordenar(arreglo,false,true);
                            metodoBurbujaClase.imprimirArreglo(arreglo);
                        }else{
                            respConts = mI.ordenar(arreglo,false,false);
                            metodoBurbujaClase.imprimirArreglo(arreglo);
                        }
                        System.out.println("Comparaciones -> "+respConts[0]+" | Cambios -> "+respConts[1]);
                    }else{
                        System.out.println("No existe ese orden");
                    }
                break;
                case 4:
                    if(cond.equalsIgnoreCase("ascendente")){
                        if(conPasos){
                            respConts = mB.ordenar(arreglo, true,true);
                            metodoBurbujaClase.imprimirArreglo(arreglo);
                        }else{
                            respConts = mB.ordenar(arreglo, true,false);
                            metodoBurbujaClase.imprimirArreglo(arreglo);
                        }
                        System.out.println("Comparaciones -> "+respConts[0]+" | Cambios -> "+respConts[1]);
                    }else if(cond.equalsIgnoreCase("descendente")){
                        if(conPasos){
                            respConts = mB.ordenar(arreglo, false,true);
                            metodoBurbujaClase.imprimirArreglo(arreglo);
                        }else{
                            respConts = mB.ordenar(arreglo, false,false);
                            metodoBurbujaClase.imprimirArreglo(arreglo);
                        }
                        System.out.println("Comparaciones -> "+respConts[0]+" | Cambios -> "+respConts[1]);
                    }else{
                        System.out.println("No existe ese orden");
                    }
                    
                break;
                default:
                    System.out.println("No ingresó ningua de las 4 opciones");
                break;
            }
            for(int i=0; i<arreglo.length;i++){
                arreglo[i]= arregloBase[i];
            }
        }
    }
    public static int getPositve(Scanner lector, String mensaje){
        int numero=0;
        do{
            System.out.println(mensaje + ": ");
            numero = lector.nextInt();
            if(numero<=0){
                System.out.println("El número debe ser positivo. Intente nuevamente.");
            }
        }while(numero<=0);
        return numero;
    }
    public static String getValidString(Scanner lector, String[] posibles, String messaje){
        String input;
        boolean valido = false;
        do{
            System.out.println(messaje + ": ");
            input =lector.next();
            valido = false;
            for (String posible : posibles) {
                //ascendente, descendente
                if(input.equalsIgnoreCase(posible)){
                    valido = true;
                    break;
                }
            }
        }while(!valido);
        return input;

    }
}
