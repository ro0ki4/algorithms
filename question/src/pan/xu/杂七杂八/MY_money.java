package pan.xu.杂七杂八;

/**
 * 递归解决
 */

public class MY_money {
    static int flag = 0;

    public static void main(String[] args) {
        int[] variaty = {1, 5, 10, 20, 50, 100};
        int num = 10000;
        System.out.println(money(variaty, num, 6));
    }

    static int money(int[] variaty, int num, int i) {
        System.out.println(flag++);
        if (num <= 0) return 1;

        if (i == 1) return 1;
        else {
            return money(variaty, num, i - 1) + money(variaty, num - variaty[i - 1], i);
        }
    }

    static int money_feidigui(int[] variaty, int num, int i) {
        return 0;
    }
}
