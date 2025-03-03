package ksyun.client.kcrs.modifynamespacetype.v20211109;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname ModifyNamespaceTypeResponse
 * @Description ModifyNamespaceType 返回体
 */
@Data
@ToString
public class ModifyNamespaceTypeResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
