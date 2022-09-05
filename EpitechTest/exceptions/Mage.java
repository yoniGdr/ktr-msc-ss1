package exceptions;

public class Mage extends Character {
    public Mage(String name){
        super(name, "Mage");
        System.out.println(this.name + ": May the gods be with me.");
    }

    @Override
    public void attack(String weapon) throws WeaponException{
        if (weapon.equals("magic") || weapon.equals("wand") || weapon.equals("")){
            super.attack(weapon);
            System.out.println(this.name + ": Feel the power of my " + weapon + "!");
        }
        else {
            throw new WeaponException(this.name + ": I don’t need this stupid " + weapon + "! Don’t misjudge my powers!");
        }
    }

    @Override
    public void moveLeft(){
        System.out.println(this.name + ": moves left furtively.");
    }

    @Override
    public void moveRight(){
        System.out.println(this.name + ": moves right furtively.");
    }

    @Override
    public void moveForward(){
        System.out.println(this.name + ": moves forward furtively.");
    }

    @Override
    public void moveBack(){
        System.out.println(this.name + ": moves back furtively.");
    }
}