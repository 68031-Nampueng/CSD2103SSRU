public class ArrayCaseStudy {
    public static void main(String[] args) {

        // คะแนนทำแบบทดสอบก่อนเรียนของนักศึกษา 10 คน
        int[] scores = {6, 8, 4, 9, 7, 5, 10, 3, 8, 2};

        // คำนวณคะแนนรวมของนักศึกษาทั้งหมด
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }

        // คำนวณคะแนนเฉลี่ย
        double average = (double) sum / scores.length;

        // คำนวณคะแนนสูงสุด ต่ำสุด
        int max = scores[0];
        int min = scores[0];
        int passedCount = 0; // จำนวนนักศึกษาที่ได้คะแนนตั้งแต่ 7 คะแนนขึ้นไป
        for (int score : scores) {
            if (score > max) {
                max = score;
            }
            if (score < min) {
                min = score;
            }
            if (score >= 7) {
                passedCount++;
            }
        }

        // แสดงผลลัพธ์ทางหน้าจอ
        System.out.println("1. คะแนนรวมของนักศึกษาทั้งหมด : " + sum + " คะแนน");
        System.out.println("2. คะแนนเฉลี่ย : " + average + " คะแนน");
        System.out.println("3. คะแนนสูงสุด : " + max + " คะแนน");
        System.out.println("4. คะแนนต่ำสุด : " + min + " คะแนน");
        System.out.println("5. จำนวนนักศึกษาที่ได้คะแนนตั้งแต่ 7 คะแนนขึ้นไป : " + passedCount + " คน");
        
        // รายชื่อนักศึกษาที่ควรได้รับการทบทวนเพิ่มเติม คือ นักศึกษาที่ได้คะแนนต่ำกว่า 5
        System.out.print("6. รายชื่อนักศึกษาที่ควรได้รับการทบทวนเพิ่มเติม : ");
        boolean first = true;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] < 5) {
                if (!first) {
                    System.out.print(", ");
                }
                System.out.print("นักศึกษาคนที่ " + (i + 1) + " (" + scores[i] + " คะแนน)");
                first = false;
            }
        }
        System.out.println();
    }
}