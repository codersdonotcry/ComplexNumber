public class Calculate {
    public Cartesion sin(Cartesion cartesion){
        Cartesion cartesion1 = new Cartesion();
        cartesion1.setX(Math.cos(cartesion.getX())*Math.sinh(cartesion.getY()));
        cartesion1.setY(Math.sin(cartesion.getX())*Math.cosh(cartesion.getY()));
        return cartesion1;
    }
    public Cartesion cos(Cartesion cartesion){
        Cartesion cartesion1 = new Cartesion();
        cartesion1.setX(Math.cos(cartesion.getX())*Math.cosh(cartesion.getY()));
        cartesion1.setY(Math.sin(-cartesion.getX())*Math.sinh(cartesion.getY()));
        return cartesion1;
    }
    public Cartesion tan(Cartesion cartesion){
        return cartesion.cartesionDivision(sin(cartesion),cos(cartesion));
    }
    public Cartesion cot(Cartesion cartesion){
        return cartesion.cartesionDivision(cos(cartesion),sin(cartesion));
    }
    public Cartesion ln(Cartesion cartesion){
        Cartesion cartesion1 = new Cartesion();
        cartesion1.setX(cartesion.cartesionSize(cartesion));
        cartesion1.setY(cartesion.cartesionArg(cartesion));
        return cartesion1;
    }
    public Polar pow(Cartesion cartesion , Cartesion cartesion1){
        Polar polar = new Polar();
        Cartesion cartesion2 = cartesion.cartesionProduct(cartesion1,ln(cartesion));
        polar.setR(Math.exp(cartesion2.getX()));
        polar.setTeta(cartesion2.getY());
        return polar;
    }
    public Cartesion sinh(Cartesion cartesion){
        Cartesion cartesion1 = new Cartesion();
        cartesion1.setX(Math.cosh(cartesion.getX())*Math.sin(cartesion.getY()));
        cartesion1.setY(Math.sinh(cartesion.getX())*Math.cos(cartesion.getY()));
        return cartesion1;
    }
    public Cartesion cosh(Cartesion cartesion){
        Cartesion cartesion1 = new Cartesion();
        cartesion1.setX(Math.cosh(cartesion.getX())*Math.cos(cartesion.getY()));
        cartesion1.setY(Math.sinh(cartesion.getX())*Math.sin(cartesion.getY()));
        return cartesion1;
    }
    public Cartesion tanh(Cartesion cartesion){
        return cartesion.cartesionDivision(sinh(cartesion),cosh(cartesion));
    }
    public Cartesion coth(Cartesion cartesion){
        return cartesion.cartesionDivision(cosh(cartesion),sinh(cartesion));
    }

    public Cartesion acos(Cartesion cartesion){
        Cartesion cartesion1 = new Cartesion();
        cartesion1.setX(0);
        cartesion1.setY(-1);
        Cartesion cartesion3 = new Cartesion();
        cartesion3.setX(0);
        cartesion3.setY(1);
        Cartesion cartesion4 = new Cartesion();
        cartesion4.setX(1);
        cartesion4.setY(0);
        return cartesion.cartesionProduct(cartesion1,ln(cartesion.cartesionAdd(cartesion,cartesion
                .cartesionProduct(cartesion3,cartesion.cartesionPow(cartesion.cartesionSubtract(cartesion4,cartesion.cartesionPow(cartesion,2)),0.5)))));
    }
    public Cartesion asin(Cartesion cartesion){
        Cartesion cartesion1 = new Cartesion();
        cartesion1.setX(0);
        cartesion1.setY(-1);
        Cartesion cartesion3 = new Cartesion();
        cartesion3.setX(0);
        cartesion3.setY(1);
        Cartesion cartesion4 = new Cartesion();
        cartesion4.setX(1);
        cartesion4.setY(0);
        return cartesion.cartesionProduct(cartesion1,ln(cartesion.cartesionAdd(cartesion.cartesionProduct(cartesion3,cartesion),cartesion
                .cartesionPow(cartesion.cartesionSubtract(cartesion4,cartesion.cartesionPow(cartesion,2)),0.5))));
    }
    public Cartesion atan(Cartesion cartesion){
        Cartesion cartesion1 = new Cartesion();
        cartesion1.setX(2);
        cartesion1.setY(0);
        Cartesion cartesion3 = new Cartesion();
        cartesion3.setX(0);
        cartesion3.setY(1);
        Cartesion cartesion4 = new Cartesion();
        cartesion4.setX(1);
        cartesion4.setY(0);
        return cartesion.cartesionProduct(cartesion.cartesionDivision(cartesion3,cartesion1)
                ,ln(cartesion.cartesionDivision(cartesion.cartesionAdd(cartesion3,cartesion),cartesion.cartesionSubtract(cartesion3,cartesion))));
    }
}
