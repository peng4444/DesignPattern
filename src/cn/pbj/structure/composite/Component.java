package cn.pbj.structure.composite;
/**
 * 使用组合模式的场景：
 * 把部分和整体的关系用树形结构来表示，从而使客户端可以使用统一的方式处理部分对象和整体对象。
 * 组合模式核心：
 * 抽象构件(Component)角色: 定义了叶子和容器构件的共同点
 * 叶子(Leaf)构件角色：无子节点
 * 容器(Composite)构件角色： 有容器特征，可以包含子节点
 */
/**
 * 抽象组件
 */
public interface Component {
    void operation();
}

//叶子组件
interface  Leaf extends Component{

}

//容器组件
interface Composite extends Component{
    void add(Component c);
    void remove(Component c);
    Component getChild(int index);

    @Override
    void operation();
}


