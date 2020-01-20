public class Polar {
	private double teta,R;
	public void setR(double x) {
		this.R = x;
	}
	public void setTeta(double y) {
		this.teta = y;
		
	}
	public double getR() {
		return this.R;
	}
	public double getTeta() {
		return this.teta;
	}
	public Cartesion polarToCartasion() {
		Cartesion s = new Cartesion();
		s.setX(this.R * Math.cos(this.teta));
		s.setY(this.R * Math.sin(this.teta));
		return s;
	}
	public Polar polarAdd(Polar x ,Polar y) {
		Cartesion add = new Cartesion();
		add.cartesionAdd(x.polarToCartasion(), y.polarToCartasion());
		return add.catresionToPolar();
	}
	public Polar polarProduct(Polar x,Polar y) {
		Polar product = new Polar();
		product.setR(x.getR()*y.getR());
		product.setTeta(x.getTeta()+y.getTeta());
		return product;
	}
	public Polar polarSubtract(Polar x, Polar y) {
		Cartesion subtract = new Cartesion();
		subtract.cartesionSubtract(x.polarToCartasion(), y.polarToCartasion());
		return subtract.catresionToPolar();
	}
	public Polar polarDivision(Polar x,Polar y) {
		Polar division = new Polar();
		division.setR(x.getR()/y.getR());
		division.setTeta(x.getTeta()-y.getTeta());
		return division;
	}
	public Polar polarConjugate(Polar x) {
		Polar conjugate = new Polar();
		conjugate.setR(x.getR());
		conjugate.setTeta(-(x.getTeta()));
		return conjugate;
	}
	public Polar polarPow(Polar x , double y) {
		Polar pow = new Polar();
		pow.setR(Math.pow(x.getR(), y));
		pow.setTeta(x.getTeta()*y);
		return pow;
	}
}
