package ksyun.client.ket.getstreamtranlist.v20170101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname GetStreamTranListResponse
* @Description GetStreamTranList 返回体
*/
@Data
@ToString
public class GetStreamTranListResponse extends BaseResponseModel {

    /***/
    @JsonProperty("GetStreamTranListResponse")
    private String GetStreamTranListResponse;

}
