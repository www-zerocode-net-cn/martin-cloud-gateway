# martin-cloud-config
系统网关，基于spring cloud gateway

启动martin-cloud-eureka → martin-cloud-config → martin-cloud-gateway → martin-biz-hello

访问：

http://localhost:9527/martin-biz-hello/hello

成功返回：

```text
hello
```
说明网关已经生效，已经访问到martin-biz-hello模块下，hello接口