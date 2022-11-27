public class Main {
    public static void main(String[] args) {

        //ogretmenler
      Teacher t1= new Teacher("burak","555","YZLM");
      Teacher t2= new Teacher("gamze","555","GLSM");
      Teacher t3= new Teacher("rabia","555","DIS");

      //Dersler
      Course yazilim=new Course("Yazılım","yazılım101","YZLM");
      Course gelisim=new Course("Gelişim","gelisim101","GLSM");
      Course dis=new Course("Diş","dıs101","DIS");
      /*
      yazilim.addTeacher(t1);
      gelisim.addTeacher(t2);
      dis.addTeacher(t3);
        */
      Student s1= new Student("nisa","3838","java101",yazilim,gelisim,dis);
      Student s2= new Student("ümit","3838","java101",yazilim,gelisim,dis);
      s1.addBulkExamNote(50,70,80);
      s1.addBulksozNote(90,60,45);
      s1.printNote();
      s1.avarage();
      s1.isPass();


      s2.addBulkExamNote(40,40,80);
      s2.addBulksozNote(55,15,83);
      s2.printNote();
      s2.avarage();
      s2.isPass();




    }
}