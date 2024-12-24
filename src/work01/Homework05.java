package work01;

public class Homework05 {
    public static void main(String[] args) {
        //FV本利總和 = PV（本金）* (1+R（每期利率）)n（期數）次方
        double pv = 1_500_000;
        double r = 0.02;
        int n = 10;
        double fv = pv * Math.pow(1 + r, n);//複利公式計算
        fv = Math.round(fv);//四捨五入
        int finalFv = (int) fv;//將浮點類型轉成整數類型
        System.out.println(finalFv);
    }
}
