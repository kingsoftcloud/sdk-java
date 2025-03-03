package ksyun.client.kmr.startrayjobrun.v20240814;

import common.annotation.KsYunField;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname StartRayJobRunRequest
 * @Description 请求参数
 */
@Data
public class StartRayJobRunRequest {
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
     * Ray版本
     */
    @KsYunField(name = "ReleaseVersion")
    private String ReleaseVersion;

    /***/
    @KsYunField(name = "RaySubmitData")

    private RaySubmitDataDto RaySubmitDataList;

    @Data
    @ToString
    public static class RaySubmitDataDto {
        /**
         * 作业名称
         */
        @KsYunField(name = "Name")
        private String Name;
        /**
         * Ray作业的Head节点核数
         */
        @KsYunField(name = "RayHeadCores")
        private Integer RayHeadCores;
        /**
         * Ray作业的Head节点内存
         */
        @KsYunField(name = "RayHeadMemory")
        private String RayHeadMemory;
        /**
         * Ray作业的Worker节点核数
         */
        @KsYunField(name = "RayWorkerCores")
        private Integer RayWorkerCores;
        /**
         * Ray作业的Worker节点内存
         */
        @KsYunField(name = "RayWorkerMemory")
        private String RayWorkerMemory;
        /**
         * Ray作业的Worker节点数量
         */
        @KsYunField(name = "RayWorkerNum")
        private Integer RayWorkerNum;
        /**
         * Ray作业的Worker节点GPU数
         */
        @KsYunField(name = "RayWorkerGpus")
        private Integer RayWorkerGpus;
        /**
         * 用于配置作业的启动命令
         * 格式：python + 文件名
         */
        @KsYunField(name = "EntrypointCmd")
        private String EntrypointCmd;
        /**
         * 作业的ks3文件路径
         * 格式：ks3://xx/ray/ray-test.py
         */
        @KsYunField(name = "EntrypointResource")
        private String EntrypointResource;
        /**
         * 作业自定义配置,多个参数用逗号分隔
         * 格式：
         * ["key1=value1", "key2=value2"]
         */
        @KsYunField(name = "Conf")
        private String Conf;
        /**
         * 作业使用的镜像
         * 如需使用自定义镜像，添加该配置，替换镜像地址
         */
        @KsYunField(name = "Image")
        private String Image;
        /**
         * JuiceFS配置
         * Ray head节点挂载 JuiceFS 存储卷
         */
        @KsYunField(name = "JuiceFs")
        private String JuiceFs;
        /**
         * JuiceFS挂载路径
         */
        @KsYunField(name = "MountPath")
        private String MountPath;
        /**
         * 运行时环境配置,例如依赖、环境变量、工作目录等
         */
        @KsYunField(name = "RuntimeEnv")
        private String RuntimeEnv;
        /**
         * 作业优先级
         * true：p0优先级，可用于期望高优插入执行的作业
         * false：p1优先级，默认优先级
         * 其中p0优先级高于p1优先级
         */
        @KsYunField(name = "HighPriority")
        private Boolean HighPriority;
    }
}