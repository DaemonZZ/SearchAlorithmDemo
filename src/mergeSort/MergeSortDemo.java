package mergeSort;

public class MergeSortDemo {
    int[] arr;

    public int[] getArr() {
        return arr;
    }

    public MergeSortDemo(int[] arr) {
        this.arr = arr;
    }

    public void sort(int[] a, int head, int tail) {
        if (head < tail) {
            int mid = (head + tail) / 2;
            sort(a, head, mid);
            sort(a, mid + 1, tail);
            merge(a, head, mid, tail);
        }
    }

    private void merge(int[] a, int head, int mid, int tail) {
        int[] left = new int[mid - head + 1];
        int[] right = new int[tail - mid];
        for (int n = 0; n < left.length; n++) {
            left[n] = a[n + head];
            //System.out.print("left " + left[n]+"  ok?   ");
        }
        for (int n = 0; n < right.length; n++) {
            right[n] = a[n + mid + 1];
        }

        int i = 0, j = 0, k = head;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                a[k++] = left[i++];
            } else {
                a[k++] = right[j++];
            }
        }
        while (i < left.length) {
        }
        while (j < right.length) {
            a[k++] = right[j++];
        }
    }
}
