package ksyun.client.krds.overridedbinstancebypointintime.v20160701;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname OverrideDBInstanceByPointInTimeResponse
* @Description OverrideDBInstanceByPointInTime 返回体
*/
@Data
@ToString
public class OverrideDBInstanceByPointInTimeResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
