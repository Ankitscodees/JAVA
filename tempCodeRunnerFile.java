import java.util.*;

class User {
    String username;
    String password;
    String role;

    User(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }
}

class JobRequest {
    String jobType;
    String requester;

    JobRequest(String jobType, String requester) {
        this.jobType = jobType;
        this.requester = requester;
    }
}

public class JobPortal {
    static List<User> users = new ArrayList<>();
    static List<JobRequest> jobRequests = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        seedUsers();
        login();
    }

    static void seedUsers() {
        users.add(new User("worker1", "pass123", "Worker"));
        users.add(new User("customer1", "pass456", "Customer"));
    }

    static void login() {
        System.out.print("Enter Username: ");
        String username = scanner.next();
        System.out.print("Enter Password: ");
        String password = scanner.next();

        for (User user : users) {
            if (user.username.equals(username) && user.password.equals(password)) {
                System.out.println("Login Successful!\nWelcome " + user.username);
                if (user.role.equals("Worker")) {
                    checkJobRequests(user.username);
                } else {
                    requestJob(user.username);
                }
                return;
            }
        }
        System.out.println("Invalid credentials. Try again.");
    }

    static void requestJob(String requester) {
        System.out.println("Available job roles: Plumber, Chef, Maid, Mechanic");
        System.out.print("Enter job type you need: ");
        String jobType = scanner.next();
        jobRequests.add(new JobRequest(jobType, requester));
        System.out.println("Job request placed successfully!");
    }

    static void checkJobRequests(String worker) {
        System.out.println("Available job requests:");
        for (JobRequest job : jobRequests) {
            System.out.println("Job Type: " + job.jobType + " | Requested by: " + job.requester);
        }
    }
}
