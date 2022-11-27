public class Student {
    Course c1;
    Course c2;
    Course c3;

   String name;
    String stuNo;
    String classes;

    double avarage;

    boolean isPass;

    Student(String name,String stuNo,String classes,Course c1,Course c2,Course c3){
     this.name=name;
     this.stuNo=stuNo;
     this.classes=classes;
     this.c1=c1;
     this.c2=c2;
     this.c3=c3;
     this.avarage=0.00;
     this.isPass=false;

    }

    void addBulkExamNote(int note1,int note2,int note3){
    this.c1.note=note1;
    this.c2.note=note2;
    this.c3.note=note3;
    }
    void addBulksozNote(int note1,int note2,int note3){
        this.c1.sozlu=note1;
        this.c2.sozlu=note2;
        this.c3.sozlu=note3;
    }

    void avarage(){

        this.avarage=((this.c1.note*0.70+this.c1.sozlu*0.30)+(this.c2.note*0.70+this.c2.sozlu*0.30)+(this.c3.note*0.70+this.c3.sozlu*0.30))/3.0;
        System.out.println(this.avarage);
    }






    void isPass(){
     if (this.avarage >54) {
      System.out.println("Sınıfı geçtiniz.");
      this.isPass=true;
     }else System.out.println("Sınıfta kaldınız.");
     this.isPass=false;
    }




    void printNote(){
        System.out.println("-------------");
     System.out.println(c1.name+" notu :"+c1.note+" sözlü :"+c1.sozlu);
     System.out.println(c2.name+" notu :"+c2.note+" sözlü :"+c2.sozlu);
     System.out.println(c3.name+" notu :"+c3.note+" sözlü :"+c3.sozlu);
    }

}
