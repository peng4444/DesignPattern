package cn.pbj.createmodles.builder;

public class SxtAirShipBuilder implements AirShipBuilder {
    @Override
    public Engine builderEngine() {
        System.out.println("构建ll牌发动机");
        return new Engine("ll牌发动机");
    }

    @Override
    public EscapeTower builderEscapeTower() {
        System.out.println("构建ss牌逃逸塔");
        return new EscapeTower("ss牌逃逸塔");
    }

    @Override
    public OrbitalModle builderOrbitalModle() {
        System.out.println("构建21牌轨道车");
        return new OrbitalModle("21牌轨道车");
    }
}
