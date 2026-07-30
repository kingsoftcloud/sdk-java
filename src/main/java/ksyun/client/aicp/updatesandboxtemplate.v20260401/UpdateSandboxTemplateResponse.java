package ksyun.client.aicp.updatesandboxtemplate.v20260401;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname UpdateSandboxTemplateResponse
* @Description UpdateSandboxTemplate 返回体
*/
@Data
@ToString
public class UpdateSandboxTemplateResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("TemplateId")
        private String TemplateId;

    }

}
