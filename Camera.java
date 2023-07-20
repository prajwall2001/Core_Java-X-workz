class Camera{
static void click(String location,String date,int howManyPeople,int resolution,String clarity,String cameraName)
{
System.out.println("Location is: "+location);
System.out.println("On : "+date);
System.out.println("Total people: "+howManyPeople);
System.out.println("With resolution: "+resolution);
System.out.println("Clarity: "+clarity);
System.out.println("Camera man name: "+cameraName);
if (howManyPeople > 0) {
            System.out.println("People's : " + howManyPeople);
        } else {
            System.err.println("Invalid number of people.");
			return;
        }

        if (resolution > 0) {
            System.out.println("With resolution: " + resolution);
        } else {
            System.err.println("Invalid resolution.");
			return;
        }

        if (clarity != null && !clarity.isEmpty()) {
            System.out.println("Clarity: " + clarity);
        } else {
            System.err.println("Invalid clarity.");
        }

        if (cameraName != null && !cameraName.isEmpty()) {
            System.out.println("Camera man name: " + cameraName);
        } else {
            System.err.println("Invalid camera man name.");
			return;
		}
}
}