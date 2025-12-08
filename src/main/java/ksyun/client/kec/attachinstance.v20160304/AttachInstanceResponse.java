package ksyun.client.kec.attachinstance.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname AttachInstanceResponse
* @Description AttachInstance 返回体
*/
@Data
@ToString
public class AttachInstanceResponse extends BaseResponseModel {
    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**添加云服务器是否成功*/
    @JsonProperty("Return")
    private Boolean ReturnField;

}
