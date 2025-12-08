package ksyun.client.kcrs.modifynamespacetype.v20211109;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ModifyNamespaceTypeResponse
* @Description ModifyNamespaceType 返回体
*/
@Data
@ToString
public class ModifyNamespaceTypeResponse extends BaseResponseModel {
    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

}
