package ksyun.client.kec.modifyaccessgroup.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ModifyAccessGroupResponse
* @Description ModifyAccessGroup 返回体
*/
@Data
@ToString
public class ModifyAccessGroupResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

}
