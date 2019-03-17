public class ErrorHandling {

    public static void main(String[] args) {

        int[] array = new int[10];

        try {
            processArray(array);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("code after error");

    }

    private static void processArray(int[] array) throws Exception {
        array[20] = 5;
    }

}
