class CameraPicker{
public static void main(String[] args){
System.out.println("Invoking main in CakePicker....");
String location="Rajajinagar";
String date="25.05.2023";
int howManyPeople=18;
int resolution=720;
String clarity="HD" ;
String cameraName="Nikon";

Camera.click(location,date,howManyPeople,resolution,clarity, cameraName);
}
}