package ksyun.client.tagv2.createtagandattachresource.v20200901;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
 * @Classname CreateTagAndAttachResourceResponse
 * @Description CreateTagAndAttachResource 返回体
 */
@Data
@ToString
public class CreateTagAndAttachResourceResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
