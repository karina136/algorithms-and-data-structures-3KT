package Task29;

public class Row {
    private int number;
    private int start;
    private int[] row;
    private boolean result;
    Row(int start, int number) {
        this.number = number;
        this.start = start;
        row = createRow(start, this.number);
        this.result = checkResult();
    }
    private static int[] createRow(int start, int number) {
        int numberLength = String.valueOf(number).length();
        int[] array = new int[numberLength];
        for (int i = 0; i < numberLength; i++) {
            array[i] = start;
            start += 1;
        }
        return array;
    }
    private boolean checkResult() {
        String[] numberStr = String.valueOf(this.number).split("");
        int numberLength = String.valueOf(this.number).length();
        int sum = 0;
        for (int i = 0; i < numberLength; i++) {
            sum += Math.pow(Integer.parseInt(numberStr[i]), this.row[i]);
        }
        return ((this.number * this.start) == (sum));
    }
    public boolean getResult() {
        return this.result;
    }
}
