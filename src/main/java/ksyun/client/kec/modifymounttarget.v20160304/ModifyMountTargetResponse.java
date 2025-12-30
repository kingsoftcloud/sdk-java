package ksyun.client.kec.modifymounttarget.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ModifyMountTargetResponse
* @Description ModifyMountTarget 返回体
*/
@Data
@ToString
public class ModifyMountTargetResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

}
