package ksyun.client.postgresql.modifyinstancedatabaseowner.v20181225;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
 * @Classname ModifyInstanceDatabaseOwnerResponse
 * @Description ModifyInstanceDatabaseOwner 返回体
 */
@Data
@ToString
public class ModifyInstanceDatabaseOwnerResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
