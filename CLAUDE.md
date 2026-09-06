## Build / test / run
(from `My First Spring Boot Project/`, evidence: `pom.xml` parent `spring-boot-starter-parent` + `spring-boot-maven-plugin`, wrapper scripts `mvnw`/`mvnw.cmd`)
- Build: `./mvnw clean package`
- Test: `./mvnw test`
- Run (dev): `./mvnw spring-boot:run`

No lint command found — none configured in `pom.xml`.

## Rules
- Use the committed Maven wrapper (`./mvnw`), not a bare `mvn` — wrapper and `.mvn/wrapper` are committed in `My First Spring Boot Project/`.
- `Test/` is a separate, unrelated scratch project (own IntelliJ module `Test.iml`, no `pom.xml`) — do not fold it into the Maven build.

## Read first
1. `My First Spring Boot Project/pom.xml`
2. `My First Spring Boot Project/src/main/java/com/example/myfirstspringbootproject/MyFirstSpringBootProjectApplication.java`
3. `My First Spring Boot Project/src/main/java/com/example/myfirstspringbootproject/MyClass.java`

Architecture: see ARCHITECTURE.md — read before structural changes
