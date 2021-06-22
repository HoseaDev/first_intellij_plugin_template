package com.github.hlgithub369.firstintellijplugintemplate.services

import com.github.hlgithub369.firstintellijplugintemplate.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
