# OOP Testing Demo

Dự án demo về testing hướng đối tượng (OOP) sử dụng Java và JUnit 5.

## Mô tả dự án

Dự án này triển khai class `NumberProcessor` với phương thức `processNumbers(int[] arr)` để xử lý mảng số nguyên. Logic xử lý:
- Cộng tất cả số chẵn
- Trừ tất cả số lẻ
- Trả về kết quả: tổng chẵn - tổng lẻ

## Cách chạy

### Yêu cầu
- Java 8+
- Maven 3.6+

### Chạy test
```bash
mvn test
```

### Build project
```bash
mvn clean compile
```

## Mô tả Test Case

Class `NumberProcessorTest` chứa 7 test case để kiểm tra logic của `NumberProcessor`:

### 1. testEvenNumbers
- **Input**: {2, 4, 6}
- **Expected**: 12
- **Giải thích**: Tất cả số chẵn: 2+4+6 = 12, tổng lẻ = 0 → 12 - 0 = 12

### 2. testOddNumbers
- **Input**: {1, 3, 5}
- **Expected**: -9
- **Giải thích**: Tất cả số lẻ: 1+3+5 = 9, tổng chẵn = 0 → 0 - 9 = -9

### 3. testMixedNumbers
- **Input**: {2, 3}
- **Expected**: -1
- **Giải thích**: Chẵn: 2, lẻ: 3 → 2 - 3 = -1

### 4. testEmptyArray
- **Input**: {}
- **Expected**: 0
- **Giải thích**: Mảng rỗng, tổng chẵn = 0, tổng lẻ = 0 → 0 - 0 = 0

### 5. testOnlyEven
- **Input**: {2, 4}
- **Expected**: 6
- **Giải thích**: Chẵn: 2+4 = 6, lẻ: 0 → 6 - 0 = 6

### 6. testOnlyOdd
- **Input**: {1, 3}
- **Expected**: -4
- **Giải thích**: Chẵn: 0, lẻ: 1+3 = 4 → 0 - 4 = -4

### 7. testMixedPath
- **Input**: {2, 3, 4}
- **Expected**: 3
- **Giải thích**: Chẵn: 2+4 = 6, lẻ: 3 → 6 - 3 = 3

## Kết quả chạy test

Khi chạy `mvn test`, tất cả 7 test case sẽ pass nếu logic đúng.

```
Tests run: 7, Failures: 0, Errors: 0, Skipped: 0
```
