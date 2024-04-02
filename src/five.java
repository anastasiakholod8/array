public class five {
    public static void main(String[] args) {
        int[] array = new int[15];
        int sum =0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 11);
            System.out.println(array[i] + " ");
        }

        for (int i = 0; i < array.length; i++) {

            if(array[i] % 2 == 0){
                sum++;
            }
        }
         System.out.println();
         System.out.println(sum);
    }
}
