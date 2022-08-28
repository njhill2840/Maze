
public class RunMaze {

	public static void main(String[] args) {
		Maze m = new Maze();
		m.createMaze(27,81);
		for(int row = 0; row<m.getGrid().length; row++) {
			for(int col = 0; col<m.getGrid()[row].length; col++) {
				System.out.print(m.getGrid()[row][col]);
			}
			System.out.println();


		}

	}

}
