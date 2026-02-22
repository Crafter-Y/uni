public class HellmannBrute {
    private static int subsetSumFromBits(int[] key, String bits) {
        int sum = 0;
        for (int i = 0; i < key.length; i++) {
            if (bits.charAt(i) == '1') sum += key[i];
        }
        return sum;
    }

    private static char decryptBlock(int[] key, int letter) {
        int n = key.length;

        for (int mask = 0; mask < Math.pow(2, n); mask++) {
            // 00000000 bis 11111111
            String bits = String.format("%" + n + "s", Integer.toBinaryString(mask)).replace(' ', '0');

            int sum = subsetSumFromBits(key, bits);
            if (sum == letter) {
                return (char) mask;
            }
        }

        return '?';
    }

    public static String solve(int[] key, int[] ciphertext) {
        StringBuilder result = new StringBuilder();

        for (int letter : ciphertext) {
            result.append(decryptBlock(key, letter));
        }

        return result.toString();
    }
    
    public static void main() {
        System.out.println();
        System.out.println();
        int[] key = {211, 212, 424, 217, 13, 447, 473, 105};
        int[] message = {876, 1674, 853, 424, 1007, 1188, 1214, 1326, 1188, 1300, 529, 746, 746};
        System.out.println(solve(key, message));
    }
}
