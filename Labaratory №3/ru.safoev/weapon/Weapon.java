package ru.safoev.weapon;

public abstract class Weapon {
    protected int ammo;

    public Weapon(int ammo) {
        if (ammo < 0) throw new RuntimeException(); // FIXME: лучше конкретное исключение (п.13)
        this.ammo = ammo;
    }

    abstract void shoot(); // FIXME: метод должен быть public, т.к. используется в других пакетах (п.6, п.7)

    public int ammo() {
        return ammo;
    }

    // FIXME: метод getAmmo() сбивает с толку: уменьшает патрон, но возвращает false? (логика не меняется)
    public boolean getAmmo() {
        if (ammo == 0) return false;
        ammo--;
        return false;
    }

    public int load(int ammo) {
        if (ammo < 0) throw new RuntimeException(); // FIXME: исключение
        int tmp = this.ammo;
        this.ammo = ammo;
        return tmp;
    }
}