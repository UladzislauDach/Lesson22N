import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

//дан лист строк. Отсортировать, отфильтровать, избавиться от пустых строк и null, привести к верхнему регистру
//создать user'ов, вывести имена
public class StreamExample {
    private static void doWithoutLambda() {
        List<String> strings = new ArrayList<>();
        strings.add("Ivan");
        strings.add("");
        strings.add(null);
        strings.add("stormnet");
        strings.add("TEst");
        strings.add("Stepan");
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            if (name == null || name.isEmpty()) {
                iterator.remove();
            }
        }
        Collections.sort(strings);

        List<User> users = new ArrayList<>();
        for (String name : strings) {
            User user = new User(name.toUpperCase());
            System.out.println(user.getName());
            users.add(user);
        }

    }

}