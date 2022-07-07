package com.github.marianolopezzuniga.livetemplate.services

import com.intellij.openapi.project.Project
import com.github.marianolopezzuniga.livetemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
