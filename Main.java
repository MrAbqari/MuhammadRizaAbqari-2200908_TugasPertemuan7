package tugas.pkg7.pbo;

public class Main {
	public static void main(String[] args) {

		StopWatch stopWatch = new StopWatch();
                
		int[] randomArray = getArray();
                
		stopWatch.start();

		selectionSort(randomArray);

		stopWatch.stop();

		System.out.println("Waktu eksekusi pengurutan array 100.000: " + stopWatch.getElapsedTime() +  " milidetik");
	}

	public static int[] getArray() {
		int[] array = new int[100000];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() * 100000);
		}
		return array;
	}

	public static void selectionSort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			int min = array[i];
			int minIndex = i;

			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < min) {
					min = array[j];
					minIndex = j;
				}
			}

			if (i != minIndex) {
				array[minIndex] = array[i];
				array[i] = min;
			}
		}
	} 
}
