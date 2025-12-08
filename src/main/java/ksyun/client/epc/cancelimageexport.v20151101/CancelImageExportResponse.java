package ksyun.client.epc.cancelimageexport.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CancelImageExportResponse
* @Description CancelImageExport 返回体
*/
@Data
@ToString
public class CancelImageExportResponse extends BaseResponseModel {
    /***/
    @JsonProperty("Return")
    private Boolean ReturnField;

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
