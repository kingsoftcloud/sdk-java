package ksyun.client.vpc.disassociateeip.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DisassociateEipResponse
* @Description DisassociateEip 返回体
*/
@Data
@ToString
public class DisassociateEipResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
