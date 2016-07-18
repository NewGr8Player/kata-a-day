package com.michaelmidura.kataday.day022;

public class ConwayLife {

	public static int[][] getGeneration(int[][] cells, int generations) {
		ConwayLifeGrid grid = new ConwayLifeGrid(cells);

		return grid.getGrid();
	}

	public static void main(String[] args) {
		int[][] gliders = {
				{0, 1, 0},
				{0, 0, 1},
				{1, 1, 1}
		};
		ConwayLifeGrid grid = new ConwayLifeGrid(gliders);
		System.out.println(grid.get(1, 0) + " " + grid.get(1, 1) + " " + grid.get(1, 2));
	}

	public static class ConwayLifeGrid {
		private int[][] grid;

		public ConwayLifeGrid(int[][] grid) {
			this.grid = grid;
		}

		public void gridCheck(int x, int y) {
			if (x >= grid.length) {
				int[][] tmp = grid;
				grid = new int[x + 1][];
				System.arraycopy(tmp, 0, grid, 0, tmp.length);
				for (int i = x; i < x + 1; i++)
					grid[i] = new int[y];
			}

			if (y >= grid[x].length) {
				int[] tmp = grid[x];
				grid[x] = new int[y + 1];
				System.arraycopy(tmp, 0, grid[x], 0, tmp.length);
			}
		}

		public void set(int x, int y, int n) {
			gridCheck(x, y);
			grid[x][y] = n;
		}

		public int get(int x, int y) {
			gridCheck(x, y);
			return grid[x][y];
		}

		public int[][] getGrid() {
			return grid.clone();
		}
	}
}