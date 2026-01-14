package ksyun.client.kfw.modifyhostbook.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ModifyHostbookResponse
* @Description ModifyHostbook 返回体
*/
@Data
@ToString
public class ModifyHostbookResponse extends BaseResponseModel {

    /**请求ID，用于标识本次请求*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**修改的域名簿ID*/
    @JsonProperty("Id")
    private String Id;

}
