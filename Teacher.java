public class Teacher {

    String name;
    String mpno;
    String brach;

    Teacher(String name,String mpno,String brach){
        this.name=name;
        this.mpno=mpno;
        this.brach=brach;
    }
    void teacInfo(){
        System.out.println("_______________");
        System.out.println("Adı:"+this.name);
        System.out.println("Telefon no:"+this.mpno);
        System.out.println("Bölümü:"+this.brach);

    }
}
