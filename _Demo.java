class _Demo {
	public static void main(String[] args){

		if(args.length != 1){
			System.out.println("You must enter a number from 1 - 4");
			System.exit(0);
		}

		int matrix_size = Integer.parseInt(args[0]);
		if(matrix_size > 4 || matrix_size < 1){
			System.out.println("You must enter a number from 1 - 4");
			System.exit(0);
		}

		MatrixWorker mworker = new MatrixWorker(matrix_size);
		mworker.print();
		mworker.rotate();
		mworker.print();

	}
}
