/**
 * Author : Riven 
 * 
 * */
public class Set {
	public static final int num = 136;
	// a set of mahjong has 136 tiles(without flowers)
	// has four of each.
	private Tile[] set = new Tile[num];
	// does each tile need an id???
	
	public Set()
	{
		// make tong,tiao,wan, feng, jian
		// t as tong, s as tiao, w as wan, f as wind, d as arrow
		int current = 0;
		//for(int j = 0; j < 4 ;j++)
		//{
			for(int i = 0;i<9;i++)
			{
				for(int j = 0; j < 4 ;j++)
				{
					set[current] = new Tile('t',i,current);
					current ++;
				}
			}
			for(int i = 0;i<9;i++)
			{
				for(int j = 0; j < 4 ;j++)
				{
					set[current] = new Tile('s',i,current);
					current ++;
				}
			}
			for(int i = 0;i<9;i++)
			{
				for(int j = 0; j < 4 ;j++)
				{
					set[current] = new Tile('w',i,current);
					current ++;
				}
			}
			
			for(int i = 0;i<4;i++)
			{
				for(int j = 0; j < 4 ;j++)
				{
					set[current] = new Tile('f',i,current);
					current ++;
				}
			}
			
			for(int i = 0;i<3;i++)
			{
				for(int j = 0; j < 4 ;j++)
				{
					set[current] = new Tile('d',i,current);
					current ++;
				}
			}
	//	}
		
		// for debug
		System.out.println(current);
		
		
	}
}
