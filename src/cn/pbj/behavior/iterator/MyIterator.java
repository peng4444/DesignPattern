package cn.pbj.behavior.iterator;

public interface MyIterator {
    void first();
    void next();
    boolean hasNext();

    boolean isfirst();
    boolean idLast();

    Object getCurrentObj();
}
