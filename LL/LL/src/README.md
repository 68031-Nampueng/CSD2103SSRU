  - คำสั่งในการค้นหา node ที่มีค่า blue
ใช้การเรียกเมธอด searchNode โดยส่ง head ของ Linked List และค่า blue ที่ต้องการค้นหาเข้าไป

Node1<String> targetNode = searchNode(head, "blue");
System.out.println("search 'blue' = " + targetNode);

การทำงาน
โปรแกรมส่งตัววิ่ง current เริ่มเดินจากหัวแถว (red) ไล่ไปทีละ Node ผ่านสายเชื่อม next เพื่อเอาค่าไปเปรียบเทียบ:
red ➔ ไม่ใช่ blue ➔ ขยับไปตัวถัดไป
yellow ➔ ไม่ใช่ blue ➔ ขยับไปตัวถัดไป
green ➔ ไม่ใช่ blue ➔ ขยับไปตัวถัดไป
pink ➔ ไม่ใช่ blue ➔ ขยับไปตัวถัดไป
null (สุดสาย) ➔ หลุดลูป while ทันที
ผลลัพธ์: คืนค่ากลับมาเป็น null เพราะเดินจนสุดทางแล้วแต่ไม่เจอคำว่า blue ในลิสต์

  - Method ในการนับจำนวน node ใน list
นี่คือตัวเมธอด countNodes ที่ใช้สำหรับวนลูปนับจำนวน Node ทั้งหมดตั้งแต่หัว (head) ไปจนถึงท้ายลิสต์

public static <T> int countNodes(Node1<T> head) {
    int count = 0;
    Node1<T> current = head;
    while (current != null) {
        count++;
        current = current.next;
    }
    return count;
}

การทำงาน
โปรแกรมตั้งตัวนับ count = 0 แล้วส่งตัววิ่ง current เริ่มเดินจากหัวแถวขยับไปทีละ Node เพื่อเพิ่มแต้ม:
อยู่ที่ red ➔ บวกแต้ม (count = 1) ➔ ขยับไปตัวถัดไป
อยู่ที่ yellow ➔ บวกแต้ม (count = 2) ➔ ขยับไปตัวถัดไป
อยู่ที่ green ➔ บวกแต้ม (count = 3) ➔ ขยับไปตัวถัดไป
อยู่ที่ pink ➔ บวกแต้ม (count = 4) ➔ ขยับไปตัวถัดไป
เป็น null (สุดสาย) ➔ หลุดลูป while ทันที
ผลลัพธ์: คืนค่าตัวเลข 4 กลับมา ซึ่งเป็นจำนวน Node ทั้งหมดที่ตัววิ่งเดินผ่านมา
