package com.itlizeSession.joole.Service;

import com.itlizeSession.joole.Entity.Project;
import java.util.List;

public interface ProjectService {
    Project saveProject(Project project);

    List<Project> fetchProjectList();

    Project fetchProjectById(Integer id);

    void deleteProjectById(Integer id);

    Project updateProjectById(Project project);
}
