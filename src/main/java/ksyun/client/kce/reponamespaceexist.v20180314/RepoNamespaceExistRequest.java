package ksyun.client.kce.reponamespaceexist.v20180314;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname RepoNamespaceExistRequest
* @Description 请求参数
*/
@Data
public class RepoNamespaceExistRequest{
    /**命名空间名称*/
    @KsYunField(name="Namespace")
    private String Namespace;

}
