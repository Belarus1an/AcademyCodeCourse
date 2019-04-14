package week5OOP.scrum;

import java.text.DecimalFormat;
import java.util.*;

public class TaskProvider {

    private Map<String, List<Task>> task = new LinkedHashMap<>();

    public TaskProvider(){
        task.put("Inprogress", Arrays.asList(
                new Task("Deploy to Azure", "Bob", 8),
                new Task("Handle user input", "John", 4)
                ));

        task.put("To do", Arrays.asList(
                new Task("Connect to DB", "John", 2),
                new Task("Add users", "Jessica", 7),
                new Task("Confogure logging", "Bob", 3)
        ));

        task.put("Done", Arrays.asList(
                new Task("Prepare", "Bob", 5)
        ));
    }

    public void showTask(){
        String content;
        String user;
        int time;

        for (Map.Entry<String, List<Task>> entry: task.entrySet()){ //map
            System.out.println(entry.getKey() + "(" + entry.getValue().size()+ "): ");

            for (int i = 0; i < entry.getValue().size(); i++) { //list
                content = entry.getValue().get(i).getContent();
                user = entry.getValue().get(i).getUser();
                time = entry.getValue().get(i).getEstimatedTime();
                System.out.println("* " + content + " (" + user  + ", " + time + ")");
            }
        }
    }

    public void showTaskByUser(String user){
        int taskByUser = 0;
        for (Map.Entry<String, List<Task>> entry: task.entrySet()){
            for (int i = 0; i < entry.getValue().size() ; i++) {
                if (entry.getValue().get(i).getUser().equals(user)){
                    taskByUser++;
                }
            }
        }
        System.out.println(user + " was assigned to " + taskByUser + " task in this sprint");
    }

    public void showAverangeTime(){
        int sum = 0;
        double averange = 0;
        int tasksNumer = 0;

        for (Map.Entry<String, List<Task>> entry: task.entrySet()){
            for (int i = 0; i < entry.getValue().size() ; i++) {
                sum += entry.getValue().get(i).getEstimatedTime();
            }
            tasksNumer += entry.getValue().size();
        }
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        df.setMinimumFractionDigits(2);
        averange = (double) sum / tasksNumer;
        System.out.println("Mean aproximate time per task is " + df.format(averange));
    }
}
