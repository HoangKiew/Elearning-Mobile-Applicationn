## 🍕 Bits and Pizzas - Chapter 9 Demo (Head First Android Development)

### Mô tả

Project này là bài thực hành **Chương 9: A Material World** từ sách "Head First Android Development, 3rd Edition".
Nội dung chính là tìm hiểu và áp dụng các thành phần **Material Design** để xây dựng giao diện người dùng (UI) hiện đại, tương tác cho ứng dụng Android.

### Lý thuyết áp dụng

* [cite_start]**`CoordinatorLayout`**: Dùng làm layout gốc để điều phối hành vi giữa các view con, đặc biệt là hiệu ứng cuộn[cite: 365].
* [cite_start]**`AppBarLayout` & `CollapsingToolbarLayout`**: Tạo ra thanh công cụ (Toolbar) động, có thể cuộn lên/xuống và thu gọn/mở rộng, thường đi kèm `ImageView` để hiển thị ảnh nền lớn[cite: 366, 374].
* [cite_start]**Scrolling Behavior**: Sử dụng `app:layout_scrollFlags` (ví dụ: `scroll|exitUntilCollapsed`, `scroll|enterAlways`) và `app:layout_collapseMode` (`pin`, `parallax`) để kiểm soát cách Toolbar và ảnh nền phản ứng khi người dùng cuộn `NestedScrollView` [cite: 367, 374-375].
* **Material Views**:
    * [cite_start]`RadioButton` / `RadioGroup`: Cho phép chọn một tùy chọn duy nhất (loại pizza)[cite: 381].
    * [cite_start]`Chip` / `ChipGroup` (với style `Choice`): Cho phép chọn nhiều tùy chọn (topping) [cite: 383-384].
    * [cite_start]`FloatingActionButton` (FAB): Nút nổi cho hành động chính (đặt hàng)[cite: 385].
* **User Feedback**:
    * [cite_start]`Toast`: Hiển thị thông báo ngắn, tự biến mất (khi chưa chọn pizza)[cite: 394].
    * [cite_start]`Snackbar`: Hiển thị thông báo ở cuối màn hình, có thể có action (hiển thị tóm tắt đơn hàng)[cite: 395].

### Kết quả

Đã xây dựng thành công `OrderFragment` cho ứng dụng "Bits and Pizzas" với các tính năng:

* Thanh công cụ thu gọn hiển thị ảnh nền đẹp mắt.
* Giao diện cho phép người dùng chọn loại pizza bằng `RadioButton` và chọn topping bằng `Chip`.
* Nút `FAB` để xác nhận đơn hàng.
* Phản hồi người dùng bằng `Toast` và `Snackbar` tùy theo tình huống.
* Giao diện đáp ứng tốt với thao tác cuộn của người dùng.
<img width="372" height="801" alt="Screenshot 2025-10-25 234957" src="https://github.com/user-attachments/assets/66fd24cc-4d64-463b-8c35-d819571a04a1" />
<img width="371" height="805" alt="Screenshot 2025-10-25 235006" src="https://github.com/user-attachments/assets/29a6c00f-8ead-41b0-9044-a99a166afedd" />
<img width="370" height="805" alt="Screenshot 2025-10-25 235017" src="https://github.com/user-attachments/assets/901f340d-1d62-4e0e-96e5-a5068449597a" />


