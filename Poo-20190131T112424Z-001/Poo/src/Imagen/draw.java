
package Imagen;

import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;

public class draw implements KeyListener{
    
    private String PersonajePrincipal;
    private int dx;
    private int dy;
    private int x;
    private int y;
    private Image image;
    
    public draw(){
        
        x = 40;
        y = 60;
        PersonajePrincipal = "PhillJobs.png.png";
        ImageIcon image_icon = new ImageIcon(this.getClass().getResource(PersonajePrincipal));
        image = image_icon.getImage();
        
    }
    
      //RETORNAR VALORES
    
    public int tenerX(){
        
        return x;
    }
    public int tenerY(){
        
        return y;
    }
    public Image tenerImagen(){
        
        return image;
    }
    
    //METODO PARA DETECTAR TECLAS
    public void keyPressed(KeyEvent e){
        
        int key = e.getKeyCode();
        
        if (key == KeyEvent.VK_LEFT ){
            
            dx = -5;
        }
          if (key == KeyEvent.VK_RIGHT ){
            
            dx = 5;
        }
          if (key == KeyEvent.VK_UP ){
            
            dy = -5;
        }
          if (key == KeyEvent.VK_DOWN ){
            
            dy = 5;
        }
    }
    
     public void keyReleased(KeyEvent e){
        
        int key = e.getKeyCode();
        
        if (key == KeyEvent.VK_LEFT ){
            
            dx = 0;
        }
          if (key == KeyEvent.VK_RIGHT ){
            
            dx = 0;
        }
          if (key == KeyEvent.VK_UP ){
            
            dy = 0;
        }
          if (key == KeyEvent.VK_DOWN ){
            
            dy = 0;
        }
    }
    
    


    @Override
    public void keyTyped(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void mover() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
