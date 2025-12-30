package ksyun.client.kce.describeprometheusinstance.v20230306;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribePrometheusInstanceResponse
* @Description DescribePrometheusInstance 返回体
*/
@Data
@ToString
public class DescribePrometheusInstanceResponse extends BaseResponseModel {

    /**请求id*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**分页标识，如果调用未返回全部实例，标记下次调用的返回值的起点，如果已返回全部实例，则其值为0*/
    @JsonProperty("Marker")
    private Integer Marker;

    /**实例数量*/
    @JsonProperty("TotalCount")
    private Integer TotalCount;

    /**实例信息*/
    @JsonProperty("InstanceSet")
    private List<InstanceSetDto> InstanceSet;

    @Data
    @ToString
    public static class InstanceSetDto {
    }

}
