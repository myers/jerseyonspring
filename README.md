# spring boot / jersey / jdbi demo

```bash
docker compose up -d # run data services
./mvnw spring-boot:run
```

```bash
curl http://localhost:8080/hello
```

## Ideas

* serialize/deserialize session
* follow common pattern where we cache the session in app memory, and pubsub to redis to invalidate
* scan classpath for daos <https://stackoverflow.com/questions/61526870/spring-boot-custom-bean-loader>
* connect-backend will require having multiple binder like things.  <https://dev.to/__nikolamicic21/multiple-hierarchical-contexts-in-spring-boot-25nf>
