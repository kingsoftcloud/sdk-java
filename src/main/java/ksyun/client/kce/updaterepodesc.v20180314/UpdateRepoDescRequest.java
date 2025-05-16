package ksyun.client.kce.updaterepodesc.v20180314;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname UpdateRepoDescRequest
 * @Description 请求参数
 */
@Data
public class UpdateRepoDescRequest {
    /**
     * 镜像仓库名称
     */
    @KsYunField(name = "RepoName")
    private String RepoName;

    /**
     * 镜像仓库描述内容
     */
    @KsYunField(name = "Description")
    private String Description;

}