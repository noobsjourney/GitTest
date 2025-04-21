public class quicksort {
    public static int first;
    public static int last;
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 2, 4, 6, 8, 0};
        quickSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void quickSort(int[] arr, int left, int right) 
    {
       if (left >= right) {
           return;
       }
       int value = arr[(int)(left + Math.random() * (right - left + 1))];
       partition(arr, left, right, value);
       quickSort(arr, left, first - 1);
       quickSort(arr, last + 1, right);
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void partition(int[] arr, int left, int right, int value) {
        first = left;
        last = right;
        int i = left;
        while(i <= last) {
            if (arr[i] < value) {
                swap(arr, i++, first++);
            } else if (arr[i] > value) {
                swap(arr, i, last--);
            } else {
                i++;
            }
        }
    }
}
