package ksyun.client.cdn.getdomainauthcontent.v3;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname GetDomainAuthContentResponse
* @Description GetDomainAuthContent 返回体
*/
@Data
@ToString
public class GetDomainAuthContentResponse extends BaseResponseModel {

    /**本次校验的内容，如：cb4b37ef9e0fcbdce5dccf777452683a*/
    @JsonProperty("Content")
    private String Content;

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
