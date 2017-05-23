package jp.techacademy.naoto.fukuda.myapplication;

import android.util.Log;

/**
 * Created by naotofukuda on 21/5/2017.
 */
public class Human extends Animal
                   implements Movable,Thinkable {
    static String to_jp = "人間";
    String hobby; //趣味

    //コンストラクタ
    public Human (String name, int age, String hobby) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }

    //クラス関数
    public static void introduce(){
        Log.d("javatest", "これは人間クラスです");
    }

    //メンバ関数
    public void say(){
        Log.d("javatest", "「私の名前は"+ this.name +"です。年は"+ this.age + "歳です。」");
    }

    @Override
    public void move(){
        Log.d("javatest", this.name + "(" + this.age +")" + "は全力で走った");
    }

    @Override
    public void think(){
        Log.d("javatest", "「私は" + this.hobby + "について考える。」");
    }
}
