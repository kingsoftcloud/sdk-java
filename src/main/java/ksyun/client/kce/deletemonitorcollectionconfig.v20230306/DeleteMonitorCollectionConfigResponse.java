package ksyun.client.kce.deletemonitorcollectionconfig.v20230306;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteMonitorCollectionConfigResponse
* @Description DeleteMonitorCollectionConfig 返回体
*/
@Data
@ToString
public class DeleteMonitorCollectionConfigResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
