package me.xDest.mcdungeon.custommob;

import org.bukkit.Location;
import org.bukkit.World;

public interface CustomMob {

	
	void setMaxHealth(double hp);
	void setDamage(int dmgsp, int dmgsk);
	void setDamage(int dmg);
	void setProperties(World w, Location l, double hp, int dmgsp, int dmgsk, int speed); //only effects riders and passenger mobs
	void setProperties(World w, Location l, double hp, int dmg, int speed);
	void setSpawnLocation(Location l);
	void spawnInWorld();
	void setSpeed(int speed);
	void setBossArmor();
	void setNormArmor();
	void setFireRes();
	
	
	
}
