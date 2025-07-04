package pl.coderslab.entity;

public class MainDao {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();

        User user1 = new User();
        user1.setUserName("karol");
        user1.setEmail("karol@gmail.com");
        user1.setPassword("123456");
        userDao.create(user1);

        User user2 = new User();
        user2.setUserName("hania");
        user2.setEmail("hanna@outlook.com");
        user2.setPassword("passwd");
        userDao.create(user2);

    }
}
