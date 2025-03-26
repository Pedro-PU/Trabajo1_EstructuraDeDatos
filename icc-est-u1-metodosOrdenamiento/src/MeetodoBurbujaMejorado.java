public class MeetodoBurbujaMejorado {
    public int [] ordenar(int [] arreglo, boolean isDes){
        int n = arreglo.length;
        int contComparaciones = 0;
        int contCambios = 0;
        if(isDes){
            //Ascendente
            for(int i=0; i<n-1; i++){
                for(int j = 0; j < n-1-i; j++){
                    System.out.println("Comparaciones: "+contComparaciones+" -> "+arreglo[j]+" > "+arreglo[(j+1)]);
                    contComparaciones ++;
                    if(arreglo[j]>arreglo[(j+1)]){
                        int aux = arreglo[j];
                        arreglo[j] = arreglo[(j+1)];
                        arreglo[(j+1)]=aux;
                        contCambios++;
                    }
                }
                System.out.println("Estado actual ->");
                
            }
        }else{
            //Descendente
            for(int i=0; i<n-1; i++){
                for(int j = 0; j < n-1-i; j++){
                    System.out.println("Comparaciones: "+contComparaciones+" -> "+arreglo[j]+" > "+arreglo[(j+1)]);
                    contComparaciones ++;
                    if(arreglo[j]<arreglo[(j+1)]){
                        int aux = arreglo[j];
                        arreglo[j] = arreglo[(j+1)];
                        arreglo[(j+1)]=aux;
                        contCambios++;
                    }
                }
                System.out.println("Estado actual ->");
            }
        }
        int [] resultado = {contComparaciones, contCambios};
        return resultado;
    }
    
}
