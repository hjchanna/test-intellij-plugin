package com.github.hjchanna.testintellijplugin.services

import com.github.hjchanna.testintellijplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
