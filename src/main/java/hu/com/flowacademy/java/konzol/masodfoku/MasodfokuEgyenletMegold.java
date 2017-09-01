package hu.com.flowacademy.java.konzol.masodfoku;

/**
 * Created by istvan on 9/1/17.
 */
public class MasodfokuEgyenletMegold {

    private float x1;
    private float x2;
    private boolean flag;

    public MasodfokuEgyenletMegold(float a, float b, float c) {
        flag = false;
        if (a == 0)
            return;
        float d = b * b - 4 * a * c;
        if (d >= 0) {
            x1 = (-b + d) / (2 * a);
            x2 = (-b - d) / (2 * a);
            flag = true;
        }
    }

    public boolean vanmegoldas() {
        return flag;
    }

    public float getX1() {
        return x1;
    }

    public float getX2() {
        return x2;
    }
}
