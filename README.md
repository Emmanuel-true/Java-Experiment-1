# Java-Experiment-1
###### ***2020322091 张昊宇 计G202***
## 1.实验内容
- 1.基本要求是完成教材P110页的第四题关于PC，cpu及其他模拟的程序。
- 2.附加要求是{
 1. 类中定义不少于两个构造方法；
 2. 每个类定义不少于两个属性，且属性的类型应该多样化；
 3. 根据课堂中关于访问权限的内容，尝试定义属性的修饰符多样化，类中定义方法操作属性，避免直接通过“类对象.属性”的形式访问属性值；且定义的方法内应该有符合常理的逻辑判断
 4. 尝试把本次实验的多个类放置在不同的包中，体会修饰符private的用法。
}

---

## 2.实验设计/实验过程
1. 根据书上给出的内容写出cpu,harddisk,pc,test方法，因为附加要求需要使用定义方法操作属性于是写出方法
***其他类中相似***
```java
    public void setAmount(int amount){
        this.amount = amount;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }
``` 
2. 根据附加要求4类要放到不同的包内，cpu，harddisk和pc，test放在不同的包中
3. 根据类要多样化，自定义了screen和moutheboard类

---

## 3.核心方法
1.
```java
    void setCpu(cpu cpu){
        this.cpu = cpu;
    }
    void setHardDisk(HardDisk hd){
        this.hd = hd;
    }
    void setMoutherBoard(moutherBoard mb){
        this.mb = mb;
    }
    void setScreen(Screen sc){
        this.sc = sc;
    }
```
2.
```java
        moutherBoard mb = new moutherBoard();
        cpu cpu = new cpu();
        HardDisk hd = new HardDisk();
        Screen sc = new Screen();
```
***这次的实验中感觉并没有什么可以称之为核心方法的方法，就随便截了一小段***

---

## 4.流程图
![流程图](https://github.com/Emmanuel-true/Java-Experiment-1/blob/main/Java-Experiment-1.jpg)
***貌似图片有点问题不能打开的话***
[emmmm](https://github.com/Emmanuel-true/Java-Experiment-1/blob/main/JAVA-1.html)
***请把html 下载下来，在浏览器里打开***


---

## 5.实验结果
```
The Screen size was 15.6
The Screen's refresh rate was 240
moutherBoard was msi
moutherBoard's price was 6000
cpu's name is i7
cpu's speed is 2200
HardDisk's capacity is 200GB
HardDisk's speed was 5400
```

---

## 6.实验感想
 1. 通过这次实验学习到了public,private,default的不同
 2. 练习了重构
 3. 学习了构建方法
 4. [x]没学会如何使用markdown 
 5. 练习了包外调用
   ~看来是我电脑的问题~

 
