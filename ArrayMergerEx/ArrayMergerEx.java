import java.util.Arrays;

public class ArrayMergerEx {

    // โค้ดส่วนที่โจทย์ของอาจารย์ให้มา
    public static void sort(int[] values) {
        if (values.length < 2) {
            return;
        }
        
        int middle = values.length / 2;
        int[] left = new int[middle];
        for (int i = 0; i < middle; i++) {
            left[i] = values[i];
        }
        
        int[] right = new int[values.length - middle];
        for (int i = 0; i < values.length - middle; i++) {
            right[i] = values[middle + i];
        }
        
        sort(left);
        sort(right);
        
        // เรียกใช้ฟังก์ชัน merge ที่นักศึกษาเขียนตอบในข้อ 2
        merge(values, left, right);
    }

    // --- ส่วนคำตอบของข้อที่ 2 (ฟังก์ชันสำหรับรวมอาร์เรย์ย่อย) ---
    public static void merge(int[] values, int[] left, int[] right) {
        int i = 0; // ตัวชี้ตำแหน่งสำหรับฝั่ง left
        int j = 0; // ตัวชี้ตำแหน่งสำหรับฝั่ง right
        int k = 0; // ตัวชี้ตำแหน่งสำหรับอาร์เรย์ผลลัพธ์ (values)

        // วนลูปเปรียบเทียบและเลือกดึงค่าที่น้อยกว่ามาใส่ลงใน values
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                values[k] = left[i];
                i++;
            } else {
                values[k] = right[j];
                j++;
            }
            k++;
        }

        // เก็บตกข้อมูลที่ยังเหลือค้างอยู่ในอาร์เรย์ฝั่ง left
        while (i < left.length) {
            values[k] = left[i];
            i++;
            k++;
        }

        // เก็บตกข้อมูลที่ยังเหลือค้างอยู่ในอาร์เรย์ฝั่ง right
        while (j < right.length) {
            values[k] = right[j];
            j++;
            k++;
        }
    }

    // ส่วนประมวลผลหลัก (Main) สำหรับทดสอบการทำงานของโปรแกรม
    public static void main(String[] args) {
        // ชุดข้อมูลตัวอย่างตามโจทย์ข้อ 3
        int[] data = {15, 3, 9, 31, 11, 17, 7, 23}; 
        
        System.out.println("ข้อมูลก่อนเรียงลำดับ: " + Arrays.toString(data));
        
        // สั่งทำงานฟังก์ชันจัดเรียงข้อมูล
        sort(data); 
        
        System.out.println("ข้อมูลหลังเรียงลำดับ (ด้วย Merge Sort): " + Arrays.toString(data));
    }
}