public class Light {


    public static void main(String[] args) {

        // Create a Light Object
        // Using new keyword we are invoking Light constructor to create a Light Object
        Light myTableLight = new Light(); // Hidden(Default) Constructor in a class looks like ClassName()
        // Yea we have object, can we turn on or off?
        myTableLight.onOffLight();
    }

    public void onOffLight(){
        /**
         * if (condition){
         *     // If the condition is true execute anything inside the block if not skip
         *  }
         *
         * */
        // State of the light
        boolean isLightOn = true; // Light is off
        // isLightOn = true  -- > invert the value true ---> false (!ture)
        if ( !true){
            System.out.println("Turn On Light");
            System.out.println("Light Turned On");
        }
        else if ( isLightOn){
            System.out.println("Turn Off Light");
            System.out.println("Light Turned Off");
        }
        else {
            System.out.println("Light is On");
        }

    }

    public void turnOnLight(){
        System.out.println("Turn On Light");
        System.out.println("Light Turned On");
    }

    public void turnOffLight(){
        System.out.println("Turn Off Light");
        System.out.println("Light Turned Off");
    }

    public void increaseLight(){
        System.out.println("Increase Light by 50%");
        System.out.println("Light increased by 50%");
    }

}
