public class Triangle {

    // Треугольник существует только тогда, когда сумма любых двух его сторон больше третьей
    private static boolean isValidTriangle(int sideA, int sideB, int sideC) {
        return (sideA + sideB > sideC) && (sideB + sideC > sideA) && (sideC + sideA > sideB);
    }

    public static double countSquareBySides(int sideA, int sideB, int sideC) {
        if (sideA <= 0 || sideB <= 0 || sideC <= 0) {
            return 0d;
        } else if (!isValidTriangle(sideA, sideB, sideC)) {
            return 0d;
        }
        double halfP = (double) (sideA + sideB + sideC) / 2;
        return Math.sqrt(halfP * (halfP - sideA) * (halfP - sideB) * (halfP - sideC));
    }

}
