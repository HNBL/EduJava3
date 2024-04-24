package Lab3.Lab3_1;

class Study {

    private String course;

    Study(String b){
        course=b;
        System.out.println(b);
    }


    public String printCourse() {
        return this.course;

    }

}

class JavaProgram {
    public static void main(String[] args) {
        Study Egor = new Study("Изучения Java- это не просто");
        Egor.printCourse();


    }

}