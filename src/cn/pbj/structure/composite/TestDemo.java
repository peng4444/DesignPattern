package cn.pbj.structure.composite;

/**
 * 组合模式工作流程分析：
 * 组合模式为处理树形结构提供了完美的解决方案，描述了如何将容器和叶子进行递归组合，
 * 使得用户在使用时可以一致性的对待容器和叶子。
 * 当容器对象的指定方法被调用时，将遍历整个树形结构，寻找也包含这个方法的成员，
 * 并调用执行。其中，使用了递归调用的机制对整个结构进行处理。
 *
 * 使用组合模式，模拟杀毒软件架构设计
 *
 * 开发中的应用场景：
 * 操作系统的资源管理器
 * GUI中的容器层次图
 * XML文件解析
 * OA系统中，组织结构的处理
 * Junit单元测试框架
 * 底层设计就是典型的组合模式，TestCase(叶子)、TestUnite(容器)、Test接口(抽象)
 */
public class TestDemo {
    public static void main(String[] args) {
        AbstractFile f2,f3,f4,f5;
        Folder f1 = new Folder("我的收藏");
        f2 = new ImageFile("adb.jpg");
        f3 = new TextFile("ssl.txt");

        f1.add(f2);
        f1.add(f3);

//        f1.killVirus();

        Folder f11 = new Folder("电影");
        f4 = new VideoFile("nine cat");
        f5 = new VideoFile("big bang");
        f11.add(f4);
        f11.add(f5);
        f1.add(f11);

        f1.killVirus();

        /**
         * ---图像文件adb.jpg进行杀毒
         * ---文本文件ssl.txt进行杀毒
         * ---文件夹：电影进行杀毒
         * ---视频文件nine cat进行杀毒
         * ---视频文件big bang进行杀毒
         */
    }

}
