Compiling
=========

You can compile Alternator as long as you have the [Java Development Kit (JDK)](http://www.oracle.com/technetwork/java/javase/downloads/index-jsp-138363.html) for Java 8 or newer.
You only need one version of the JDK installed.

The build process uses Gradle, which you do *not* need to download. Alternator is a multi-module project with three modules:

* `alternator-core` contains the Alternator API
* `alternator-bukkit` is the Bukkit plugin
* `alternator-sponge` is the Sponge plugin

## To compile...

### On Windows

1. Shift + right click the folder with Alternator's files and click "Open command prompt".
2. `gradlew build`

### On Linux, BSD, or Mac OS X

1. In your terminal, navigate to the folder with Alternator's files (`cd /folder/of/alternator/files`)
2. `./gradlew build`

## Then you will find...

You will find:

* The core Alternator API in **alternator-core/build/libs**
* Alternator for Bukkit in **alternator-bukkit/build/libs**
* Alternator for Sponge in **alternator-sponge/build/libs**

If you want to use Alternator, use the `-dist` version.

(The -dist version includes Alternator + necessary libraries.)

## Other commands

* `gradlew idea` will generate an [IntelliJ IDEA](http://www.jetbrains.com/idea/) module for each folder.
* `gradlew eclipse` will generate an [Eclipse](https://www.eclipse.org/downloads/) project for each folder.
