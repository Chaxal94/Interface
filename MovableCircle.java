class MovableCircle  implements Movable,Cloneable,Comparable<MovableCircle> {
    int radius;
    MovablePoint centre;

    MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.radius = radius;
        this.centre = new MovablePoint(x, y, xSpeed, ySpeed);
    }



    @Override
    public void moveUP() {
        System.out.println(centre.y);

    }

    @Override
    public void moveDown() {
        System.out.println(centre.ySpeed);

    }

    @Override
    public void moveLeft() {
        System.out.println(centre.xSpeed);

    }

    @Override
    public void moveRight() {
        System.out.println(centre.x);


    }


    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "(" + centre.x +","+ centre.y + ")" + ","
                + "Speed=(" + centre.xSpeed +","+ centre.ySpeed + ")," +
                "radius=" + radius;


    }


    @Override
    public int compareTo(MovableCircle o) {
        return this.radius - o.radius;
    }
}
