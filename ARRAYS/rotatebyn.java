class rotatebyn {
    public static void main(String[] args) {

        int arr[][] = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        // 90° Clockwise Rotation
        System.out.println("90° Clockwise");
        for (int j = 0; j < arr[0].length; j++) {
            for (int i = arr.length - 1; i >= 0; i--) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        // 180° Rotation
        System.out.println("\n180° Rotation");
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = arr[0].length - 1; j >= 0; j--) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        // Horizontal Mirror (Reverse each row)
        // NOTE: This is NOT a 270° rotation.
        System.out.println("\nHorizontal Mirror (Reverse Each Row)");
        for (int a = 0; a < arr.length; a++) {
            for (int j = arr[0].length - 1; j >= 0; j--) {
                System.out.print(arr[a][j] + "\t");
            }
            System.out.println();
        }

        // Actual 270° Clockwise Rotation (90° Anti-Clockwise)
        System.out.println("\n270° Clockwise / 90° Anti-Clockwise");
        for (int j = arr[0].length - 1; j >= 0; j--) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}