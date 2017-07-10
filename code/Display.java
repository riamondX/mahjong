
import java.util.*;

import javax.swing.*;

public class Display extends JFrame{
	// a deck and two cards
    private Set          setofT;
    private Pile			p;
    private Player          p1;
    private Player          p2;
    private Player          p3;
    private Player          p4;

    // the main frame that holds everything
    private static JFrame f;

    // the frame pops up when click.provide help information
    private static JFrame fHelp;

    // have three panels, main, sp(pile),p1(ur view), p2,p3,p4
    private JPanel        pan;
    private JPanel        sp;
    private JPanel        sp1;
    private JPanel        sp2;
    private JPanel        sp3;
    private JPanel        sp4;
    
/*
    // button : two shows cards, one play, one reset
    private JButton       hu;
    private JButton       peng;
    private JButton       gang;
    private JButton       guo;
    private JButton       chi;
    private JButton[]	  pai;

    // text field : two shows cards name, one shows winner
    // last one shows help information
    private JTextField    text1;
    private JTextField    text2;
    private JTextField    text3;
    private JTextField    text4;
*/
    // menu : two items, quit and help
    private JMenuBar      menuBar;
    private JMenuItem     item1;
    private JMenuItem     item2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	}

}
