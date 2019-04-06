package cn.pbj.createmodles.builder;

/**
 * 建造模式的本质：
 * 分离了对象子组件的单独构造(由Builder来负责)和装配(由Director负责)。 从而可以构造出复杂的对象。
 * 这个模式适用于：某个对象的构建过程复杂的情况下使用。
 * 由于实现了构建和装配的解耦。不同的构建器，相同的装配，也可以做出不同的对象；
 * 相同的构建器，不同的装配顺序也可以做出不同的对象。也就是实现了构建算法、装配算法的解耦，
 * 实现了更好的复用。
 */
public class Client {
    public static  void main(String[] args){
        AirShipDirector director = new SxtAirShipDirector(new SxtAirShipBuilder());

        AirShip ship = director.directorAirShip();

        System.out.println(ship.getEngine().getName());

        ship.launch();
    }
}
