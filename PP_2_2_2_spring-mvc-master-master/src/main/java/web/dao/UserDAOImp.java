package web.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import web.Model.User;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDAOImp implements UserDAO {
        List<User> users;

    {
        users = new ArrayList<>();

        users.add(new User(1, "Ivanov", "Ivan", 30));
        users.add(new User(2, "Sidorov", "Sidr", 31));
        users.add(new User(3, "Petrov", "Petr", 32));
        users.add(new User(4, "Kirilov", "Kirill", 33));
        users.add(new User(5, "Dmitriev", "Dmitrii", 34));

    }

    public List<User> index() {
        return users;

    }

    public User show(int id) {
        return users.stream().filter(user -> user.getId() == id).findAny().orElse(null);
    }
    public void save(User user) {
        users.add(user);
    }

    public void update(int id, User updateUser){
        User userToBeUpdate = show(id);

        userToBeUpdate.setId(updateUser.getId());
        userToBeUpdate.setSurname(updateUser.getSurname());
        userToBeUpdate.setName(updateUser.getName());
        userToBeUpdate.setAge(updateUser.getAge());
    }

    public void delete(int id){

        users.removeIf(user -> user.getId() == id);
    }

}
