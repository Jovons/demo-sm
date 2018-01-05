## 1. aop
[description] [1]

in package `com.example.demosm.my.aop` class `Foo` is annotated with `NeedTestClass`, the following code in `MyAspect` would cause `BusinessService#logicWithAnnotatedArgs1` throws en error. 

````
@AfterReturning("@annotation(n)")
public void afterReturningFromAnnotated(NeedTestClass n) {
    log.info("aspect: after annotated {}", n.value());
}
````

Sometimes the error is
```
No visible constructors in class org.springframework.hateoas.config.HypermediaSupportBeanDefinitionRegistrar$DefaultObjectMapperCustomizer
```
Other times (not in this project though) the error is
```
Cannot subclass final class org.springframework.boot.autoconfigure.AutoConfigurationPack‌​ages$BasePackages
```
I believe that somehow some innocent classes are polluted (they are treated as being annotated with `@NeedTestClass`).
## 2. *@DataJpaTest*
[description] [2]
in package `com.example.demosm.my.djt` class `JudgeItemServiceApi` is also initiated when initializing ApplicationContext, which in sequence calls for a bean `redisTemplate` which does not exist, an error of such is thrown if one runs `com.example.demosm.JpaTest#test`
## 3. *produces* in *RequestMapping* makes a post request 404
in package `com.example.demosn.my.fof` class `FourOFourController` has 2 GET requests, using `curl` /get.html would return 406 (or actually 404 in our projects ajax request) if **produces = JSON** is used.
On the contrary if there is no `produces = MediaType....JSON` it would be OK. I know that spring would check request surffix like `.html` and thereafter treat the return object as a page, but a single **produces** would make such an incongruous behavior is misleading, especially when @ReponseBody exists and requests having `Accept: */json` headers.
```
curl -v -H "Accept:application/json, text/javascript, */*; q=0.01" -H "Accept-Encoding:gzip, deflate, br" -H "Accept-Language:zh-CN,zh;q=0.9,en-US;q=0.8,en;q=0.7" -H "Connection:keep-alive" -H "X-Requested-With:XMLHttpRequest" http://localhost:8888/fof/get.html
```
[description] [3]
## 4. *@Entity* ManyToMany join table is not inserted.  TODO
--------
[1]: https://stackoverflow.com/questions/48055097/spring-aop-no-visible-constructors-in-class
[2]: https://stackoverflow.com/questions/45309405/why-is-spring-boots-datajpatest-scanning-component
[3]: https://stackoverflow.com/questions/48000692/spring-produces-field-of-controller-annotation-causes-a-get-404