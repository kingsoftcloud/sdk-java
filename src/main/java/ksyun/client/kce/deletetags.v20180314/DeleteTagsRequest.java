package ksyun.client.kce.deletetags.v20180314;

import common.annotation.KsYunField;
import lombok.Data;

import java.util.List;

/**
 * @Classname DeleteTagsRequest
 * @Description 请求参数
 */
@Data
public class DeleteTagsRequest {
    /**
     * 镜像仓库名称
     */
    @KsYunField(name = "RepoName")
    private String RepoName;

    /**
     * 指定的镜像版本
     */
    @KsYunField(name = "Tag")
    private List<String> TagList;

}