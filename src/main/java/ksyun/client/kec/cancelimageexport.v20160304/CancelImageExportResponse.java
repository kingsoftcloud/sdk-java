package ksyun.client.kec.cancelimageexport.v20160304;

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

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**有效值：True | False*/
    @JsonProperty("Return")
    private Boolean ReturnField;

}
