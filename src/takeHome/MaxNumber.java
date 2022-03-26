package takeHome;

public class MaxNumber {

	public static void main(String[] args) {
		int values[] = { 1, 5, -9, 12, -3, 89, 100, 18, 23, 4, -6 };

		System.out.println(GetMax(values));

	}

	public static int GetMax(int[] values) {

		int max = values[0];
		for (int i = 0; i < values.length; i++) {
			if (values[i] > max) {
				max = values[i];
			}
		}

		return max;

	}

}
