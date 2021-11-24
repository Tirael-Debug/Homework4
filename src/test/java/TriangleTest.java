import org.junit.Assert;
import org.junit.Test;

/**
 * По отчету:
 *
 * Получилось настроить движок surefire. Для этого потребовалось
 * добавить несколько зависимостей и выполнить Lifecycle/site
 *
 * После этого запускала таску Plugins/site/site:run
 * переходила на сгенерировааную страницу и далее в просмотр отчета surefite
 * http://localhost:8080/surefire-report.html
 * 
 * */

public class TriangleTest {

    // Допустимая точность сравнения результата с эталонным значением
    public static final double assertionDelta = 0.00000001d;

    // Площадь треугольника со торонами 1 x 1 x 1
    public static final double testSquare1 = 0.4330127018922193d;

    @Test
    public void countSquareSuccessTest() {
        Assert.assertEquals(Triangle.countSquareBySides(1,1,1), testSquare1, assertionDelta);
    }

    @Test
    public void countSquareInvalidArgumentTest() {
        Assert.assertEquals(Triangle.countSquareBySides(1, 0, 2), 0d, assertionDelta);
    }

    @Test
    public void countSquareNullArgumentTest() {
        Assert.assertEquals(Triangle.countSquareBySides(0, 0, 0), 0d, assertionDelta);
    }

    @Test
    public void countSquareNegativeArgumentTest() {
        Assert.assertEquals(Triangle.countSquareBySides(2, 1, -1), 0d, assertionDelta);
    }

    @Test
    public void  countSquareInValidTriangle() {
        Assert.assertEquals(Triangle.countSquareBySides(1,1,10), 0d, assertionDelta);
    }

}