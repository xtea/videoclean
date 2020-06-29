# 短视频水印处理工具

## 抖音

1. 将无水印视频下载到本地

```java
 // 抖音分享视频地址.
 String msgFromDouyin = "#比尔拉塞尔 我现在都可以打爆你们 https://v.douyin.com/JLeEkWY/ " +
                "复制此链接，打开【抖音短视频】，直接观看视频！";
 Douyin.downloadVideo(msgFromDouyin, "/tmp/");
```

2. 解析抖音短视频信息

```java
ApiResult apiResult = Douyin.fetchVideoScheme(msgFromDouyin);
```
返回结果内容参考源代码