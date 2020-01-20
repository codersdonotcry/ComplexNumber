
public class Cartesion {
	private double x,y;
	public void setX(double x) {
		this.x = x;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double getX() {
		return this.x;
	}
	public double getY() {
		return this.y;
	}

	public Cartesion(double x, double y) {
		this.x = x;
		this.y = y;
	}
	public Cartesion() {
	}

	public Polar catresionToPolar() {
		Polar s = new Polar();
		s.setTeta(Math.atan(this.y/this.x));
		s.setR(Math.sqrt(Math.pow(this.y, 2)+Math.pow(this.x, 2)));
		return s;
	}
	public Cartesion cartesionAdd(Cartesion x,Cartesion y) {
		Cartesion sum = new Cartesion();
		sum.setX(x.getX() + y.getX());
		sum.setY(x.getY() + y.getY());
		return sum;
	}
	public Cartesion cartesionProduct(Cartesion x , Cartesion y) {
		Cartesion product = new Cartesion();
		product.setX((x.getX()*y.getX())-(x.getY()*y.getY()));
		product.setY((x.getX()*y.getY())+(y.getX()*x.getY()) );
		return product;
	}
	public Cartesion cartesionSubtract(Cartesion x,Cartesion y){
		Cartesion subtract = new Cartesion();
		subtract.setX(x.getX() - y.getX());
		subtract.setY(x.getY() - y.getY());
		return subtract;
	}
	public Cartesion cartesionDivision(Cartesion x , Cartesion y) {
		Cartesion division = new Cartesion();
		division.setX((x.getX()*y.getX() + x.getY()+y.getY())/(Math.pow(y.getX(), 2) + Math.pow(y.getY(), 2)));
		division.setY((x.getY()*y.getX() - x.getX()+y.getY())/(Math.pow(y.getX(), 2) + Math.pow(y.getY(), 2)));
		return division;
	}
	public Cartesion cartesionConjugate(Cartesion x) {
		Cartesion conjugate = new Cartesion();
		conjugate.setX(x.getX());
		conjugate.setY(-(x.getY()));
		return conjugate;
	}
	public double cartesionSize(Cartesion x) {
		double size = Math.sqrt(Math.pow(x.getX(), 2) + Math.pow(x.getY(), 2));
		return size;
	}
	public double cartesionArg(Cartesion x) {
		double Arg = Math.atan(x.getY()/x.getX());
		return Arg;
	}
	public Cartesion cartesionPow(Cartesion x,double y) {
		Polar pow = new Polar();
		pow.polarPow(x.catresionToPolar(), y);
		return pow.polarToCartasion();
	}
}
