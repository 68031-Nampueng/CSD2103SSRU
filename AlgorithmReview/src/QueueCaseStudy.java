import java.util.LinkedList;
import java.util.Queue;

public class QueueCaseStudy {
    public static void main(String[] args) {

        // สร้าง Queue โดยใช้ LinkedList
        Queue<String> patientQueue = new LinkedList<>();

        // เพิ่มผู้ป่วย P001 ถึง P005 ลงใน Queue
        patientQueue.add("P001");
        patientQueue.add("P002");
        patientQueue.add("P003");
        patientQueue.add("P004");
        patientQueue.add("P005");

        System.out.println("1. สถานะคิวปัจจุบัน : " + patientQueue);

        // เรียกผู้ป่วยออกจากคิว 2 คน & ตรวจสอบก่อน remove() ว่า Queue ว่างหรือไม่
        System.out.println("2. เรียกผู้ป่วยเข้ารับบริการ : ");
        for (int i = 1; i <= 2; i++) {
            if (!patientQueue.isEmpty()) {
                String servedPatient = patientQueue.remove();
                System.out.println("   -> เรียกผู้ป่วย [" + servedPatient + "] เข้ารับบริการ");
            } else {
                System.out.println("ไม่มีผู้ป่วยรออยู่ในคิว");
            }
        }

        // เพิ่มผู้ป่วย P006 และ P007 เข้า Queue
        patientQueue.add("P006");
        patientQueue.add("P007");
        System.out.println("3. ผู้ป่วยที่มาลงทะเบียนเพิ่ม : [P006, P007] ");

        // แสดงผู้ป่วยคนถัดไปด้วย peek()
        if (!patientQueue.isEmpty()) {
            String nextPatient = patientQueue.peek();
            System.out.println("4. ผู้ป่วยคนถัดไป : [" + nextPatient + "]");
        } else {
            System.out.println("4. ไม่มีผู้ป่วยรออยู่ในคิว");
        }

        // แสดงจำนวนผู้ป่วยที่ยังรออยู่ด้วย size()
        System.out.println("5. จำนวนผู้ป่วยที่ยังรออยู่ : " + patientQueue.size() + " คน");

        // แสดงสถานะของ Queue หลังจากดำเนินการทั้งหมด
        System.out.println("6. สถานะคิวผู้ป่วยล่าสุด : " + patientQueue);
    }
}