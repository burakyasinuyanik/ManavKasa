public class Boks {
    public static void main(String[] args) {

        Fighter selman=new Fighter("selman",9,100,75,30,50);
        Fighter sulo=new Fighter("sülo",11,100,65,35,50);

        Match altinKemer=new Match(selman,sulo,75,65);

        altinKemer.run();

    }
}
