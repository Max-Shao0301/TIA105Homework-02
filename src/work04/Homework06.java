package work04;

public class Homework06 {
    public static void main(String[] args) {
        new Test().checkScore();
    }
}
class Test{
    public void checkScore() {

                      //index 0   1   2   3   4   5 (test)
        int [][] score =  { { 10, 37, 100,77, 98, 90}, //0 index (student)
                            { 35, 75, 70, 95, 70, 80},  //1
                            { 40, 77, 79, 70, 89, 100}, //2
                            { 100,89, 90, 89, 90, 75},  //3
                            { 90, 64, 75, 60, 75, 50},  //4
                            { 85, 75, 70, 75, 90, 20},  //5
                            { 75, 70, 79, 85, 89, 99},  //6
                            { 70, 95, 90, 89, 90, 75} };//7

        int[] count = new int[score.length];//保存每個學生每輪最高分的次數
        for (int test = 0; test < score[0].length; test++) {//循環每一輪考試成績
            int highScore = 0;//保存最高分

            // 循環比較每位學生的該輪成績 將成績最高的保留在highScore
            for (int student = 0; student < score.length; student++) {
                if (score[student][test] > highScore) {
                    highScore = score[student][test];
                }
            }
            //循環比對成績跟最高分一樣的是哪一位學生，用陣列保存,並退出循環
            for (int student = 0; student < score.length; student++) {
                if (score[student][test] == highScore) {
                    count[student]++;
                    break;
                }
            }
        }
        //循環打印最高分次數
        for (int student = 0; student < score.length; student++) {
            System.out.println((student + 1) + " 號最高分的次數： " + count[student]);
        }
    }
}