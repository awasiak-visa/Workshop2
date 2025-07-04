package pl.coderslab.entity;

import org.mindrot.jbcrypt.BCrypt;


public class MainDao {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();

        // Tests for method create.
        User user1 = new User();
        user1.setUserName("karol");
        user1.setEmail("karol@gmail.com");
        user1.setPassword("123456");
        userDao.create(user1);
        System.out.println(user1.getPassword());

        User user2 = new User();
        user2.setUserName("hania");
        user2.setEmail("hanna@outlook.com");
        user2.setPassword("passwd");
        userDao.create(user2);
        System.out.println(BCrypt.checkpw("passwd", user2.getPassword()));

        // Tests for method read.
        User user3 = userDao.read(3);
        System.out.println(user3 != null);
        System.out.println("id: " + user3.getId());
        System.out.println("userName: " + user3.getUserName());
        System.out.println("email: " + user3.getEmail());
        System.out.println("password: " + user3.getPassword());

        User user4 = userDao.read(100);
        System.out.println(user4 == null);

        // Test for method update.
        user3.setUserName("alicja");
        user3.setEmail("alicja@gmail.com");
        user3.setPassword("1234");
        userDao.update(user3);
        System.out.println("id: " + user3.getId());
        System.out.println(user3.getPassword());
        System.out.println(BCrypt.checkpw("1234", user3.getPassword()));

        // Test for method delete.
        userDao.delete(1);

        // Test for method findAll.
        User[] allUsers = userDao.findAll();
        System.out.println(allUsers != null);
        System.out.println(allUsers.length);
        System.out.println("First user's id: " + allUsers[0].getId());
        System.out.println("First user's userName: " + allUsers[0].getUserName());
        System.out.println("First user's email: " + allUsers[0].getEmail());
        System.out.println("First user's password: " + allUsers[0].getPassword());
    }
}
