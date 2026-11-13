package ksyun.client.aicp.createimagecache.v20260401;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateImageCacheRequest
* @Description 请求参数
*/
@Data
public class CreateImageCacheRequest{
    /**镜像配置列表，支持批量多镜像；每个元素对应一条缓存记录，单镜像也需使用数组*/
    @KsYunField(name="ImageConfigs",type=1)
    private List<ImageConfigsDto> ImageConfigsList;

    @Data
    @ToString
    public static class ImageConfigsDto {
        /**镜像源类型：Personal（个人版镜像仓库）或 Enterprise（企业版镜像仓库）*/
        @KsYunField(name="ImageSource")
        private String ImageSource;

        /**镜像仓库地址。Personal 格式为 hub-vpc-{Region}.kce.ksyun.com；Enterprise 格式为 {InstanceName}-vpc.{Region}.ksyunkcr.com*/
        @KsYunField(name="ImageEndpoint")
        private String ImageEndpoint;

        /**镜像命名空间*/
        @KsYunField(name="ImageNamespace")
        private String ImageNamespace;

        /**镜像名称*/
        @KsYunField(name="ImageName")
        private String ImageName;

        /**镜像版本（Tag）*/
        @KsYunField(name="ImageTag")
        private String ImageTag;

        /**镜像仓库实例ID；ImageSource=Enterprise 时必填*/
        @KsYunField(name="RegistryInstanceId")
        private String RegistryInstanceId;

        /**镜像仓库用户名；私有命名空间时必须与 CredentialPwd 同时提供*/
        @KsYunField(name="CredentialUsername")
        private String CredentialUsername;

        /**镜像仓库密码；私有命名空间时必须与 CredentialUsername 同时提供*/
        @KsYunField(name="CredentialPwd")
        private String CredentialPwd;

    }

}
