public class EmailAccount {
    // Thuộc tính private (đóng gói)
    private String email;
    private String password;
    private double storageLimit;   // GB
    private double usedStorage;    // GB

    // Constructor với kiểm tra dữ liệu (validation)
    public EmailAccount(String email, String password, double storageLimit) {
        if (!email.contains("@") || !email.contains(".")) {
            throw new IllegalArgumentException("Email không hợp lệ");
        }
        if (password.length() < 8) {
            throw new IllegalArgumentException("Mật khẩu phải có ít nhất 8 ký tự");
        }
        if (storageLimit <= 0) {
            throw new IllegalArgumentException("Dung lượng phải lớn hơn 0");
        }

        this.email = email;
        this.password = password;
        this.storageLimit = storageLimit;
        this.usedStorage = 0; // mặc định chưa dùng gì
    }

    // Phương thức đổi mật khẩu
    public boolean changePassword(String oldPass, String newPass) {
        if (this.password.equals(oldPass) && newPass.length() >= 8) {
            this.password = newPass;
            return true;
        }
        return false;
    }

    // Phương thức upload file
    public boolean uploadFile(double sizeGB) {
        if (sizeGB <= 0) return false;
        if (usedStorage + sizeGB <= storageLimit) {
            usedStorage += sizeGB;
            return true;
        }
        return false;
    }

    // Tính phần trăm dung lượng đã dùng
    public double calculateStoragePercentage() {
        return (usedStorage / storageLimit) * 100;
    }

    // Getter và Setter (đóng gói)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (!email.contains("@") || !email.contains(".")) {
            throw new IllegalArgumentException("Email không hợp lệ");
        }
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    // Không tạo setter cho password để bảo mật, chỉ đổi qua changePassword()

    public double getStorageLimit() {
        return storageLimit;
    }

    public void setStorageLimit(double storageLimit) {
        if (storageLimit <= 0) {
            throw new IllegalArgumentException("Dung lượng phải lớn hơn 0");
        }
        this.storageLimit = storageLimit;
    }

    public double getUsedStorage() {
        return usedStorage;
    }
}
