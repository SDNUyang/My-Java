package random_circle_trangle;

public class random_triangle {
	public static void main(String[] ages) {
		double x1,y1;
		double x2,y2;
		double x3,y3;
		while(true) {
			x1=40*Math.cos(2*Math.PI*Math.random());
			y1=40*Math.cos(2*Math.PI*Math.random());
			x2=40*Math.cos(2*Math.PI*Math.random());
			y2=40*Math.cos(2*Math.PI*Math.random());
			x3=40*Math.cos(2*Math.PI*Math.random());
			y3=40*Math.cos(2*Math.PI*Math.random());
			if(Math.pow(x1, 2)+Math.pow(y1, 2)==1600&&Math.pow(x2, 2)+Math.pow(y2, 2)==1600&&Math.pow(x3, 2)+Math.pow(y3, 2)==1600)
			{
				System.out.println("OK");
				break;
			}
		}
		System.out.println("The first point:("+x1+","+y1+")");
		System.out.println("The second point:("+x2+","+y2+")");
		System.out.println("The third point:("+x3+","+y3+")");
	}

}
