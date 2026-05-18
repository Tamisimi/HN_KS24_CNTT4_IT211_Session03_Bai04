/*
1. Các thành phần có trong HTTP Request:

- Method: POST → Dùng để tạo mới một tài nguyên (Create).
- URL: /api/sanpham → Đường dẫn đến endpoint xử lý sản phẩm.
- Headers:
    + Host: example.com → Chỉ định tên miền máy chủ.
    + Content-Type: application/json → Cho biết dữ liệu body đang ở định dạng JSON.
    + Authorization: Bearer abc123 → Xác thực người dùng bằng Token (Bearer Token).
    + Content-Length: 48 → Cho biết độ dài (bytes) của body.

- Body: {"ten":"Laptop","gia":1500000,"tonkho":10} → Dữ liệu gửi lên server để tạo sản phẩm mới.

2. Các thành phần trong HTTP Response:

- Status Line: HTTP/1.1 201 Created → Trạng thái phản hồi.
- Headers:
    + Date: ... → Thời gian server trả về response.
    + Content-Type: application/json → Định dạng dữ liệu trả về là JSON.
    + Location: /api/sanpham/101 → Đường dẫn đến tài nguyên vừa được tạo (rất quan trọng với POST).

- Body: {"id":101,"ten":"Laptop",...} → Dữ liệu trả về cho client.

Mã trạng thái 201 Created thuộc nhóm **2xx (Success)**. Ý nghĩa: Yêu cầu đã được xử lý thành công và server đã tạo ra một tài nguyên mới.

3. Nếu client gửi GET /api/sanpham/999 nhưng sản phẩm không tồn tại:
   → Server trả về mã **404 Not Found**.
   Ý nghĩa: Tài nguyên mà client yêu cầu không tồn tại trên server.

4. Khi server gặp lỗi xử lý không xác định (lỗi nội bộ):
   → Sử dụng mã trạng thái **500 Internal Server Error** (thuộc nhóm 5xx - Server Error).
   */
