# Hummer

#### 介绍
基于spring-boot的一组分布式套件，包括，主从选举、统一任务调度、统一配置、动态模型、流式计算等

#### 主从选举（hummer-cluster）
    目前：
        支持基于consul的分布式锁实现的主从选举。
        内置分布式锁，可以直接使用。
    新目标：
        支持zookeeper的选举方案。
        支持基于netty实现的raft选举方案。
[link](./hummer-cluster/readme.md). 
#### 统一任务调度（hummer-task）
    目前（代码整理中）：
        支持定时任务周期3分钟以上的任务的统一管理和调度，解决避免重复执行，或者执行失败后无法重试执行的问题。
        支持具有“前置任务”的任务的按需调度
        内置分布式任务调度锁，解决基于Spring定时任务框架实现的定时任务，在多实例部署场景会重复执行的问题。
    新目标：
        支持后台管理系统：任务配置、重启、修改执行时间等功能。
link](./hummer-task/readme.md). 
#### 统一配置（hummer-config）
    目前（代码整理中）：
        支持application.properties和spring自动配置的配置的热加载和更新
    新目标：
        支持对接第三方配置框架
        支持多样化的配置数据入口。
[link](./hummer-config/readme.md). 
#### 动态模型（hummer-dynamodel）
    目前：
        支持动态数据库（pg）表的创建修改以及表数据的新增、修改、删除。
    新目标：
        支持其他数据库。
[link](./hummer-dynamodel/readme.md). 
#### 流式计算（hummer-stream）
    目前（代码整理中）：
        支持基于redis实现的实时分析的功能。
    新目标：
        支持基于flink的二次开发，实现更复杂的实时数据分析的功能
[link](./hummer-stream/readme.md). 

#### 更多惊喜，期待您的加入。。。。

#### 参与贡献

1.  Fork 本仓库
2.  新建 Feat_develop 分支
3.  提交代码
4.  新建 Pull Request
