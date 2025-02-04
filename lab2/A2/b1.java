import java.util.*;

public class b1{
	public static void main(String[] args) {
		int[] array = new int[1000];
		Random random = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(100) + 1; 
		}

		int numThreads = 10;
		int partSize = array.length / numThreads;
		Thread[] threads = new Thread[numThreads];
		SumCalculator[] calculators = new SumCalculator[numThreads];


		for (int i = 0; i < numThreads; i++) {
			calculators[i] = new SumCalculator(array, i * partSize, (i + 1) * partSize);
			threads[i] = new Thread(calculators[i]);
			threads[i].start();
		}


		for (int i = 0; i < numThreads; i++) {
			try {
				threads[i].join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}


		int totalSum = 0;
		for (SumCalculator calculator : calculators) {
			totalSum += calculator.getPartialSum();
		}


		double average = (double) totalSum / array.length;

		System.out.println("Total Sum: " + totalSum);
		System.out.println("Average: " + average);
	}
}


class SumCalculator implements Runnable {
	 int[] array;
	 int start;
	 int end;
	 int partialSum;

	public SumCalculator(int[] array, int start, int end) {
		this.array = array;
		this.start = start;
		this.end = end;
	}

	@Override
	public void run() {
		partialSum = 0;
		for (int i = start; i < end; i++) {
			partialSum += array[i];
		}
	}

	public int getPartialSum() {
		return partialSum;
	}
}
