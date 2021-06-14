import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        MovablePoint p =new MovablePoint(1,4,4,5);
        p.moveLeft();
        Object p1 = p.clone();
        System.out.println(p1);
        System.out.println(p);
        System.out.println("++++++++");
        System.out.println(p1);
        System.out.println(p);
        System.out.println();
        System.out.println();
        System.out.println("******** ");
        MovableCircle c = new MovableCircle(1,5,3,4,8);
        c.moveUP();
        System.out.println(c.toString());
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        MovablePoint p2 = new MovablePoint( 1,3,4,2);
        MovablePoint p3 = new MovablePoint( 3,5,6,7);
        MovablePoint p4 = new MovablePoint( 10,7,9,20);
        MovablePoint p5 = new MovablePoint( 7,7,7,7);
        List<MovablePoint> movablePoints = Arrays.asList(p2,p3,p4,p5);
        System.out.println(movablePoints);
        movablePoints.sort((o1, o2) -> o1.x - o2.x);
        System.out.println("Sorted points--------");
        System.out.println(movablePoints);
        System.out.println("--------------");
        MovableCircle c2 =new MovableCircle(54,5,8,1,2);
        MovableCircle c3 =new MovableCircle(64,7,2,3,9);
        MovableCircle c4 =new MovableCircle(34,5,23,9,13);
        MovableCircle c5 =new MovableCircle(44,12,27,3,14);
        MovableCircle c6 =new MovableCircle(27,15,29,6,20);
        List<MovableCircle> movableCircles =Arrays.asList(c2,c3,c4,c5,c6);
        System.out.println(movableCircles);
        movableCircles.sort((o1, o2) -> o2.radius - o1.radius);
        System.out.println("Sorted Circles++++");
        System.out.println(movableCircles);










    }




}
