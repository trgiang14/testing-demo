public class NumberProcessor {

    // phương thức có loop + rẽ nhánh
    public int processNumbers(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum += arr[i];      // số chẵn
            } else {
                sum -= arr[i];      // số lẻ
            }
        }

        return sum;
    }
}