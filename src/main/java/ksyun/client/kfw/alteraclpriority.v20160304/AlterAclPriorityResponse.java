package ksyun.client.kfw.alteraclpriority.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname AlterAclPriorityResponse
* @Description AlterAclPriority 返回体
*/
@Data
@ToString
public class AlterAclPriorityResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
