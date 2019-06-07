# Principle
## 单一职责原则(Single Responsibility Principle)
### *There should never be more than one reason for a class to change.*
### *应该有且仅有一个原因引起类的变更*
<br/>

## 里氏替换原则(Liskov Substitution Principle) 
1. ### *If for each object o1 of type S there is an object o2 of type T such that for all programs P defined in terms of T, the behavior of P is unchanged when o1 is substituted for o2 then S is a subtype of T.*
1. ### *如果对每一个类型为S的对象o1，都有类型T的对象o2，使得以T定义的所有程序P在所有的对象o1都代换成o2时，程序P的行为没有发生变化，那么类型S是类型T的子类型* 
2. ### *Functions that use pointers or references to base classes must be able to use objects of derived classes without knowing it.*
2. ### *所有引用基类的地方必须能够透明地使用其子类的对象*
<br/>

## 依赖倒置原则(Dependence Inversion Principle)
1. ### *High level modules should not depend upon low level modules. Both should depend upon abstractions. Abstractions should not depend upon details. Details should depend upon abstractions.*
2. ### *高层模块不应该依赖低层模块，两者都应该依赖其抽象*
3. ### *抽象不应该依赖细节*
4. ### *细节应该依赖抽象*
<br/>

## 接口隔离原则(Interface Segregation Principle)
1. ### *Clients should not be forced to depend upon interfaces that they do not use.*
2. ### *客户端不应该依赖它不需要的接口*
3. ### *The dependency of one class to another one should depend on the smallest possible interface.*
4. ### *类间的依赖关系应该建立在最小的接口上*
<br/>

## 迪米特法则(Law of Demeter) or 最少知识原则(Least Knowledge Principle)
1. ### *Only talk to your immedate friends*
2. ### *只与直接的朋友通信*
3. ### *一个软件实体应当尽可能少的与其他实体发生相互作用，每一个软件单位对其他的单位都只有最少的知识，而且局限于那些与本单位密切相关的软件单位*
<br/>

## 开闭原则(Open Closed Principle)
1. ### *Software entities like classes, modules and functions should be open for extension but closed for modifications.*
2. ### *一个软件实体如类、模块和函数应该对扩展开放，对修改关闭*
<br/>
<br/>

# Pattern

## part1: 接口型模式

### 适配器模式(Adapter) 
* *Convert the interface of a class into another interface clients expect. Adapter lets classes work together that could not otherwise because of incompatible interfaces.*  
* *将一个类的接口变换成客户端所期待的另一个接口，从而使原本因接口不匹配而无法在一起工作的两个类能够在一起工作*

### 外观模式(Facade) 
* *Provide a unified interface to a set of interfaces in a subsystem. Facade defines a higher-level interface that makes the subsystem easier to use.*
* *要求一个子系统的外部与其内部的通信必须通过一个统一的对象进行。门面模式提供一个高层次的接口，使得子系统更易于使用*

### 组合模式(Composite) 
* *Compose objects into tree structures to represent part-whole hierarchies. Composite lets clients treat individual objects and compositions of objects uniformly.*
* *将对象组合成树形结构以表示‘部分-整体’的层次结构，使得用户对单个对象和组合对象的使用具有一致性*

### 桥接模式(Bridge) 
* *Decouple an abstraction from its implementation so that the two can vary independently.*
* *将抽象和实现解耦，使得两者可以独立的变化*

<br/>

## part2: 责任型模式

### 责任链模式(Chain-of-responsibility) 
* *Avoid coupling the sender of a request to its receiver by giving more than one object a chance to handle the request. Chain the receiving objects and pass the request along the chain until an object handles it.*
* *使多个对象都有机会处理请求，从而避免请求的发送者和接受者之间的耦合关系。将这些对象连成一条链，并沿着这条链传递该请求，直到有对象处理它为止*

### 单体模式(Singleton) 
* *Ensure a class has only one instance, and provide a global point of access it.*
* *确保某一个类只有一个实例，而且自行实例化并向整个系统提供这个实例*

### 观察者模式(Observer) 
* *Define a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.*
* *定义对象间一种一对多的依赖关系，使得每当一个对象改变状态，则所有依赖于它的对象都会得到通知并被自动更新*

### 中介模式(Mediator) 
* *Define an object that encapsulates how a set of objects interact. Mediator promotes loose coupling by keeping objects from referring to each other explicitly, and it lets you vary their interaction independently.*
* *用一个中介对象封装一系列的对象交互，中介者使各对象不需要显示地相互作用，从而使其耦合松散，而且可以独立地改变它们之间的交互*

### 代理模式(Proxy) 
* *Provide a surogate or placeholder for another object to control access to it.*
* *为其他对象提供一种代理以控制对这个对象的访问*
* *Proxy type:*

      远程代理:
      当需要为一个对象再不同的地址空间提供局部的代表时
      此时的代理模式称为远程代理：为一个对象在不同的地址空间提供局部代表。
      target:
      隐藏一个对象存在于不同地址空间的事实；
      远程机器可能具有更好的计算性能与处理速度，可以快速响应并处理客户端请求。

      虚拟代理:
      当需要创建开销非常大的对象时
      此时的代理模式称为虚拟代理：通过使用过一个小的对象代理一个大对象。
      target:
      减少系统的开销。

      保护代理:
      当需要控制对原始对象的访问时
      此时的代理模式称为保护代理：控制目标对象的访问，给不同用户提供不同的访问权限
      target:
      用来控制对真实对象的访问权限

      智能引用代理:
      当需要在访问对象时附加额外操作时
      此时的代理模式称为智能引用代理，额外操作包括耗时操作、计算访问次数等等
      target:
      在不影响对象类的情况下，在访问对象时进行更多的操作

      others:
      防火墙代理：保护目标不让恶意用户靠近
      Cache代理：为结果提供临时的存储空间，以便其他客户端调用

### 享元模式(Flyweight) 
* *Use sharing to support large numbers of fine-grained objects efficiently.*
* *使用共享对象可有效地支持大量的细粒度的对象*

<br/>

## part3: 构造型模式

### 生成器模式(Builder) 
* *Separate the construction of a complex object from its representation so that the same construction process can create different representations.*
* *将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示*

### 工厂方法模式(Factory Method) 
* *Define an interface for creating an object, but let subclasses decide which class to instantiate. Factory Method lets a class defer instantiation to subclasses.*
* *定义一个用于创建对象的接口，让子类决定实例化哪一个类 工厂方法使一个类的实例化延长到其之类*

### 抽象工厂模式(Abstract Factory) 
* *Provide an interface for creating families of related or dependent objects without specifying their concrete classes.*
* *为创建一组相关或相互依赖的对象提供一个接口，而且无需指定它们的具体类*

### 原型模式(Prototype) 
* *Specify the kinds of objects to create using a prototypical instance, and create new objects by copying this prototype.*
* *用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象*

### 备忘录模式(Memento) 
* *Without violating encapsulation, capture and externalize an object's internal state so that the object can be restored to this state later.*
* *捕获一个对象的内部状态，并在该对象之外保存这个状态。这样以后就可以将该对象恢复到原先保存的状态*

<br/>

## part4: 操作型模式

### 模板方法模式(Template Method) 
* *Define the skeleton of an algorithm in an operation, deferring some steps to subclasses. Template Method lets subclasses redefine certain steps of an algorithm without changing the algorithm's structure.*
* *定义一个操作中的算法的框架，而将一些步骤延迟到子类中 使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤*

### 状态模式(State) 
* *Allow an object to alter its behavior when its internal state change. The object will appear to change its class.*
* *当一个对象内在状态改变时允许其改变行为，这个对象看起来像改变了其类*

### 策略模式(Strategy) 
* *Define a family of algorithms, encapsulate each one, and make them interchangeable.*
* *定义一组算法，将每个算法都封装起来，并且使它们之间可以互换*

### 命令模式(Command) 
* *Encapsulate a request as an object, thereby letting you parameterize clients with different requests, queue or log requests, and support undoable operations.*
* *将一个请求封装成一个对象，从而让你使用不同的请求把客户端参数化，对请求排队或者记录请求日志，可以提供命令的撤销和恢复功能*

### 解释器模式(Interpreter) 
* *Given a language, define a representation for its grammar along with an interpreter that uses the representation to interpret sentences in the language.*
* *给定一门语言 定义它的文法的一种表示 并定义一个解释器 该解释器使用该表示来解释语言中的句子*

<br/>

## part5: 扩展型模式

### 装饰器模式(Decorator) 
* *Attach additional responsibilities to an object dynamically keeping the same interface. Decorators provide a flexible alternative to subclassing for extending functionality.*
* *动态地给一个对象添加一些额外的职责。就增加功能来说，装饰模式相比生成之类更为灵活*

### 迭代器模式(Iterator) 
* *Provide a way to access the elements of an aggreagate object sequentially without exposing its underlying representation.*
* *提供一种方法访问容器对象中的各个元素，而又不需要暴露该对象的内部细节*

### 访问者模式(Visitor) 
* *Represent an operation to be performed on the elements of an object structure. Visitor lets you define a new operation without changing the classes of the elements on which it operates.*
* *封装一些用于某种数据结构中的各元素的操作，它可以在不改变数据结构的前提下定义作用于这些元素的新的操作*
