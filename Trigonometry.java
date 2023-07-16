public class Trigonometry {

    //Perform sin with radian angle
    public static float sin(float radian) {
        double ans = Math.sin(Math.toRadians(radian));
        return (float) ans;
    }

    //Perform sind wth degree
    public static float sind(int degree) {
        double ans = Math.sin(degree);
        return (float) ans;
    }

    //Perform cos with radian angle 
    public static float cos(float radian) {
        double ans = Math.cos(Math.toRadians(radian));
        return (float) ans;
    }
    
    //Perform cosd with degree
    public static float cosd(int degree) {
        double ans = Math.cos(degree);
        return (float) ans;
    }
}
