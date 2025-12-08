package ksyun.client.kcrs.describeinstanceusage.v20211109;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeInstanceUsageResponse
* @Description DescribeInstanceUsage 返回体
*/
@Data
@ToString
public class DescribeInstanceUsageResponse extends BaseResponseModel {
    /**请求Id*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**命名空间配额数量*/
    @JsonProperty("NamespaceQuota")
    private Integer NamespaceQuota;

    /**已创建的命名空间数量	*/
    @JsonProperty("NamespaceUsage")
    private Integer NamespaceUsage;

    /**镜像仓库配额数量	*/
    @JsonProperty("RepoQuota")
    private Integer RepoQuota;

    /**已创建的镜像仓库数量	*/
    @JsonProperty("RepoUsage")
    private Integer RepoUsage;

}
