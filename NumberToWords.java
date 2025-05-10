public class NumberToWords {
    public static void main(String[] args) {
        int number = 4021;
        String[] words = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        String numStr = String.valueOf(number);

        for (int i = 0; i < numStr.length(); i++) {
            int digit = Character.getNumericValue(numStr.charAt(i));
            System.out.print(words[digit] + " ");
        }
    }
}
