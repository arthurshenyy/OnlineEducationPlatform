```sql
   jdbc:mysql://localhost:3306/xdclass?useUnicode=true&characterEncoding=UTF-8&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC 
   ```
   放在缓冲里面需要实现implements Serializable
   
   ## 单机和分布式应用 这个要重点掌握
   token：uuid生成随机的64位字符串。放在redis中，
   用户a通过浏览器登录，存储登录成功的凭证：jsessionid token然后存在
   服务器的tomcat中 
   session id不能被别人窃取了。不然别人就可以仿造你登录。
   分布式，防止服务器挂了，前面有一个nginx负载均衡器。访问服务器2但里面没有id这个已经挂了，
   所有有一种解决方案，tomcat开启session共享。 id放在共享session中
   一个数据要放在三份内存中。
   方案二：redis集群存储登录token 每次都要访问一次redis 网络开销比较高。
   # 微服务下登录校验解决方案：
   通过加解密算法生成token校验。 
   
   
   
   
    