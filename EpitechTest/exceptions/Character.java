package exceptions;

public abstract class Character implements Movable {

    protected String RPGClass;
    protected String name;
    protected int life;
    protected int agility;
    protected int strength;
    protected int wit;

    public Character(String p_name, String p_class) {
        this.name = p_name;
        this.RPGClass = p_class;
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

    public void setName(String p_name) {
        this.name = p_name;
    }

    public void setLife(int p_life) {
        this.life = p_life;
    }

    public void setAgility(int p_agility) {
        this.agility = p_agility;
    }

    public void setStrength(int p_strength) {
        this.strength = p_strength;
    }

    public void setWit(int p_wit) {
        this.wit = p_wit;
    }

    public void attack(String weapon) throws WeaponException{
        if (weapon.equals("")){
            throw new WeaponException(this.name + ": I refuse to fight with my bare hands.");
        }
        else {
            System.out.println(this.name + ": Rrrrrrrrr....");
        }
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

    public void tryToAttack(String weapon){
        try {
            this.attack(weapon);
        }
        catch(WeaponException e){
            System.out.println(e.getMessage());
        }
    }
}