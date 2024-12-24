package work01;

public class Homework03 {
    public static void main(String[] args) {
        int totalSeconds = 256559;
        //1d = 24h, 1h = 60min, 1min = 60s
        //1d = 24 * 60 * 60 = 86400
        int day = totalSeconds / (24 * 60 * 60 );
        //天數 ＝ 總秒數 / （一天24小時＊每小時60分鐘*每分鐘60秒）
        int hour = (totalSeconds % (24 * 60 * 60)) / 3600;
        //小時 ＝ 總秒數 / （一天24小時＊每小時60分鐘*每分鐘60秒）取餘後 / （每小時60分鐘*每分鐘60秒）
        int minute = ((totalSeconds % (24 * 60 * 60)) - (hour * 3600)) / 60;
        //分鐘 ＝ （總秒數 / （一天24小時＊每小時60分鐘*每分鐘60秒）取餘後 - 小時＊（每小時60分鐘*每分鐘60秒））/ 每分鐘60秒
        int seconds = (totalSeconds % (24 * 60 * 60) - hour * 3600 - minute * 60);
        //秒數 ＝（總秒數 / （一天24小時＊每小時60分鐘*每分鐘60秒）取餘後 - 小時＊（每小時60分鐘*每分鐘60秒）- 分鐘數*60秒
        System.out.println(day + " 天 " + hour + " 小時 " + minute + " 分 " + seconds + " 秒");
    }
}
