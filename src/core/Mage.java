package core;

public class Mage extends Unit {
// Generators
    public Mage(){
        super(75,25,100);
    }
    public Mage(int health_,int damage_,int mana_){
        super(health_,damage_,mana_);
    }

    public Mage(String team_, int nomer_){
        super(team_, nomer_);
    }
    public Mage(String team_,int nomer_,int health_,int damage_,int mana_){
        super(team_, nomer_, health_, damage_, mana_);
    }
// Methods
    @Override
    public void kickUnit(Unit odj){
        this.setMana(this.getMana()-2);
        odj.setHealth(odj.getHealth()-this.getDamage());
        this.setXp(this.getXp()+10);
        this.upLevel();
    }

    @Override
    public void restoreHealth(int hp){
        this.setHealth(this.getHealth()+hp);
        this.setMana(this.getMana()-(hp%10));
    }

    @Override
    public void upLevel(){
        if (getXp()>50){
            this.setLevel(this.getLevel()+1);
            this.setXp(this.getXp()-50);
        }
    }
}
