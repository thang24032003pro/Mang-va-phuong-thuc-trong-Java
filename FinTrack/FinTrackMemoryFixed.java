import java.util.Arrays;

public class FinTrackMemoryFixed {
    public static void main(String[] args) {
        // 1. Biến nguyên thủy (Stack)
        int originalPrice = 500;
        int backupPrice = originalPrice;
        backupPrice = 700;
        System.out.println("Original Price: " + originalPrice); // 500

        // 2. Mảng dữ liệu (Heap) - ĐÃ SỬA LỖI
        int[] todayRates = { 10, 20, 30 };
        int[] backupRates = Arrays.copyOf(todayRates, todayRates.length); // Deep Copy
        backupRates[0] = 99;
        System.out.println("Today Rate [0] (Gốc): " + todayRates[0]); // Vẫn là 10

        // 3. Null Pointer - ĐÃ SỬA LỖI
        int[] historyRates = new int[3]; // Cấp phát vùng nhớ
        System.out.println("History Rate [0]: " + historyRates[0]); // 0

        // 4. Kiểm tra truyền tham số vào hàm
        modifyArray(todayRates);
        System.out.println("Today Rates sau hàm: " + Arrays.toString(todayRates)); // [10, 888, 30]
    }

    public static void modifyArray(int[] arr) {
        if (arr != null && arr.length > 1) {
            arr[1] = 888; // Thay đổi trực tiếp trên Heap thông qua bản sao địa chỉ
        }
    }
}