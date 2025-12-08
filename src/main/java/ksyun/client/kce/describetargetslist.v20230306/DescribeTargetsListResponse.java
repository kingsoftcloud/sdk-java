package ksyun.client.kce.describetargetslist.v20230306;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeTargetsListResponse
* @Description DescribeTargetsList 返回体
*/
@Data
@ToString
public class DescribeTargetsListResponse extends BaseResponseModel {
    /**请求id*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**分页标识*/
    @JsonProperty("Marker")
    private Integer Marker;

    /**采集目标数量*/
    @JsonProperty("TotalCount")
    private Integer TotalCount;

    /**采集目标列表*/
    @JsonProperty("TargetSet")
    private List<TargetSetDto> TargetSet;

    @Data
    @ToString
    public static class TargetSetDto {
    }

}
