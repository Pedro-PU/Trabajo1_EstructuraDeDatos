public class MetodoInserción {
    public void ordenar(int[] arreglo, boolean isDes){
        if(isDes){
            insercionAscendente(arreglo);
        }else{
            insercionDescendente(arreglo);
            }
    }

    // Método ascendente
    public int insercionAscendente(int[] arr) {
        int n = arr.length;
        int contComparaciones = 0;
        for (int i = 1; i < n; i++) {
            int currentValue = arr[i];
            int position = i;
            

            while (position > 0 && arr[position - 1] > currentValue) {
                // Movemos el elemento mayor a la derecha
                arr[position] = arr[position - 1];
                // Nos movemos una posición a la izquierda
                position--;
                contComparaciones ++;
            }
            
            // Insertamos el valor en la posición correcta
            arr[position] = currentValue;
        }
        return contComparaciones;
    }

    // Método descendente
    public int insercionDescendente(int[] arr) {
        int n = arr.length;
        int contComparaciones = 0;

        for (int i = 1; i < n; i++) {
        int currentValue = arr[i];
        int position = i;
        contComparaciones ++;
            
        while (position > 0 && arr[position - 1] < currentValue) {
                // Movemos el elemento menor a la derecha
                arr[position] = arr[position - 1];
                // Nos movemos una posición a la izquierda
                position--;
            }
                
            // Insertamos el valor en la posición correcta
            arr[position] = currentValue;
        }
        return contComparaciones;
    }
}

