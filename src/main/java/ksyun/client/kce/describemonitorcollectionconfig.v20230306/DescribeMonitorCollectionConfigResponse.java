package ksyun.client.kce.describemonitorcollectionconfig.v20230306;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeMonitorCollectionConfigResponse
* @Description DescribeMonitorCollectionConfig 返回体
*/
@Data
@ToString
public class DescribeMonitorCollectionConfigResponse extends BaseResponseModel {

    /**请求id*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**监控采集配置yaml*/
    @JsonProperty("ConfigYaml")
    private String ConfigYaml;

}
