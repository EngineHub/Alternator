rootProject.name = "alternator"

listOf("bukkit", "core", "sponge").forEach {
    include("alternator-$it")
}
