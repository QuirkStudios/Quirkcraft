//val fabricLoaderVersion: String by project.extra
val mixinVersion: String by project.extra

dependencies {
    annotationProcessor("org.spongepowered:mixin:${mixinVersion}:processor")
    //modImplementation("net.fabricmc:fabric-loader:${fabricLoaderVersion}")
}

/*publishing {
    publications {
        mavenCommon(MavenPublication) {
            artifactId = rootProject.archivesBaseName
            from components.java
        }
    }

    repositories {
        if (System.getenv("MAVEN_PASS") != null) {
            maven {
                url = "https://maven.quirkstudios.xyz/"
                credentials {
                }
            }
        }
    }
}*/