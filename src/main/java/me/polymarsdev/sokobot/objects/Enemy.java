package me.polymarsdev.sokobot.objects;

public class Enemy {

    int x = 0;
    int y = 0;
    int hp = 3;
    Grid currentGrid;
    String enemyEmoji;
    public Enemy(int x, int y, Grid currentGrid, String enemyEmoji) {
        this.x = x;
        this.y = y;
        this.currentGrid = currentGrid;
        this.enemyEmoji = enemyEmoji;
    }

    public int getX()
    {
        return x;
    }
    public int getY()
    {
        return y;
    }
    public String toString() {
        return enemyEmoji;
    }
    public void dealDamage() {
        hp--;
        if(hp >= 0) this.enemyEmoji = ":skull:";
    }



}
