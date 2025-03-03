package ksyun.client.kce.reponamespaceexist.v20180314;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname RepoNamespaceExistRequest
 * @Description 请求参数
 */
@Data
public class RepoNamespaceExistRequest {
    /**
     * 命名空间名称
     */
    @KsYunField(name = "Namespace")
    private String Namespace;


}