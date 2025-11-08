## 簡易ドキュメント

### ダウンロードURL
```java
https://itijuku.github.io/blue-force_by_java
```

### インポート
```java:main.java
import blueforce.Attack;
```

### インスタンス作成
インスタンス作成の際の第一引数でblueforceに使う文字列を指定。
```java:main.java
Attack att = new Attack("abcdefghijklmnopqrstuvwxyz1234567890");
```

### 使用

```java:main.java
Attack att = new Attack("ab");
System.out.println(att.next()); // a
System.out.println(att.next()); // b
System.out.println(att.next()); // aa
System.out.println(att.next()); // ab
System.out.println(att.next()); // ba
// ・・・
```

### 実用例
```java:main.java
import blueforce.Attack;

public class App {
    public static void main(String[] args)throws Exception{
        Attack att = new Attack("abcdefghijklmnopqrstuvwxyz1234567890");
        final String password = "password";

        long start = System.currentTimeMillis();
        String pass = "";
        while(!pass.equals(password)){
            pass = att.next();
        }
        long end = System.currentTimeMillis();

        System.out.print((end - start)/1000);
        System.out.println("秒で発見！パスワード:"+pass);
    }
}
```
