package example;

public class FindConsecutiveNumOf1 {

	public static void main(String[] args) {
		int[] num = { 1, 1, 0, 1, 0, 1, 1, 1, 0 };

		int count = 0;
		int maxCount = 0;
		for (Integer n : num) {
			if (n == 1) {
				count++;
				int max = count;
				maxCount = Math.max(count, max);

			} else {
				count = 0;
			}
		}
		System.out.println(maxCount);
	}

}
