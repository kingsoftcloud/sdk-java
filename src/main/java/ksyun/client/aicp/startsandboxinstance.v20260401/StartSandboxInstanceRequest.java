package ksyun.client.aicp.startsandboxinstance.v20260401;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname StartSandboxInstanceRequest
* @Description 请求参数
*/
@Data
public class StartSandboxInstanceRequest{
    /**模板ID*/
    @KsYunField(name="TemplateId")
    private String TemplateId;

    /**过期时间（秒），范围60-86400，默认3600*/
    @KsYunField(name="Timeout")
    private Integer Timeout;

    /**KS3存储挂载配置，同创建模板结构，可覆盖模板配置*/
    @KsYunField(name="Ks3MountConfig")
    private Ks3MountConfigDto Ks3MountConfig;

    @Data
    @ToString
    public static class Ks3MountConfigDto {
        /**是否启用KS3挂载，默认false
*/
        @KsYunField(name="Ks3Enable")
        private Boolean Ks3Enable;

        /**KS3挂载点列表，Ks3MountConfig.Ks3Enable=true时必填，最多5个
*/
        @KsYunField(name="Ks3MountPoints",type=2)
        private List<Ks3MountConfigKs3MountPointsDto> Ks3MountPointsList;

        @Data
        @ToString
        public static class Ks3MountConfigKs3MountPointsDto {
            /**KS3桶名，Ks3MountConfig.Ks3Enable=true时必填*/
            @KsYunField(name="BucketName")
            private String BucketName;

            /**桶内路径，必须以 / 开头
*/
            @KsYunField(name="RemotePath")
            private String RemotePath;

            /**本地挂载目录，必须以 / 开头，不允许使用系统保留路径，不允许与已有路径冲突*/
            @KsYunField(name="LocalMountPath")
            private String LocalMountPath;

            /**只读权限，默认false*/
            @KsYunField(name="ReadOnly")
            private Boolean ReadOnly;

        }

    }

    /**KPFS存储挂载配置，同创建模板结构，可覆盖模板配置
*/
    @KsYunField(name="KpfsMountConfig")
    private KpfsMountConfigDto KpfsMountConfig;

    @Data
    @ToString
    public static class KpfsMountConfigDto {
        /**是否启用KPFS挂载，默认false
*/
        @KsYunField(name="KpfsEnable")
        private Boolean KpfsEnable;

        /**KPFS挂载点列表，KpfsMountConfig.KpfsEnable=true时必填，最多5个
*/
        @KsYunField(name="KpfsMountPoints",type=2)
        private List<KpfsMountConfigKpfsMountPointsDto> KpfsMountPointsList;

        @Data
        @ToString
        public static class KpfsMountConfigKpfsMountPointsDto {
            /**KPFS文件系统名称，KpfsMountConfig.KpfsEnable=true时必填*/
            @KsYunField(name="FileSystemName")
            private String FileSystemName;

            /**文件系统内路径，必须以 / 开头*/
            @KsYunField(name="RemotePath")
            private String RemotePath;

            /**本地挂载目录，必须以 / 开头，不允许使用系统保留路径，不允许与已有路径冲突*/
            @KsYunField(name="LocalMountPath")
            private String LocalMountPath;

            /**只读权限，默认false*/
            @KsYunField(name="ReadOnly")
            private Boolean ReadOnly;

        }

    }

    /**Access Key，未传则使用模板绑定的AK/SK*/
    @KsYunField(name="AccessKey")
    private String AccessKey;

    /**Secret Access Key，未传则使用模板绑定的AK/SK
*/
    @KsYunField(name="SecretAccessKey")
    private String SecretAccessKey;

    /**环境变量列表，同创建模板结构,覆盖模板中同名变量，新增变量一并注入*/
    @KsYunField(name="Envs",type=2)
    private List<EnvsDto> EnvsList;

    @Data
    @ToString
    public static class EnvsDto {
        /**环境变量键，字母/数字/下划线，下划线或字母开头，1~63字符
*/
        @KsYunField(name="Key")
        private String Key;

        /**环境变量值
*/
        @KsYunField(name="Value")
        private String Value;

    }

}
