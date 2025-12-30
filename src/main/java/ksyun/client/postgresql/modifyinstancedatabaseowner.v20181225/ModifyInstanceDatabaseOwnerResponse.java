package ksyun.client.postgresql.modifyinstancedatabaseowner.v20181225;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ModifyInstanceDatabaseOwnerResponse
* @Description ModifyInstanceDatabaseOwner 返回体
*/
@Data
@ToString
public class ModifyInstanceDatabaseOwnerResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
