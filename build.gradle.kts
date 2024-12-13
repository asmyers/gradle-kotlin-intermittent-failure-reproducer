
val generateDevNotesIndex = tasks.register("generateDevNotesIndex") {
    doLast {
	val devNotes = project.layout.projectDirectory.dir("docs/dev-notes").asFile.list().toList()
        println(devNotes)
    }
}
