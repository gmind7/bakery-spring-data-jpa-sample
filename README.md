spring-multistore-config-sample
===============================

JPA2.x 관련 프로젝트로 Spring Data JPA + QueryDSL 사용 샘플링 프로젝트 입니다. (개발진행중)

## Project Modules

* Spring Data JPA
* Spring Shared
* Spring Web
 
## MySQL DB Schema

![Schema Desian][]

## Building from source

### InitScript
[schema-mysql.sql][]를 실행하여 스키마와 샘플 데이터를 생성 합니다.

### Environment
[environment Properties][] 파일의 DB 접근 정보를 수정 합니다.

```Java
default.ds.jdbc.username=root
default.ds.jdbc.password=abcde12#
```

### Import
IDE를 통해 Gradle Project로 Import 합니다.

### Testing
[All Test Repository][] 파일을 junit test를 실행하여 jpa 환경이 정상적인지 테스트 합니다.

### Web Start
개발 진행 중

## Related GitHub projects
* [Bakery Spring Configuration][]
* [Bakery Spring Multistore Configuration][]

[schema-mysql.sql]: https://raw.github.com/gmind7/spring-data-jpa-sample/master/spring-shared/src/main/scripts/sql/schema-mysql.sql
[Schema Desian]: https://raw.github.com/gmind7/spring-data-jpa-sample/master/spring-shared/src/main/scripts/sql/schema-mysql.jpg

[environment Properties]: https://raw.github.com/gmind7/spring-data-jpa-sample/master/spring-shared/src/main/resources/environment/database_loc.properties

[All Test Repository]: https://raw.github.com/gmind7/spring-data-jpa-sample/master/spring-data-jpa/src/test/java/com/gmind7/bakery/AllTestRepository.java

[Bakery Spring Configuration]: https://github.com/gmind7/spring-configuration-sample.git
[Bakery Spring Multistore Configuration]: https://github.com/gmind7/spring-multistore-config-sample.git
