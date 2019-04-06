package cn.pbj.structure.bridge;

public interface Brand {
    void sale();
}

class Lenvo implements Brand{

    @Override
    public void sale() {
        System.out.println("销售联想品牌");
    }
}

class Dell implements Brand{

    @Override
    public void sale() {
        System.out.println("销售Dell品牌");
    }
}
//这里可以随时添加销售品牌