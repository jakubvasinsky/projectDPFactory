public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();

        Movie movie1 = factory.getMovie("ShRek");
        movie1.collection();

        Movie movie2 = factory.getMovie("titanic");
        movie2.collection();

        Movie movie3 = factory.getMovie("INCEPTION");
        movie3.collection();



    }
}
