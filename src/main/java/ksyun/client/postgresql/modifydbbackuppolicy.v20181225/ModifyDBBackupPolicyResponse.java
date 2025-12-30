package ksyun.client.postgresql.modifydbbackuppolicy.v20181225;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ModifyDBBackupPolicyResponse
* @Description ModifyDBBackupPolicy 返回体
*/
@Data
@ToString
public class ModifyDBBackupPolicyResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
