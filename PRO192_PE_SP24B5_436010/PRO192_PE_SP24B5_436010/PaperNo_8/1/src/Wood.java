/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cuong
 */
public class Wood {
    String source;
    int year;

    public Wood() {
    }

    public Wood(String source, int year) {
        this.source = source;
        this.year = year;
    }

    public String getSource() {
        int a = source.length();
        return source.substring(0, a-1);
    }

    public int getYear() {
        return year;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setYear(int year) {
        this.year = year - getYear();
    }
    
    
}
