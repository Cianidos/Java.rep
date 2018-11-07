package core;

public class Mage extends Unit {
// Generators
    public Mage(){
        super(75,25,100);
    }
    public Mage(int health_,int damage_,int mana_){
        super(health_,damage_,mana_);
    }

    Mage(String team_, int nomer_){
        super(team_, nomer_);
    }
    Mage(String team_, int nomer_, int health_, int damage_, int mana_){
        super(team_, nomer_, health_, damage_, mana_);
    }
// Methods
    @Override
    public void kickUnit(Unit odj){
        if (odj.isDead()) {
            this.setMana(this.getMana() - 2);
            odj.setHealth(odj.getHealth() - this.getDamage());
            this.setXp(this.getXp() + 10);
            this.upLevel();
            System.out.printf("%d %s нанес %d уронa %d %s \n", this.getNomer(), this.getTeam(), this.getDamage(), odj.getNomer(), odj.getTeam());
            odj.death(this);
        } else {System.out.printf("очень жаль, но %d %s уже мертв \n",odj.getNomer(), odj.getTeam());}
    }

    @Override
    public void restoreHealth(int hp){
        this.setHealth(this.getHealth()+hp);
        this.setMana(this.getMana()-(hp%10));
        System.out.printf("%d %s + %d здоровья -- %d, осталось %d маны \n",this.getNomer(),this.getTeam(),hp,this.getHealth(),this.getMana());
    }

    @Override
    public void upLevel(){
        if (getXp()>50){
            this.setLevel(this.getLevel()+1);
            this.setXp(this.getXp()-50);
            System.out.printf("%d %s получил новый уровень %d, осталось %d опыта \n",this.getNomer(),this.getTeam(),this.getLevel(),this.getXp());

        }
    }
}
