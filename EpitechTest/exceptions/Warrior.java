package exceptions;

public class Warrior extends Character {
    public Warrior(String name){
        super(name, "Warrior");
        System.out.println(this.name + ": My name will go down in history!");
    }

    @Override
    public void attack(String weapon) throws WeaponException{
        if (weapon.equals("sword") || weapon.equals("hammer") || weapon.equals("")){
            super.attack(weapon);
            System.out.println(this.name + ": I’ll crush you with my " + weapon + "!");
        }
        else {
            throw new WeaponException(this.name + ": A " + weapon + "?? What should I do with this?!");
        }
    }

    @Override
    public void moveLeft(){
        System.out.println(this.name + ": moves left like a bad boy.");
    }

    @Override
    public void moveRight(){
        System.out.println(this.name + ": moves right like a bad boy.");
    }

    @Override
    public void moveForward(){
        System.out.println(this.name + ": moves forward like a bad boy.");
    }

    @Override
    public void moveBack(){
        System.out.println(this.name + ": moves back like a bad boy.");
    }
}