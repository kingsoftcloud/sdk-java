package ksyun.client.kad.createforwardconf.v20161122;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateForwardConfResponse
* @Description CreateForwardConf 返回体
*/
@Data
@ToString
public class CreateForwardConfResponse extends BaseResponseModel {
    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

}
