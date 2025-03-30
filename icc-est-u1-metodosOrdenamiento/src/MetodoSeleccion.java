public class MetodoSeleccion {
    public int[] ordenar(int[] arreglo, boolean isDes, boolean condPasos){
        if(isDes){
            if(condPasos){
                return ordenarAsSeleccionConPasos(arreglo);
            }else{
                return ordenarAsSeleccionSinPasos(arreglo);
            }
        }else{
            if(condPasos){
                return ordenarDesSeleccionConPasos(arreglo);
            }else{
                return ordenarDesSeleccionSinPasos(arreglo);
            }
        }
    }
    // Método descendente con Pasos
    public int [] ordenarDesSeleccionConPasos(int[] arreglo){
        int n = arreglo.length;
        int contComparaciones = 0;
        int contCambios = 0;
        for(int i=0; i<n-1; i++){
            int maxIdx = i;
            for(int j=i+1; j<n; j++){
                contComparaciones ++;
                if(arreglo[maxIdx]< arreglo[j]){
                    //Condición para encontrar el mayor
                    maxIdx = j;
                }
            }
            //CAMBIO
            if(maxIdx != i){
                int aux = arreglo[maxIdx];
                arreglo[maxIdx] = arreglo[i];
                arreglo[i]=aux;
                contCambios++;
            }
        }
        System.out.println("PASOS");
        int [] resultado = {contComparaciones, contCambios};
        return resultado;

    }

    // Método descendente sin Pasos
    public int [] ordenarDesSeleccionSinPasos(int[] arreglo){
        int n = arreglo.length;
        int contComparaciones = 0;
        int contCambios = 0;
        for(int i=0; i<n-1; i++){
            int maxIdx = i;
            for(int j=i+1; j<n; j++){
                contComparaciones ++;
                if(arreglo[maxIdx]< arreglo[j]){
                    //Condición para encontrar el mayor
                    maxIdx = j;
                }
            }
            //CAMBIO
            if(maxIdx != i){
                int aux = arreglo[maxIdx];
                arreglo[maxIdx] = arreglo[i];
                arreglo[i]=aux;
                contCambios++;
            }
        }
        int [] resultado = {contComparaciones, contCambios};
        return resultado;

    }

    // Método ascendente con Pasos
    public int [] ordenarAsSeleccionConPasos(int[] arreglo){
        int n = arreglo.length;
        int contComparaciones = 0;
        int contCambios = 0;
        for(int i=0; i<n-1; i++){
            int maxIdx = i;
            for(int j=i+1; j<n; j++){
                contComparaciones ++;
                if(arreglo[maxIdx]> arreglo[j]){
                    //Condición para encontrar el mayor
                    maxIdx = j;
                }
            }
            //CAMBIO
            if(maxIdx != i){
                int aux = arreglo[maxIdx];
                arreglo[maxIdx] = arreglo[i];
                arreglo[i]=aux;
                contCambios++;
            }
        }
        System.out.println("PASOS");
        int [] resultado = {contComparaciones, contCambios};
        return resultado;
    }
    // Método ascendente sin Pasos
    public int [] ordenarAsSeleccionSinPasos(int[] arreglo){
        int n = arreglo.length;
        int contComparaciones = 0;
        int contCambios = 0;
        for(int i=0; i<n-1; i++){
            int maxIdx = i;
            for(int j=i+1; j<n; j++){
                contComparaciones ++;
                if(arreglo[maxIdx]> arreglo[j]){
                    //Condición para encontrar el mayor
                    maxIdx = j;
                }
            }
            //CAMBIO
            if(maxIdx != i){
                int aux = arreglo[maxIdx];
                arreglo[maxIdx] = arreglo[i];
                arreglo[i]=aux;
                contCambios++;
            }
        }
        int [] resultado = {contComparaciones, contCambios};
        return resultado;
    }

    
}
