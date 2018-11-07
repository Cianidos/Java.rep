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
    private boolean dead = false;

// Generators
    public Unit(){
        team = "none";
        nomer = 0;
        health = 100;
        damage = 10;
        mana = 50;
    }

    Unit(int health_, int damage_, int mana_){
        team = "none";
        nomer = 0;
        health = health_;
        damage = damage_;
        mana = mana_;
    }

    Unit(String team_, int nomer_){
        team = team_;
        nomer = nomer_;
        health = 100;
        damage = 10;
        mana = 50;
    }

    Unit(String team_, int nomer_, int health_, int damage_, int mana_){
        team = team_;
        nomer = nomer_;
        health = health_;
        damage = damage_;
        mana = mana_;
    }

// Methods
    public void kickUnit(Unit odj){
        if (odj.isDead()) {
            odj.setHealth(odj.getHealth() - this.getDamage());
            this.setXp(this.getXp() + 5);
            this.upLevel();
            System.out.printf("%d %s нанес %d уронa %d %s \n", this.getNomer(), this.getTeam(), this.getDamage(), odj.getNomer(), odj.getTeam());
            odj.death(this);
        } else {System.out.printf("очень жаль, но %d %s уже мертв \n",odj.getNomer(), odj.getTeam());}
    }

    public void restoreHealth(int hp){
        this.setHealth(this.getHealth()+hp);
        this.setMana(this.getMana()-(hp%5));
        System.out.printf("%d %s + %d здоровья -- %d, осталось %d маны \n",this.getNomer(),this.getTeam(),hp,this.getHealth(),this.getMana());
    }

    public void upLevel(){
        if (getXp()>10){
            this.setLevel(this.getLevel()+1);
            this.setXp(this.getXp()-10);
            System.out.printf("%d %s получил новый уровень %d, осталось %d опыта \n",this.getNomer(),this.getTeam(),this.getLevel(),this.getXp());
        }
    }

    void death(Unit odj){
        if (this.getHealth()<=0){
            this.setDead();
            System.out.printf("%d %s погиб от рук %d %s \n",this.getNomer(),this.getTeam(),odj.getNomer(),odj.getTeam());
        }
    }

// Getters and Satters
    int getXp() {
        return xp;
    }

    void setXp(int xp) {
        this.xp = xp;
    }

    int getLevel() {
        return level;
    }

    void setLevel(int level) {
        this.level = level;
    }

    String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    int getNomer() {
        return nomer;
    }

    public void setNomer(int nomer) {
        this.nomer = nomer;
    }

    int getHealth() {
        return health;
    }

    void setHealth(int health) {
        this.health = health;
    }

    int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    int getMana() {
        return mana;
    }

    void setMana(int mana) {
        this.mana = mana;
    }

    boolean isDead() {
        return !dead;
    }

    private void setDead() {
        this.dead = true;
    }
}
