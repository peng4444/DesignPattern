package cn.pbj.createmodles.builder;

public class SxtAirShipDirector implements AirShipDirector {

    AirShipBuilder builder;

    public SxtAirShipDirector(AirShipBuilder builder) {
        this.builder = builder;
    }

    @Override
    public AirShip directorAirShip() {
        Engine e = builder.builderEngine();
        OrbitalModle o = builder.builderOrbitalModle();
        EscapeTower et = builder.builderEscapeTower();

        AirShip ship = new AirShip();
        ship.setEngine(e);
        ship.setOrbitalModle(o);
        ship.setEscapeTower(et);
        return null;
    }
}
