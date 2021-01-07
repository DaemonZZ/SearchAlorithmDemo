package binary;


public class BinarySearchDemo {
    int[] a = new int[]{2,3,5,7,45,654,754,777,2345,4433,4555,5652,8887};

    public BinarySearchDemo() {
        System.out.println(search(a,2345));
    }
    public int search(int[] a,int element){
        int head = 0, tail =a.length-1;
        int mid;
        while (head<=tail){
//            if(a[head]==element) return head;
//            if(a[tail]==element) return tail;
            mid=(head+tail)/2;
            if(a[mid]==element) return mid;
            if(a[mid]<element) head = mid+1;
            if(a[mid]>element) tail =mid -1;
        }
        return -1;
    }

    public static void main(String[] args) {
        new BinarySearchDemo();
    }
}
