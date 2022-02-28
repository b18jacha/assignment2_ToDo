package b18jacha_a19gabos;

import javax.swing.JFrame;

import se.his.it401g.todo.*;

public class ToDo {

    public static void main(String[] args) {
    	JFrame frame = new JFrame();
    
    	Task task = new HomeTask();
    	frame.add(task.getGuiComponent());
    	System.out.println("Yo");
    	frame.setBounds(2100,100,400,400);
    	frame.setVisible(true);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

//Hello