public class MetodoBurbuja {
/*
    public void ordenarAscendente(int[] arreglo){
        int n = arreglo.length;
        for(int i=0; i<arreglo.length; i++){
            System.out.print("[");
            System.out.print(" "+arreglo[i]+" ");
            System.out.print("]");
        }
        System.out.println(" ");

        for(int i=0; i<n; i++){
            for(int j = i+1; j < n; j++){
                System.out.println("i: "+i+" j: "+j);
                if(arreglo[i]>arreglo[j]){
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[i];
                    arreglo[i]=aux;
                }
            }
        }
    }
 */
    public void imprimirArreglo(int[] arreglo){
        System.out.println("-".repeat(45));
        for(int i=0; i<arreglo.length; i++){
            System.out.print("[");
            System.out.print(" "+arreglo[i]+" ");
            System.out.print("]");
        }
        System.out.println("\n"+"-".repeat(45));
    }
    public int ordenar(int [] arreglo, boolean isDes){
        int n = arreglo.length;
        int contComparaciones = 0;
        if(isDes){
            //Ascendente
            for(int i=0; i<n; i++){
                for(int j = i+1; j < n; j++){
                    //System.out.println("i: "+i+" j: "+j);
                    if(arreglo[i]>arreglo[j]){
                        int aux = arreglo[j];
                        arreglo[j] = arreglo[i];
                        arreglo[i]=aux;
                    }
                }
                contComparaciones ++;
            }
        }else{
            //Descendente
            for(int i=0; i<n; i++){
                for(int j = i+1; j < n; j++){
                    //System.out.println("i: "+i+" j: "+j);
                    if(arreglo[i]<arreglo[j]){
                        int aux = arreglo[j];
                        arreglo[j] = arreglo[i];
                        arreglo[i]=aux;
                    }
                }
                contComparaciones ++;
            }
        }
        return contComparaciones;
    }
}
