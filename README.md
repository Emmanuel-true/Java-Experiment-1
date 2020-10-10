# Java-Experiment-1
## 1.实验内容
- 1.基本要求是完成教材P110页的第四题关于PC、memory、cpu及其他模拟的程序。
- 2.附加要求是{
 1. 类中定义不少于两个构造方法；
 2. 每个类定义不少于两个属性，且属性的类型应该多样化；
 3. 根据课堂中关于访问权限的内容，尝试定义属性的修饰符多样化，类中定义方法操作属性，避免直接通过“类对象.属性”的形式访问属性值；且定义的方法内应该有符合常理的逻辑判断
 4. 尝试把本次实验的多个类放置在不同的包中，体会修饰符private的用法。
}
## 2.实验设计
1.设置硬盘对象，给硬盘对象设置amount，speed方法。设置amount，speed方法在硬盘对象外不可访问(其他对象通用)
```

class HardDisk {
    private int amount;
    private int speed;

```
2.自建了一个主板对象。
## 3.核心方法
1.
```Java

    void setCpu(cpu cpu){
        this.cpu = cpu;
    }
    void setHardDisk(HardDisk hd){
        this.hd = hd;
    }
    void setMoutherBoard(moutherBoard mb){
        this.mb = mb;
    }

```
2.
```Java

        moutherBoard mb = new moutherBoard();
        cpu cpu = new cpu();
        HardDisk hd = new HardDisk();

```
## 4.流程图
[打开流程图](https://github.com/chinazhanghaoyu/Java-Experiment-1/blob/main/java-Experiment-1.png)
## 5.实验结果
```markdown

moutherBoard was msi
moutherBoard's price was 6000
cpu's name is i7
cpu's speed is 2200
HardDisk's capacity is 200
HardDisk's speed was 5400

```
## 6.实验感想
 1. 通过这次实验学习到了public,private,default的不同
 2. 练习了重构
 3. 学习了构建方法
 4. 学会了如何使用markdown，markdown修改了无数次终于对了
#### 我是计G202的张昊宇
