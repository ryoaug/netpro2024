public class Renshu {
    public int doubleValue(int x){
        return x * 2;
    }
    public int sumUpToN(int n){
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum = sum + i;
        };
        return sum;
    }
    public int sumFromPtoQ(int p, int q){
        int sum = 0;
        if(p <= q){
            for(int i = p; i <= q; i++){
                sum = sum + i;
            }
            return sum;
        }else{
            return  -1;
        }
    }
    public int sumFromArrayIndex(int[] a, int index){
        int sum = 0;
        if(a.length > index){
            for(int i = index; i < a.length; i++){
                sum = sum + a[i];
            }
            return sum;
        }else{
            return -1;
        }
    }
    public int selectMaxValue(int[] a){
        int max = a[0];
        for(int i = 0; i < a.length; i++){
            if(a[0] < a[i]){
                max = a[i];
            }
        }
        return max;
    }
    public int selectMinValue(int[] a){
        int min = a[0];
        for(int i = 0; i < a.length; i++){
            if(min > a[i]){
                min = a[i];
            }
        }
        return min;
    }
    public int selectMaxIndex(int[] a){
        int max = a[0];
        int index = 0;
        //int min = a[0];
        for(int i = 0; i < a.length; i++){
            if(max < a[i]){
                max = a[i];
                index = i;
            }
        }
        return index;
    }
    public void swapArrayElements(int[] p, int i, int j){
        int temp = p[j];
        p[j] = p[i];
        p[i] = temp;
    }
    public boolean swapTwoArrays(int[] a, int[] b){
        int temp = 0;
        if(a.length == b.length){
            for(int i = 0; i < a.length; i++){
                temp = a[i];
                a[i] = b[i];
                b[i] = temp;
            }
            return true;
        }else{
            return false;
        }
    }
    public void bubble_sort(int[] d) {
            // iはi回目の交換する回数
            for (int i = d.length-1; i > 0; i-- ) {
                // j は交換する箇所の前からの番号を示している
                for (int j = 0; j < i; j++) {
                    if(d[j]>d[j+1]){
                      //降順にしたい場合は不等号を逆に
                      int box = d[j];
                      d[j] = d[j+1];
                      d[j+1] = box;
                      System.out.println(d[j] + ":" +d[j+1]);
                    } else{
                      //そのまま
                    }
                }
            }
    }
    public static void quickSort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        quickSort(arr, 0, arr.length - 1);
    }
    
    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
    
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }
    
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}