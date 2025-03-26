public class MetodoSeleccion {
    public void ordenar(int[] arreglo, boolean isDes){
        if(isDes){
            ordenarAsSeleccion(arreglo);
        }else{
            ordenarDesSeleccion(arreglo);
        }
    }

    public int ordenarDesSeleccion(int[] arreglo){
        int n = arreglo.length;
        int contComparaciones = 0;
        for(int i=0; i<n-1; i++){
            int maxIdx = i;
            for(int j=i+1; j<n; j++){
                if(arreglo[maxIdx]< arreglo[j]){
                    //Condición para encontrar el mayor
                    maxIdx = j;
                    contComparaciones ++;
                }
            }
            //CAMBIO
            if(maxIdx != i){
                int aux = arreglo[maxIdx];
                arreglo[maxIdx] = arreglo[i];
                arreglo[i]=aux;
            }
        }
        return contComparaciones;

    }
    public int ordenarAsSeleccion(int[] arreglo){
        int n = arreglo.length;
        int contComparaciones = 0;
        for(int i=0; i<n-1; i++){
            int maxIdx = i;
            for(int j=i+1; j<n; j++){
                if(arreglo[maxIdx]> arreglo[j]){
                    //Condición para encontrar el mayor
                    maxIdx = j;
                    contComparaciones ++;
                }
            }
            //CAMBIO
            if(maxIdx != i){
                int aux = arreglo[maxIdx];
                arreglo[maxIdx] = arreglo[i];
                arreglo[i]=aux;
            }
        }
        return contComparaciones;
    }

    
}
