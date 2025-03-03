package ksyun.client.kci.createimagecache.v20200702;

import common.annotation.KsYunField;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * @Classname CreateImageCacheRequest
 * @Description 请求参数
 */
@Data
public class CreateImageCacheRequest {
    /**
     * 镜像缓存名称，最长63个字符，名称需符合
     * `^[a-zA-Z0-9]([-a-zA-Z0-9._]*[a-zA-Z0-9])?$` 格式
     */
    @KsYunField(name = "ImageCacheName")
    private String ImageCacheName;

    /**
     * 子网ID，创建缓存过程中会创建一个容器实例，占用该子网下一个ip
     */
    @KsYunField(name = "SubnetId")
    private String SubnetId;

    /**
     * 安全组ID
     */
    @KsYunField(name = "SecurityGroupId")
    private String SecurityGroupId;

    /**
     * 镜像缓存大小，单位GB，默认20GB，取值范围20-500G，请保证下载的镜像小于等于该大小。
     */
    @KsYunField(name = "ImageCacheSize")
    private Integer ImageCacheSize;

    /**
     * 镜像缓存保留天数，最大65536天，不填写或者0则表示永久保留
     */
    @KsYunField(name = "RetentionDays")
    private Integer RetentionDays;

    /**
     * 镜像数量，最多20个，镜像必须符合docker镜像格式
     */
    @KsYunField(name = "Image")
    private List<String> ImageList;

    /**
     * 拉取镜像仓库中私有镜像的凭据，公开镜像无须填写凭据
     */
    @KsYunField(name = "ImageRegistryCredential", type = 2)
    private List<ImageRegistryCredentialDto> ImageRegistryCredentialList;
    /**
     * 镜像缓存类型
     * - Common 普通型
     * - Rapid 极速型
     */
    @KsYunField(name = "ImageCacheType")
    private String ImageCacheType;
    /**
     * 是否预热，默认false
     */
    @KsYunField(name = "EnableWarm")
    private Boolean EnableWarm;

    @Data
    @ToString
    public static class ImageRegistryCredentialDto {
        /**
         * 可以是ip或者domain，请与填写的镜像的server域名保持一致，否则无法使用
         */
        private String Server;
        /**
         * 仓库用户名
         */
        private String Username;
        /**
         * 镜像仓库密码
         */
        private String Password;
    }


}