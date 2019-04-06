package cn.pbj.createmodles.prototype;

import java.io.Serializable;
import java.util.Date;

public class Sheep implements  Cloneable , Serializable {
    private String sheepName;
    private Date sheepBirthday;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object obj = super.clone();
        return obj;
    }

    public Sheep() {

    }

    public Sheep(String sheepName, Date sheepBirthday) {
        this.sheepName = sheepName;
        this.sheepBirthday = sheepBirthday;
    }

    public String getSheepName() {
        return sheepName;
    }

    public void setSheepName(String sheepName) {
        this.sheepName = sheepName;
    }

    public Date getSheepBirthday() {
        return sheepBirthday;
    }

    public void setSheepBirthday(Date sheepBirthday) {
        this.sheepBirthday = sheepBirthday;
    }
}
