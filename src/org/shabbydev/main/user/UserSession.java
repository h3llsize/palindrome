package org.shabbydev.main.user;

public class UserSession {
    protected static Long sessionId;

    private static User user;

    static Long getCurrentSessionId() {
        return sessionId;
    }

    public static User getCurrentUser() {
        //опустим нормальную реализацию и поиск в бд

        if(user != null)
            return user;
        else {
            user = new User();
            user.setId(0L);
            user.setName("Unknown User");
            user.setScore(0L);

            return user;
        }
    }
}
