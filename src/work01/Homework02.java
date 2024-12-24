package work01;

public class Homework02 {
    public static void main(String[] args) {
        int eggSum = 200 ;
        int numOfPieces = 12;//一打12顆
        int dozen = eggSum / numOfPieces;//總數/12 = 一共幾打
        int eggPieces = eggSum % numOfPieces;//取於數算出剩幾顆
        System.out.println("200顆蛋是: " + dozen + "打," + eggPieces + "顆" );
    }
}
