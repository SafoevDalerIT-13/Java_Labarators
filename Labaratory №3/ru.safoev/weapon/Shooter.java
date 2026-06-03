package ru.safoev.weapon;

public class Shooter {
    private String name;
    private Weapon weapon;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Weapon getWeapon() {
        return this.weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Shooter(String name) {
        this.name = name;
        this.weapon = null;
    }

    @Override
    public boolean equals(Object obj) {  // FIXME: нереализованный метод, лучше убрать
        return super.equals(obj);
    }

    public Shooter(String name, Weapon weapon) {
        this.name = name;
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Вы создали Стрелка с именем - " + getName();
    }

    public void shoot() {
        if(weapon != null) {   // FIXME: пробел после if (п.3)
            System.out.print(name + " стреляет: ");
            weapon.shoot();
        } else {
            System.out.println(name + ": не могу участвовать в перестрелке");
        }
    }
}