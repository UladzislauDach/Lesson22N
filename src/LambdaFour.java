public class LambdaFour {
    interface UserBuilder {
        User create(String name);
    }

    static class User {
        private String name;

        String getName() {
            return name;
        }

        User(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        UserBuilder userBuilder = User::new;
        User user = userBuilder.create("Tom");
        System.out.println(user.getName());
    }
}
