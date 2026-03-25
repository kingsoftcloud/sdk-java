package ksyun.client.aicp.describemodeltypes.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeModelTypesResponse
* @Description DescribeModelTypes 返回体
*/
@Data
@ToString
public class DescribeModelTypesResponse extends BaseResponseModel {

    /**模型类别列表*/
    @JsonProperty("ModelTypeList")
    private List<ModelTypeListDto> ModelTypeList;

    @Data
    @ToString
    public static class ModelTypeListDto {
        /**模型类别*/
        @JsonProperty("ModelType")
        private String ModelType;

    }

}
