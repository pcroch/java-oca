package Oca.WorkingInheritance;

class Cinema {
    protected String name;
    protected Integer age;
    public Cinema(String name) {this.name = name;}
        public Cinema(String name, Integer age) {this.name = name;
            this.age = age;}
}
class Movie extends Cinema {
    public static Integer age = 15;
    public Movie(String movie, Integer age) {
        super(movie, age);
                System.out.println("Hello" + movie);
    }

    public Movie(String movie) {
//        super(movie);
        this(movie, age);
                System.out.println("Hello" + movie);
    }
    public static void main(String[] showing) {
        System.out.print(new Movie("Another Trilogy").name);
    }
}

