public class Maze {
	// 0 = blank tile
	// 1 = solution path tile
	// 2 = generated path tile
	// 3 = start tile
	// 4 = end tile

	private int x_size;
	private int y_size;
	private int[][] grid;
	private int[] startTile;
	private int[] endTile;
	
	public void createGrid(int x,int y) {
		if(x!=0 & y!=0 & x%3==0 & y%3==0) {
			setXsize(x);
			setYsize(y);
			setGrid(x,y);
		}
		else {
			System.out.println("Error: x and y must be non-zero and divisible by 3");
		}
	}
	
	public void fillGrid() {
		for(int row = 0; row<grid.length; row++) {
			for(int col = 0; col<grid[row].length; col++) {
				this.grid[row][col] = 0;
			}
		}
	}
	
	public int[] randomTile() {
		return new int[]{Math.toIntExact(Math.round(Math.random()*Double.valueOf(this.getX_size())))
				,Math.toIntExact(Math.round(Math.random()*Double.valueOf(this.getY_size())))};
	}
	
	public void checkIfInGrid(int xOrY) {
		
	}
	
	public void checkIfFinish() {
		 
	}
	
	public int[][] createMaze(int x, int y) {
		createGrid(x,y);
		setStartTile(randomTile());
		setEndTile(randomTile());
		while(getEndTile() == getStartTile()) {
			setEndTile(randomTile());
		}
		fillGrid();
		
		return getGrid();
	}

	// Setters
	public void setXsize(int x){
		this.x_size = x;}
	public void setYsize(int y){
		this.y_size = y;
	}
	public void setGrid(int x, int y){
		this.grid = new int[x][y];
	}

	public void setStartTile(int[] start){
		this.startTile = start;
	}

	public void setEndTile(int[] end){
		this.endTile = end;
	}
	// Getters
	public int getX_size(){
		return this.x_size;
	}
	public int getY_size(){
		return this.y_size;
	}
	public int[][] getGrid(){
		return this.grid;
	}

	public int[] getStartTile() {
		return this.startTile;
	}

	public int[] getEndTile() {
		return this.endTile;
	}
}
