package t4_exception;

import java.util.Arrays;

public class Exception1_interrupted {
	public static void main(String[] args) {
		int[] lotto = new int[6];

		System.out.print("금주의 로또번호는? ");
		atom: for (int i = 0; i < 6; i++) {
			int rand = (int) (Math.random() * 45) + 1;
			if (lotto[i] == rand) {
				i--;
				continue atom;
			}

			for (int j = 0; j < 5; j++) {
				System.out.print(".");
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
				}
			}
			System.err.print(rand);
			lotto[i] = rand;
		}

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
		}
		Arrays.sort(lotto);
		System.out.print("\n행운을 붙잡으세요 :");
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}

	}
}
