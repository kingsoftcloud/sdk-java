package ksyun.client.milvus.createsecuritygroup.v20231010;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateSecurityGroupResponse
* @Description CreateSecurityGroup 返回体
*/
@Data
@ToString
public class CreateSecurityGroupResponse extends BaseResponseModel {

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
        @JsonProperty("Id")
        private String Id;

        /**安全组ID*/
        @JsonProperty("Name")
        private String Name;

        /**操作状态*/
        @JsonProperty("IpVersion")
        private String IpVersion;

        /**创建时间*/
        @JsonProperty("CreatedAt")
        private String CreatedAt;

        /**更新时间*/
        @JsonProperty("UpdatedAt")
        private String UpdatedAt;

    }

}
