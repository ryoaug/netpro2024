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
    public void quickSort(int[] d){
        int a = 0;
        int b = d.length-1;
            if (a>=b) {
                return;
            }
            int p = d[(a + b)/2];
            int l = a, r = b, tmp;
            while(l<r) {
                while(d[l] < p) { l++; }
                while(d[r] > p) { r--; }
                if (l<=r) {
                    tmp = d[l]; d[l] = d[r]; d[r] = tmp;
                    l++; r--;
                }
            }
            quickSort(d);  // ピボットより左側をクイックソート
            quickSort(d); // ピボットより右側をクイックソート
        }
    }
