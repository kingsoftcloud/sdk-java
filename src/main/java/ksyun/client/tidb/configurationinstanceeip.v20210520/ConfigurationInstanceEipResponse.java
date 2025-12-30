package ksyun.client.tidb.configurationinstanceeip.v20210520;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ConfigurationInstanceEipResponse
* @Description ConfigurationInstanceEip 返回体
*/
@Data
@ToString
public class ConfigurationInstanceEipResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Data")
    private Boolean Data;

}
