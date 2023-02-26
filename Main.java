import java.util.*;

public class Main {
    public static void main(String[] args) {

        TreeSet<Book> book = new TreeSet<>();


        book.add(new Book("Gece Yarısı Kütüphanesi",296,"Matt Haig",2005));
        book.add(new Book("Nietzsche Ağladığında",432,"Irvin D. Yalom",1985));
        book.add(new Book("Yalın Tutku",56,"Annie Ernaux",2022));
        book.add(new Book("Kırmızı Pazartesi",200,"Gabriel Garcia Marquez",2000));
        book.add(new Book("Fedailerin Kalesi Alamut",510,"Vladimir Bartol",2012));

        TreeSet<Book> book1 = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getBookPage()- o2.getBookPage();
            }
        });

        book1.addAll(book);
        System.out.println("================= İsime göre sıralama==================");
        for (Book name : book){
            System.out.println("Sayfa sayısı:"+name.getBookPage()+" Kitap ismi:"+name.getBookName());
        }
        System.out.println("================= Sayfa sayısına göre sıralama==================");
        for (Book page : book1){
            System.out.println("Sayfa sayısı:"+page.getBookPage()+" Kitap ismi:"+page.getBookName());
        }
        }
    }


