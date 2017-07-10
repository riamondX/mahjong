/**
 * 
 */
import java.util.*;
import javax.swing.*;

/**
 * @author Riven Xu
 *
 */
public class Tile {
	private char suit;
	// t as tong, s as tiao, w as wan, f as wind, d as arrow
	private int value;
	// tong has 1-9, tiao has 1-9, wan has 1-9, wind has 1-4, arrow has 1-3
	//might not be useful : private String name;
	// 0 - 135
	private int id;
    private ImageIcon   faceImg;
    private ImageIcon   backImg;
	
    public Tile()
    {
        suit  = 'n';
        value = -1;
        id  = -1;
    }
    
	public Tile(char s, int v, int i)
	{
		suit = s;
		value = v;
		id = i;	
		faceImg = new ImageIcon("MJ"+suit+v+".png");
		backImg = new ImageIcon("back.png");
	}

	/**
	 * @return the suit
	 */
	public char getSuit() {
		return suit;
	}

	/**
	 * @return the value
	 */
	public int getValue() {
		return value;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the faceImg
	 */
	public ImageIcon getFaceImg() {
		return faceImg;
	}

	/**
	 * @return the backImg
	 */
	public ImageIcon getBackImg() {
		return backImg;
	}
	
	

}
