plugins {
	java
	id("org.springframework.boot") version "3.3.0"
	id("io.spring.dependency-management") version "1.1.5"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(22)
	}
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-batch")
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
	implementation("org.xerial:sqlite-jdbc:3.41.2.2")
	implementation("org.hibernate.orm:hibernate-community-dialects:7.0.0.Final")
	//	implementation("org.hibernate:hibernate-core:6.6.3.Final")
//	implementation("org.hibernate:hibernate-entitymanager:5.6.15.Final")
	implementation("jakarta.xml.bind:jakarta.xml.bind-api:4.0.2")
	implementation("org.springframework.boot:spring-boot-starter-data-rest:3.3.6")


	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testImplementation("org.springframework:spring-webflux")
	testImplementation("org.springframework.batch:spring-batch-test")
	testImplementation("org.springframework.graphql:spring-graphql-test")
	testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.withType<Test> {
	useJUnitPlatform()
}
