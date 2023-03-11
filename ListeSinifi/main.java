package ListeSinifi;

public class main {
    public static void main(String[] args) {
        Mylist<Integer> liste =new Mylist<>();
        liste.add(10);
        liste.add(2);
        liste.add(3);
        liste.add(4);
        liste.add(5);
        liste.add(6);
        liste.add(7);
        liste.add(8);
        liste.add(9);
        liste.add(10);
        liste.add(11);
        liste.add(12);
        liste.add(13);


        System.out.println(liste.indexOf(10));
        System.out.println(liste.lastIndexOf(11));
        System.out.println(liste.isEmpty());




        System.out.println("dizideki eleman sayısı:"+liste.size());
        System.out.println("dizinin kapasitesi:"+liste.getCapacity());
    }
}
