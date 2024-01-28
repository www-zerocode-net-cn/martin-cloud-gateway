FROM erdonline/jdk8-yum-go:latest

MAINTAINER martin114@foxmail.com

RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime

RUN mkdir -p /martin-cloud-gateway && mkdir -p /opt/erd

WORKDIR /martin-cloud-gateway

EXPOSE 9502

ADD ./target/martin-cloud-gateway.xjar ./

ADD ./target/xjar.go ./

RUN go version

RUN go build xjar.go

ENTRYPOINT ./xjar java ${JAVA_OPTS} -Djava.security.egd=file:/dev/./urandom -jar martin-cloud-gateway.xjar
