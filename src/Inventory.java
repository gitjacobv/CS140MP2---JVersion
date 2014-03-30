import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

import java.util.*;

public class Inventory {
	
	ArrayList<Items> objectList; 
	int selected;
	boolean isSelected;
	int weaponEquipped;
	int armorEquipped;
	int bootsEquipped;
	int headgearEquipped;
	
	
	Object weapon;
	boolean arrow;
	public Image smallerText;
	public Image bg;
	public Image inBox;
	public Image inBox2;
	public Image inBox3;
	public Image equip;
	
	public Inventory(){
		setImage();
		objectList=new ArrayList<Items>();
		this.selected=0;	
		
		arrow=true;
		weaponEquipped=-1;
		armorEquipped=-1;
		bootsEquipped=-1;
		headgearEquipped=-1;
		
	}
	
	public void setImage(){
		try {
			this.smallerText=new Image("images/smallertext.png");
			this.bg= new Image("images/large.png");
			this.inBox=new Image("images/inventory.png");
			this.inBox2=new Image("images/inventory2.png");
			this.inBox3=new Image("images/inventory3.png");
			this.equip=new Image("C:/Users/LENOVO/Desktop/CS140MP2-2/bin/images/equipped.png");
		} catch (SlickException e) {
			e.printStackTrace();
		}
	}
	
	
	
	public void drawObjects(Graphics g){
		g.drawImage(bg, 0, 0);
		int x=75;
		int y=50;
		for(int j=0; j<4; j++){
			for(int i=0; i<10; i++){
				if((j*10)+i < objectList.size()){
					if( objectList.get((j*10)+i) != null){
						if(objectList.get((j*10)+i).itemClass==1){
							g.drawImage(objectList.get((j*10)+i).getImg(), x+5, y+5);
							if(((Equipable)objectList.get((j*10)+i)).equipped){
								g.drawImage(equip, x,y);
							}
						}else{
							g.drawImage(objectList.get((j*10)+i).getImg(), x+5, y+5);
						}
					}
				}
				if(selected==(j*10)+i){
					if(isSelected){
						g.drawImage(inBox3,x,y);
						
					}else{
						g.drawImage(inBox2,x,y);
					}
				}else{
					g.drawImage(inBox,x,y);
				}
				
				x+=50;
			}
			x=75;
			y+=50;
		}
	
	}
	
	public void drawCurrentItems(Graphics g){
		g.drawString("WEAPON", 275, 290);
		
		if(this.weaponEquipped!=-1){
			g.drawImage(this.objectList.get(this.weaponEquipped).getImg(), 355, 280);
		}
		g.drawImage(inBox,350,275);
		g.drawString("HEADGEAR", 425, 290);
		if(this.headgearEquipped!=-1){
			g.drawImage(this.objectList.get(this.headgearEquipped).getImg(), 505, 280);
		}
		g.drawImage(inBox,500,275);
		g.drawString("ARMOR", 275, 360);
		if(this.armorEquipped!=-1){
			g.drawImage(this.objectList.get(this.armorEquipped).getImg(), 355, 355);
		}
		g.drawImage(inBox,350,350);
		g.drawString("FOOTWEAR", 425, 360);
		if(this.bootsEquipped!=-1){
			g.drawImage(this.objectList.get(this.bootsEquipped).getImg(), 505, 355);
		}
		g.drawImage(inBox,500,350);
	}
	
	public void drawDialogue(Graphics g){
		
		g.drawImage(smallerText, 400,325);
	}
	
	public void setSelected(int s){
		this.selected=s;
	}
}
