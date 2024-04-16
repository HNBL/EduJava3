package Lab3.Lab3_2;

 public class Car {

    String Color;
    String model;
    double weight;

    Car(String a)
    {
    Color=a;
    }
    Car(String a,double b){
        Color =a;
        weight=b;
    }

    Car(){

    }

    void infoCar()
{
    System.out.printf("цвет авто: %s\n модель авто: %s\n вес авто: %.2f\n", Color, model, weight);
}


    public static void main(String[] args)
    {
        Car Egor= new Car();
        Egor.Color = "черный";
        Egor.model ="Лада";
        Egor.weight = 3500.2;
        Egor.infoCar();

        Car Artur = new Car();
        Artur.Color ="Серый";
        Artur.model ="Мерседес";
        Artur.weight=2500;
        Artur.infoCar();

        Car Artur1 =new Car("Красный");
        Artur1.infoCar();
        Car Egor2 = new Car("Бордовый",5900);
        Egor2.infoCar();
        Car JohnDoe= new Car();
        JohnDoe.infoCar();
    }
}
