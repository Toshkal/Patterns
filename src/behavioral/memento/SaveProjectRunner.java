package behavioral.memento;

public class SaveProjectRunner {
    public static void main(String[] args) {
        Project project = new Project();
        GithubRepoz githubRepoz = new GithubRepoz();

        System.out.println("Creating new project. Version 1.0");
        project.setVersionAndData("Version 1.0");

        System.out.println("Saving current version to github...");
        githubRepoz.setSave(project.save());

        System.out.println("Updating project to version 1.1");

        System.out.println("Writing poor code...");

        project.setVersionAndData("Version 1.1");

        System.out.println(project);

        System.out.println("Something went wrong...");

        System.out.println("Rolling back to version 1.0");
        project.load(githubRepoz.getSave());

        System.out.println("Project after rolback:");
        System.out.println(project);
    }
}
