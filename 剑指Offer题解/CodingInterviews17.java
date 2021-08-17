class CodingInterviews17 {
   public int[] printNumbers(int n) {
        int num = (int)Math.pow(10, n);
        int[] result = new int[num - 1];
        for(int i = 0; i < num - 1; i++) result[i] = i + 1;
        return result;
    }
}
