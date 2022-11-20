package generative.prototype;

public class Project implements ClonePrototype {
    private int id;
    private String projectName;
    private String resource;

    public Project(int id, String projectName, String resource) {
        this.id = id;
        this.projectName = projectName;
        this.resource = resource;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    @Override
    public Object copy() {
        Project copy = new Project(id, projectName, resource);
        return copy;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", projectName='" + projectName + '\'' +
                ", resource='" + resource + '\'' +
                '}';
    }
}
