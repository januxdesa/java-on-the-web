package cl.iarobot.www;

import java.util.Random;

public class Colores {
		
	public String colores () {
		
		Random r = new Random();
		
		int color1 = r.nextInt(16777215);   // #FFFFFF 
		String hex1 = Integer.toHexString(color1);   
		
		return hex1;
		
	}
	
	public String salidaHtml(int i, int j, String hex1, String hex2) {
		
		int alternar = 0;
		String out = "";
		
		//String color1 = this.colores();
		//String color2 = this.colores();
		
		
		if (j % 2 == 0) { alternar = 0; } else { alternar = 1; }
		
		if (i % 2 == alternar) {
			
		     out = "<div class='negro' Style='background-color: #"+hex1+"'></div>";
		      
			
		 } else {
			 
			 out = "<div class='rojo' Style='background-color: #"+hex2+"'></div>";
			 
			 
    	}
		
		return out;
	}
	

}
