package top.woaibocai.java;
/*
一、异常处理：抓抛模型try-catch-finally
过程一：抛
    ①出现异常后，生成一个在对应异常类的对象，并抛出。
    ②抛出后对象后，气候的代码不再执行。
过程二：抓
    可理解为异常的处理方式：
    ①try-catch-finally
    ②throws
二、try-catch-finally的使用
try{
    //可能会出现的代码
}catch(异常类型1 变量名1){
    //处理异常的方式1
}catch(异常类型2 变量名2){
    //处理异常的方式2
}
...
finally{
    //一定会执行的代码
}

二、异常处理的方式二：throws + 异常类型
1."throws + 异常类型"写在方法声明处，指该代码可能会抛出的异常类型
    出现异常时，会在异常处生成异常类的对象，此对象满足throws类型时会被抛出，后续代码不在执行。
三、体会
    ①try-catch-finally,将一场处理掉！
    ②throws只是将异常抛给方法的调用者，并没有将异常处理掉。

 */
public class ExceptionTest {
    public static void main(String[] args) {
        Ai ai = new Ai();
        ai.Ai4();
    }

}
class Ai{
    int a = 1;
    int b= 1;
    int c = a + b;

    int d = 0;
    int e = 0;
    public void Ai1(){
        System.out.println("a:" + a);
    }
    public void Ai2(){
        System.out.println("b:" + b);
    }
    public void Ai3(){
        System.out.println("c:" + c);
    }
    public void Ai4(){
        try{
            e = c / d;
        }catch (ArithmeticException ari){
            System.out.println("分母不能为0！！！");
            d = 1;
            e = c / d;
        }finally {
            System.out.println("e:" + e);
        }
    }
}