package ksyun.client.kmr.startjobrun.v20240814;

import common.annotation.KsYunField;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname StartJobRunRequest
 * @Description 请求参数
 */
@Data
public class StartJobRunRequest {
    /**
     * 工作空间ID
     */
    @KsYunField(name = "WorkspaceId")
    private String WorkspaceId;

    /**
     * AK
     * 用于API请求认证
     */
    @KsYunField(name = "AccessKeyId")
    private String AccessKeyId;

    /**
     * SK
     * 用于API请求认证
     */
    @KsYunField(name = "AccessKeySecret")
    private String AccessKeySecret;

    /**
     * Spark版本
     */
    @KsYunField(name = "ReleaseVersion")
    private String ReleaseVersion;

    /***/
    @KsYunField(name = "SparkSubmitData")
    private SparkSubmitDataDto SparkSubmitData;

    @Data
    @ToString
    public static class SparkSubmitDataDto {
        /**
         * 作业名称
         */
        @KsYunField(name = "Name")
        private String Name;

        /**
         * 作业的Driver核数
         */
        @KsYunField(name = "SparkDriverCores")
        private int SparkDriverCores;

        /**
         * 作业的Driver内存
         */
        @KsYunField(name = "SparkDriverMemory")
        private String SparkDriverMemory;

        /**
         * 作业的Executor核数
         */
        @KsYunField(name = "SparkExecutorCores")
        private int SparkExecutorCores;

        /**
         * 作业的Executor内存
         */
        @KsYunField(name = "SparkExecutorMemory")
        private String SparkExecutorMemory;

        /**
         * 作业的Executor数量
         */
        @KsYunField(name = "SparkNumExecutors")
        private int SparkNumExecutors;

        /**
         * Java作业的主类，其中包含启动的main函数
         */
        @KsYunField(name = "Class")
        private String ClassName;

        /**
         * 作业应用程序代码的资源文件路径
         */
        @KsYunField(name = "AppResource")
        private String AppResource;

        /**
         * 自定义参数组
         */
        @KsYunField(name = "ExtraArgs")
        private String[] ExtraArgs;

        /**
         * 设置作业配置项，以key=value形式填写
         */
        @KsYunField(name = "Conf")
        private String[] Conf;

        /**
         * 作业需引用的JAR包资源，仅支持KS3资源，多个文件使用逗号（,）分隔
         */
        @KsYunField(name = "Jars")
        private String[] Jars;

        /**
         * 作业需要引用的资源文件，仅支持KS3资源，多个文件使用逗号（,）分隔
         */
        @KsYunField(name = "Files")
        private String[] Files;

        /**
         * 作业需引用的Python脚本，仅支持KS3资源，多个文件使用逗号（,）分隔，该参数仅对PySpark程序生效
         */
        @KsYunField(name = "PyFiles")
        private String[] PyFiles;

        /**
         * 作业需引用的archive包资源，仅支持KS3资源，多个文件使用逗号（,）分隔
         */
        @KsYunField(name = "Archives")
        private String[] Archives;

        /**
         * 作业指定外部依赖包
         */
        @KsYunField(name = "Packages")
        private String[] Packages;

        /**
         * 用于缓存加速archive资源，多个文件使用逗号（,）分隔
         */
        @KsYunField(name = "CacheFile")
        private String[] CacheFile;

        /**
         * 容器镜像地址
         */
        @KsYunField(name = "Image")
        private String Image;
    }

}