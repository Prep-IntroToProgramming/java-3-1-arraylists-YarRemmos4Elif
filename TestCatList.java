import java.util.*;
public class TestCatList{
    public static void main(){
        ArrayList<Cat> CatList = new ArrayList<Cat>();
        Cat Bryant =  new Cat("Bryant");/* This names a new cat Bryant*/
        Cat Michelle =  new Cat("Michelle");/* This names a new cat July*/
        Cat July = new Cat("July");/* This names a new cat July*/
        Cat Holly = new Cat("Holly"); /* This names a new cat Holly*/
        CatList.add(0, Bryant); 
        CatList.add(1, Michelle); 
        CatList.add(2, July); 
        CatList.add(3, Holly);
        int x =0 ;
        for (Cat i: CatList){
            double w = (Math.random()*10)+5;
            CatList.get(x).setWeight(w);
            x=x+1;
        }
        x=0;
        for (Cat i: CatList){
            System.out.println(CatList.get(x).getname() + " " + CatList.get(x)
            System.out.println(CatList.get(x).getName() + " says " );
           
    }