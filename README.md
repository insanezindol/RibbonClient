# RibbonClient

## 개요

RibbonClient는 Spring Boot와 Spring Cloud를 기반으로 구축된 마이크로서비스 클라이언트 애플리케이션입니다. Netflix Eureka 서비스 디스커버리와 Zipkin 분산 추적 시스템을 지원하는 클라우드 네이티브 애플리케이션입니다.

## 주요 기능

-   **서비스 디스커버리**: Netflix Eureka 클라이언트로 서비스 등록 및 발견
-   **분산 추적**: Spring Cloud Sleuth와 Zipkin을 통한 요청 추적
-   **액추에이터**: Spring Boot Actuator를 통한 애플리케이션 모니터링
-   **RESTful API**: 클라이언트 서비스를 위한 REST API 제공

## 기술 스택

-   **Java**: 1.8
-   **Spring Boot**: 2.1.2.RELEASE
-   **Spring Cloud**: Greenwich.RELEASE
-   **Maven**: 빌드 도구
-   **Lombok**: 코드 간소화

### 주요 의존성

-   `spring-boot-starter-web`: 웹 애플리케이션 개발
-   `spring-boot-starter-actuator`: 애플리케이션 모니터링
-   `spring-cloud-starter-netflix-eureka-client`: 서비스 디스커버리
-   `spring-cloud-starter-sleuth`: 분산 추적
-   `spring-cloud-starter-zipkin`: Zipkin 추적

## 프로젝트 구조

```
src/
├── main/
│   ├── java/
│   │   └── kr/co/lunasoft/
│   │       ├── RibbonClientApplication.java     # 메인 애플리케이션 클래스
│   │       ├── config/
│   │       │   └── AspectConfig.java            # AOP 설정
│   │       └── controller/
│   │           └── ClientController.java        # REST API 컨트롤러
│   └── resources/
│       └── application.yml                      # 애플리케이션 설정
└── test/
    └── java/
        └── kr/co/lunasoft/
            └── RibbonClientApplicationTests.java # 테스트 클래스
```

## 설정 정보

### 애플리케이션 설정 (application.yml)

-   **포트**: 8083
-   **애플리케이션 이름**: eureka-client
-   **Eureka 서버**: http://localhost:8761/eureka/
-   **Zipkin 서버**: http://ubuntu-server:9411
-   **추적 샘플링**: 100% (probability: 1)

## API 엔드포인트

### 1. 맵 데이터 조회

```
GET /client/get-map-data
```

**응답 예시:**

```json
{
    "code": "100200",
    "msg": "success",
    "data": "this is ribbon client. 12345"
}
```

### 2. 테스트 엔드포인트

```
GET /client/test
```

**응답 예시:**

```json
{
    "code": "100200",
    "msg": "success",
    "data": "this is ribbon client. 67890"
}
```

## 실행 방법

### 사전 요구사항

1. **Java 1.8** 이상 설치
2. **Maven** 설치
3. **Eureka 서버** 실행 (포트 8761)
4. **Zipkin 서버** 실행 (선택사항)

### 애플리케이션 실행

#### Maven을 사용한 실행

```bash
./mvnw spring-boot:run
```

#### JAR 파일 빌드 및 실행

```bash
# JAR 파일 빌드
./mvnw clean package

# 실행
java -jar target/RibbonClient-0.0.1-SNAPSHOT.jar
```

### 실행 확인

애플리케이션이 정상적으로 시작되면:

-   애플리케이션: http://localhost:8083
-   Actuator 엔드포인트: http://localhost:8083/actuator
-   Eureka 대시보드에서 `eureka-client` 서비스 확인: http://localhost:8761

## 개발 환경

### IDE 설정

1. **Lombok 플러그인** 설치 필요
2. **Annotation Processing** 활성화

### 빌드 도구

-   Maven Wrapper 포함되어 있어 별도 Maven 설치 불필요
-   `./mvnw` (Unix/Linux/macOS) 또는 `mvnw.cmd` (Windows) 사용

## 모니터링

### Actuator 엔드포인트

-   `/actuator/health`: 애플리케이션 상태 확인
-   `/actuator/info`: 애플리케이션 정보
-   `/actuator/metrics`: 메트릭 정보

### 분산 추적

-   **Sleuth**: 자동 트레이스 ID 생성 및 스팬 관리
-   **Zipkin**: 분산 추적 데이터 시각화 (http://ubuntu-server:9411)

## 라이센스

이 프로젝트는 Spring Boot 프로젝트로 생성되었습니다.

## 기여

버그 리포트나 기능 요청은 이슈를 통해 제출해 주세요.
