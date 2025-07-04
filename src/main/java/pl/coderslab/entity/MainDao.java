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


        User user3 = userDao.read(7);
        System.out.println(user3 != null);
        System.out.println("id: " + user3.getId());
        System.out.println("userName: " + user3.getUserName());
        System.out.println("email: " + user3.getEmail());
        System.out.println("password: " + user3.getPassword());

        User user4 = userDao.read(5);
        System.out.println(user4 == null);
    }
}
