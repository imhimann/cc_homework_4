public class cc_bad_code {
    public static void main(String[] args) {
       //exception_handling
        int num = Integer.parseInt("hello");
    }
}

class Lod{
    Car car;
    //Law of Demeter
    public void bad_example(){
        car.performance.parts.engine.start();
    }
}
    /*
    public class Car {
        public Performance performance;
        }
    }


    public class Performance {
        public Parts parts;
        }
    }


    public class Parts{
        public Engine engine;
    }

     */
