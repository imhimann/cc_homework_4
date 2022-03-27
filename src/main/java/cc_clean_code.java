public class cc_clean_code {
    public static void main(String[] args) {

        //Exception Handling
        try{
            int x = Integer.parseInt("hello");
        }
        catch (NumberFormatException nfe) {
            //Code that we want to execute
            System.out.println("You can't make an int out of this");
        }
        finally {
            System.out.println("Final.");
        }
    }
}
//Law of Demeter
class Lod {
    Car car;

    public void good_example() {
        car.StartEngine();
    }

}

    /*
    public class Car {
        public Performance performance;
        public void StartEngine(){
            performance.StartEngine();
        }
    }


    public class Performance {
        public Parts parts;
        public void StartEngine(){
            parts.StartEngine();
        }
    }

    public class Parts{
        public Engine engine;
        public void StartEngine(){
            engine.start();
        }
    }

     */


