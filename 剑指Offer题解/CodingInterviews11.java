public class CodingInterviews11 {
  
    public int minArray(int[] numbers) {
        int len = numbers.length , min = numbers[0];
        if (len == 1){
            return numbers[0];
        }
        for (int i = 1; i < len; i++) {
            if (numbers[i - 1] > numbers[i]){
                min = numbers[i];
            }
        }
        return min;
    }
}
