import java.util.*;
import greenfoot.*;
import java.awt.Color;


public class Steuerung extends Actor
{
    World meineWelt;
    MouseInfo MI;
    raumschiff Enterprise = new raumschiff();
    Bullet meineKugel;
    boolean Freigabe=true;
    int z = 5;
    public void act()
    {
        MI=Greenfoot.getMouseInfo();
        if (MI!=null)
        {
            Enterprise.setLocation(MI.getX(),363);
            if ((MI.getButton()==1)&&(Freigabe== true))
            {
                shoot();
                z= 5;
                Freigabe = false;
            }
        } 
        z--;
        if (z<0) {
            Freigabe = true;
        }
    }
    public void addedToWorld(World w)
    {
        w.addObject(Enterprise,300,363);
        meineWelt=w;
    }
    public void shoot()
    {
      if (Freigabe== true) {
              meineKugel = new Bullet();
              meineWelt.addObject(meineKugel,Enterprise.getX(),363);
        }
    }
    
} 

