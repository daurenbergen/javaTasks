package GroupWorks2;

public class Registration {
        private String email;
        private String userName;
        private String password;

        public void setEmail(String email) {
            if (email.endsWith("@yahoo.com")) {
                this.email = email;
            } else {
                System.out.println("Invalid email. Use yahoo email address.");
            }
        }

        public void setUserName(String userName) {
            if (userName.length() > 6) {
                this.userName = userName;
            } else {
                System.out.println("Invalid username. Should be at least 6 characters.");
            }
        }

        public void setPassword(String password) {
            if (password.length() > 6 && !password.contains(userName)) {
                this.password = password;
            } else {
                System.out.println("Invalid password. Password should be at least 6 characters long and cannot contain username.");
            }
        }

        public String getEmail() {
            return email;
        }

        public String getUserName() {
            return userName;
        }

        public String getPassword() {
            return password;
        }

}
