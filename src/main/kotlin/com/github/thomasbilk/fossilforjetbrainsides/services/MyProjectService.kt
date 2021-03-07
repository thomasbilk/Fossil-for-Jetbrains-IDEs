package com.github.thomasbilk.fossilforjetbrainsides.services

import com.github.thomasbilk.fossilforjetbrainsides.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
