class _Demo {
	public static void main(String[] args){
		if (args.length < 0){
			System.out.println("Please specify one string to test");
			System.exit(0);
		}
		int height = 4;
		int width = 4;
		int[][] matrix = new int[height][width];
		for(int h = 0; h < height; h++){
			for(int w = 0; w < width; w++){
				int val = h + w;
				System.out.println(h + ", " + w + ", " + val);
				matrix[h][w] = val;
			}
		}
	}
}
