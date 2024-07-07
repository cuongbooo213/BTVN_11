/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cuong
 */
public class MyString implements IString{

    @Override
    public int f1(String str) {
        String[] s = str.split("\\s");
        int flag=0;
        int count =0;
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[i].length(); j++) {
                if (Character.isAlphabetic(s[i].charAt(j))) {
                    flag++;
                }
            }
            if (flag>0) {
                count = count+1;
                flag = 0;
            }
        }
        return count;
        
    }

    @Override
    public String f2(String str) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
