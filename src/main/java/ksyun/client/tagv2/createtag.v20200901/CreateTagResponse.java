package ksyun.client.tagv2.createtag.v20200901;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateTagResponse
* @Description CreateTag 返回体
*/
@Data
@ToString
public class CreateTagResponse extends BaseResponseModel {

    /***/
    @JsonProperty("TagId")
    private Integer TagId;

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
