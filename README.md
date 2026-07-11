# FindFiles

输入目录路径，统计该目录下所有文件的后缀分布。

## 功能

- 递归扫描指定目录及其子目录中的所有文件
- 按文件后缀名（扩展名）分组统计数量
- Web 页面展示每种后缀的文件数及占比，带进度条可视化

## 技术栈

- Java 25
- Spring Boot 4.1.0
- Spring MVC
- Maven

## 快速启动

```bash
# 编译并运行
./mvnw spring-boot:run
```

启动后访问 http://localhost:8080 ，输入目录路径点击查询即可。

## 项目结构

```
src/
├── main/java/com/jerry/findfiles/
│   ├── FindFilesApplication.java      # 启动类
│   ├── Controller/ControllerImpl.java # REST 接口
│   └── Service/
│       ├── service.java               # 接口
│       └── impl/serviceImpl.java      # 递归统计逻辑
└── main/resources/static/
    └── index.html                     # 前端页面
    ![img.png](img.png)
   
```
## 长这个样子，仅有的一个功能（嘿嘿，等后期demo多了再合成一个大demo）
![img_1.png](img_1.png)