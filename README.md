1.@component是注解类的,而@Bean可以注解类里面的方法

2.@Bean注解的方法返回值是对象，可以在方法中为对象设置属性

3.如果你想要将第三方库中的组件装配到你的应用中，在这种情况下，是没有办法
在它的类上添加@Component注解的，因此就不能使用自动化装配的方案了，
但是我们可以使用@Bean.

