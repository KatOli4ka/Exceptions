import transport.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("ДЗ-1");
        boolean uspeh=Data.proverka("ghyq1","poiu8j_","poiu8j");
        if (uspeh) {
            System.out.println("Вы ввели корректные данные!");
        } else {
            System.out.println("Вы ввели не корректные данные!");
        }
        System.out.println("ДЗ-2");
        Car lada = new Car("Granta", "Lada", 1.6, TypeOfBody.SEDAN);
        Car bmw = new Car("Z8", "BMW", 1.9,TypeOfBody.SEDAN);
        Car kia = new Car("Sportage", "Kia", 1.7,TypeOfBody.SEDAN);
        Car subaru = new Car("Forester", "Subaru", 1.5,TypeOfBody.STATION_WAGON);
        Truck fl = new Truck("FL-D5K", "Volvo", 2.4, LoadCapacity.N1);
        Truck fe = new Truck("FE-G9K320", "Volvo", 8.9,LoadCapacity.N3);
        Truck fm = new Truck("FM-D8K", "Volvo", 6.0,LoadCapacity.N2);
        Truck fh = new Truck("FH--D13K", "Volvo", 12.8,LoadCapacity.N3);
        Bus liaz = new Bus("5256", "ЛиАЗ", 5.8,Capacity.MIDDLE);
        Bus ikarus = new Bus("280", "Ikarus", 8.0,null);
        Bus paz = new Bus("5411", "ПАЗ", 6.1,Capacity.TINY);
        Bus scania = new Bus("125", "Scania", 6.8,Capacity.HUGE);
        getDiagnoctic(lada,bmw,kia,subaru,fl,fe,fm,fh,liaz,ikarus,paz,scania);


    }

    private static void getDiagnoctic(Transport... transports) {
        for (Transport transport : transports) {
            if (!transport.getDiagnostic()) {
                try {
                    throw new RuntimeException("Авто " + transport.getBrand() + " "
                            + transport.getModel() + " не прошел диагностику");
                } catch (RuntimeException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}