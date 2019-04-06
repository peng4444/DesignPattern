package cn.pbj.createmodles.builder;



public class AirShip {
    private OrbitalModle orbitalModle;//轨道车
    private Engine engine;//引擎
    private EscapeTower escapeTower;//逃逸塔

    public void launch(){
        System.out.println("发射。。");
    }

    public OrbitalModle getOrbitalModle() {
        return orbitalModle;
    }

    public void setOrbitalModle(OrbitalModle orbitalModle) {
        this.orbitalModle = orbitalModle;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public EscapeTower getEscapeTower() {
        return escapeTower;
    }

    public void setEscapeTower(EscapeTower escapeTower) {
        this.escapeTower = escapeTower;
    }
}
class OrbitalModle{
    private String name;


    public OrbitalModle(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
class Engine{
    private String name;

    public Engine(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }
}
class EscapeTower{
    private String name;

    public EscapeTower(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
