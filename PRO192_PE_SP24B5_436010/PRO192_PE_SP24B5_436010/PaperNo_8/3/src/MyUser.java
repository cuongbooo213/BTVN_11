
import java.lang.reflect.Array;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Cuong
 */
public class MyUser implements IUser {

    @Override
    public int f1(List<User> t) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < t.size(); i++) {
            if (Character.isDigit(t.get(i).getName().charAt(1))) {
                if (t.get(i).getStatus()>max) {
                    max = t.get(i).getStatus();
                }
            }
        }
        return max;
    }

    @Override
    public void f2(List<User> t) {
        User temp = t.get(3);
        t.set(3, t.get(5));
        t.set(5, temp);

    }

    @Override
    public void f3(List<User> t) {
        int max = Integer.MIN_VALUE;
        int flag=0;
        for (int i = 0; i < t.size(); i++) {
            if (t.get(i).getStatus()> max) {
                max=t.get(i).getStatus();
                flag=i;
            }
        }
        t.set(0, t.get(flag));
        
    }

}
