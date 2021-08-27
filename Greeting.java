class Greeting {
  public static void main(String[] args) {
    System.out.println("Good morning");

    System.out.println("Good afternoon");

    System.out.println("Good evening");

    // 変数を定義
    int var;

    var = 1;

    System.out.println(var);

    // 変数省略
    int Var = 2;

    System.out.println(Var);

    // 整数のデータ型
    byte var01 = 1;
    short var02 = 12345;
    int var03 = 1234567890;
    long var04 = 123456789000L;

    System.out.println(var01);
    System.out.println(var02);
    System.out.println(var03);
    System.out.println(var04);

    // 少数のデータ型
    double var05 = 1.23456789;
    float var06 = 1.234F;

    System.out.println(var05);
    System.out.println(var06);

    // 文字のデータ型(Stringは実際はクラス)
    char var07 = 'a'; // charはシングルクォーテーション
    String var08 = "hello,world!";

    System.out.println(var07);
    System.out.println(var08);

    // ブーリアン型
    int var_a = 10;
    int var_b = 1;
    
    boolean var_bool = (var_a > var_b);

    System.out.println(var_bool);

    // 配列
    String[] arr = {"sato", "suzuki", "yamada"};

    System.out.println(arr[0]);
    System.out.println(arr[1]);
    System.out.println(arr[2]);

    arr[1] = "tanaka";

    System.out.println(arr[1]);

    // 演算子

    int x = 10;
    int y = 2;
    int z = 10;

    System.out.println(x + y);
    System.out.println(x - y);
    System.out.println(x * y);
    System.out.println(x / y);
    System.out.println(x % y);

    // 関係演算子
    System.out.println(x > y);
    System.out.println(x < y);
    System.out.println(x >= y);
    System.out.println(x <= z);
    System.out.println(x == y);
    System.out.println(x != y);
    System.out.println(x == z);

    // 論理演算子
    x = 8;
    y = 3;

    System.out.println(x >= 5 && x <= 10);
    System.out.println(y >= 5 && y <= 10);

    System.out.println(x == 3 || y == 3);
    System.out.println(x == 1 || y == 1);

    // 複合代入演算子

    x = 8;
    y = 12;
    z = 20;

    System.out.println(x += 10);
    System.out.println(x += y);

    // インクリメント・デクリメント
    x = 8;
    y = 8;
    x++;
    y--;

    System.out.println(x);
    System.out.println(y);

    // if文
    int age = 19;

    if (age > 20) {
      System.out.println("adult");
    } else if (age == 0) {
      System.out.println("baby");
    } else {
      System.out.println("child");
    }

    // for文
    for (int i = 0; i <= 4; i++) {
      System.out.println(i);
    }

    // break文
    for (int i = 0; i <= 10; i++) {
      if (i == 3) {
        break;
      }
      System.out.println(i);
    }

    // continue文
    for (int i = 0; i <= 5; i++) {
      if (i == 3) {
        continue;
      }
      System.out.println(i);
    }

    // for文のネスト
    for (int i = 0; i <= 2; i++) {
      for (int j = 0; j <= 5; j++) {
        System.out.println(i + "-" + j);
      }
    }

    // 配列
    int arr_02[] = {2,4,6,8,10};

    for (int i = 0; i <= 3; i++) {
      System.out.println(arr_02[i]);
    }


  }
}