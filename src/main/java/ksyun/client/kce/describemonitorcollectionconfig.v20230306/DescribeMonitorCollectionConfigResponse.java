package ksyun.client.kce.describemonitorcollectionconfig.v20230306;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
 * @Classname DescribeMonitorCollectionConfigResponse
 * @Description DescribeMonitorCollectionConfig 返回体
 */
@Data
@ToString
public class DescribeMonitorCollectionConfigResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
