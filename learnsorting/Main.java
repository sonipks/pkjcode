public class Main {

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int a[] = {2,12,90,1,6,2,3,25,15 };
		System.out.println("input: ");
		display(a);

		System.out.println("\n****************************");
//		new BubbleSort2Algorithm().sort(a);
//		 new InsertionSortAlgorithm().sort(a);
//		 new SelectionSortAlgorithm().sort(a);
		 new MergeSortAlgorithm().sort(a);
		// new ShellSortAlgorithm().sort(a);
//		 new HeapSortAlgorithm().sort(a);
		System.out.println();
		System.out.println("Output: ");
		display(a);

	}

	public static void display(int[] a) {
		for (int t : a) {
			System.out.print(t + ", ");
		}
	}

}
