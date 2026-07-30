package ksyun.client.aicp.createsandboxtemplate.v20260401;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateSandboxTemplateResponse
* @Description CreateSandboxTemplate 返回体
*/
@Data
@ToString
public class CreateSandboxTemplateResponse extends BaseResponseModel {

    /**20260417-123456789-0000000001*/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /**sdt-dibk4rra*/
        @JsonProperty("TemplateId")
        private String TemplateId;

    }

}
