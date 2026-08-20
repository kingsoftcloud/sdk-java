package ksyun.client.pdns.batchdeletezonerecord.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname BatchDeleteZoneRecordResponse
* @Description BatchDeleteZoneRecord 返回体
*/
@Data
@ToString
public class BatchDeleteZoneRecordResponse extends BaseResponseModel {

    /**请求id*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**是否成功*/
    @JsonProperty("Return")
    private Boolean ReturnField;

}
