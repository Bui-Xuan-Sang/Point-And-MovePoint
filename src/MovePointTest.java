public class MovePointTest {
    public static void main(String[] args) {
        MovePoint moveablePoint = new MovePoint();
        System.out.println(moveablePoint.toString());
        moveablePoint = new MovePoint(5, 6);
        System.out.println(moveablePoint.toString());
        moveablePoint = new MovePoint(  11, 5, 9, 8);
        System.out.println(moveablePoint.toString());
        moveablePoint = moveablePoint.move();
        System.out.println(moveablePoint.toString());
    }
}
