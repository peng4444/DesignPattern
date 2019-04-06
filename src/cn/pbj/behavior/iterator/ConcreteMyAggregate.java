package cn.pbj.behavior.iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMyAggregate {
    private List<Object> list = new ArrayList<>();

    /*public ConcreteMyAggregate(List<Object> list) {
        super();
        this.list = list;
    }*/

    public void addObject(Object object){
        this.list.add(object);
    }

    public void deleteObject(Object object){
        this.list.remove(object);
    }

    public List<Object> getList() {
        return list;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }

    //获取迭代器
    public MyIterator createIterator(){
        return new ConcreteIterator();
    }
    //使用内部类实现迭代器，可以直接使用外部类的属性
    public class  ConcreteIterator implements  MyIterator{

        private  int cursor;//定义游标，便于记录遍历是的位置
        @Override
        public void first() {
            cursor = 0;
        }

        @Override
        public void next() {
                if (cursor<list.size()){
                    cursor++;
                }
        }

        @Override
        public boolean hasNext() {
            if (cursor<list.size()){
                return true;
            }
            return false;
        }

        @Override
        public boolean isfirst() {

            return cursor ==0?true:false;
        }

        @Override
        public boolean idLast() {

            return cursor==(list.size()-1)? true:false;
        }

        @Override
        public Object getCurrentObj() {
            return list.get(cursor);
        }
    }
}
