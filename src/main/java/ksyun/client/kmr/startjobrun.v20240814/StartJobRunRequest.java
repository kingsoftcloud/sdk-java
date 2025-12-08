package ksyun.client.kmr.startjobrun.v20240814;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname StartJobRunRequest
* @Description 请求参数
*/
@Data
public class StartJobRunRequest{
    /**工作空间ID*/
    @KsYunField(name="WorkspaceId")
    private String WorkspaceId;

    /**AK
用于API请求认证*/
    @KsYunField(name="AccessKeyId")
    private String AccessKeyId;

    /**SK
用于API请求认证
*/
    @KsYunField(name="AccessKeySecret")
    private String AccessKeySecret;

    /**Spark版本*/
    @KsYunField(name="ReleaseVersion")
    private String ReleaseVersion;

    /***/
    @KsYunField(name="SparkSubmitData")
    private SparkSubmitDataDto1 SparkSubmitData;

    @Data
    @ToString
    public static class SparkSubmitDataDto1 {
        /**作业名称*/
        @KsYunField(name="Name")
        private String Name;

        /**作业的Driver核数*/
        @KsYunField(name="SparkDriverCores")
        private Integer SparkDriverCores;

        /**作业的Driver内存*/
        @KsYunField(name="SparkDriverMemory")
        private String SparkDriverMemory;

        /**作业的Executor核数*/
        @KsYunField(name="SparkExecutorCores")
        private Integer SparkExecutorCores;

        /**作业的Executor内存*/
        @KsYunField(name="SparkExecutorMemory")
        private String SparkExecutorMemory;

        /**作业的Executor数量*/
        @KsYunField(name="SparkNumExecutors")
        private Integer SparkNumExecutors;

        /**Java作业的主类，其中包含启动的main函数*/
        @KsYunField(name="Class")
        private String ClassField;

        /**作业应用程序代码的资源文件路径*/
        @KsYunField(name="AppResource")
        private String AppResource;

        /**自定义参数组*/
        @KsYunField(name="ExtraArgs",type=2)
        private List<String> ExtraArgsList;

        /**设置作业配置项
以key=value形式填写*/
        @KsYunField(name="Conf",type=2)
        private List<String> ConfList;

        /**作业需引用的JAR包资源
仅支持KS3资源，多个文件使用逗号（,）分隔*/
        @KsYunField(name="Jars",type=2)
        private List<String> JarsList;

        /**作业需要引用的资源文件
仅支持KS3资源，多个文件使用逗号（,）分隔*/
        @KsYunField(name="Files",type=2)
        private List<String> FilesList;

        /**作业需引用的Python脚本
仅支持KS3资源，多个文件使用逗号（,）分隔
该参数仅对PySpark程序生效*/
        @KsYunField(name="PyFiles",type=2)
        private List<String> PyFilesList;

        /**作业需引用的archive包资源
仅支持KS3资源，多个文件使用逗号（,）分隔
*/
        @KsYunField(name="Archives",type=2)
        private List<String> ArchivesList;

        /**作业指定外部依赖包*/
        @KsYunField(name="Packages",type=2)
        private List<String> PackagesList;

        /**用于缓存加速archive资源，多个文件使用逗号（,）分隔*/
        @KsYunField(name="CacheFile",type=2)
        private List<String> CacheFileList;

        /**容器镜像地址*/
        @KsYunField(name="Image")
        private String Image;

        /**作业优先级
true：p0优先级，可用于期望高优插入执行的作业
false：p1优先级，默认优先级
其中p0优先级高于p1优先级
*/
        @KsYunField(name="HighPriority")
        private Boolean HighPriority;

    }

}
