# BẢN MÔ TẢ PHÂN BỔ BỘ NHỚ STACK / HEAP - DỰ ÁN FINTRACK

## 1. Trạng thái khi bị lỗi (Legacy Code)
Đoạn code lỗi: `int[] backupRates = todayRates;`

### Sơ đồ trực quan bằng ký tự:
```text
STACK (Biến cục bộ / Tham chiếu)        HEAP (Đối tượng thực tế)
┌──────────────────────────────┐        ┌──────────────────────────────┐
│ [main() Frame]               │        │                              │
│                               │        │  Vùng nhớ địa chỉ: 0x111     │
│ todayRates  ───► (trỏ đến) ──┼────────┼─► [ 10 | 20 | 30 ]           │
│                               │        │         ▲                    │
│ backupRates ───► (trỏ đến) ──┼────────┼─────────┘                    │
└──────────────────────────────┘        └──────────────────────────────┘