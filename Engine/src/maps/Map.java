package maps;

public class Map {

	private Tile[][] map;
	private int height;			public int getHeight(){return height;}
	private int width;			public int getWidth(){return width;}
	
	public Map(int _height, int _width){
		height = _height > 0 ? _height: 1;
		width = _width > 0 ? _width: 1;
		
		map = generateMap();
	}
	
	public Tile getTile(int x, int y){
		if(inBounds(x,y))
			return new BlankTile();
		
		return map[x][y];
	}
	
	public boolean inBounds(int x, int y){
		return !(x > -1 && y > -1 && x < height && y < width);
	}
	
	private Tile[][] generateMap(){
		Tile[][] temp = new Tile[height][width];
		
		for(int i = 0; i < height; i ++){
			for(int j = 0; j < width; j++){
				if(i == 0 || j == 0 || i == height-1 || j == width-1)
					temp[i][j] = new WallTile();
				else
					temp[i][j] = new GrassTile();
			}
		}
		
		return temp;
	}
}
