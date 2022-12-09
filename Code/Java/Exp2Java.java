import java.util.*;
class Resistor{
HashMap<String,Integer> color;
// data members
private String band1;
private String band2;
private String band3;
private double value; // Resistor value (Ohms)
// default constructor
public Resistor()
{
 band1=band2=band3="";
 value=0.0;
}
// Constructor taking three strings as parameters
// and calculating the resistance
public Resistor(String b1, String b2, String b3)
{
// *** to be completed ***
band1=b1;
band2=b2;
band3=b3;
color=new HashMap<>();
color.put("black",0);
color.put("brown",1);
color.put("red",2);
color.put("orange",3);
color.put("yellow",4);
color.put("green",5);
color.put("blue",6);
color.put("violet",7);
color.put("grey",8);
color.put("white",9);
}
public String getResistance(){
 int firstdig=color.get(band1);
 int seconddig=color.get(band2);
 int thirddig=(int)Math.pow(10,color.get(band3));
 String value1=Integer.toString(firstdig)+Integer.toString(seconddig);
 value=Integer.parseInt(value1)*thirddig;
 value=value/1000;
 value1=value+"Kilo_ohms";
 return value1;
}
}
public class Exp2Java{
public static void main(String args[]){
Resistor r1=new Resistor("red","black","orange");
System.out.println(r1.getResistance());
}
} 