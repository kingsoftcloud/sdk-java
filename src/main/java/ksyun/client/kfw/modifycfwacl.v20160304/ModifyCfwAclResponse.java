package ksyun.client.kfw.modifycfwacl.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ModifyCfwAclResponse
* @Description ModifyCfwAcl 返回体
*/
@Data
@ToString
public class ModifyCfwAclResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
