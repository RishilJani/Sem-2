class ThreeDPoint extends MyPoint{
    float z;
    ThreeDPoint(){
        super();
        z = 0f;
    }
    ThreeDPoint(float x,float y,float z){
        super(x,y);
        this.z = z;
    }

    public float getterZ(){
        return z;
    }

    double distance(ThreeDPoint t2){
        dis = Math.pow(this.x - t2.x,2) + Math.pow(this.y - t2.y, 2) + Math.pow(this.z - t2.z, 2);

        dis = Math.sqrt(dis);
        return dis;
    }
}

public class J0605ThreeD {
    public static void main(String[] args) {
        ThreeDPoint t1 = new ThreeDPoint();
        ThreeDPoint t2 = new ThreeDPoint(10f,30f,25.5f);

        System.out.println("distance between (0,0,0) and (10,30,25.5) = ");
        System.out.println(t1.distance(t2));

    }
}
