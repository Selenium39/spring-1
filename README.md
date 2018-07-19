# spring-1

１.开发Spring的流程:<br/>
&nbsp;&nbsp; &nbsp; &nbsp;  1.导入5个核心jar包:commons-logging spring-core spring-context spring-beans spring-expression<br/>
   &nbsp;&nbsp; &nbsp; &nbsp;  2.创建配置文件spring.xml<br/>
   &nbsp;&nbsp; &nbsp; &nbsp;  3.获取Bean:<br/>
       &nbsp;&nbsp; &nbsp; &nbsp;  &nbsp;&nbsp; &nbsp; &nbsp;  1.获取ApplicationContext容器<br/>
      &nbsp;&nbsp; &nbsp; &nbsp;   &nbsp;&nbsp; &nbsp; &nbsp;  2.通过容器获取Bean<br/>
2.Spring　IOC容器的实现:BeanFactory和ApplicationContext<br/>
   &nbsp;&nbsp; &nbsp; &nbsp;  1.BeanFactory:IOC容器的基本实现,面向Spring本身<br/>
  &nbsp;&nbsp; &nbsp; &nbsp;   2.ApplicationContext:实现了BeanFactory接口,是IOC容器的高级实现,面向Spring的开发者<br/>
   &nbsp;&nbsp; &nbsp; &nbsp; &nbsp;&nbsp;  ApplicationContext在初始化上下文时就实例化了所有的单例Bean<br/>
3.3种依赖注入:通过某种方法给bean的资源进行注入<br/>
   &nbsp;&nbsp; &nbsp; &nbsp;  1.构造器注入<br/>
  &nbsp;&nbsp; &nbsp; &nbsp;   2.setter注入<br/>
  &nbsp;&nbsp; &nbsp; &nbsp;   3.工厂方法注入(静态工厂方法注入,实例工厂方法注入)<br/>
4.注入属性细节:<br/>
  &nbsp;&nbsp; &nbsp; &nbsp;   1.当注入的属性含特殊字符时,在value子节点中使用<![CDATA[＜属性＞]]>进行注入<br/>
  &nbsp;&nbsp; &nbsp; &nbsp;   2.引用时可分为内部Bean(只能用一次，相当于内部类)和外部Bean<br/>
  &nbsp;&nbsp; &nbsp; &nbsp;   3.可以通过级联属性进行配置<br/>
  &nbsp;&nbsp; &nbsp; &nbsp;   4.可以以外部List,Map的方式注入<br/>
  <br/>
参考视频:https://ke.qq.com/course/280229
