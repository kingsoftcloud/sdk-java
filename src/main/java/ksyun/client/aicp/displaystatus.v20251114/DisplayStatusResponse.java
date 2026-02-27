package ksyun.client.aicp.displaystatus.v20251114;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DisplayStatusResponse
* @Description DisplayStatus 返回体
*/
@Data
@ToString
public class DisplayStatusResponse extends BaseResponseModel {

    /**请求唯一标识*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**文档 ID*/
    @JsonProperty("Id")
    private String Id;

    /**展示状态：queuing / indexing / available / error*/
    @JsonProperty("DisplayStatus")
    private String DisplayStatus;

}
