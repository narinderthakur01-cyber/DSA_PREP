class rotatebyn {
    public static void main(String[] args) {

        int arr[][] = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        // 90° Clockwise Rotation
        System.out.println("90");
        for (int j = 0; j < arr[0].length; j++) {
            for (int i = arr.length - 1; i >= 0; i--) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        // 180° Rotation
        System.out.println("180");
        for (int n = arr.length - 1; n >= 0; n--) {
            for (int j = arr.length - 1; j >= 0; j--) {
                System.out.print(arr[n][j] + "\t");
            }
            System.out.println();
        }

        // Horizontal Mirror (Reverse Each Row)
        // This was your original "270" code.
        // It is a valid matrix transformation, but NOT a 270° rotation.
        System.out.println("Horizontal Mirror");
        for (int a = 0; a < arr.length; a++) {
            for (int j = arr.length - 1; j >= 0; j--) {
                System.out.print(arr[a][j] + "\t");
            }
            System.out.println();
        }

        // Actual 270° Clockwise Rotation (90° Anti-Clockwise)
        System.out.println("270");
        for (int j = arr[0].length - 1; j >= 0; j--) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}