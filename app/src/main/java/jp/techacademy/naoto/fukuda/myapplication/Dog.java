package jp.techacademy.naoto.fukuda.myapplication;

import android.util.Log;

/**
 * Created by naotofukuda on 21/5/2017.
 */
class Dog extends Animal implements Movable{
    //変数
    static String to_jp = "犬";

    //コンストラクタ
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;

    }

    //クラス関数
    public static void introduce(){
        Log.d("javatest", "これは犬クラスです");
    }

    //メンバ関数
    public void say(){
        Log.d("javatest", this.name + "(" + this.age + "歳)" +"「ワンワン」");

    }

    @Override
    public void move(){
        Log.d("javatest", this.name + "(" + this.age +")" + "は全力で走った");
    }
}