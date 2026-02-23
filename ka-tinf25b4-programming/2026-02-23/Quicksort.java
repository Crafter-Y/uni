public class Quicksort {
    private int[] data;

    public Quicksort(int[] array) {
        this.data = array;

        quicksort(0, data.length - 1);
    }

    private void quicksort(int left, int right) {
        if (left < right) {
            int div = div(left, right);
            quicksort(left, div - 1);
            quicksort(div + 1, right);
        }
    }

    private int div(int left, int right) {
        int i = left;
        int j = right - 1;
        int pivot = data[right];

        while(i < j) {
            while(data[i] <= pivot && i < right) {
                i++;
            }

            while(data[j] >= pivot && j > left) {
                j--;
            }

            if (i < j) {
                int inter = data[i];
                data[i] = data[j];
                data[j] = inter;
            }
        }

        if (data[i] > pivot) {
            int inter = data[i];
            data[i] = data[right];
            data[right] = inter;
        }

        return i;
    }

    public int[] getArray() {
        return this.data;
    }

    public static int[] sort(int[] array) {
        Quicksort qs = new Quicksort(array);
        return qs.getArray();
    }

    public static void main() {
        int[] unsorted = {9, 2, 5, 7, 8, 3, 4, 10, 1, 6};

        int[] sorted = sort(unsorted);
        for (int i = 0; i < sorted.length; i++) {
            System.out.print(sorted[i] + " ");
        }
        System.out.println();
    }
}
