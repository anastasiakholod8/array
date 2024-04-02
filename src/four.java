public class four {
    public static void main(String[] args) {

        int array1[] = new int[10];
        int array2[] = new int[10];
        int array3[] = new int[10];
        double mid1 = 0, mid2 = 0 ;
        for (int i = 0; i <  10; i++) {
            array1[i] = (int)  (Math.random() * 11);
            mid1 = mid1 + array1[i];
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            array2[i] = (int)  (Math.random() * 11);
            mid2 = mid2 + array2[i];
            System.out.print(array2[i] + " ");

        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
           array3[i]=array1[i] + array2[i];
           System.out.println(array3[i] + " ");
        }

    }
}









