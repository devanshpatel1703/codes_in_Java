class Ball{
    float x,y,xDelta,yDelta;
    int radius;
    Ball(float a,float b,int c,float d,float e){
        x=a;
        y=b;
        radius=c;
        xDelta=d;
        yDelta=e;
    }
    public float getX(){
        return x;
    }
    public void setX(float X){
        x=X;
    }
    public float getY(){
        return y;
    }
    public void setY(float Y){
        y=Y;
    }
    public int getRadius(){
        return radius;
    }
    public void setRadius(int r){
        radius=r;
    }
    public float getXDelta(){
        return xDelta;
    }
    public void setXDelta(float xd){
        xDelta=xd;
    }
    public float getYDelta(){
        return yDelta;
    }
    public void setYDelta(float yd){
        yDelta=yd;
    }
    public void move(){
        x=x+xDelta;
        y=y+yDelta;
    }
    public void reflectHorizontal(){
        xDelta=xDelta*(-1);
    }
    public void reflectVertical(){
        yDelta=yDelta*(-1);
    }
    public String toString() {
        return "Ball[("+x+","+y+")"+",speed=("+xDelta+","+yDelta+")]";
    }
}
public class Main {
   public static void main(String[] args) {
      // Test constructor and toString()
      Ball ball = new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
      System.out.println(ball);  // toString()

      // Test Setters and Getters
      ball.setX(80.0f);
      ball.setY(35.0f);
      ball.setRadius(5);
      ball.setXDelta(4.0f);
      ball.setYDelta(6.0f);
      System.out.println(ball);  // toString()
      System.out.println("x is: " + ball.getX());
      System.out.println("y is: " + ball.getY());
      System.out.println("radius is: " + ball.getRadius());
      System.out.println("xDelta is: " + ball.getXDelta());
      System.out.println("yDelta is: " + ball.getYDelta());

      // Bounce the ball within the boundary
      float xMin = 0.0f;
      float xMax = 100.0f;
      float yMin = 0.0f;
      float yMax = 50.0f;
      for (int i = 0; i < 15; i++) {
         ball.move();
         System.out.println(ball);
         float xNew = ball.getX();
         float yNew = ball.getY();
         int radius = ball.getRadius();
         // Check boundary value to bounce back
         if ((xNew + radius) > xMax || (xNew - radius) < xMin) {
            ball.reflectHorizontal();
         }
         if ((yNew + radius) > yMax || (yNew - radius) < yMin) {
            ball.reflectVertical();
         }
      }
   }
}
