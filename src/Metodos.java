public class Metodos {
    public void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Intercambiar arr[j] y arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public void bubbleSortOptimized(int[] arreglo){
        int space = arreglo.length;
        boolean swapped;
        for(int i = 0; i < space - 1; i++){
            swapped = false;
            for(int j = 0; j < space - 1 - i; j++){
                if(arreglo[j] > arreglo[j + 1]){
                    //intercambio de arreglo[j] & arreglo[j + 1]
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                    swapped = true;
                }
            }
            if(!swapped) break; // Si no hubo intercambio, el array está ordenado
        }
    }
    public void selectionSort(int[] arregloSel){
        int tamanio = arregloSel.length;
        for(int i = 0; i < tamanio - 1; i++){
            int minIdex = i;
            for(int j = i + 1; j < tamanio; j++){
                if(arregloSel[j] < arregloSel[minIdex]){
                    minIdex = j;
                }
            }
            // Intercambiar arregloSel[i] y arreglo[minIndex]
            int aux = arregloSel[minIdex];
            arregloSel[minIdex] = arregloSel[i];
            arregloSel[i] = aux;
        }
    }
    public void insertionSort(int[] arregloInsercion){
        int tamanio = arregloInsercion.length;
        for(int i = 1; i < tamanio; i++){
            int key = arregloInsercion[i];
            int j = i - 1;
            // Mover los elementos mayores que key una posicion hacia adelante
            while(j >= 0 && arregloInsercion[j] > key){
                arregloInsercion[j + 1] = arregloInsercion[j];
                j = j - 1;
            }
            arregloInsercion[j + 1] = key;
        }
    }
    public int linearSearch(int[] arraySearch, int x){
        int tamanio = arraySearch.length;
        for(int i = 0; i < tamanio; i++){
            if(arraySearch[i] == x){
                return i; // Retorna el indice del elemento encontrado
            }
        }
        return -1; //Si el elemento no se encuentra, retorna -1
    }
    public int binarySearch(int[] arrayBin, int x){
        int left = 0, right = arrayBin.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            //Verifica si x esta en el medio
            if(arrayBin[mid] == x){
                return mid;
            }
            //Si x es mayor, ignora la mitad izquierda
            if(arrayBin[mid] < x){
                left = mid + 1;
            }else{
                //Si x es menor, ignora la mitad derecha
                right = mid - 1;
            }
        }
        return -1; //Si el elemento no se encuentra, retorna -1
    }
}