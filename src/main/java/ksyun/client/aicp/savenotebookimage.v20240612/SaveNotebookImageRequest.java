package ksyun.client.aicp.savenotebookimage.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname SaveNotebookImageRequest
* @Description 请求参数
*/
@Data
public class SaveNotebookImageRequest{
    /**镜像名称*/
    @KsYunField(name="ImageName")
    private String ImageName;

    /**描述*/
    @KsYunField(name="Description")
    private String Description;

    /**镜像类型 Personal-个人版实例，Official-企业版实例*/
    @KsYunField(name="ImageType")
    private String ImageType;

    /**命名空间*/
    @KsYunField(name="Namespace")
    private String Namespace;

    /**命名空间权限，Public-公有 / Private-私有*/
    @KsYunField(name="NamespacePermission")
    private String NamespacePermission;

    /**镜像仓库*/
    @KsYunField(name="ImageRepo")
    private String ImageRepo;

    /**版本号*/
    @KsYunField(name="ImageVersion")
    private String ImageVersion;

    /**企业版实例ID，当ImageType=Official 必填*/
    @KsYunField(name="OfficialInstance")
    private String OfficialInstance;

    /**用户名*/
    @KsYunField(name="UserName")
    private String UserName;

    /**密码*/
    @KsYunField(name="Password")
    private String Password;

    /**可见性 Public- 公开可见 / Private-仅自己可见*/
    @KsYunField(name="ImagePermission")
    private String ImagePermission;

    /**开发任务ID*/
    @KsYunField(name="NotebookId")
    private String NotebookId;

    /**镜像仓库域名(参数已废弃)*/
    @KsYunField(name="ImageDomain")
    private String ImageDomain;

}