import java.util.Random;

final int SIZE = 100;

void main() {
    Random rnd = new Random();
    
    int[] nums = new int[100];

    // construct random array
    for (int i = 0; i < 100; i++) {
        nums[i] = rnd.nextInt(10);
        System.out.print(nums[i] + ", ");
    }
    System.out.println();

    // calculate average
    int sum = 0;
    for (int i : nums) {
        sum += i;
    }
    double average = sum / (SIZE * 1d);

    System.out.println("Mittelwert: " + average);
    
    // variance
    double variance = 0;

    for (int i : nums) {
        variance += Math.pow((i - average), 2);
    }

    variance = variance / (SIZE - 1d);

    // std dev.
    double standartDeviation = Math.sqrt(variance);

    System.out.println("Standartabwichung: " + standartDeviation);
}