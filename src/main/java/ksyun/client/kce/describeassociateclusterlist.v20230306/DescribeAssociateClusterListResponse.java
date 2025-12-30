package ksyun.client.kce.describeassociateclusterlist.v20230306;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeAssociateClusterListResponse
* @Description DescribeAssociateClusterList 返回体
*/
@Data
@ToString
public class DescribeAssociateClusterListResponse extends BaseResponseModel {

    /**请求id*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**分页标识*/
    @JsonProperty("Marker")
    private Integer Marker;

    /**关联的集群数量*/
    @JsonProperty("TotalCount")
    private Integer TotalCount;

    /***/
    @JsonProperty("ClusterSet")
    private List<ClusterSetDto> ClusterSet;

    @Data
    @ToString
    public static class ClusterSetDto {
    }

}
