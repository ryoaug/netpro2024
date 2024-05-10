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
        int[] temp = {};
        if(a.length == b.length){
            for(int i = 0; i < a.length; i++){
                a[i] = temp[i];
                a[i] = b[i];
                temp[i] = a[i];
            }
            return true;
        }else{
            return false;
        }
    }
    
}
