package ksyun.client.cen.createcen.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateCenResponse
* @Description CreateCen 返回体
*/
@Data
@ToString
public class CreateCenResponse extends BaseResponseModel {
    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**云企业网的信息*/
    @JsonProperty("Cen")
    private CenDto Cen;

    @Data
    @ToString
    public static class CenDto {
        /**创建时间*/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /**云企业网的ID*/
        @JsonProperty("CenId")
        private String CenId;

        /**云企业网的名称*/
        @JsonProperty("CenName")
        private String CenName;

        /**云企业网的描述信息*/
        @JsonProperty("Description")
        private String Description;

    }

}
