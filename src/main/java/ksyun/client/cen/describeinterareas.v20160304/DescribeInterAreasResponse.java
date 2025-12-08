package ksyun.client.cen.describeinterareas.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeInterAreasResponse
* @Description DescribeInterAreas 返回体
*/
@Data
@ToString
public class DescribeInterAreasResponse extends BaseResponseModel {
    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**获取另一页返回结果的 token.*/
    @JsonProperty("NextToken")
    private String NextToken;

    /**互通大区的信息*/
    @JsonProperty("InterAreaSet")
    private List<InterAreaSetDto> InterAreaSet;

    @Data
    @ToString
    public static class InterAreaSetDto {
        /**互通大区ID*/
        @JsonProperty("InterAreaId")
        private String InterAreaId;

        /**互通区域名称*/
        @JsonProperty("InterAreaName")
        private String InterAreaName;

    }

}
