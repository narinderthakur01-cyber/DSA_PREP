class twoDarr {
    public static void main(String[] args) {

        int arr[][] = {
            {1, 2, 3},
            {4, 5, 6}
        };

        // Row-wise traversal (matrix format)
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println();

        // Row-wise traversal (single line)
        for (int a = 0; a < arr.length; a++) {
            for (int b = 0; b < arr[a].length; b++) {
                System.out.print(arr[a][b] + "\t");
            }
        }

        System.out.println("\n");

        // Column-wise traversal
        for (int j = 0; j < arr[0].length; j++) {
            for (int t = 0; t < arr.length; t++) {
                System.out.print(arr[t][j] + "\t");
            }
            System.out.println();
        }
    }
}