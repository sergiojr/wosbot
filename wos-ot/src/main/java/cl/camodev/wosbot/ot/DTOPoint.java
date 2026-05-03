package cl.camodev.wosbot.ot;

public class DTOPoint {
	private int x;
	private int y;

	public DTOPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public DTOPoint(DTOPoint point, float scale) {
		this.x = (int) (scale * point.x);
		this.y = (int) (scale * point.y);
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	@Override
	public String toString() {
		return "DTOPoint [x=" + x + ", y=" + y + "]";
	}
}
