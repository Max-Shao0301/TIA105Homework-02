package work1;

public class Homework06 {
    public static void main(String[] args) {
        System.out.println(5 + 5);
        //整數類型相加，＃10
        System.out.println(5 + '5');
        //整數和字元類型相加，字元會變成對應ASCII十進制的值，
        //透過字元轉為整數，int c = '5'，得到c = 53; 5 + 53 = 58, # 58
        // https://codepen.io/bertchien/full/pRoZRB ASCII對照表
        System.out.println(5 + "5");
        //整數類型和字串類型相加會變成合併，＃55

    }
}
