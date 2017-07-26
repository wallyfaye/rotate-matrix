class MatrixWorker{

	private int[][] matrix2d;
	private int matrix_size;
        private int[] colors = new int[]{40, 41, 42, 43, 44, 45, 46, 47};
	private int height = matrix_size;
	private int width = matrix_size;

	public MatrixWorker(int matrix_size){
		this.matrix_size = matrix_size;
		this.height = this.matrix_size;
		this.width = this.matrix_size;
		this.matrix2d = new int[matrix_size][matrix_size];
		this.build();
	}

	public void rotate(){
		int cache_array_size = this.matrix_size - 1;
		int[] cache = new int[cache_array_size];

		// top
		for(int i = 0; i < cache_array_size; i++){
			int array_item = this.matrix2d[0][i];
			System.out.println(array_item);
//			cache[i] = this.matrix2d[0][i];
		}

			System.out.println("");

		// right
		for(int i = 0; i < cache_array_size; i++){
			int array_item = this.matrix2d[cache_array_size][i];
			System.out.println(array_item);
//			this.matrix2d[0][i] = this.matrix2d[cache_array_size][i];
		}

			System.out.println("");

		// bottom
		for(int i = 0; i < cache_array_size; i++){
			int array_item = this.matrix2d[cache_array_size - i][cache_array_size];
			System.out.println(array_item);
		}

			System.out.println("");

		// left
		for(int i = 0; i < cache_array_size; i++){
			int array_item = this.matrix2d[0][cache_array_size - i];
			System.out.println(array_item);
		}

			System.out.println("");




	}

	public void build(){

                for(int h = 0; h < this.height; h++){

                        for(int w = 0; w < this.width; w++){

                                int val = h + w;
                                this.matrix2d[h][w] = val;

                        }

                }

	}

	public void print(){

                System.out.println("");

                for(int h = 0; h < this.height; h++){

                        String row_out = "";

                        for(int w = 0; w < this.width; w++){

                                int val = this.matrix2d[h][w];
                                row_out += (char)27 + "[" + this.colors[val] + "m " + val + " ";

                        }

                        System.out.println(row_out);

                }

                System.out.println((char)27 + "[0m");

	}

}
