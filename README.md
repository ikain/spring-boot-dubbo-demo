# spring-boot-dubbo-demo

##### 需要的环境 zookeeper + mongodb
    
    # nginx 后端接口api配置
    location ^~ /api {
		proxy_pass http://localhost:8086/api;
		proxy_set_header X-Real-Ip $remote_addr;
		proxy_set_header X-Forwarded-For $proxy_add_x_forwarded_for;
		proxy_set_header Upgrade $http_upgrade;
		proxy_set_header Connection "upgrade";
	}
	# 前端配置 
	location / {
		proxy_pass http://localhost:8000/;
	}
	
##### 前端代码git地址
    git clone https://github.com/ikain/drizzleDemo.git
    gulp 命令启动，需要nodeJs环境