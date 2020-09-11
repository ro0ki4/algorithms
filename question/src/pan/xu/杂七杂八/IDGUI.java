package pan.xu.杂七杂八;


/** 递归重要用法 */
public class IDGUI {
  static int x = 1;
  static int y = 1;
  static int sum=0;
  public static void main(String[] args) {
//     hannuota(3,'A','B','C');//汉诺塔


//        String s = "heh   kk";
//        for(String ss : s.split(" ")){
//            if(ss.equals(""))
//                continue;
//            System.out.println("-"+ss+"-");
//        }

      System.out.println(B.val);

  }

  static void hannuota(int n, char a, char b, char c) { // 将n个盘子从a移动到b
    if (n == 1) System.out.println(a + "第一个移动到" + b);
    else {
      hannuota(n - 1, a, c, b);
      System.out.println(a + "第一个移动到" + b);
      hannuota(n - 1, c, b, a);
    }
  }

  static void show_character(StringBuffer s) {
    if (s.length() == 1) System.out.println(s);
    else {
      System.out.println(s.charAt(s.length() - 1));
      show_character(s.deleteCharAt(s.length() - 1));
    }
  }

  static float show_the_num_of_n(int n) {
    if (n == 1) return 1;
    else {
      return ((float) n / (float) (n + 1) + show_the_num_of_n(n - 1));
    }
  }

  static void find_path(int[][] a) { // 0是可以走的，1是已经走过的，2是不可以走的
  	sum++;
  	System.out.println(sum);
    a[x][y] = 1;
    if (x == 3 && y == 3) return;
    else if (x < 1 || x > 3 || y < 1 || y > 3) return;
    else if (a[x + 1][y] != 0 && a[x - 1][y] != 0 && (a[x][y - 1] != 0 || a[x][y + 1] != 0)) {
      return;
    } else {
      if (a[x + 1][y] == 0) {
        a[x + 1][y] = 0;
        find_path(a);
      } else if (a[x - 1][y] == 0) {
        a[x - 1][y] = 0;
        find_path(a);
      } else if (a[x][y - 1] == 0) {
        a[x][y - 1] = 0;
        find_path(a);
      } else if (a[x][y + 1] == 0) {
        a[x][y + 1] = 0;
        find_path(a);
      } else return;
    }
  }

  static int migong(int x,int y,int array_x,int array_y,int n){
  	/*
  	x++;
  	migong(x,y,array_x,array_y);
  	y++;
  	migong(x,y,array_x,array_y);

  	 */
  	System.out.println(x+"    "+y);
  	if((x==array_x-1&&y==array_y-1)||x>array_x-1||y>array_y-1){
  		System.out.println(n);
  		System.out.println("退出此层方法");
  		return 0; }
  	else {
  		//System.out.println(sum++);
  		x++;
  		n++;
  		migong(x,y,array_x,array_y,n);
  		n++;
  		y++;
  		migong(x,y,array_x,array_y,n);
    }
  	//System.out.println(n);
  	return n;
  }
}


class A{
    static int val = 1;
    void fuck(int num){
        num++;
    }
}

class B extends A{
    @Override
    void fuck(int num){
        num--;
    }

}