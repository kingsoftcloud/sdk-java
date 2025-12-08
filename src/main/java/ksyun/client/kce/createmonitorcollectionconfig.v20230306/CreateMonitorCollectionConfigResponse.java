package ksyun.client.kce.createmonitorcollectionconfig.v20230306;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateMonitorCollectionConfigResponse
* @Description CreateMonitorCollectionConfig 返回体
*/
@Data
@ToString
public class CreateMonitorCollectionConfigResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
