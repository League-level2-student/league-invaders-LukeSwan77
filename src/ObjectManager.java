import java.util.ArrayList;
import java.util.Random;

public class ObjectManager {
	ArrayList<Projectile> projectiles = new ArrayList<Projectile>();
	ArrayList<Alien> aliens = new ArrayList<Alien>();
	public ObjectManager(Rocketship rock){
	
}
void addProjectile(Projectile pro){
	projectiles.add(pro);
}
void addAlien(){
	aliens.add(new Alien(new Random().nextInt(LeagueInvaders.gameWidth),0,50,50));
}
void update(){
	for (int i = 0; i < aliens.size(); i++) {
		aliens.get(i).update();;
		if(aliens.get(i).y > LeagueInvaders.gameHeight){
			aliens.get(i).isActive = false;
		}
	}
	
}
}
