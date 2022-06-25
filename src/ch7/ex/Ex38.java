package ch7.ex;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex38 {
    public static void main(String[] args) {
        Button b = new Button("Start");
        b.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent event) {
                    System.out.println("ActionEvent occurred");
                }
            }
        );
    }
}
