# spring boot / jersey / jdbi demo

```bash
docker compose up -d # run postgres
./mvnw spring-boot:run
```

```bash
curl http://localhost:8080/hello
```

## Ideas

* scan classpath for daos <https://stackoverflow.com/questions/61526870/spring-boot-custom-bean-loader>
