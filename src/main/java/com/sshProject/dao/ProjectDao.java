package com.sshProject.dao;
import com.sshProject.entity.Project;
import com.sshProject.entity.ProjectGroup;
import com.sshProject.entity.Task;
import java.util.ArrayList;

public interface ProjectDao {
    boolean addProject(Project project);

    boolean updateProject(Project project);

    boolean deleteProject(Project project);

    ProjectGroup getProjectTeam(int projectIndex);

    ArrayList<Task> getprojectTasks(int projectIndex);

    boolean addTask(Task task);

    boolean updateTask(Task task);

    boolean deleteTask(int taskIndex);

    Task getTask(int taskIndex);

    Project getProject(int projectIndex);

    ArrayList<Project> getAllProjects();
}
