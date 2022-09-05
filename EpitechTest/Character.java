public abstract class Character implements Movable {

    protected String name;
    protected String RPGClass;
    protected int life;
    protected int agility;
    protected int strength;
    protected int wit;

    public Character(String name, String RPGClass) {
        this.name = name;
        this.RPGClass = RPGClass;
        this.life = 50;
        this.agility = 2;
        this.strength = 2;
        this.wit = 2;
    }

    public String getRPGClass() {
        return this.RPGClass;
    }

    public String getName() {
        return this.name;
    }

    public int getLife() {
        return this.life;
    }

    public int getAgility() {
        return this.agility;
    }

    public int getStrength() {
        return this.strength;
    }

    public int getWit() {
        return this.wit;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public void attack(String weapon) {
        System.out.println(this.name + ": Rrrrrrrrr....");
    }

    public void moveLeft(){
        System.out.println(this.name + ": moves left");
    }

    public void moveRight(){
        System.out.println(this.name + ": moves right");
    }

    public void moveForward(){
        System.out.println(this.name + ": moves forward");
    }

    public void moveBack(){
        System.out.println(this.name + ": moves back");
    }

    public final void unsheathe(){
        System.out.println(this.name + ": unsheathes his weapon.");
    }
}

