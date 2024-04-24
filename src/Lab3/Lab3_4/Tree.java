package Lab3.Lab3_4;

public class Tree {
    int age;
    String alive;
    String genus;

    Tree(int a, String b)
    {
        age=a;
        genus =b;


    }

    Tree(int a,String b,String c){
        age =a;
        alive=b;
        genus=c;
    }

    Tree(){
        System.out.print("Пустой Конструктор без параметров сработал");
    }

    public static void main(String[] args)
    {

        Tree Ivan = new Tree(10, "Кедровое");
        Tree Artur = new Tree(15,"Живое","Береза");

        Tree Egor = new Tree();






    }
}

