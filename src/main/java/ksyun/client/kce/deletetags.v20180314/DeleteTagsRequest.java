package ksyun.client.kce.deletetags.v20180314;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteTagsRequest
* @Description 请求参数
*/
@Data
public class DeleteTagsRequest{
    /**镜像仓库名称*/
    @KsYunField(name="RepoName")
    private String RepoName;

    /**指定的镜像版本*/
    @KsYunField(name="Tag",type=1)
    private List<String> TagList;

}
