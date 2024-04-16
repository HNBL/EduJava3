package Lab3.Lab3_3;

public class House {

String address;
int floor;
int years;

void initHouse (String a,int b,int c){
address=a;
floor=b;
years=c;

}

void getInfoHouse(){
System.out.printf("Количество этажей: %d\n Год постройки: %d\n Адрес дома %s\n",floor,years,address);
}

void setDataHouse()
    {
        System.out.printf("%d лет с даты постройки\n",2024-years);
    }


    public static void main(String[] args)
    {
        House Egor = new House();
        Egor.initHouse("Невский проспект 12",5,1768);
        Egor.getInfoHouse();
        Egor.setDataHouse();

        House Artur = new House();
        Artur.initHouse("Невский проспект 50",4,1744);
        Artur.getInfoHouse();
        Artur.setDataHouse();






    }
}
