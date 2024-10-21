import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // MENU SIMPLE DE PRUEBA
        Scanner leer = new Scanner(System.in);

        // Pedir al usuario el tamaño del arreglo
        System.out.print("Ingrese el tamaño del arreglo: ");
        int tamanio = leer.nextInt();

        // Crear el arreglo con el tamaño especificado
        int[] arregloScanner = new int[tamanio];

        // Pedir al usuario que ingrese los valores del arreglo
        System.out.println("Ingrese los valores del arreglo:");
        for (int i = 0; i < tamanio; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            arregloScanner[i] = leer.nextInt();
        }

        // Preguntar al usuario si desea ordenar el arreglo
        System.out.print("¿Desea ordenar el arreglo? (S/N): ");
        String respuesta = leer.next();

        if (respuesta.equalsIgnoreCase("S")) {
            // Mostrar los métodos de ordenamiento disponibles
            System.out.println("Métodos de ordenamiento:");
            System.out.println("1. Bubble Sort");
            System.out.println("2. Selection Sort");
            System.out.println("3. Insertion Sort");
            System.out.println("4. Bubble Sort Optimized");

            // Pedir al usuario que elija el método de ordenamiento
            System.out.print("Elija el método de ordenamiento (1-4): ");
            int metodoOrdenamiento = leer.nextInt();

            // Ordenar el arreglo según el método elegido
            switch (metodoOrdenamiento) {
                case 1:
                    bubbleSort(arregloScanner);
                    break;
                case 2:
                    selectionSortPe(arregloScanner);
                    break;
                case 3:
                    insertionSort(arregloScanner);
                    break;
                case 4:
                    burbujaConAjuste(arregloScanner);
                    break;
                default:
                    System.out.println("Método de ordenamiento inválido.");
                    break;
            }

            // Mostrar el arreglo ordenado
            System.out.println("Arreglo Ordenado:");
            imprimirArreglo(arregloScanner);
        }

        // Preguntar al usuario qué método de búsqueda desea utilizar
        System.out.println("Métodos de búsqueda:");
        System.out.println("1. Búsqueda Secuencial");
        System.out.println("2. Búsqueda Binaria");

        System.out.print("Elija el método de búsqueda (1-2): ");
        int metodoBusqueda = leer.nextInt();

        // Pedir al usuario el valor a buscar
        System.out.print("Ingrese el valor a buscar: ");
        int valorBuscadoMenu = leer.nextInt();

        // Realizar la búsqueda según el método elegido
        int indice;
        switch (metodoBusqueda) {
            case 1:
                indice = busquedaSecuencial(arregloScanner, valorBuscadoMenu);
                break;
            case 2:
                indice = binariaBusqueda(arregloScanner, valorBuscadoMenu);
                break;
            default:
                System.out.println("Método de búsqueda inválido.");
                indice = -1;
                break;
        }

        // Mostrar el resultado de la búsqueda
        if (indice != -1) {
            System.out.println("El valor " + valorBuscadoMenu + " se encuentra en el índice " + indice + ".");
        } else {
            System.out.println("El valor " + valorBuscadoMenu + " no se encuentra en el arreglo.");
        }
        
        //METODOS DE BUSQUEDA SU IMPRESION
        int[] arregloBinario = {11, 12, 22, 25, 34, 64, 90};
        int buscadoBinario = 22;
        int resultadoBinario = binariaBusqueda(arregloBinario, buscadoBinario);
        if(resultadoBinario == -1){
            System.out.println("El elemento " + buscadoBinario + " no se encuentra en el arreglo bro.");
        }else{
            System.out.println("El elemento " + buscadoBinario + " se encuentra en el arreglo en el indice " + resultadoBinario + ".");
        }

        Metodos binaryMetodos = new Metodos();
        int[] arregloBin = {2,3,4,10,40};
        int xbinary = 10;
        int resultadoBinary = binaryMetodos.binarySearch(arregloBin, xbinary);
        if(resultadoBinary != -1){
            System.out.println("Elemento encontrado en el indice: " + resultadoBinary);
        }else {
            System.out.println("Elemento no encontrado en el arrego mijo vea bien");
        }

        int[] arrayBin = {2,3,4,5,6}; //NO PUEDE ESTAR DESORDENADO
        int valorBinBuscado = 5;
        int resultBin = busquedaBinaria(arrayBin, valorBinBuscado);
        if(resultBin != -1){
            System.out.println("El valor " + valorBinBuscado + " se encuentra en el indice " + resultBin);
        } else{
            System.out.println("El valor " + valorBinBuscado + " no se encuentra en el arreglo bro.");
        }

        int[] arraySeq = {64, 34, 25, 12, 22, 11, 90};
        int target = 22;

        int resultSeq = sequentialSearch(arraySeq, target);

        if(resultSeq == -1){
            System.out.println("El elemento " + target + " no se encuentra en el arreglo.");
        } else {
            System.out.println("El elemento " + target + " se encuentra en el índice " + resultSeq + ".");
        }

        Metodos lineMetodos = new Metodos();
        int[] arraySearch = {2,3,4,5,10,40,0};
        int x = 10;
        int resultadoS = lineMetodos.linearSearch(arraySearch, x);
        if(resultadoS != -1){
            System.out.println("Elemento encontrado en el indice: " + resultadoS);
        } else{
            System.out.println("Elemento no encontrado: ");
        }

        int[] arregloSecuencial = {5,3,8,4,2};
        int valorBuscado = 8;
        int result = busquedaSecuencial(arregloSecuencial, valorBuscado);
        if(result != -1){
            System.out.println("El valor " + valorBuscado + " Se encuentra en el indice " + result);
        } else {
            System.out.println("El valor " + valorBuscado + " No se encuentra en el arreglo mi bro.");
        }
        //METODOS DE ORDENAMIENTO SU IMPRESION
        int[] arrayInsertion = {12,11,13,5,6};
        System.out.println("Array Original Mi Bro: ");
        printInsertion(arrayInsertion);
        insertionSort(arrayInsertion);
        System.out.println("Array Ordenado Con Insercion Mi Bro: ");
        printArray(arrayInsertion);

        Metodos inserccion = new Metodos();
        int[] arregloInsertion = {3,0,10,20,90,-90,-10};
        inserccion.insertionSort(arregloInsertion);
        System.out.println("Arreglo en Inserccion: " + Arrays.toString(arregloInsertion));

        int[] arregloInsercion = {8,15,5,20,-1,4,3,19};
        inserccion(arregloInsercion);
        for(int numeroIns : arregloInsercion){
            System.out.print(numeroIns + " ");
        }
        System.out.println( );

        int[] arraySel = {3,6,7,1,-2,-3,6,100,-100};
        App.selectior(arraySel);
        System.out.println(Arrays.toString(arraySel));

        int[] arregloSelection = {64,69,96,46,0,12,1,-12,-1,-64,90};
        System.out.println("Arreglo Original Mi Bro:");
        imprimirArregloSel(arregloSelection);
        
        selectionSortPe(arregloSelection);

        System.out.println("Arreglo Ordenado Mi Bro:");
        imprimirArregloSel(arregloSelection);

        Metodos selMetodos = new Metodos();
        int[] arregloSeleccion = {3,-3,6,-6,10,20,-10,0};
        selMetodos.selectionSort(arregloSeleccion);
        System.out.print("Arreglo con Seleccion aqui: " + Arrays.toString(arregloSeleccion));
        System.out.println( );
        
        int[] arregloSel = {2,3,0,-2,-10,80,1};
        seleccion(arregloSel);
        System.out.println("Metodo Seleccion");
        for(int numeroSel : arregloSel){
            System.out.print(numeroSel + " ");
        }

        System.out.println( );
        int[] arregloAjustado = {90,45,78,1,5,34,10,2,0,-1};
        App.Ajustar(arregloAjustado);
        System.out.print(Arrays.toString(arregloAjustado));
        System.out.println( );
        int[] arregloinsano = {64, 34, 25, 12, 22, 11, 90, 10};
        System.out.println("Array original:");
        imprimirArreglo(arregloinsano);
        
        optimizedBubbleSort(arregloinsano);
        
        System.out.println("Array ordenado:");
        imprimirArreglo(arregloinsano);

        Metodos ajuste = new Metodos();
        int[] arregloyedai = {3,4,5,1,0,19,13,2};
        ajuste.bubbleSortOptimized(arregloyedai);
        System.out.println("Arreglo ordenado mi bro: " + Arrays.toString(arregloyedai));

        int[] arreglay = {7,0,1,2,6,8,9,3,4};
        burbujaConAjuste(arreglay);
        for(int numero : arreglay){
            System.out.print(numero + " ");
        }

        System.out.println( );
        int[] array = {5, 2, 8, 3, 1, 6, 4};
        App.ordenar(array);
        System.out.println(Arrays.toString(array)); // [1, 2, 3, 4, 5, 6, 8]


        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Array original:");
        printArray(arr);
        
        bubbleSort(arr);
        
        System.out.println("Array ordenado:");
        printArray(arr);

        Metodos burbuja = new Metodos();
        int[] arraylego = {64, 34, 25, 12, 22, 11, 90};
        burbuja.bubbleSort(array);
        System.out.println("Array ordenado: " + Arrays.toString(arraylego));


       int [] arreglo = {5,3,8,4,2};
       burbuja(arreglo);
       //Mostrar la impresion
       for(int val : arreglo){
            System.out.print(val + " ");
       }
       System.out.println( );
       int[] numeros = {5, 2, 8, 1, 4};
        // Llamamos al método para ordenar los números
        ordenarBurbuja(numeros);
        // Imprimimos los números ordenados
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
    }   
    //METODOS DE ORDENAMIENTO
    public static void burbuja(int [] arreglo){
        int tamanio = arreglo.length;
        for(int i = 0; i < tamanio - 1; i++){
            for(int j = 0; j < tamanio - 1 - i; j++){
                if(arreglo[j] > arreglo[j + 1]){
                    //Intercambiar
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                }
            }
        }
    }
    public static void ordenarBurbuja(int[] arreglo) {
        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]){
                    // Intercambiamos los elementos
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }
    }
    public static void ordenar(int[] arraylego){
        int naray = arraylego.length;
        for(int i = 0; i < naray - 1; i++){
            for(int j = 0; j < naray - i - 1; j++){
                if(arraylego[j] > arraylego[j + 1]){
                    // Swap
                    int tempaux = arraylego[j];
                    arraylego[j] = arraylego[j + 1];
                    arraylego[j + 1] = tempaux;
                }
            }
        }
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Intercambiar elementos
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void burbujaConAjuste(int[] arreglay){
        int tamanio = arreglay.length;
        boolean ordenado;
        for(int i = 0; i < tamanio - 1; i++){
            ordenado = true; //Suponiendo que este arreglado
            for(int j = 0; j < tamanio - i - 1; j++){
                if(arreglay[j] > arreglay[j + 1]){
                    int aux = arreglay[j];
                    arreglay[j] = arreglay[j + 1];
                    arreglay[j + 1] = aux;
                    ordenado = false; //Suponiendo que no haya estado ordenado y deba haber intercambio
                }
            }
            if(ordenado){
                break; //Suponiendo que no hubo intercambio se caba aqui
            }
        }
    }
    public static void optimizedBubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Intercambiar elementos
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // Si no hubo intercambios en esta pasada, el array está ordenado
            if (!swapped) {
                break;
            }
        }
    }
    public static void imprimirArreglo(int [] arregladitos){
        for(int i : arregladitos){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void Ajustar(int[] arregloAjustado){
        int tamanio = arregloAjustado.length;
        boolean swapper;
        for(int i = 0; i < tamanio - 1; i++){
            swapper = false;
            for(int j = 0; j < tamanio - i - 1; j++){
                if(arregloAjustado[j] > arregloAjustado[j + 1]){
                    int aux = arregloAjustado[j];
                    arregloAjustado[j] = arregloAjustado[j + 1];
                    arregloAjustado[j + 1] = aux;
                    swapper = true;
                }
            }
            if(!swapper) break;
        }
    }
    public static void seleccion(int[] arregloSel){
        int tamanio = arregloSel.length;
        for(int i = 0; i < tamanio - 1; i++){
            int indice = i; // Suponemos que el minimo esta en i
            for(int j = i + 1; j < tamanio; j++){
                if(arregloSel[j] < arregloSel[indice]){
                    indice = j; // Encuentra un numero minimo
                }
            }
            // Intercambiar el minimo con el primero no ordenado
            int aux = arregloSel[indice];
            arregloSel[indice] = arregloSel[i];
            arregloSel[i] = aux;
        }
    }
    public static void selectionSortPe(int[] arregloSelection){
        int tamanio = arregloSelection.length;
        for(int i = 0; i < tamanio - 1; i++){
            int index = i;
            for(int j = i + 1; j < tamanio; j ++){
                if(arregloSelection[j] < arregloSelection[index]){
                    index = j;
                }
            }
            int aux = arregloSelection[index];
            arregloSelection[index] = arregloSelection[i];
            arregloSelection[i] = aux;
        }
    }

    public static void imprimirArregloSel(int[] arregloSelection){
        for(int num : arregloSelection){
            System.out.print(num + " ");
        }
        System.out.println( );
    }
    public static void selectior(int [] arraySel){
        int n = arraySel.length;
        for(int r = 0; r < n - 1; r++){
            int men = r;
            for(int a = r + 1; a < n; a++){
                if(arraySel[a] < arraySel[men]){
                    men = a;
                }
            }
            //SWAP
            int aux = arraySel[men];
            arraySel[men] = arraySel[r];
            arraySel[r] = aux;
        }
    }
    public static void inserccion(int[] arregloInsercion){
        int tamanion = arregloInsercion.length;
        for(int r = 1; r < tamanion; r++){
            int key = arregloInsercion[r];
            int a = r - 1;
            //Mover los elementos mayores que la clave hacia adelante
            while(a >= 0 && arregloInsercion[a] > key) {
                arregloInsercion[a + 1] = arregloInsercion[a];
                a--;
            }
            arregloInsercion[a + 1] = key; //INSERTAR LA CLAVE EN SU POSICION CORRECTA
        }
    }
    public static void insertionSort(int[] arrayInsertion){
        int tamanio = arrayInsertion.length;
        for(int i = 1; i < tamanio; i++){
            int key = arrayInsertion[i];
            int j = i - 1;
            //Mover los elementos de arrayInsertion[0..i-1] que son mayores que key, 
            //a una posicion adelante de su posicion actual
            while (j >= 0 && arrayInsertion[j] > key) {
                arrayInsertion[j + 1] = arrayInsertion[j];
                j = j - 1;
            }
            arrayInsertion[j + 1] = key;
        }
    }
    public static void printInsertion(int[] arrayInsertion){
        for(int r : arrayInsertion){
            System.out.print(r + " ");
        }
        System.out.println( );
    }
    //METODOS DE BUSQUEDA
    public static int busquedaSecuencial(int [] arregloSecuencial, int valor){
        for(int i = 0; i < arregloSecuencial.length; i++){
            if(arregloSecuencial[i] == valor){
                return i; //Retorna el indice donde se encontro el valor
            }
        }
        return -1; //Si no se encuentra el valor, retorna -1
    }
    public static int sequentialSearch(int[] arraySeq, int target){
        for (int i = 0; i < arraySeq.length; i++) {
            if (arraySeq[i] == target) {
                return i; // Retorna el índice si el elemento es encontrado
            }
        }
        return -1; // Retorna -1 si el elemento no se encuentra en el array
    }
    public static int busquedaBinaria(int[] arrayBin, int valorBin){
        int inicio = 0;
        int fin = arrayBin.length - 1;

        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;

            if(arrayBin[medio] == valorBin){
                return medio; //Se encuentra el valor en el indice medio
            }

            if(arrayBin[medio] < valorBin){
                inicio = medio + 1; //Buscar en la mitad derecha
            } else {
                fin = medio - 1; //Buscar en la mitad izquierda
            }
        }
        return -1; //Si no se encuentra el valor a buscar
    }
    public static int binariaBusqueda(int[] arregloBinario, int buscadoBinario){
        int izquierda = 0;
        int derecha = arregloBinario.length - 1;

        while (izquierda <= derecha) {
            int mitad = derecha + (derecha - izquierda) / 2;
            //Si el elemento esta presente en el medio
            if(arregloBinario[mitad] == buscadoBinario){
                return mitad;
            }
            //Si el elemento es mayor, ignora la mitad izquierda
            if(arregloBinario[mitad] < buscadoBinario){
                izquierda = mitad + 1;
            }else{
                //Si el elemento es menor, ignora la mitad derecha
                derecha = mitad - 1;
            }
        }
        //Si llegamos aqui, el elemento no esta presente o el arreglo esta desordenado mal
        return -1;
    }
}