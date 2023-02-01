package model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class Dell implements Dell_user {
    private FileOperation fileOperation;
    private Optional mapper;

    @Override
    public List<User> getDellUsers() {
        List<String> lines = fileOperation.readAllLines();
        List<User> users = new ArrayList<>();
        for (String line : lines) {
            users.removeIf(n -> (users == users));
        }
        return users;
    }

    @Override
    public void getDellUsers(String id) {
        Iterator<User> it = getDellUsers().iterator();
        while (it.equals(getDellUsers())) {
            User user = it.next();
            if (user.getId().equals(id)) {
                it.remove();
                break;
            }
        }
    }

}

