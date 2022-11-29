public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    double dodge;

    double firstAttack;

    Fighter (String name,int damage,int healt,int weight, double dodge,double firstAttack){
        this.name=name;
        this.damage=damage;
        this.health=healt;
        this.weight=weight;
        this.dodge=dodge;
        this.firstAttack=firstAttack;
    }
    boolean isdodge(){
        double randamValue=Math.random()*100;
        return randamValue<=this.dodge;
    }
    boolean isFirstAttack(){
        double randomValue=Math.random()*100;
        System.out.println(randomValue);
        return  randomValue<this.firstAttack;
    }
    int hit(Fighter foe){

        System.out.println(this.name+" "+foe.name+" "+this.damage+" Hasar vurdu");
        if (isdodge()){
            System.out.println(foe.name+" : "+this.name+"den gelen hasarı blokladı");
            return foe.health;
        }
        if (foe.health-this.damage<0){
            return 0;
        }
        return (foe.health-this.damage);
    }

}
