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
		this.matrix2d = new int[this.height][this.width];
		this.build();
	}

	public void rotate(){

		for(int l = 0; l < matrix_size/2; l++){

			int full_cache_array_size = this.matrix_size - 1;
			
			int cache_array_size = full_cache_array_size - (l * 2);
			int[] cache = new int[cache_array_size];

			for(int i = 0; i < cache_array_size; i++){
				cache[i] = this.matrix2d[l][i  + l];
				this.matrix2d[l][i + l] = this.matrix2d[i + l][full_cache_array_size - l];
				this.matrix2d[i + l][full_cache_array_size - l] = this.matrix2d[full_cache_array_size - l][full_cache_array_size - i - l];
				this.matrix2d[full_cache_array_size - l][full_cache_array_size - i - l] = this.matrix2d[full_cache_array_size - i - l][l];
				this.matrix2d[full_cache_array_size - i - l][l] = cache[i];
			}
		}

	}

	private void build(){

                for(int h = 0; h < this.height; h++){

                        for(int w = 0; w < this.width; w++){

                                int val = h;
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
