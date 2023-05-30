@file:Suppress("unused")

import org.gradle.kotlin.dsl.kotlin
import org.gradle.kotlin.dsl.version
import org.gradle.plugin.use.PluginDependenciesSpec

object Versions {

    const val kotlin = "1.4.0"

    object Kotlinx {
        const val coroutines = "1.3.9"
        const val serialization = "1.0.0-RC"
        const val reflectLite = "1.0.0"
        const val io = "0.1.8"
        const val immutableColl = "0.1"
    }

    object Google {
        const val javaFormat = "1.7"
        const val jsr305 = "3.0.2"
        const val conscrypt = "1.4.1"
        const val tink = "1.2.1"
        const val truth = "0.44"
        const val guava = "27.1-jre"
        const val jib = "2.5.0"
        const val jibCore = "0.15.0"

        object Auto {
            const val factory = "1.0-beta6"
            const val service = "1.0-rc5"
            const val value = "1.6.5"
            const val common = "0.10"
        }
    }

    object OkHttp {
        const val okio = "2.2.0"
        const val okhttp = "4.8.1"
        const val ok2Curl = "0.4.5"
        const val digest = "0.4.0"
    }

    object Retrofit {
        const val retrofit = "2.9.0"
        const val reactorAdapter = "2.1.0"
        const val loggingRetrofit = "0.10.0"
        const val kotlinCoroutinesAdapter = "0.9.2"
        const val kotlinxSerializationConverter = "0.2.0"
    }

    const val moshi = "1.10.0"
    const val graal = "20.1.0"
    const val clikt = "2.8.0"
    const val commonsCodec = "1.15"
    const val rsocket = "1.0.2"
    const val failsafe = "2.4.0"
    const val assertj = "3.17.2"
    const val junit = "5.6.2"
    const val mockito = "3.5.10"
    const val awaitility = "3.1.6"
    const val sshj = "0.26.0"
    const val jol = "0.13"
    const val slf4j = "1.7.30"
    const val mockitoKotlin = "2.2.0"
    const val byteBuddy = "1.9.7"

    const val bouncyCastle = "1.60"
    const val brotli = "0.1.2"
    const val commonsIO = "2.6"
    const val jnrJffi = "1.2.18"
    const val jnrUnixSocket = "0.21"
    const val netty = "4.1.32.Final"

    const val ztExec = "1.10"
    const val jline = "3.9.0"
    const val eclipseCollections = "9.2.0"
    const val trov4j = "1.0.20181211"
    const val japicmp = "0.13.0"
    const val jjwt = "0.10.5"
    const val jkeychain = "1.0.0"
    const val openpdf = "1.2.9"
    const val orsonpdf = "1.8"
    const val jfreesvg = "3.3"

    const val swaggerUI = "3.10.0"
    const val swaggerCodegenCli = "3.0.0"
    const val smbj = "0.9.1"
    const val asn1 = "0.1.0"
    const val jasn1 = "1.11.2"
    const val caffeine = "2.6.2"
    const val cache2k = "1.2.0.Final"
    const val kolor = "0.0.2"
    const val ktlint = "0.31.0"
    const val mockk = "1.10.0"
    const val reactiveStreams = "1.0.2"
    const val reactor = "3.2.5.RELEASE"
    const val ff4j = "1.3.0"
    const val jmh = "1.21"
    const val classgraph = "4.8.89"
    const val pf4j = "2.6.0"
    const val licensius = "0.1.1"

    // Plugins
    const val gradle = "6.6.1"
    const val dokka = "1.4.0"
    const val ktlintPlugin = "9.4.0"
    const val shadow = "6.0.0"
    const val sonarqube = "3.0"
    const val nemerosaVersioning = "2.8.2"
    const val springBoot = "2.1.6.RELEASE"
    const val springDepMgmt = "1.0.10.RELEASE"
    const val buildSrcVersions = "0.7.0"
    const val googleJavaFmtPlugin = "0.9"
    const val benmanesVersions = "0.30.0"
    const val buildScanPlugin = "2.0.2"
    const val gitPublishPlugin = "1.0.1"
    const val swaggerGen = "2.18.2"
    const val gitProperties = "2.2.3"
    const val gradleRelease = "2.8.1"
    const val mavenPublishAuth = "2.0.2"
    const val javafxPlugin = "0.0.7"
    const val jmhPlugin = "0.4.8"
}

object Deps {

    object Kotlin {
        // kotlin("stdlib-jdk8")
        const val stdLib = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin}"
        const val stdLibJdk8 = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}"
        const val reflect = "org.jetbrains.kotlin:kotlin-reflect:${Versions.kotlin}"
        const val test = "org.jetbrains.kotlin:kotlin-test:${Versions.kotlin}"
        const val testJunit = "org.jetbrains.kotlin:kotlin-test-junit:${Versions.kotlin}"
    }

    object Kotlinx {
        const val coroutinesCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.Kotlinx.coroutines}"
        const val coroutinesJdk8 = "org.jetbrains.kotlinx:kotlinx-coroutines-jdk8:${Versions.Kotlinx.coroutines}"
        const val coroutinesReactor = "org.jetbrains.kotlinx:coroutines-reactor:${Versions.Kotlinx.coroutines}"
        const val coroutinesTest = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.Kotlinx.coroutines}"
        const val coroutinesDebug = "org.jetbrains.kotlinx:kotlinx-coroutines-debug:${Versions.Kotlinx.coroutines}"
        const val serialization =
            "org.jetbrains.kotlinx:kotlinx-serialization-core:${Versions.Kotlinx.serialization}"
        const val reflectLite = "org.jetbrains.kotlinx:kotlinx.reflect.lite:${Versions.Kotlinx.reflectLite}"
        const val io = "org.jetbrains.kotlinx:kotlinx-io-jvm:${Versions.Kotlinx.io}"
        const val immutableColl =
            "org.jetbrains.kotlinx:kotlinx-collections-immutable:${Versions.Kotlinx.immutableColl}"
    }

    object OkHttp {
        const val okio = "com.squareup.okio:okio:${Versions.OkHttp.okio}"
        const val okhttp = "com.squareup.okhttp3:okhttp:${Versions.OkHttp.okhttp}"
        const val ok2Curl = "com.github.mrmike:ok2curl:${Versions.OkHttp.ok2Curl}"
        const val mockWebServer = "com.squareup.okhttp3:mockwebserver:${Versions.OkHttp.okhttp}"
        const val sse = "com.squareup.okhttp3:okhttp-sse:${Versions.OkHttp.okhttp}"
        const val loggingInterceptor = "com.squareup.okhttp3:logging-interceptor:${Versions.OkHttp.okhttp}"
        const val tls = "com.squareup.okhttp3:okhttp-tls:${Versions.OkHttp.okhttp}"
        const val unixDomainSockets = "com.squareup.okhttp3.sample:unixdomainsockets:${Versions.OkHttp.okhttp}"
        const val digest = "com.baulsupp:okhttp-digest:${Versions.OkHttp.digest}"
        const val dnsOverHttps = "com.squareup.okhttp3:okhttp-dnsoverhttps:${Versions.OkHttp.okhttp}"
    }


    object Retrofit {
        const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.Retrofit.retrofit}"
        const val adapters = "com.squareup.retrofit2:retrofit-adapters:${Versions.Retrofit.retrofit}"
        const val converters = "com.squareup.retrofit2:retrofit-converters:${Versions.Retrofit.retrofit}"
        const val converterMoshi = "com.squareup.retrofit2:converter-moshi:${Versions.Retrofit.retrofit}"
        const val logging = "com.nightlynexus.logging-retrofit:logging:${Versions.Retrofit.loggingRetrofit}"
        const val reactorAdapter =
            "com.jakewharton.retrofit:retrofit2-reactor-adapter:${Versions.Retrofit.reactorAdapter}"
        const val kotlinCoroutinesAdapter =
            "com.jakewharton.retrofit:retrofit2-kotlin-coroutines-adapter:${Versions.Retrofit.kotlinCoroutinesAdapter}"
        const val kotlinxSerializationConverter =
            "com.jakewharton.retrofit:retrofit2-kotlinx-serialization-converter:${Versions.Retrofit.kotlinxSerializationConverter}"
    }

    object Moshi {
        const val moshi = "com.squareup.moshi:moshi:${Versions.moshi}"
        const val moshiKotlin = "com.squareup.moshi:moshi-kotlin:${Versions.moshi}"
        const val kotlinCodegen = "com.squareup.moshi:moshi-kotlin-codegen:${Versions.moshi}"
        const val adapters = "com.squareup.moshi:moshi-adapters:${Versions.moshi}"
    }

    object Google {
        const val tink = "com.google.crypto.tink:tink:${Versions.Google.tink}"
        const val conscryptUber = "org.conscrypt:conscrypt-openjdk-uber:${Versions.Google.conscrypt}"
        const val jibCore = "com.google.cloud.tools:jib-core:${Versions.Google.jibCore}"
        const val jsr305 = "com.google.code.findbugs:jsr305:${Versions.Google.jsr305}"
    }

    object Log {
        const val slf4jApi = "org.slf4j:slf4j-api:${Versions.slf4j}"
        const val slf4jSimple = "org.slf4j:slf4j-simple:${Versions.slf4j}"
        const val slf4jNop = "org.slf4j:slf4j-nop:${Versions.slf4j}"
    }

    object Cache {
        const val caffeine = "com.github.ben-manes.caffeine:caffeine:${Versions.caffeine}"
        const val cache2kApi = "org.cache2k:cache2k-api:${Versions.cache2k}"
        const val cache2kCore = "org.cache2k:cache2k-core:${Versions.cache2k}"
    }

    object Apache {
        const val commonsIO = "commons-io:commons-io:${Versions.commonsIO}"
        const val commonsCodec = "commons-codec:commons-codec:${Versions.commonsCodec}"
    }

    object Graal {
        const val sdk = "org.graalvm.sdk:graal-sdk:${Versions.graal}"
        const val compiler = "org.graalvm.compiler:compiler:${Versions.graal}"
        const val substratevm = "org.graalvm.nativeimage:svm:${Versions.graal}"
        const val substratevmLibSupport = "org.graalvm.nativeimage:library-support:${Versions.graal}"
    }

    object JUnit {
        const val jupiter = "org.junit.jupiter:junit-jupiter:${Versions.junit}"
        const val jupiterApi = "org.junit.jupiter:junit-jupiter-api:${Versions.junit}"
        const val jupiterEngine = "org.junit.jupiter:junit-jupiter-engine:${Versions.junit}"
        const val jupiterParams = "org.junit.jupiter:junit-jupiter-params:${Versions.junit}"
    }

    object Mock {
        const val mockk = "io.mockk:mockk:${Versions.mockk}"
        const val mockito = "org.mockito:mockito-core:${Versions.mockito}"
        const val mockitoKotlin = "com.nhaarman.mockitokotlin2:mockito-kotlin:${Versions.mockitoKotlin}"
    }

    object Cli {
        const val jline = "org.jline:jline:${Versions.jline}"
        const val jlineTerminal = "org.jline:jline-terminal:${Versions.jline}"
        const val jlineReader = "org.jline:jline-reader:${Versions.jline}"
        const val clikt = "com.github.ajalt:clikt:${Versions.clikt}"
        const val kolor = "com.andreapivetta.kolor:kolor:${Versions.kolor}"
    }

    const val bouncyCastle = "org.bouncycastle:bcprov-jdk15on:${Versions.bouncyCastle}"
    const val failsafe = "net.jodah:failsafe:${Versions.failsafe}"
    const val nettyResolveDns = "io.netty:netty-resolver-dns:${Versions.netty}"
    const val sshj = "com.hierynomus:sshj:${Versions.sshj}"
    const val smbj = "com.hierynomus:smbj:${Versions.smbj}"
    const val asn1 = "com.hierynomus:asn-one:${Versions.asn1}"
    const val jasn1 = "com.beanit:jasn1:${Versions.jasn1}"
    const val jasn1Compiler = "com.beanit:jasn1-compiler:${Versions.jasn1}"
    const val classgraph = "io.github.classgraph:classgraph:${Versions.classgraph}"
    const val jffi = "com.github.jnr:jffi:${Versions.jnrJffi}"
    const val jnrUnixSocket = "com.github.jnr:jnr-unixsocket:${Versions.jnrUnixSocket}"

    const val jjwt = "io.jsonwebtoken:jjwt-api:${Versions.jjwt}"
    const val jjwtImpl = "io.jsonwebtoken:jjwt-impl:${Versions.jjwt}"
    const val jjwtJackson = "io.jsonwebtoken:jjwt-jackson:${Versions.jjwt}"
    const val jkeychain = "pt.davidafsilva.apple:jkeychain:${Versions.jkeychain}"

    const val jfreesvg = "org.jfree:jfreesvg:${Versions.jfreesvg}"
    const val orsonpdf = "com.orsonpdf:orsonpdf:${Versions.orsonpdf}"
    const val openpdf = "com.github.librepdf:openpdf:${Versions.openpdf}"

    const val pf4j = "org.pf4j:pf4j:${Versions.pf4j}"
    const val licensius = "ro.fortsoft.licensius:licensius:${Versions.licensius}"
    const val ztExec = "org.zeroturnaround:zt-exec:${Versions.ztExec}"
    const val brotli = "org.brotli:dec:${Versions.brotli}"
    const val byteBuddy = "net.bytebuddy:byte-buddy:${Versions.byteBuddy}"
    const val jol = "org.openjdk.jol:jol-core:${Versions.jol}"
    const val japicmp = "com.github.siom79.japicmp:japicmp:${Versions.japicmp}"

    const val reactiveStreams = "org.reactivestreams:reactive-streams:${Versions.reactiveStreams}"
    const val reactiveStreamsFlowAdapters =
        "org.reactivestreams:reactive-streams-flow-adapters:${Versions.reactiveStreams}"
    const val reactorCore = "io.projectreactor:reactor-core:${Versions.reactor}"
    const val reactorTest = "io.projectreactor:reactor-test:${Versions.reactor}"
    const val rsocketCore = "io.rsocket:rsocket-core:${Versions.rsocket}"
    const val rsocketNetty = "io.rsocket:rsocket-transport-netty:${Versions.rsocket}"

    const val eclipseCollections = "org.eclipse.collections:eclipse-collections:${Versions.eclipseCollections}"
    const val eclipseCollectionsApi = "org.eclipse.collections:eclipse-collections-api:${Versions.eclipseCollections}"
    const val trov4j = "org.jetbrains.intellij.deps:trove4j:${Versions.trov4j}"
    const val ff4j = "org.ff4j:ff4j-core:${Versions.ff4j}"

    const val jmhCore = "org.openjdk.jmh:jmh-core:${Versions.jmh}"
    const val jmhGenAnnprocess = "org.openjdk.jmh:jmh-generator-annprocess:${Versions.jmh}"

    const val swaggerUI = "org.webjars:swagger-ui:${Versions.swaggerUI}"
    const val swaggerCodegenCli = "io.swagger.codegen.v3:swagger-codegen-cli:${Versions.swaggerCodegenCli}"
    const val assertjCore = "org.assertj:assertj-core:${Versions.assertj}"
    const val awaitility = "org.awaitility:awaitility:${Versions.awaitility}"
    const val awaitilityKotlin = "org.awaitility:awaitility-kotlin:${Versions.awaitility}"
}

/**
 * PluginId Extensions
 */
inline val PluginDependenciesSpec.kotlinJvm get() = kotlin("jvm") version Versions.kotlin
inline val PluginDependenciesSpec.kotlinKapt get() = kotlin("kapt") version Versions.kotlin
inline val PluginDependenciesSpec.kotlinNoArg get() = kotlin("plugin.noarg") version Versions.kotlin
inline val PluginDependenciesSpec.kotlinAllOpen get() = kotlin("plugin.allopen") version Versions.kotlin
inline val PluginDependenciesSpec.kotlinSpring get() = kotlin("plugin.spring") version Versions.kotlin
inline val PluginDependenciesSpec.kotlinJpa get() = kotlin("plugin.jpa") version Versions.kotlin
inline val PluginDependenciesSpec.kotlinMultiplatform get() = id("kotlin-multiplatform") version Versions.kotlin
inline val PluginDependenciesSpec.kotlinxSerialization get() = id("kotlinx-serialization") version Versions.kotlin
inline val PluginDependenciesSpec.benmanesVersions get() = id("com.github.ben-manes.versions") version Versions.benmanesVersions
inline val PluginDependenciesSpec.ktlint get() = id("org.jlleitschuh.gradle.ktlint") version Versions.ktlintPlugin
inline val PluginDependenciesSpec.gitProperties get() = id("com.gorylenko.gradle-git-properties") version Versions.gitProperties
inline val PluginDependenciesSpec.dokka get() = id("org.jetbrains.dokka") version Versions.dokka
inline val PluginDependenciesSpec.googleJavaFormat get() = id("com.github.sherter.google-java-format") version Versions.googleJavaFmtPlugin
inline val PluginDependenciesSpec.gradleRelease get() = id("net.researchgate.release") version Versions.gradleRelease
inline val PluginDependenciesSpec.mavenPublishAuth get() = id("org.datlowe.maven-publish-auth") version Versions.mavenPublishAuth
inline val PluginDependenciesSpec.javafx get() = id("org.openjfx.javafxplugin") version Versions.javafxPlugin
inline val PluginDependenciesSpec.jmh get() = id("me.champeau.gradle.jmh") version Versions.jmhPlugin
inline val PluginDependenciesSpec.shadow get() = id("com.github.johnrengelman.shadow") version Versions.shadow
inline val PluginDependenciesSpec.buildSrcVersions get() = id("de.fayard.buildSrcVersions") version Versions.buildSrcVersions
inline val PluginDependenciesSpec.swaggerGenerator get() = id("org.hidetake.swagger.generator") version Versions.swaggerGen
inline val PluginDependenciesSpec.googleJib get() = id("com.google.cloud.tools.jib") version Versions.Google.jib
inline val PluginDependenciesSpec.sonarqube get() = id("org.sonarqube") version Versions.sonarqube
inline val PluginDependenciesSpec.springDepMgmt get() = id("io.spring.dependency-management") version Versions.springDepMgmt
inline val PluginDependenciesSpec.springBoot get() = id("iorg.springframework.boot") version Versions.springBoot
