package processor;

import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("1. Add matrices");
        System.out.println("2. Multiply matrix by a constant");
        System.out.println("3. Multiply matrices");
        System.out.println("4. Transpose matrix");
        System.out.println("5. Calculate a determinant");
        System.out.println("6. Inverse matrix");
        System.out.println("0. Exit");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your choice: > ");

        boolean isExit = true;
        while (isExit) {
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addMatrices();
                    break;
                case 2:
                    multiByConst();
                    break;
                case 3:
                    multiplyMatrices();
                    break;
                case 4:
                    System.out.println("1. Main diagonal");
                    System.out.println("2. Side diagonal");
                    System.out.println("3. Vertical line");
                    System.out.println("4. Horizontal line");
                    System.out.println("Your choice: > ");
                    int choiceTrans = scanner.nextInt();
                    switch (choiceTrans) {
                        case 1:
                            transpMainDiagonal();
                            break;
                        case 2:
                            transpSideDiagonal();
                            break;
                        case 3:
                            transpVertLine();
                            break;
                        case 4:
                            transpHorLine();
                            break;
                    }
                    break;
                case 5:
                    determinant();
                    break;
                case 6:
                    inverseMatrix();
                    break;
                case 0:
                    isExit = false;
                    break;
            }
        }
    }

    public static void addMatrices() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of first matrix: > ");
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        System.out.println("Enter first matrix:");
        double[][] matrixA = new double[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrixA[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("Enter size of second matrix: > ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        System.out.println("Enter second matrix:");
        double[][] matrixB = new double[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                matrixB[i][j] = scanner.nextDouble();
            }
        }
        double[][] matrixC = new double[n][m];

        if (n == x && m == y) {
            System.out.println("The result is:");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    matrixC[i][j] = matrixA[i][j] + matrixB[i][j];
                    System.out.print(matrixC[i][j] + " ");
                }
                System.out.println();
            }
        } else System.out.println("The operation cannot be performed.");
    }

    public static void multiByConst() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of matrix: > ");
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        System.out.println("Enter matrix:");
        double[][] matrixA = new double[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrixA[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("Enter constant: > ");
        double multi = scanner.nextDouble();

        double[][] matrixC = new double[n][m];
        System.out.println("The result is:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrixC[i][j] = matrixA[i][j] * multi;
                System.out.print(matrixC[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void multiplyMatrices() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of first matrix: > ");
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        System.out.println("Enter first matrix:");
        double[][] matrixA = new double[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrixA[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("Enter size of second matrix: > ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        System.out.println("Enter second matrix:");
        double[][] matrixB = new double[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                matrixB[i][j] = scanner.nextDouble();
            }
        }
        double[][] matrixC = new double[n][y];

        if (m == x) {
            System.out.println("The result is:");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    for (int k = 0; k < y; k++) {
                        matrixC[i][k] += matrixA[i][j] * matrixB[j][k];
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < y; j++) {
                    System.out.print(matrixC[i][j] + " ");
                }
                System.out.println();
            }
        } else System.out.println("The operation cannot be performed.");
    }

    public static void transpMainDiagonal() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter matrix size: > ");
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        System.out.println("Enter matrix:");
        int[][] matrixA = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrixA[i][j] = scanner.nextInt();
            }
        }

        System.out.println("The result is:");
        int[][] matrixTrans = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrixTrans[i][j] = matrixA[j][i];
                System.out.print(matrixTrans[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void transpSideDiagonal() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter matrix size: > ");
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        System.out.println("Enter matrix:");
        double[][] matrixA = new double[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrixA[i][j] = scanner.nextDouble();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m - i - 1; j++) {
                double temp = matrixA[i][j];
                matrixA[i][j] = matrixA[n - 1 - j][m - 1 - i];
                matrixA[n - 1 - j][m - 1 - i] = temp;
            }
        }
        System.out.println("The result is:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrixA[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void transpVertLine() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter matrix size: > ");
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        System.out.println("Enter matrix:");
        double[][] matrixA = new double[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrixA[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("The result is:");
        double[][] matrixTrans = new double[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrixTrans[i][j] = matrixA[i][m - j - 1];
                System.out.print(matrixTrans[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void transpHorLine() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter matrix size: > ");
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        System.out.println("Enter matrix:");
        double[][] matrixA = new double[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrixA[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("The result is:");
        double[][] matrixTrans = new double[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrixTrans[i][j] = matrixA[n - i - 1][j];
                System.out.print(matrixTrans[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void determinant() {
        System.out.print("Enter matrix size: ");
        int n = Integer.parseInt(in.next());
        int m = Integer.parseInt(in.next());
        System.out.println("Enter the matrix:");
        ValidMatrix A = readMatrix(n, m);
        System.out.println(MatrixCalc.det(A));
    }

    public static ValidMatrix readMatrix(int n, int m) {
        double[][] mat = new double[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = Double.parseDouble((in.next()));
            }
        }
        return new ValidMatrix(mat);
    }

    public static void inverseMatrix() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter matrix size: > ");
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        System.out.println("Enter matrix:");
        double[][] matrixA = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrixA[i][j] = scanner.nextDouble();
            }
        }

        double temp;

        double[][] matrixInverse = new double[n][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) {
                matrixInverse[i][j] = 0;
                if (i == j) matrixInverse[i][j] = 1;
            }
        for (int k = 0; k < n; k++) {
            temp = matrixA[k][k];

            for (int j = 0; j < n; j++) {
                matrixA[k][j] /= temp;
                matrixInverse[k][j] /= temp;
            }
            for (int i = k + 1; i < n; i++) {
                temp = matrixA[i][k];
                for (int j = 0; j < n; j++) {
                    matrixA[i][j] -= matrixA[k][j] * temp;
                    matrixInverse[i][j] -= matrixInverse[k][j] * temp;
                }
            }
        }

        for (int k = n - 1; k > 0; k--) {
            for (int i = k - 1; i >= 0; i--) {
                temp = matrixA[i][k];

                for (int j = 0; j < n; j++) {
                    matrixA[i][j] -= matrixA[k][j] * temp;
                    matrixInverse[i][j] -= matrixInverse[k][j] * temp;
                }
            }
        }

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                matrixA[i][j] = matrixInverse[i][j];

        System.out.println("The result is:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrixInverse[i][j] + " ");
            }
            System.out.println();
        }
    }

}