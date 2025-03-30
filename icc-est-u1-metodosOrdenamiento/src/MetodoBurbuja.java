public class MetodoBurbuja {
    public void imprimirArreglo(int[] arreglo){
        System.out.println("-".repeat(120));
        for(int i=0; i<arreglo.length; i++){
            System.out.print("[");
            System.out.print(" "+arreglo[i]+" ");
            System.out.print("]");
        }
        System.out.println("\n"+"-".repeat(120));
    }

    public int [] ordenar(int [] arreglo, boolean isDes, boolean condPasos){
        int n = arreglo.length;
        int contComparaciones = 0;
        int contCambios=0;
        if(isDes){
            //Ascendente
            if(condPasos){
                for(int i=0; i<n; i++){
                    for(int j = i+1; j < n; j++){
                        contComparaciones ++;
                        System.out.println("Comparaciones: "+contComparaciones+" -> "+arreglo[i]+" > "+arreglo[(j)]);
                        //System.out.println("i: "+i+" j: "+j);
                        if(arreglo[i]>arreglo[j]){
                            int aux = arreglo[j];
                            arreglo[j] = arreglo[i];
                            arreglo[i]=aux;
                            contCambios++;
                        }
                    }
                    System.out.println("Estado actual -> \n");
                }
            }else{
                for(int i=0; i<n; i++){
                    for(int j = i+1; j < n; j++){
                        contComparaciones ++;
                        //System.out.println("Comparaciones: "+contComparaciones+" -> "+arreglo[j]+" > "+arreglo[(j+1)]);
                        //System.out.println("i: "+i+" j: "+j);
                        if(arreglo[i]>arreglo[j]){
                            int aux = arreglo[j];
                            arreglo[j] = arreglo[i];
                            arreglo[i]=aux;
                            contCambios++;
                        }
                    }
                    //System.out.println("Estado actual ->");
                }
            }
            
        }else{
            //Descendente
            if(condPasos){
                for(int i=0; i<n; i++){
                    for(int j = i+1; j < n; j++){
                        System.out.println("Comparaciones: "+contComparaciones+" -> "+arreglo[j]+" > "+arreglo[(j+1)]);
                        //System.out.println("i: "+i+" j: "+j);
                        contComparaciones ++;
                        if(arreglo[i]<arreglo[j]){
                            int aux = arreglo[j];
                            arreglo[j] = arreglo[i];
                            arreglo[i]=aux;
                            contCambios++;
                        }
                    }
                    System.out.println("Estado actual -> \n");
                }
            }else{
                for(int i=0; i<n; i++){
                    for(int j = i+1; j < n; j++){
                        //System.out.println("Comparaciones: "+contComparaciones+" -> "+arreglo[j]+" > "+arreglo[(j+1)]);
                        //System.out.println("i: "+i+" j: "+j);
                        contComparaciones ++;
                        if(arreglo[i]<arreglo[j]){
                            int aux = arreglo[j];
                            arreglo[j] = arreglo[i];
                            arreglo[i]=aux;
                            contCambios++;
                        }
                    }
                    //System.out.println("Estado actual ->");
                }
            }
            
        }
        int [] resultado = {contComparaciones, contCambios};
        return resultado;
    }
}
