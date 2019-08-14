# Samples for [Simple Sofa Ark Plugin](https://github.com/ggndnn/sofa-ark-idea-plugin) 
# [中文](README_CN.md)
## Quick Start
- Import this project `sofa-ark-samples` as Maven project.
- Create one `SofaArk Application` run-configuration.
- Manually add plugin `com.alipay.sofa:web-ark-plugin:0.6.0` from maven repository to run-configuraion and start this application.
- If you got error `Master biz should be configured when deploy multi biz`, please add jvm parameter `-Dcom.alipay.sofa.ark.master.biz=sample-bundle`.
- If you got error `The following properties were declared as required but could not be resolved: [spring.application.name]`, please add jvm parameter `-Dspring.application.name=app1`.
- Open browser to `http://localhost:8080/hello` or `http://localhost:8080/sample2/hello`.
- If you can not find plugin or biz in run-configuraion, please manually reimport maven projects.