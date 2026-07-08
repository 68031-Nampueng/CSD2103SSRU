import java.util.Stack;

public class StackCaseStudy {
    public static void main(String[] args) {

        // สร้าง Stack เพื่อเก็บประวัติคำสั่ง (เป็น String)
        Stack<String> undoStack = new Stack<>();

        // เพิ่มคำสั่งทั้งหมดลงใน Stack
        undoStack.push("Type Data");
        undoStack.push("Type Structure");
        undoStack.push("Delete Structure");
        undoStack.push("Type Algorithm");
        undoStack.push("Type Java");

        // แสดงคำสั่งทั้งหมดใน Stack
        System.out.println("1. สถานะ Stack ปัจจุบัน : " + undoStack);

        // Undo คำสั่งล่าสุด 2 ครั้ง และ แสดงคำสั่งที่ถูก Undo
        System.out.println("2. Undo คำสั่งล่าสุด 2 ครั้ง & 3. แสดงคำสั่งที่ถูก Undo : ");
        
        // ครั้งที่ 1 : ตรวจสอบก่อน pop() ว่า Stack ว่างหรือไม่
        if (!undoStack.isEmpty()) {
            String popped1 = undoStack.pop();
            System.out.println("   -> Undo ครั้งที่ 1 ยกเลิกคำสั่ง [" + popped1 + "]");
        } else {
            System.out.println("Stack ว่าง ไม่สามารถ Undo ได้");
        }

        // ครั้งที่ 2 : ตรวจสอบก่อน pop() ว่า Stack ว่างหรือไม่
        if (!undoStack.isEmpty()) {
            String popped2 = undoStack.pop();
            System.out.println("   -> Undo ครั้งที่ 2 ยกเลิกคำสั่ง [" + popped2 + "]");
        } else {
            System.out.println("Stack ว่าง ไม่สามารถ Undo ได้");
        }

        // แสดงสถานะของ Stack หลังจาก Undo
        System.out.println("4. สถานะของ Stack หลังจาก Undo : " + undoStack);
    }
}