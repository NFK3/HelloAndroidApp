package jp.techacademy.naoto.fukuda.myapplication;

import android.util.Log;

/**
 * Created by naotofukuda on 21/5/2017.
 */
class BigDog extends Dog {
    //クラス変数
    static String to_jp = "大型犬";

    public BigDog(String name, int age){
        super(name, age);
    }

    //クラス関数
    public static void introduce(){
        Log.d("javatest","これは大型犬クラスです。");
    }
}
