  class  MovablePoint implements Movable,Cloneable,Comparable<MovablePoint> {
     int x;
     int y;
     int xSpeed;
     int ySpeed;
     MovablePoint( int x, int y, int xSpeed, int ySpeed){
         this.x = x;
         this.y = y;
         this.xSpeed = xSpeed;
         this.ySpeed = ySpeed;
     }

      public void setX(int x) {
          this.x = x;
      }

      public void setY(int y) {
          this.y = y;
      }

      public int getX() {
          return x;
      }

      public int getY() {
          return y;
      }

      @Override
     public void moveUP() {
         System.out.println(y);

     }

     @Override
     public void moveDown() {
         System.out.println("Point="+y+" "
                 + "to point ="+ x+" " + "with speed=" + ySpeed+"km/h");


     }

     @Override
     public void moveLeft() {
         System.out.println("Point moves from points ="+ y+" "
                 + "to point ="+ x+" " + "with speed=" + xSpeed+"km/h");

     }

     @Override
     public void moveRight() {
         System.out.println(x);

     }
     @Override
     public Object clone() throws CloneNotSupportedException {
         return super.clone();


     }

     @Override
     public String toString(){
         return "("+this.x+","+this.y+")"+","+
                 "Speed=("+this.xSpeed+","+this.ySpeed+")km/h";
     }


     @Override
     public int compareTo(MovablePoint o) {

         return this.x -o.x;
     }



  }
