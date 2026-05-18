/*
Bài tập 1: Lý thuyết tổng quan về Web Service và định dạng dữ liệu

1. Khái niệm Web Service:
   Web Service là công nghệ cho phép các ứng dụng khác nhau có thể giao tiếp và trao đổi dữ liệu với nhau qua mạng internet bằng các giao thức chuẩn.
   Nó hoạt động như một cầu nối giữa các hệ thống, cho phép gọi hàm từ xa.
   Ví dụ: Ứng dụng ngân hàng gọi Web Service để kiểm tra thông tin tài khoản hoặc thực hiện chuyển khoản.

2. So sánh SOAP và REST

- Giao thức truyền tải:
  SOAP: HTTP, SMTP, TCP...
  REST: Thường là HTTP/HTTPS

- Định dạng dữ liệu chính:
  SOAP: XML (bắt buộc)
  REST: JSON (phổ biến nhất), có thể là XML

- Trạng thái (stateful/stateless):
  SOAP: Có thể Stateful
  REST: Stateless

- Tính dễ dàng triển khai:
  SOAP: Phức tạp, khó triển khai
  REST: Đơn giản, dễ triển khai và bảo trì

3. Chuyển JSON sang XML:

<sinhvien>
    <maso>SV001</maso>
    <hoten>Nguyễn Văn A</hoten>
    <diem>
        <item>8.5</item>
        <item>7.0</item>
        <item>9.0</item>
    </diem>
</sinhvien>

4. Ưu điểm của JSON so với XML:
- JSON nhẹ hơn, kích thước dữ liệu nhỏ hơn nên tiết kiệm băng thông và truyền nhanh hơn.
- Cú pháp đơn giản, dễ đọc, dễ hiểu và dễ parse hơn.
- Parse nhanh hơn, đặc biệt phù hợp với JavaScript và các ứng dụng web/mobile.
- Dễ dàng chuyển đổi sang Object trong hầu hết các ngôn ngữ lập trình.
  */