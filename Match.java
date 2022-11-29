public class Match {
    Fighter f1;
    Fighter f2;
    int maxWeight;
    int minWeight;


    Match(Fighter f1,Fighter f2,int maxWeight,int minWeight){
        this.f1=f1;
        this.f2=f2;
        this.maxWeight=maxWeight;
        this.minWeight=minWeight;
    }

    void run(){
        if (isCheckWeight()){
            System.out.println("======Büyük Kapışma Başlıyor======");

                    if (this.f1.isFirstAttack()) {
                        System.out.println("=====Maç Başladı=====");
                        while (this.f2.health > 0 && this.f1.health > 0) {

                            this.f2.health = this.f1.hit(this.f2);

                            if (this.winCheck()) {
                                break;
                            }

                            this.f1.health = this.f2.hit(this.f1);

                            if (this.winCheck()) {
                                break;
                            }
                            System.out.println(this.f1.name + " Sağlık:" + this.f1.health);
                            System.out.println(this.f2.name + " Sağlık:" + this.f2.health);
                            System.out.println("*******");

                        }
                    }

                    else {
                        while (this.f2.health > 0 && this.f1.health > 0) {
                            System.out.println("=====Maç Başladı=====");
                            this.f1.health = this.f2.hit(this.f1);

                            if (this.winCheck()) {
                                break;
                            }

                            this.f2.health = this.f1.hit(this.f2);

                            if (this.winCheck()) {
                                break;
                            }
                            System.out.println(this.f1.name + " Sağlık:" + this.f1.health);
                            System.out.println(this.f2.name + " Sağlık:" + this.f2.health);
                            System.out.println("*******");

                        }
                    }






        }
        else System.out.println("Sikletlerin ağırlıkları uyuşmamakta");



    }

    boolean isCheckWeight(){
        return (this.f1.weight<=this.maxWeight && this.f1.weight>=minWeight) && (this.f2.weight<=this.maxWeight && this.f2.weight>=minWeight);
    }
    boolean winCheck(){
        if (this.f1.health==0){
            System.out.println("Maçı kazanan:"+this.f2.name);
            return true;
        }else if(this.f2.health==0){
            System.out.println("Maçı kazanan:"+this.f1.name);
            return true;
        }
        return false;
    }

}
