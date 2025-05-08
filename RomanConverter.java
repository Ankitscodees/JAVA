public class RomanConverter {
    public static void main(String[] args) {
        int number = 1987;
        String[] romans = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int[] values   = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            while (number >= values[i]) {
                number -= values[i];
                result.append(romans[i]);
            }
        }
        System.out.println("Roman numeral: " + result);
    }
}
