# DesignPattern
**some of my summerize design Pattern learning**

[TOC]


[参考视频：忘了是看了那个视频写的](https://github.com/peng4444/DesignPattern)

[23种设计模式的详细概念和具体的Java实现【上】](https://www.nowcoder.com/discuss/377458)

[面试官问，你在开发中有用过什么设计模式吗？我懵了](https://www.cnblogs.com/awan-note/p/12555872.html)
## 什么是设计模式？
>> 设计模式是一套被反复使用的、多数人知晓的、经过分类编目的、代码设计经验的总结。 
### 为什么使用设计模式
```markdown
使用设计模式是为了重用代码、让代码更容易被他人理解、保证代码可靠性。
```
### 设计模式的七大原则
```markdown
单一职责原则:
开闭原则(Open Close Principle)：对扩展开放，对修改关闭。
    在程序需要进行拓展的时候，不能去修改原有的代码，实现一个热插拔的效果。所以一句话概括就是：
    为了使程序的扩展性好，易于维护和升级。想要达到这样的效果，我们需要使用接口和抽象类。 
里氏代换原则(Liskov Substitution Principle)：对开闭原则的补充。任何基类可以出现的地方，子类一定可以出现。
    LSP是继承复用的基石，只有当派生类可以替换掉基类，且软件单位的功能不受到影响时，基类才能真正被复用，而派生类也能够在基类的基础上增加新的行为。
依赖倒转原则(Dependence Inversion Principle)：针对接口编程，依赖于抽象而不依赖于具体。
接口隔离原则(Interface Segregation Principle)：尽量使用多个隔离的接口，为了降低类之间的耦合度。
迪米特法则(最少知道原则)(Demeter Principle)：一个实体应当尽量少地与其他实体之间发生相互作用，使得系统功能模块相对独立。
合成复用原则(Composite Reuse Principle)：尽量使用合成/聚合的方式，而不是使用继承。
```
[万字总结之设计模式七大原则](https://www.cnblogs.com/chenchen0618/p/12434603.html)

[设计模式7大原则](https://www.cnblogs.com/1314xf/p/10122504.html)

## 设计模式有23种类型。按照主要分类可以分为三大类:
### 一、创建型模式 
```markdown
这些设计模式提供了一种在创建对象的同时隐藏创建逻辑的方式，而不是使用new运算符直接实例化对象。
这使得程序在判断针对某个给定实例需要创建哪些对象时更加灵活。 
1.单例模式 工厂模式 抽象工厂模式 建造者模式 原型模式
创建型模式：都是用来帮助我们创建对象的！
```   
#### 1.单例模式
[吐血整理全网最全的单例模式](https://www.cnblogs.com/chenchen0618/p/12434575.html)
>> 保证一个类只有一个实例，并且提供一个访问该实例的全局访问点。
```markdown
单例模式首先通过将类的实例化方法私有化来防止程序通过其他方式创建该类的实例，
然后通过提供一个全局唯一获取该类实例的方法帮助用户获取类的实例，用户只需也只能通过调用该方法获取类的实例。
饿汉模式（线程安全）
    定义一个私有的构造方法，并将自身的实例对象设置为一个私有属性,并加上static和final修饰符，然后通过公共的静态方法调用返回实例。
        优点：写起来很简单，并且不会因为不加synchronized关键字而造成的线程不安全问题。
        类初始化时立即加载，无法延迟加载,天然线程安全
        方法没有同步，调用效率高
        缺点：当该类被加载的时候，会初始化该实例和静态变量并被创建并分配内存空间，并且会一直占用内存。
饱汉模式/懒汉式(线程不安全)
    定义一个私有的构造方法，定义一个该类静态私有的变量，然后定义一个公共的静态方法，对该类的值进行空判断，不为空直接返回，否则重新构建一个。
    延迟加载
    优点：写起来很简单，在第一次调用的时候才会初始化，节省了内存。
    缺点：线程不安全，多个线程调用可能会出现多个实例。
    总结：书写简单，线程不安全，效率还行。
静态内部类
    定义一个私有的构造方法，定义一个该类私有静态的内部类，然后在内部类中定义一个该类的静态变量，
    然后通过公共的final修饰的静态方法调用返回实例。
    因为该类的内部类是私有的，除了对外公布的公共静态方法getInstance()，是无法访问的。因为它是延迟加载，
    所以读取读取实例的时候不会进行同步，几乎没有性能的缺陷，而且还是线程安全的，并且不依赖JDK的版本。
双重锁检查
    定义一个私有构造方法，通过volatile定义静态私有变量，保证了该变量的可见性，然后定义一个共有的静态方法，
    第一次对该对象实例化时与否判断，不为空直接返回，提升效率；然后使用synchronized 进行同步代码块，
    防止对象未初始化时，在多线程访问该对象在第一次创建后，再次重复的被创建；
    然后第二次对该对象实例化时与否判断，如果未初始化，则初始化，否则直接返回该实例。
    这种模式在很长的一段时间内可以说是最优的了，内存占用低，效率高，线程安全，多线程操作原子性。但是有个缺点就是书写麻烦，对新手不太友好。
枚举单例
    JDK1.5之后出现了枚举，并且完美支持单例模式，并且线程安全、效率高！但是这些不是最重要的，
    最重要的是书写超级简单！究竟有多简单，看下面的示例应该就可以了解一下了。。。  
构造方法私有化（private）;
定义一个私有(private)静态(static)实例化对象;对外提供一个公共(public)静态(static)的方法得到该实例;     
单例模式的使用场景
 * 在程序中比较常用的是数据库连接池、线程池、日志对象等等。
 * 单例模式使用
 * 最早我们在学习单例模式的时候，基本都会接触这两种模式：饿汉式和饱汉式(懒汉式)。
```
#### 2. 简单工厂模式
[工厂模式讲解, 引入Spring IOC](https://www.cnblogs.com/tanshaoshenghao/p/10770659.html)
>> 在创建一个对象时不向客户暴露内部细节，并提供一个创建对象的通用接口。

>> 简单工厂模式 用来生产同一等级结构中的任意产品。（对于增加新的产品，需要修改已有代码）
```markdown 
简单工厂模式也叫静态工厂模式，就是工厂类一般是使用静态方法，通过接收的参数的不同来返回不同的对象实例。
简单工厂把实例化的操作单独放到一个类中，这个类就成为简单工厂类，让简单工厂类来决定应该用哪个具体子类来实例化。
对于增加新产品无能为力！不修改代码的话，是无法扩展的。 
```
#### 3. 工厂方法模式
>> 定义了一个创建对象的接口，但由子类决定要实例化哪个类。工厂方法把实例化操作推迟到子类。
>> 工厂方法模式  用来生产同一等级结构中的固定产品。（支持增加任意产品） 
```markdown
工厂方法模式要点：为了避免简单工厂模式的缺点，不完全满足OCP。
工厂方法模式和简单工厂模式最大的不同在于，简单工厂模式只有一个（对于一个项目或者一个独立模块而言）
工厂类，而工厂方法模式有一组实现了相同接口的工厂类。
```
#### 4. 抽象工厂模式
>> 提供一个接口，用于创建 相关的对象家族
>> 抽象工厂模式 用来生产不同产品族的全部产品。（对于增加新的产品，无能为力；支持增加产品族）
```markdown
抽象工厂模式在工厂模式上添加了一个创建不同工厂的抽象接口（抽象类或接口实现），该接口可叫做超级工厂。
在使用过程中，我们首先通过抽象接口创建出不同的工厂对象，然后根据不同的工厂对象创建不同的对象。
抽象工厂模式创建的是对象家族，也就是很多对象而不是一个对象，并且这些对象是相关的，也就是说必须一起创建
出来。而工厂方法模式只是用于创建一个对象，这和抽象工厂模式有很大不同。
```
#### 5. 建造者模式
>> 封装一个对象的构造过程，并允许按步骤构造。
```markdown
建造模式的本质：
 * 分离了对象子组件的单独构造(由Builder来负责)和装配(由Director负责)。 从而可以构造出复杂的对象。
 * 这个模式适用于：某个对象的构建过程复杂的情况下使用。
 * 由于实现了构建和装配的解耦。不同的构建器，相同的装配，也可以做出不同的对象；
 * 相同的构建器，不同的装配顺序也可以做出不同的对象。也就是实现了构建算法、装配算法的解耦，实现了更好的复用。
```
#### 6. 原型模式
>> 使用原型实例指定要创建对象的类型，通过复制这个原型来创建新对象。
```markdown
通过new产生一个对象需要非常繁琐的数据准备或访问权限，则可以使用原型模式。
 * 就是java中的克隆技术，以某个对象为原型，复制出新的对象。显然，新的对象具备原型对象的特点
 * 优势有：效率高(直接克隆，避免了重新执行构造过程步骤) 。
 * 克隆类似于new，但是不同于new。new创建新的对象属性采用的是默认值。
 * 克隆出的对象的属性值完全和原型对象相同。并且克隆出的新对象改变不会影响原型对象。
 * 然后，再修改克隆对象的值。
 * 原型模式实现：
 * Cloneable接口和clone方法
 * Prototype模式中实现起来最困难的地方就是内存复制操作，所幸在Java中提供了clone()方法替我们做了绝大部分事情。
```

### 二、结构型模式
>> 适配器模式 桥接模式 过滤器模式 组合模式 装饰器模式 外观模式 享元模式 代理模式
```markdown
这些设计模式关注类和对象的组合。继承的概念被用来组合接口和定义组合对象获得新功能的方式。
核心作用：是从程序的结构上实现松耦合，从而可以扩大整体的类结构，用来解决更大的问题。
```
#### 1. 适配器模式
>> 把一个类接口转换成另一个用户需要的接口。
#### 2. 桥接模式 
>> 将抽象与实现分离开来，使它们可以独立变化。
[结构型设计模式 - 桥接模式详解](https://www.cnblogs.com/songjilong/p/12600282.html)
#### 3. 组合模式 
>> 将对象组合成树形结构来表示“整体/部分”层次关系，允许用户以相同的方式处理单独对象和组合对象。
#### 4. 装饰器模式
>> 为对象动态添加功能。
#### 5. 外观模式
>> 提供了一个统一的接口，用来访问子系统中的一群接口，从而让子系统更容易使用。
#### 6. 享元模式
>> 利用共享的方式来支持大量细粒度的对象，这些对象一部分内部状态是相同的。
#### 7. 代理模式
>> 控制对其它对象的访问。
[通过模拟JDK中的动态代理,由浅入深讲解动态代理思想](https://www.cnblogs.com/tanshaoshenghao/p/10765360.html)

[代理模式](https://www.cnblogs.com/weixk/p/12996346.html)
```markdown
优点：代理模式能将代理对象与真实被调用的目标对象分离
      一定程度上降低了系统的耦合度，扩展性好
      保护目标对象
      增强目标对象
缺点：
    代理模式会造成系统设计中类的数目增加
    在客户端和目标对象增加一个代理对象，会造成请求处理速度变慢
    增加系统的复杂度
静态代理
动态代理
CGLib代理
Spring代理选择：
    当Bean有实现接口时，Spring就会用JDK的动态代理
    当Bean没有实现接口时，Spring使用CGlib
    可以强制使用Cglib
    在spring配置中加入<aop:aspectj-autoproxy proxy-target-class="true"/>
模拟场景：spring中，service调用dao前，需要先根据分库策略，切换数据源，即AOP面向切面
源码示例：1.spring中的ProxyFactoryBean(静态代理)
         2.mybatis中的MapperProxy(动态代理)
```

### 三、行为型模式
```markdown
这些设计模式特别关注对象之间的通信。
责任链模式 命令模式 模板模式 策略模式 解释器模式 访问者模式 迭代器模式 中介者模式 状态模式 备忘录模式 观察者模式 空对象模式
```
#### 1.责任链模式
>> 使多个对象都有机会处理请求，从而避免请求的发送者和接收者之间的耦合关系。将这些对象连成一条链，并沿着这条链发送该请求，直到有一个对象处理它为止。
[由浅入深讲解责任链模式,理解Tomcat的Filter过滤器](https://www.cnblogs.com/tanshaoshenghao/p/10741160.html)
```markdown

```
#### 2. 命令模式
>> 将命令封装成对象中，具有以下作用：
   使用命令来参数化其它对象
   将命令放入队列中进行排队
   将命令的操作记录到日志中
   支持可撤销的操作
#### 3. 解释器模式
>> 为语言创建解释器，通常由语言的语法和语法分析来定义。
#### 4. 迭代器模式
>> 提供一种顺序访问聚合对象元素的方法，并且不暴露聚合对象的内部表示。
#### 5. 中介者模式
>> 集中相关对象之间复杂的沟通和控制方式。
#### 6. 备忘录模式
[行为型设计模式 - 备忘录模式详解](https://www.cnblogs.com/songjilong/p/12846761.html)
>> 备忘录模式（Memento Pattern）：在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态。
>> 这样就可以将该对象恢复到原先保存的状态
##### 模式分析
```markdown
Originator（发起者）：记录当前的状态，负责创建和恢复备忘录
Memento（备忘录）：负责存储发起者的状态，在需要的时候提供发起人需要的状态
Caretaker（管理者）：管理备忘录
优点：
    给用户提供了一种可以恢复状态的机制，使用户可以比较方便的回退到某个历史的状态
    实现了信息的封装，使用户不需要关心备忘录中状态的保存细节
缺点：
    在实际应用中，备忘录模式都是多状态和多备份的，发起人角色的状态需要存储到备忘录对象中，
    对资源的消耗是比较严重的，为了节约内存，可以配合原型模式使用
应用场景：
    游戏的存档
    CTRL + Z 撤销
    浏览器的后退
    数据库的事务管理,回滚操作
    ...
```
#### 7. 观察者模式
>> 定义对象之间的一对多依赖，当一个对象状态改变时，它的所有依赖都会收到通知并且自动更新状态。
#### 8. 状态模式
>> 允许对象在内部状态改变时改变它的行为，对象看起来好像修改了它所属的类。
```markdown
核心：用于解决系统中复杂对象的状态转换以及不同状态下行为的封装问题
结构：Context环境类 环境类中维护一个State对象，他是定义了当前的状态。 State抽象状态类
ConcreteState具体状态类,每一个类封装了一个状态对应的行为。
开发中常见的场景：
    银行系统中账号状态的管理
    OA系统中公文状态的管理
    酒店系统中，房间状态的管理
    线程对象各状态之间的切换
```
[行为型设计模式 - 状态模式详解](https://www.cnblogs.com/songjilong/p/12894463.html)
```markdown
状态模式（State Pattern）主要用来解决对象在多种状态转换时，需要对外输出不同的行为的问题，类的行为是基于它的状态改变的。
Context（环境角色）：用于维护 State 实例，这个实例定义当前状态
State（抽象状态）：定义一个接口以封装与 Context 的一个特定状态相关的行为
ConcreteState（具体状态）：每一子类实现一个与 Context 的一个状态相关的行为
优点：
代码具有较强的可读性。状态模式将每个状态的行为封装到对应的一个类中
方便维护。将容易产生问题的 if-else 语句删除了，如果把每个状态的行为都放到一个类中，每次调用方法时都要判断当前是什么状态，不但会产出很多 if-else 语句，而且容易出错
缺点：
会产生很多类。每个状态都对应一个类，当状态过多时，维护难度变大
状态模式的结构与实现都较为复杂，如果使用不当将导致程序结构和代码的混乱
状态模式对"开闭原则"的支持并不太好，对于可以切换状态的状态模式，增加新的状态类需要修改那些负责状态转换的源代码，否则无法切换到新增状态，而且修改某个状态类的行为也需修改对应类的源代码。
适用环境：
行为随状态改变而改变的场景
条件、分支语句的代替者


```
#### 9. 策略模式
>> 定义一系列算法，封装每个算法，并使它们可以互换。策略模式可以让算法独立于使用它的客户端。
[为什么会有Comparable与Comparator接口? 引入策略模式](https://www.cnblogs.com/tanshaoshenghao/p/10753022.html)

[策略模式在公司项目中的运用实践，看完又可以涨一波实战经验了！](https://www.cnblogs.com/javazhiyin/p/12840885.html)

[从聚合支付业务的设计来聊聊策略模式](https://www.cnblogs.com/felordcn/p/13035461.html)

#### 10. 模板模式
>> 定义算法框架，并将一些步骤的实现延迟到子类。通过模板方法，子类可以重新定义算法的某些步骤，而不用改变算法的结构。
#### 11. 访问者模式
>> 为一个对象结构（比如组合结构）增加新能力。
#### 12. 空对象（Null）
>> 使用什么都不做的空对象来代替 NULL。
   一个方法返回 NULL，意味着方法的调用端需要去检查返回值是否是 NULL，这么做会导致非常多的冗余的检查代
   码。并且如果某一个调用端忘记了做这个检查返回值，而直接使用返回的对象，那么就有可能抛出空指针异常。

## 未学习
[不错的随笔分类 - 设计模式+代码+常见源码示例](https://www.cnblogs.com/weixk/category/1759952.html)
[23种设计模式——结构型设计模式（7种）](https://www.cnblogs.com/steffen/p/11546001.html)
[23种设计模式——创建型设计模式（5种）](https://www.cnblogs.com/steffen/p/11400509.html)
[状态模式+装饰器模式+简单工厂模式实战：（一）提交个订单我到底经历了什么鬼？](https://www.cnblogs.com/wang-meng/p/12038619.html)
[常用设计模式的实现，以及Netty中的设计模式](https://www.cnblogs.com/lbhym/p/12844295.html)
[设计模式第二弹: 不知道怎么提高代码复用性？看看这几种设计模式吧！](https://www.cnblogs.com/dennisj/p/12956859.html)
[如何在代码中应用设计模式](https://www.cnblogs.com/liyus/p/10508681.html)
[随笔分类 - headfirst设计模式](https://www.cnblogs.com/skyseavae/category/937670.html)
