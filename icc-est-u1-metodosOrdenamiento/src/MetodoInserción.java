public class MetodoInserción {
    public int[] ordenar(int[] arreglo, boolean isDes, boolean condPasos){
        if(isDes){
            if(condPasos){
                return insercionAscendenteConPasos(arreglo);
            }else{
                return insercionAscendenteSinPasos(arreglo);
            }
        }else{
            if(condPasos){
                return insercionDescendenteConPasos(arreglo);
            }else{
                return insercionDescendenteSinPasos(arreglo);
            }
        }
    }

    // Método ascendente con Pasos
    public int [] insercionAscendenteConPasos(int[] arr) {
        int n = arr.length;
        int contComparaciones = 0;
        int contCambios = 0;
        for (int i = 1; i < n; i++) {
            int currentValue = arr[i];
            int position = i;
            

            while (position > 0) {
                contComparaciones++; // Se cuenta la comparación primero
                if (arr[position - 1] > currentValue) { // Solo si hay cambio, se incrementa contCambios
                    arr[position] = arr[position - 1];
                    position--;
                    contCambios++;
                } else {
                    break;
                }
            }
            
            
            // Insertamos el valor en la posición correcta
            arr[position] = currentValue;
        }
        System.out.println("PASOS");
        int [] resultado = {contComparaciones, contCambios};
        return resultado;
    }

    // Método ascendente sin Pasos
    public int [] insercionAscendenteSinPasos(int[] arr) {
        int n = arr.length;
        int contComparaciones = 0;
        int contCambios = 0;
        for (int i = 1; i < n; i++) {
            int currentValue = arr[i];
            int position = i;
            

            while (position > 0) {
                contComparaciones++; // Se cuenta la comparación primero
                if (arr[position - 1] > currentValue) { // Solo si hay cambio, se incrementa contCambios
                    arr[position] = arr[position - 1];
                    position--;
                    contCambios++;
                } else {
                    break;
                }
            }
            
            
            // Insertamos el valor en la posición correcta
            arr[position] = currentValue;
        }
        int [] resultado = {contComparaciones, contCambios};
        return resultado;
    }

    // Método descendente con Pasos
    public int [] insercionDescendenteConPasos(int[] arr) {
        int n = arr.length;
        int contComparaciones = 0;
        int contCambios = 0;
        for (int i = 1; i < n; i++) {
        int currentValue = arr[i];
        int position = i;
        contComparaciones ++;
            
        while (position > 0) {
            contComparaciones++; // Se cuenta la comparación primero
            if (arr[position - 1] < currentValue) { // Solo si hay cambio, se incrementa contCambios
                arr[position] = arr[position - 1];
                position--;
                contCambios++;
            } else {
                break;
            }
        }
        
                
            // Insertamos el valor en la posición correcta
            arr[position] = currentValue;
        }
        System.out.println("PASOS");
        int [] resultado = {contComparaciones, contCambios};
        return resultado;
    }

    // Método descendente sin Pasos
    public int [] insercionDescendenteSinPasos(int[] arr) {
        int n = arr.length;
        int contComparaciones = 0;
        int contCambios = 0;
        for (int i = 1; i < n; i++) {
        int currentValue = arr[i];
        int position = i;
        contComparaciones ++;
            
        while (position > 0) {
            contComparaciones++; // Se cuenta la comparación primero
            if (arr[position - 1] < currentValue) { // Solo si hay cambio, se incrementa contCambios
                arr[position] = arr[position - 1];
                position--;
                contCambios++;
            } else {
                break;
            }
        }
        
                
            // Insertamos el valor en la posición correcta
            arr[position] = currentValue;
        }
        int [] resultado = {contComparaciones, contCambios};
        return resultado;
    }
}

