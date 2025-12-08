package ksyun.client.kec.modifydataguardgroups.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ModifyDataGuardGroupsResponse
* @Description ModifyDataGuardGroups 返回体
*/
@Data
@ToString
public class ModifyDataGuardGroupsResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Return")
    private Boolean ReturnField;

}
