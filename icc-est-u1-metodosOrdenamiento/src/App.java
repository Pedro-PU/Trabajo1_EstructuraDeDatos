import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);
        int [] arreglo  = {10, 9, 21, 5, 15, 2, -1, 0 };
        int [] arregloBase = {10, 9, 21, 5, 15, 2, -1, 0 };
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
            System.out.println("-".repeat(45));
            int metodo = lector.nextInt();
            if(metodo==5){
                continuar = false;
                break; 
            }
            System.out.println("¿Desea ver los pasos? (true/false)");
            boolean conPasos = lector.nextBoolean();
            int contadorComparacionesResultado = 0;
            switch (metodo) {
                case 1:
                    System.out.print("Ascendente o Descendente: ");
                    cond = lector.next();
                    /*boolean orden = cond.equalsIgnoreCase("ascendente");
                    metodoBurbujaClase.ordenar(arreglo, orden);
                    metodoBurbujaClase.imprimirArreglo(arreglo);*/
                    if(cond.equalsIgnoreCase("ascendente")){
                        metodoBurbujaClase.ordenar(arreglo, true);
                        metodoBurbujaClase.imprimirArreglo(arreglo);
                        contadorComparacionesResultado = metodoBurbujaClase.ordenar(arregloBase, true);
                        System.out.println("Comparaciones -> "+contadorComparacionesResultado);
                    }else if(cond.equalsIgnoreCase("descendente")){
                        metodoBurbujaClase.ordenar(arreglo, false);
                        metodoBurbujaClase.imprimirArreglo(arreglo);
                        contadorComparacionesResultado = metodoBurbujaClase.ordenar(arregloBase, false);
                        System.out.println("Comparaciones -> "+contadorComparacionesResultado);
                    }else{
                        System.out.println("No existe ese orden");
                    }

                    for(int i=0; i<arreglo.length;i++){
                        arreglo[i]= arregloBase[i];
                    }
                break;
                case 2:
                    System.out.print("Ascendente o Descendente: ");
                    cond = lector.next();
                    /*boolean orden = cond.equalsIgnoreCase("ascendente");
                    mI.ordenar(arreglo, orden);
                    metodoBurbujaClase.imprimirArreglo(arreglo);*/
                    if(cond.equalsIgnoreCase("ascendente")){
                        mS.ordenar(arreglo,true);
                        metodoBurbujaClase.imprimirArreglo(arreglo);
                        contadorComparacionesResultado = mS.ordenarAsSeleccion(arregloBase);
                        System.out.println("Comparaciones -> "+contadorComparacionesResultado);
                    }else if(cond.equalsIgnoreCase("descendente")){
                        mS.ordenar(arreglo,false);
                        metodoBurbujaClase.imprimirArreglo(arreglo);
                        contadorComparacionesResultado = mS.ordenarDesSeleccion(arregloBase);
                        System.out.println("Comparaciones -> "+contadorComparacionesResultado);
                    }else{
                        System.out.println("No existe ese orden");
                    }

                    for(int i=0; i<arreglo.length;i++){
                        arreglo[i]= arregloBase[i];
                    }
                break;
                case 3:
                    System.out.print("Ascendente o Descendente: ");
                    cond = lector.next();
                    /*boolean orden = cond.equalsIgnoreCase("ascendente");
                    mS.ordenar(arreglo, orden);
                    metodoBurbujaClase.imprimirArreglo(arreglo);*/
                    if(cond.equalsIgnoreCase("ascendente")){
                        mI.ordenar(arreglo,true);
                        metodoBurbujaClase.imprimirArreglo(arreglo);
                        contadorComparacionesResultado= mI.insercionAscendente(arregloBase);
                        System.out.println("Comparaciones -> "+contadorComparacionesResultado);
                    }else if(cond.equalsIgnoreCase("descendente")){
                        mI.ordenar(arreglo,false);
                        metodoBurbujaClase.imprimirArreglo(arreglo);
                        contadorComparacionesResultado= mI.insercionDescendente(arregloBase);
                        System.out.println("Comparaciones -> "+contadorComparacionesResultado);
                    }else{
                        System.out.println("No existe ese orden");
                    }

                    for(int i=0; i<arreglo.length;i++){
                        arreglo[i]= arregloBase[i];
                    }
                break;
                case 4:
                    System.out.print("Ascendente o Descendente: ");
                    cond = lector.next();
                    /*boolean orden = cond.equalsIgnoreCase("ascendente");
                    mS.ordenar(arreglo, orden);
                    metodoBurbujaClase.imprimirArreglo(arreglo);*/
                    if(cond.equalsIgnoreCase("ascendente")){
                        mB.ordenar(arreglo,true);
                        metodoBurbujaClase.imprimirArreglo(arreglo);
                        contadorComparacionesResultado= mB.ordenar(arreglo, true);
                        System.out.println("Comparaciones -> "+contadorComparacionesResultado);
                    }else if(cond.equalsIgnoreCase("descendente")){
                        mB.ordenar(arreglo,false);
                        metodoBurbujaClase.imprimirArreglo(arreglo);
                        contadorComparacionesResultado= mB.ordenar(arreglo, false);
                        System.out.println("Comparaciones -> "+contadorComparacionesResultado);
                    }else{
                        System.out.println("No existe ese orden");
                    }

                    for(int i=0; i<arreglo.length;i++){
                        arreglo[i]= arregloBase[i];
                    }
                break;
                default:
                    System.out.println("No ingresó ningua de las 4 opciones");
                break;
            }
        }

        /* 
        //MetodoBurbuja
        if(cond.equalsIgnoreCase("ascendente")){
            metodoBurbujaClase.ordenar(arreglo, true);
            metodoBurbujaClase.imprimirArreglo(arreglo);
        }else if(cond.equalsIgnoreCase("descendente")){
            metodoBurbujaClase.ordenar(arreglo, false);
            metodoBurbujaClase.imprimirArreglo(arreglo);
        }else{
            System.out.println("No existe ese orden");
        }
        */

        //MetodoSeleccion
        /* 
        if(cond.equalsIgnoreCase("ascendente")){
            mS.ordenar(arreglo,true);
            metodoBurbujaClase.imprimirArreglo(arreglo);
        }else if(cond.equalsIgnoreCase("descendente")){
            mS.ordenar(arreglo,false);
            metodoBurbujaClase.imprimirArreglo(arreglo);
        }else{
            System.out.println("No existe ese orden");
        }
        

        //DEBER: clase MetodoInserción, hacer de maner ascendente y descendente.
        //MetodoInserción
        if(cond.equalsIgnoreCase("ascendente")){
            mI.ordenar(arreglo,true);
            metodoBurbujaClase.imprimirArreglo(arreglo);
        }else if(cond.equalsIgnoreCase("descendente")){
            mI.ordenar(arreglo,false);
            metodoBurbujaClase.imprimirArreglo(arreglo);
        }else{
            System.out.println("No existe ese orden");
        }
        */


    }
}
