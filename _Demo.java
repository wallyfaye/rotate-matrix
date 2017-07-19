class _Demo {
	public static void main(String[] args){
		if (args.length < 0){
			System.out.println("Please specify one string to test");
			System.exit(0);
		}
		int height = 4;
		int width = 4;
		int[][] matrix = new int[height][width];

		int[] colors = new int[8];
		colors[0] = 40;
		colors[1] = 41;
		colors[2] = 42;
		colors[3] = 43;
		colors[4] = 44;
		colors[5] = 45;
		colors[6] = 46;
		colors[7] = 47;
		System.out.println("");
		for(int h = 0; h < height; h++){
			String row_out = "";
			for(int w = 0; w < width; w++){
				int val = h + w;
				matrix[h][w] = val;
//				row_out += val + " ";
				row_out += (char)27 + "[" + colors[val] + "m " + val + " "; 
			}
			System.out.println(row_out);
		}
		System.out.println((char)27 + "[0m");
	}
}
