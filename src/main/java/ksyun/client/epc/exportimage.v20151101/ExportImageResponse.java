package ksyun.client.epc.exportimage.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ExportImageResponse
* @Description ExportImage 返回体
*/
@Data
@ToString
public class ExportImageResponse extends BaseResponseModel {
    /***/
    @JsonProperty("Return")
    private Boolean ReturnField;

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
