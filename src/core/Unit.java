package core;

public class Unit {
// Variables

    private int xp = 0;
    private int level = 0;
    private String team;
    private int nomer;
    private int health;
    private int damage;
    private int mana;

// Generators
    public Unit(){
        team = "none";
        nomer = 0;
        health = 100;
        damage = 10;
        mana = 50;
    }

    public Unit(int health_,int damage_,int mana_){
        team = "none";
        nomer = 0;
        health = health_;
        damage = damage_;
        mana = mana_;
    }

    public Unit(String team_, int nomer_){
        team = team_;
        nomer = nomer_;
        health = 100;
        damage = 10;
        mana = 50;
    }

    public Unit(String team_,int nomer_,int health_,int damage_,int mana_){
        team = team_;
        nomer = nomer_;
        health = health_;
        damage = damage_;
        mana = mana_;
    }

// Methods
    public void kickUnit(Unit odj){
        odj.setHealth(odj.getHealth()-this.getDamage());
        this.setXp(this.getXp()+5);
        this.upLevel();
    }

    public void restoreHealth(int hp){
        this.setHealth(this.getHealth()+hp);
        this.setMana(this.getMana()-(hp%5));
    }

    public void upLevel(){
        if (getXp()>10){
            this.setLevel(this.getLevel()+1);
            this.setXp(this.getXp()-10);
        }
    }

// Getters and Satters
    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public int getNomer() {
        return nomer;
    }

    public void setNomer(int nomer) {
        this.nomer = nomer;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }
}
