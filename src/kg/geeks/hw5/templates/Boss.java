package kg.geeks.hw5.templates;

public class Boss {
    private int health;
    private int damage;
    private String protectionType;

    public Boss() {
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return this.damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getProtectionType() {
        return this.protectionType;
    }

    public void setProtectionType(String protectionType) {
        this.protectionType = protectionType;
    }
}

