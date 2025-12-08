package ksyun.client.kce.updatemonitorcollectionconfig.v20230306;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname UpdateMonitorCollectionConfigResponse
* @Description UpdateMonitorCollectionConfig 返回体
*/
@Data
@ToString
public class UpdateMonitorCollectionConfigResponse extends BaseResponseModel {
    /**请求id*/
    @JsonProperty("RequestId")
    private String RequestId;

}
