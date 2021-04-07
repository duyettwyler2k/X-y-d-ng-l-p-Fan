public class fan {
 final int slow=1;
 final int medium=2;
final int fast=3;
int speed;
boolean on;
double radius;
String color;

public  fan(){

   this.on=false;
   this.radius=5;
   this.color="blue";

}
public fan(boolean on,int speed,double radius,String color){
    this.speed=speed;
    this.radius=radius;
    this.color=color;
    this.on=on;
}
public fan(int speed,double radius,String color){
    this.speed=speed;
    this.radius=radius;
    this.color=color;
}
int getSpeed(){
    return this.speed;
}
double getRadius(){
    return this.radius;
}
String getColor(){
    return this.color;
}
void setSpeed(){
    this.speed=speed;
}
void setRadius(){
    this.radius=radius;
}
public String toString(){
    if(this.on==true){
        return "color "+this.color+" speed "+this.speed+" radius "+this.radius+" fan is on";
    }
    else
        return "color "+this.color+" radius "+this.radius+" fan is off";
}

}
