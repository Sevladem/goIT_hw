package homework6.task4;

public class CitizenFactory {

    private class Englishman implements Citizen{
        @Override
        public void sayHello() {
            System.out.println("Hi");
        }
    }

    private class Chinese implements Citizen{
        @Override
        public void sayHello() {
            System.out.println("你好");
        }
    }

    private class Russian implements Citizen{
        @Override
        public void sayHello() {
            System.out.println("Привет");
        }
    }

    private class Italian implements Citizen{
        @Override
        public void sayHello() {
            System.out.println("Ciao");
        }
    }

    public Citizen getCitizen(String nationality){
        switch (nationality){
            case "e":
                return new Englishman();
            case "c":
                return new Chinese();
            case "r":
                return new Russian();
            case "i":
                return new Italian();
            default:
                return null;
        }

    }
}
