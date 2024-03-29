package point2D.org;

public class Point3D extends Point2D{
    public float z = 2.0f;

    public Point3D(){

    }
    public Point3D(float x, float y, float z){
        super(x,y);
        this.z = z;
    }
    public float getZ(){
        return z;
    }
    public void setZ(float newZ){
        this.z = newZ;
    }
    public float [] getXYZ(){
        return new float[]{super.x, super.y, this.z};
    }
    public String toString(){
        return "(" + getX() + "," + getY() + "," + getZ()+")";
    }
}
