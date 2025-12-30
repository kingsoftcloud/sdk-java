package ksyun.client.cen.createcengrant.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateCenGrantResponse
* @Description CreateCenGrant 返回体
*/
@Data
@ToString
public class CreateCenGrantResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**云企业网授权的信息*/
    @JsonProperty("CenGrant")
    private CenGrantDto CenGrant;

    @Data
    @ToString
    public static class CenGrantDto {
        /**创建时间*/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /**云企业网授权的ID*/
        @JsonProperty("CenGrantId")
        private String CenGrantId;

        /**云企业网的ID*/
        @JsonProperty("CenId")
        private String CenId;

        /**云企业网网络实例ID*/
        @JsonProperty("NetworkInstanceId")
        private String NetworkInstanceId;

        /**网络实例类型*/
        @JsonProperty("InstanceType")
        private String InstanceType;

        /**授权的云企业网账号ID*/
        @JsonProperty("CenAccountId")
        private String CenAccountId;

    }

}
