# [Sofa Ark IDEA插件](https://github.com/ggndnn/sofa-ark-idea-plugin)示例 

## 快速开始
- 以Maven工程方式导入本项目`sofa-ark-samples`到IDEA
- 创建一个`SofaArk Application`类型的运行配置
- 手动从Maven仓库添加Sofa Ark插件模块`com.alipay.sofa:web-ark-plugin:0.6.0`到运行配置并启动应用
- 如果启动应用的过程遇到错误`Master biz should be configured when deploy multi biz`, 请添加虚拟机参数`-Dcom.alipay.sofa.ark.master.biz=sample-bundle`
- 如果启动应用的过程遇到错误`The following properties were declared as required but could not be resolved: [spring.application.name]`, 请添加虚拟机参数`-Dspring.application.name=app1`
- 打开浏览器访问`http://localhost:8080/hello`或者`http://localhost:8080/sample2/hello`验证结果
- 如果在运行配置中出现模块找不到的情况或异常, 请手动重新导入Maven工程(Reimport maven projects)