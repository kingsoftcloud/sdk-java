package ksyun.client.kcrs.deleterepotag.v20211109;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteRepoTagRequest
* @Description 请求参数
*/
@Data
public class DeleteRepoTagRequest{
    /**实例id*/
    @KsYunField(name="InstanceId")
    private String InstanceId;

    /**命名空间*/
    @KsYunField(name="Namespace")
    private String Namespace;

    /**镜像仓库名称*/
    @KsYunField(name="RepoName")
    private String RepoName;

    /**镜像版本（Tag）名称*/
    @KsYunField(name="TagName")
    private String TagName;


}