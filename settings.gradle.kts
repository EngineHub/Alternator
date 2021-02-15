rootProject.name = "alternator"

listOf("core").forEach {
    include("alternator-$it")
}
