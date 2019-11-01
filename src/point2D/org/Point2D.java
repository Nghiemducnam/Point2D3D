package point2D.org;

public class Point2D {
    public float x = 1.0f;
    public float y = 1.0f;

    public  Point2D(){

    }
    public  Point2D(float x, float y){
        this.x = x;
        this.y = y;
    }
    public float getX(){
        return x;
    }
    public float getY(){
        return y;
    }
    public float [] getXY(){
        return new float[]{this.x, this.y};
    }
    public void setX(float newX){
        this.x = newX;
    }
    public  void setY(float newY){
        this.y = newY;
    }
    public void setXY(float newX, float newY){
        this.x = newX;
        this.y = newY;
    }

    public  String toString(){
        return "(" + getX() + "," + getY() + ")";
    }

}
