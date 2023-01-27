package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        if (power<0){
            System.out.println("too much power");
            return;
        }
        int ans=1;
        for (int i = 0; i <= power; i++) {
            System.out.println(ans);
            ans*=2;
        }
    }
}
