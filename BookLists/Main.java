package BookLists;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        ArrayList<Books> bookList= new ArrayList<>();

        bookList.add(new Books("Çaluşu", 125, "Reşat Nuri Güntekin", 2010));
        bookList.add(new Books("Kürk Mantolu Madonna", 160, "Sabahattin Ali", 2022));
        bookList.add(new Books("Şeker Portakalı", 182, "Jose Mauro De Vasconcelos", 2019));
        bookList.add(new Books("1984", 352, "George Orwell", 2019));
        bookList.add(new Books("Kuyucaklı Yusuf", 221, "Sabahattin Ali", 2019));
        bookList.add(new Books("Saatleri Ayarlama Enstitüsü", 382, "Ahmet Hamdi Tanpınar", 2017));
        bookList.add(new Books("Aylak Adam", 156, "Yusuf Atılgan", 2017));
        bookList.add(new Books("Zeytindağı", 176, "Falih Rıfkı Atay", 2013));
        bookList.add(new Books("Gün Olur Asra Bedel", 413, "Cengiz Aytmatov", 2020));
        bookList.add(new Books("Nietzsche Ağladığında", 432, "Irvin D. Yalom", 2022));

        Map<String,String> bookMap =new HashMap<>();
        bookList.stream().forEach(books -> bookMap.put(books.getBookName(),books.getAuthor()));

        for (String i :bookMap.keySet()){
           System.out.println(i+" - "+bookMap.get(i));
        }
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@q");
        bookList.stream().filter(books ->books.getPage()>200 ).forEach(books -> System.out.println(books.getBookName()+" - "+ books.getPage() ));
    }
}
