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
	}

	public void rotate(){
		
	}

	public void print(){

                System.out.println("");

                for(int h = 0; h < this.height; h++){

                        String row_out = "";

                        for(int w = 0; w < this.width; w++){

                                int val = h + w;
                                this.matrix2d[h][w] = val;
                                row_out += (char)27 + "[" + this.colors[val] + "m " + val + " ";

                        }

                        System.out.println(row_out);

                }

                System.out.println((char)27 + "[0m");

	}

}
