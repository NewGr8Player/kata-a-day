package com.michaelmidura.kataday.day022;

public class ConwayLife {

    public static int[][] getGeneration(int[][] cells, int generations) {
        ConwayLifeGrid grid = new ConwayLifeGrid(cells);

        return grid.getGrid();
    }

    public static class ConwayLifeGrid {
        private int[][] grid;

        public ConwayLifeGrid(int[][] grid) {
            this.grid = grid;
        }

        public void set(int x, int y, int n) {
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

            grid[x][y] = n;
        }

        public int[][] getGrid() {
            return grid.clone();
        }
    }
}