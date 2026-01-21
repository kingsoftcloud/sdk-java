package ksyun.client.aicp.createimage.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateImageRequest
* @Description 请求参数
*/
@Data
public class CreateImageRequest{
    /**自定义镜像名称*/
    @KsYunField(name="ImageName")
    private String ImageName;

    /**描述信息*/
    @KsYunField(name="Description")
    private String Description;

    /**镜像类型*/
    @KsYunField(name="ImageType")
    private String ImageType;

    /**命名空间*/
    @KsYunField(name="Namespace")
    private String Namespace;

    /**命名空间权限*/
    @KsYunField(name="NamespacePermission")
    private String NamespacePermission;

    /**镜像仓库*/
    @KsYunField(name="ImageRepo")
    private String ImageRepo;

    /**镜像版本*/
    @KsYunField(name="ImageVersion")
    private String ImageVersion;

    /**企业镜像实例，当ImageType=Official不能为空*/
    @KsYunField(name="OfficialInstance")
    private String OfficialInstance;

    /**用户名，当ImageType=Official不能为空*/
    @KsYunField(name="UserName")
    private String UserName;

    /**密码，当ImageType=Official不能为空*/
    @KsYunField(name="Password")
    private String Password;

    /**镜像权限*/
    @KsYunField(name="ImagePermission")
    private String ImagePermission;

}
